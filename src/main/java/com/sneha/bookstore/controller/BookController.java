package com.sneha.bookstore.controller;/* Created by narendra on 26/03/24 */

import com.sneha.bookstore.model.Book;
import com.sneha.bookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String getHello()
    {
        return  "Hello Bun";
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveBook(@RequestBody Book book)
    {
      return bookService.saveBookService(book);
    }
    @PutMapping ("/update/{id}")
    public ResponseEntity<String> updateBook(@RequestBody Book book, @PathVariable Long id)
    {
        //System.out.println("Book Author "+book.getAuthor());
        return bookService.updateBookService(book,id);
    }

}
