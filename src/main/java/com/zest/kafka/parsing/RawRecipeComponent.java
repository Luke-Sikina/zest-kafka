package com.zest.kafka.parsing;

import com.zest.kafka.discovery.RecipeLink;

public record RawRecipeComponent(String ingredient, String unit, float quantity, RecipeLink recipe) {}
