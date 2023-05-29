package com.oleh.barsukov.spring.springboot.spring_demo_services.service.impl;

import com.oleh.barsukov.spring.springboot.spring_demo_services.service.SingleStringService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class SingleStringServiceImpl implements SingleStringService {
    private final String myString;

    public SingleStringServiceImpl(@Value("${application.service.singleString}") String myString) {
        this.myString = myString;
    }

    @Override
    @Async
    public CompletableFuture<String> getSingleString() {
        return CompletableFuture.completedFuture(myString);
    }
}

