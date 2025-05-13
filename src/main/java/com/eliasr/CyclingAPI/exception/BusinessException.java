package com.eliasr.CyclingAPI.exception;

public class BusinessException extends Exception{

    private String errorMessage;
    private String errorCause;

    public BusinessException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
