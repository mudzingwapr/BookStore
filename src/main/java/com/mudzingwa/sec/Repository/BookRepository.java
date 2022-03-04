package com.mudzingwa.sec.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudzingwa.sec.Models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
