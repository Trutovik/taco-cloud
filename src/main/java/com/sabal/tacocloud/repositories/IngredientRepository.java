package com.sabal.tacocloud.repositories;

import com.sabal.tacocloud.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
