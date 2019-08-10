package edu.utn.frro.ds.juguetes;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/world-jug")
	String home() {
		return "Hello World-jug!";
		}
		public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
		}
}
