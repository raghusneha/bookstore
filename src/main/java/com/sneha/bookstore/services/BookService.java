package com.sneha.bookstore.services;/* Created by narendra on 26/03/24 */

import com.sneha.bookstore.model.Book;
import com.sneha.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

   @Autowired
   BookRepository bookRepository;
    public ResponseEntity<String> saveBookService(Book book) {
        if(book!=null) {
            bookRepository.save(book);
            return ResponseEntity.ok().body("Record updated successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request is not proper");

    }
    public ResponseEntity<String> updateBookService(Book updatedBook, Long id) {
        if (!bookRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record with ID " + id + " not found.");
        } else {
            Book book = bookRepository.findById(id).orElseThrow();
            book.setAuthor(updatedBook.getAuthor());
            book.setTitle(updatedBook.getTitle());
            book.setPrice(updatedBook.getPrice());
            bookRepository.save(book);
            return ResponseEntity.ok().body("Record updated successfully");
        }
    }
        public ResponseEntity<String> deleteBookService(Long id) {
            if (!bookRepository.existsById(id)) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record with ID " + id + " not found.");
            } else {
                    bookRepository.deleteById(id);
                return ResponseEntity.ok().body("Record deleted successfully");

            }

        }
    }

