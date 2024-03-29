package com.sneha.bookstore.repository;/* Created by narendra on 26/03/24 */

import com.sneha.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
