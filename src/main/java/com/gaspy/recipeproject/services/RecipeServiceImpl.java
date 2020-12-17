package com.gaspy.recipeproject.services;

import com.gaspy.recipeproject.model.Recipe;
import com.gaspy.recipeproject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
        log.debug(" I am in the service");
        return (List)recipeRepository.findAll();
    }
}
