package java.oop.aggregation;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    // addBook 및 removeBook 메서드를 사용하여 책을 관리할 수 있지만,
    // 책 객체는 독립적으로 존재할 수 있다. 책이 도서관과 연결되지만 책이 삭제되더라도, 책 객체는 남아있다.
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
