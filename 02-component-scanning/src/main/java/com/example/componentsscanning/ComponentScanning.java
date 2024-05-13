package com.example.componentsscanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.componentsscanning", "common"})
public class ComponentScanning {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanning.class, args);
	}

}
