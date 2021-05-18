package it.ab.bookapi.exceptions;

import lombok.Getter;

@Getter
public class ExceptionResponse {
    private final GlobalError error;

    public ExceptionResponse(GlobalError error) {
        this.error = error;
    }
}
