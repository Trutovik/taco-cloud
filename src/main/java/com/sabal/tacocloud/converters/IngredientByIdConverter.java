package com.sabal.tacocloud.converters;

import com.sabal.tacocloud.entities.Ingredient;
import com.sabal.tacocloud.entities.Type;
import com.sabal.tacocloud.repositories.JDBCIngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private JDBCIngredientRepository ingredientRepository;

    public IngredientByIdConverter(JDBCIngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String source) {
        return ingredientRepository.findById(source).orElse(null);
    }
}
