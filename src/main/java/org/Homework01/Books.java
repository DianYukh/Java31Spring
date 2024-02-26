package org.Homework01;

import java.util.List;

public class Books {
    private Integer idBooks;
    private String title;

    private List<Authors> authors;

    public Books() {
    }

    public Books(Integer idBooks, String title, List<Authors> authors) {
        this.idBooks = idBooks;
        this.title = title;
        this.authors = authors;
    }

    public Integer getIdBooks() {
        return idBooks;
    }

    public void setIdBooks(Integer idBooks) {
        this.idBooks = idBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }
}
