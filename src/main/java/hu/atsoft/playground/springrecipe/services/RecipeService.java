package hu.atsoft.playground.springrecipe.services;

import hu.atsoft.playground.springrecipe.commands.RecipeCommand;
import hu.atsoft.playground.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    public Recipe findById(Long id);
    public RecipeCommand saveRecipeCommand(RecipeCommand command);
}
