package com.gaspy.recipeproject.controllers;

import com.gaspy.recipeproject.repositories.RecipeRepository;
import com.gaspy.recipeproject.services.RecipeService;
import com.gaspy.recipeproject.services.RecipeServiceImpl;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = indexController.getIndexPage(model);
        assertEquals("index", viewName);
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
        verify(recipeService,times(1)).getRecipes();
    }
}