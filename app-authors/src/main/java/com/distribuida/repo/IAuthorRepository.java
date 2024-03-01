package com.distribuida.repo;

import com.distribuida.db.Author;

import java.util.List;

public interface IAuthorRepository {

    List<Author> findAll();
    Author findById(Integer id);
    void create(Author author);
    Author update(Author author);
    void deleteById(Integer id);

}
