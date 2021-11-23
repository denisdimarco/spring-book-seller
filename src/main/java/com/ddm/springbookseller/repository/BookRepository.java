package com.ddm.springbookseller.repository;

import com.ddm.springbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
