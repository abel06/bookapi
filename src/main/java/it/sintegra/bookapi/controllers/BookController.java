package it.sintegra.bookapi.controllers;

import it.sintegra.bookapi.dal.dtos.BookDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    //paged
    @GetMapping(value = "/books")
    public ResponseEntity<Page<BookDTO>> getAllBooks(Pageable pageable){
        return null;
    }
}
