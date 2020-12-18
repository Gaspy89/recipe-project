package com.gaspy.recipeproject.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @Test
    void getId() {
        category = new Category();
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());

    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}