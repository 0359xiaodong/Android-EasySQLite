package com.tonilopezmr.sample.domain.exception;

/**
 * Created by toni on 06/02/15.
 */
public class SubjectException extends RuntimeException {

    private String message;

    public SubjectException(Exception exception) {
        this.setStackTrace(exception.getStackTrace());
        this.message = exception.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
