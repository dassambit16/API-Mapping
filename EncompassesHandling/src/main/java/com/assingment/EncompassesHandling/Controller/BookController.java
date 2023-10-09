package com.assingment.EncompassesHandling.Controller;

import com.assingment.EncompassesHandling.Model.Book;
import com.assingment.EncompassesHandling.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("books")
    public String addBooks(@RequestBody Book books) {
        return bookService.addBooks(books);
    }

    @GetMapping("book/{id}")
    public Optional<Book> getBook(@PathVariable Integer id) {
        return bookService.getBook(id);
    }

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

}
