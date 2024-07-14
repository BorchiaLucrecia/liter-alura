package com.literalura.catalog;

import com.literalura.catalog.main.Main;
import com.literalura.catalog.repository.AuthorRepository;
import com.literalura.catalog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {

		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookRepository, authorRepository);
		main.app();
	}

}
