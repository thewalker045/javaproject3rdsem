package service;

import abstraction.LibraryOperation;
import model.Book;

public class IssueBook extends LibraryOperation {

    @Override
    public void execute(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book Issued: " + book.getTitle());
        } else {
            System.out.println("Book already issued");
        }
    }
}
