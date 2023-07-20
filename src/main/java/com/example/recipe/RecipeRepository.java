package com.example.recipe;
import java.util.List;

public interface RecipeRepository {
    List<Recipe> getAllRecipes();
    Recipe getRecipeById(int recipeId);
    Recipe createRecipe(String recipeName, String recipeType, List<String> ingredients);
    void updateRecipe(int recipeId, String recipeName, List<String> ingredients);
    void deleteRecipe(int recipeId);
}
