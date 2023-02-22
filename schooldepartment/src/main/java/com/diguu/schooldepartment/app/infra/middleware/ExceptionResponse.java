package com.diguu.schooldepartment.app.infra.middleware;

import com.diguu.schooldepartment.app.infra.middleware.exceptions.GlobalException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionResponse {

    private String statusName;
    private int statusCode;
    private String errorMessage;

    public ExceptionResponse(Exception ex) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if (ex instanceof GlobalException)
            status = ((GlobalException) ex).getStatusCode();

        setStatusName(status.name());
        setStatusCode(status.value());
        setErrorMessage(ex.getMessage());
    }

}
