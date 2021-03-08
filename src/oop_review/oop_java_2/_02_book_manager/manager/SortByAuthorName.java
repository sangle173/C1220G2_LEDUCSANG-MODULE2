package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;

import java.util.Comparator;

public class SortByAuthorName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorName().compareTo(o2.getAuthorName());
    }
}
