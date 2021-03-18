package com.loan.web.forms;

public class Success<T> extends Result {
    private final T value;

    public Success(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
