package com.mudzingwa.sec.Service.InterfaceImplementation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.sec.Models.Book;
import com.mudzingwa.sec.Repository.BookRepository;
import com.mudzingwa.sec.Service.IBookServiceInterf;
@Service
public class BookServiceImple implements IBookServiceInterf {
	@Autowired
	private BookRepository repos;

	@Override
	public Book saveBook(Book bk) {
		bk.setCreatedTime(LocalDateTime.now());
			return repos.save(bk);
	}

	@Override
	public List<Book> listBooks() {
		return repos.findAll();
	}

	@Override
	public Book updateBook(Book bk) {
		
		return repos.save(null);
	}

	@Override
	public void deleteBook(Integer id) {
		repos.deleteById(id);

	}

	@Override
	public Book find(Integer id) {
		return repos.getById(id);
	}

}
