package org.Homework01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("library-context.xml");
        Library library = (Library) context.getBean("oxfordLibrary");
        System.out.println("Назва бібліотеки: " + library.getName() + " " + "Місто: " + library.getCity()) ;
        System.out.println();

        System.out.println("---------------------");
        List<Authors> authors = library.getAuthors();
        System.out.println("Список авторыів: ");
        for (Authors author : authors) {
            System.out.println(author.getName() + " " + author.getSurname());
        }
        System.out.println("---------------------");

        System.out.println();
        System.out.println("Список книг: ");
        List<Books> books = library.getBooks();
        for (Books book : books) {
            System.out.println(book.getTitle());
        }


    }
}
