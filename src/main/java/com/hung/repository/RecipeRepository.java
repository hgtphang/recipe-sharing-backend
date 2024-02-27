package com.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hung.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
