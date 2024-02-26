package org.Homework01;

import java.util.List;

public class Library {
    private Integer idLibrary;
    private String name;

    private String city;

    private List<Authors> authors;

    private List<Books> books;

    public Library() {
    }

    public Library(Integer idLibrary, String name, String city, List<Authors> authors, List<Books> books) {
        this.idLibrary = idLibrary;
        this.name = name;
        this.city = city;
        this.authors = authors;
        this.books = books;
    }

    public Integer getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Integer idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
