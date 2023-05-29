package com.oleh.barsukov.spring.springboot.spring_demo_services.service.impl;

import com.oleh.barsukov.spring.springboot.spring_demo_services.service.CurrentDayNameService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

@Service
public class CurrentDayNameServiceImpl implements CurrentDayNameService {
    @Override
    @Async
    public CompletableFuture<String> getCurrentDayName() {
        return CompletableFuture.completedFuture(LocalDate.now().getDayOfWeek().toString());
    }
}
