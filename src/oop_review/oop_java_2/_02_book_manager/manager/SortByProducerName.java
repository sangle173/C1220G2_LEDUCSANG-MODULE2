package oop_review.oop_java_2._02_book_manager.manager;

import oop_review.oop_java_2._02_book_manager.document.Book;
import oop_review.oop_java_2._02_book_manager.document.Document;

import java.util.Comparator;

public class SortByProducerName implements Comparator<Document> {
    @Override
    public int compare(Document o1, Document o2) {
        return o1.getProducerName().compareTo(o2.getProducerName());
    }
}
