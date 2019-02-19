package hu.atsoft.playground.springrecipe.repositories;

import hu.atsoft.playground.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
