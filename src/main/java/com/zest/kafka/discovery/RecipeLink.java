package com.zest.kafka.discovery;

import java.net.URL;
import java.time.LocalDateTime;

public record RecipeLink(int id, String path, URL domain, LocalDateTime lastUpdated) {
}
