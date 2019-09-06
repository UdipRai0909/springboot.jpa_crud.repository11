package com.manageticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = {
//        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
//        )
//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TicketBookingManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementApplication.class, args);	
	}
}
