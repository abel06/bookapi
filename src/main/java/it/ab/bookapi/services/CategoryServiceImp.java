package it.ab.bookapi.services;

import it.ab.bookapi.dal.dtos.CategoryDTO;
import it.ab.bookapi.dal.models.Category;
import it.ab.bookapi.dal.repositories.CategoryRepository;
import it.ab.bookapi.utilities.MultiMapper;
import it.ab.bookapi.utilities.SingleMapper;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MultiMapper multiMapper;

    @Autowired
    private SingleMapper singleMapper;

    @Override
    public Page<CategoryDTO> saveCategories(List<CategoryDTO> categoryDTOList) {

        Iterable<Category> categories= categoryRepository.saveAll(multiMapper.mapList(categoryDTOList, Category.class));

        List<CategoryDTO> categorySavedDTOList=multiMapper.mapList(Lists.newArrayList(categories),CategoryDTO.class);
        Page<CategoryDTO> page = new PageImpl<>(categorySavedDTOList);
        return page;
    }

    @Override
    public Page<CategoryDTO> findCategories(Pageable pageable) {
        Page<Category> page = categoryRepository.findAll(pageable);
        Page<CategoryDTO> categoryDTOPage  =singleMapper.mapSingle(page,Page.class);
        return singleMapper.mapSingle(categoryDTOPage,Page.class);
    }
}
