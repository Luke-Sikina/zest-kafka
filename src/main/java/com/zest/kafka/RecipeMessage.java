package com.zest.kafka;

import java.net.URL;
import java.time.LocalDateTime;

public record RecipeMessage(int id, String path, URL domain, LocalDateTime lastUpdated) {
}
