package com.headfirst.service;

import com.headfirst.entity.Book;
import com.headfirst.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dockService")
public class BookWriterImpl implements BookServiceRegister {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void publishTheBook(Book newBook) {

		String dockID = bookRepository.insert(newBook).getId();

		System.out.println(dockID + " document ID");


	}
}
