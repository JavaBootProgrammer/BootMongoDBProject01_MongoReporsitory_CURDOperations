package com.headfirst.runner;

import com.headfirst.entity.Book;
import com.headfirst.service.BookService;
import com.headfirst.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MongoRepoRunner implements CommandLineRunner {

	@Autowired
	BookService dockServiceRegister;

	@Autowired
	BookServiceImpl bookWriterImpl;


	@Override
	public void run(String... args) throws Exception {

		publishABook();
		findAllBooks();
		findByID("667c6b5d46d4243be51bf197");

	}

	private void findByID(String yand) {

		System.out.println("-------------------");
		System.out.println(bookWriterImpl.findByAuthor(yand));
		System.out.println("-------------------");
	}

	private void publishABook() {
		Book book = new Book();
		book.setTitle("Pinjar");
		book.setAuthor("Amrita Pritam");
		book.setPages(300);
		dockServiceRegister.publishBookService(book);
	}

	private void findAllBooks() {
		System.out.println("***************");
		bookWriterImpl.findAllBooks().forEach(System.out::println);
		System.out.println("***************");
	}



}
