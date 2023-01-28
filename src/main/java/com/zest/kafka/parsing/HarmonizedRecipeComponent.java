package com.zest.kafka.parsing;

import com.zest.kafka.discovery.RecipeLink;

public record HarmonizedRecipeComponent(String ingredient, float grams, RecipeLink recipe) {
}
