package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;

import java.util.Comparator;

public class SortByNoOfPage implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getNoOfPage() > o2.getNoOfPage()) {
            return 1;
        } else {
            return -1;
        }
    }
}
