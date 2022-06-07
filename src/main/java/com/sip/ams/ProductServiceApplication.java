package com.sip.ams;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sip.ams.entities.Product;
import com.sip.ams.repositories.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Samsung A31","Samsung A51","Samsung A71").forEach(
				
				(String s)->productRepository.save(new Product(null, s, Math.random()*1000)));
		
		
		productRepository.findAll().forEach(System.out::println);
	}

}
