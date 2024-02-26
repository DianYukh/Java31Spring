package org.Homework01;

import java.util.List;

public class Authors {
    private Integer idAuthors;
    private String name;

    private String surname;

    private List<Books> books;

    public Authors() {
    }

    public Authors(Integer idAuthors, String name, String surname, List<Books> books) {
        this.idAuthors = idAuthors;
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    public Integer getIdAuthors() {
        return idAuthors;
    }

    public void setIdAuthors(Integer idAuthors) {
        this.idAuthors = idAuthors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
