package com.gui.car_rental_configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CarRentalConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalConfigServerApplication.class, args);
	}

}
