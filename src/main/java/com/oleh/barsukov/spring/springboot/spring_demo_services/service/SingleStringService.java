package com.oleh.barsukov.spring.springboot.spring_demo_services.service;

import java.util.concurrent.CompletableFuture;

public interface SingleStringService {
    CompletableFuture<String> getSingleString();
}
