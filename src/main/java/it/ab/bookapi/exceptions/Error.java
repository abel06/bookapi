package it.ab.bookapi.exceptions;

import it.ab.bookapi.enums.ValidationCode;
import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Error {
    private ValidationCode id;
    private  int code;
    private HttpStatus status;
    private  String title;
    private  String detail;
    private  String href;

}
