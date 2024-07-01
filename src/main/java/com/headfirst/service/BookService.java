package com.headfirst.service;

import com.headfirst.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

	public void publishBookService(Book dock);

	public List<Book> findAllBooks();

	public Optional<Book> findByAuthor(String author);
}
