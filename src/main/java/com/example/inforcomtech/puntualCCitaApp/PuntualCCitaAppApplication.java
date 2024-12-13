package com.example.inforcomtech.puntualCCitaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.inforcomtech.controller"})


public class PuntualCCitaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuntualCCitaAppApplication.class, args);
	}

}
