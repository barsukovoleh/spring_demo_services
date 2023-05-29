package com.oleh.barsukov.spring.springboot.spring_demo_services;

import com.oleh.barsukov.spring.springboot.spring_demo_services.ui.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class SpringDemoServicesApplicationTests {

	@Autowired
	private MainController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}


}
