package com.pokemon

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {

// Every method is public as well
	static void main(String[] args) {

 	// You can omit the last method call parenthesis
 	// This is the same as .run(Application, args)
 		SpringApplication.run Application, args
 	}
}
