package it.ab.bookapi.exceptions;

import it.ab.bookapi.enums.ValidationCode;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {



    @ExceptionHandler(value = DuplicateKeyException.class)
    public ResponseEntity<Object> handleDuplicateEntryException(DuplicateKeyException duplicateKeyException) {

        return null;
    }


    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException constraintViolationException){
      return null;
    }

    @ExceptionHandler(value =DataIntegrityViolationException.class)
    public ResponseEntity<Object> DataIntegrityViolationException(DataIntegrityViolationException dataIntegrityViolationException){
        HttpStatus badRequest = HttpStatus.UNPROCESSABLE_ENTITY;
        ValidationCode entityAlreadyExist = ValidationCode.ENTITY_ALREADY_EXIST;

        List<Error> errors = new ArrayList<>();

        GlobalError globalError = new GlobalError();
        globalError.setCode(badRequest.value());
        globalError.setMessage(entityAlreadyExist.getMsg());
        Error error = new Error(entityAlreadyExist, badRequest.value(), badRequest, dataIntegrityViolationException.getCause().getLocalizedMessage(), dataIntegrityViolationException.getCause().getCause().getLocalizedMessage(), null);

        errors.add(error);
        globalError.setErrors(errors);
        return new ResponseEntity<>(new ExceptionResponse(globalError), badRequest);
    }

}
