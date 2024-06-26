package com.headfirst.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collation = "Book")
public class Book {

	@Id
	private String id;

	private String author;

	private Integer pages;

	@Override
	public String toString() {
		return "Book{" +
				"id='" + id + '\'' +
				", author='" + author + '\'' +
				", pages=" + pages +
				", press='" + press + '\'' +
				'}';
	}

	private String press;

}
