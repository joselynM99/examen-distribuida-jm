package com.distribuida.repo;

import com.distribuida.db.Author;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.*;
import jakarta.transaction.*;


import java.util.List;

@ApplicationScoped
@Transactional
public class AuthorRepository implements IAuthorRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Author> findAll() {
        TypedQuery<Author> myQuery=this.entityManager.createQuery("Select a from Author a", Author.class);
        return myQuery.getResultList();
    }

    @Override
    public Author findById(Integer id) {
        return this.entityManager.find(Author.class, id);
    }

    @Override
    public void create(Author author) {
        this.entityManager.persist(author);
    }

    @Override
    public Author update(Author author) {
        return this.entityManager.merge(author);
    }

    @Override
    public void deleteById(Integer id) {
        this.entityManager.remove(this.findById(id));
    }
}