package com.example.recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;
@RestController
class RecipeController {
    RecipeService recipeService=new RecipeService();

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @PostMapping("/recipes")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe.getRecipeName(), recipe.getRecipeType(), recipe.getIngredients());
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable int recipeId) {
        return recipeService.getRecipeById(recipeId);
    }

    @PutMapping("/recipes/{recipeId}")
    public void updateRecipe(@PathVariable int recipeId, @RequestBody Recipe recipe) {
        recipeService.updateRecipe(recipeId, recipe.getRecipeName(), recipe.getIngredients());
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable int recipeId) {
        recipeService.deleteRecipe(recipeId);
    }
}
