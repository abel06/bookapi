package it.sintegra.bookapi.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalError {

    private int code;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Z"));
    private String message;
    private List<Error> errors = new ArrayList<>();

    public GlobalError(int code) {
        this.code = code;
        this.message = "Unexpected error";
    }

    public GlobalError(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
