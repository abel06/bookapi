package it.ab.bookapi.services;

import it.ab.bookapi.dal.dtos.CategoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CategoryService {
    Page<CategoryDTO> saveCategories(List<CategoryDTO> categoryDTOList);
    Page<CategoryDTO> findCategories(Pageable pageable);
}
