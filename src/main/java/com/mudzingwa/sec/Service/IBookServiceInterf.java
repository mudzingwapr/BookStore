package com.mudzingwa.sec.Service;

import java.util.List;

import com.mudzingwa.sec.Models.Book;

public interface IBookServiceInterf {
	public Book saveBook(Book bk);
    public List<Book> listBooks();
    public Book updateBook(Book bk);
    public void deleteBook(Integer id);
    public Book find(Integer id);
}
