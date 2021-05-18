package it.sintegra.bookapi.exceptions;

import io.katharsis.errorhandling.ErrorResponse;
import lombok.Getter;

@Getter
public class ExceptionResponse {
    private final GlobalError error;

    public ExceptionResponse(GlobalError error) {
        this.error = error;
    }
}
