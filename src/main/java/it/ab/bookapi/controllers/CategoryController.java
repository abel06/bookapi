package it.ab.bookapi.controllers;

import it.ab.bookapi.dal.dtos.CategoryDTO;
import it.ab.bookapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/categories",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<CategoryDTO>> addCategories(@RequestBody List<CategoryDTO> categoryDTOList) {
        Page<CategoryDTO> page = categoryService.saveCategories(categoryDTOList);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @PostMapping(value = "/categories",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<CategoryDTO>> getCategories(Pageable  pageable) {
        Page<CategoryDTO> page = categoryService.findCategories(pageable);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }
}
