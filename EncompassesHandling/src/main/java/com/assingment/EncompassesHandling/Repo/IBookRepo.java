package com.assingment.EncompassesHandling.Repo;

import com.assingment.EncompassesHandling.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Integer> {
}
