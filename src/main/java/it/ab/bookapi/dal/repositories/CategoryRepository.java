package it.ab.bookapi.dal.repositories;

import it.ab.bookapi.dal.models.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}
