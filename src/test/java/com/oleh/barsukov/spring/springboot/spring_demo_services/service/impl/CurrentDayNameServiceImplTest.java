package com.oleh.barsukov.spring.springboot.spring_demo_services.service.impl;

import com.oleh.barsukov.spring.springboot.spring_demo_services.service.CurrentDayNameService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;


import static org.junit.jupiter.api.Assertions.assertEquals;


class CurrentDayNameServiceImplTest {

    @Test
    void getCurrentDayNameTest() throws ExecutionException, InterruptedException {
        CurrentDayNameService currentDayNameService = new CurrentDayNameServiceImpl();

        assertEquals(LocalDate.now().getDayOfWeek().toString(), currentDayNameService.getCurrentDayName().get());
    }
}