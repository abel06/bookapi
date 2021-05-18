package it.sintegra.bookapi.services;

import it.sintegra.bookapi.dal.dtos.CategoryDTO;
import it.sintegra.bookapi.dal.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CategoryService {
    Page<CategoryDTO> saveCategories(List<CategoryDTO> categoryDTOList);
    Page<CategoryDTO> findCategories(Pageable pageable);
}
