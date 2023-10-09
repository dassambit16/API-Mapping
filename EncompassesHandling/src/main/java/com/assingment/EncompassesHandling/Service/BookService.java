package com.assingment.EncompassesHandling.Service;

import com.assingment.EncompassesHandling.Model.Book;
import com.assingment.EncompassesHandling.Repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBooks(Book books) {
        List<Book> newBooks = new ArrayList<>();
        newBooks.add(books);
        bookRepo.saveAll(newBooks);
        return newBooks.size() + " are added!!";
    }


    public Optional<Book> getBook(Integer id) {
        return bookRepo.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
