package com.headfirst.runner;

import com.headfirst.entity.Book;
import com.headfirst.service.BookServiceRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MongoRepoRunner implements CommandLineRunner {

	@Autowired
	BookServiceRegister dockServiceRegister;

	@Override
	public void run(String... args) throws Exception {

		Book dock = new Book();
		dock.setAuthor("Karthy Sierra");
		dock.setPages(401);
		dock.setPress("Head First");

		dockServiceRegister.publishTheBook(dock);



	}
}
