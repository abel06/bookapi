package it.ab.bookapi.controllers;

import it.ab.bookapi.dal.dtos.BookDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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
