package com.oleh.barsukov.spring.springboot.spring_demo_services.service.impl;

import com.oleh.barsukov.spring.springboot.spring_demo_services.service.SingleStringService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class SingleStringServiceImplTest {
    @Value("${application.service.singleString}")
    String myString;

    @Test
    void getCurrentDayNameTest() throws ExecutionException, InterruptedException {
        SingleStringService singleStringService = new SingleStringServiceImpl(myString);

        assertEquals(myString, singleStringService.getSingleString().get());
    }
}