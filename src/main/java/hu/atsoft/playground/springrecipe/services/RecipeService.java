package hu.atsoft.playground.springrecipe.services;

import hu.atsoft.playground.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
