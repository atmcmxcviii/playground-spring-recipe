package hu.atsoft.playground.springrecipe.repositories;

import hu.atsoft.playground.springrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
