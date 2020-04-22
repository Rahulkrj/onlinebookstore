package com.rjstudio360.onlinebookstore.repository;

import com.rjstudio360.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
