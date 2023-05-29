package com.oleh.barsukov.spring.springboot.spring_demo_services.ui.controller;

import com.oleh.barsukov.spring.springboot.spring_demo_services.service.CurrentDayNameService;
import com.oleh.barsukov.spring.springboot.spring_demo_services.service.SingleStringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
@RequestMapping("string-day-info")
@RequiredArgsConstructor
public class MainController {
    private final SingleStringService singleStringService;
    private final CurrentDayNameService currentDayNameService;

    @GetMapping
    public Map<String, String> getInfo() {
        CompletableFuture<String> futureDayName = currentDayNameService.getCurrentDayName();
        CompletableFuture<String> futureSingleString = singleStringService.getSingleString();

        final List<String> values = Stream.of(futureDayName, futureSingleString)
                .map(CompletableFuture::join)
                .toList();
        final List<String> keyList = Arrays.asList("Today", "Single String");
        return IntStream.range(0, keyList.size())
                .boxed()
                .collect(Collectors.toMap(keyList::get, values::get));
    }
}