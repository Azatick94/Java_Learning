package com.loan.web.forms;

public class Error extends Result {
    private final String error;

    public Error(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
