package it.sintegra.bookapi.dal.repositories;

import it.sintegra.bookapi.dal.models.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}
