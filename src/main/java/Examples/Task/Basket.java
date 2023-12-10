package Examples.Task;

import java.util.ArrayList;
import java.util.List;

//a. get all books from shopping
//b. add book to shopping cart
//c. clear a shopping cart
//d. sum of prices for all books in the shopping cart

public class Basket {
    private List<Book> books;

    public Basket() {
        this.books = new ArrayList<>();
    }


    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void clearCart() {
        books.clear();
    }
    public double calculateTotalPrice() {
       return books.stream().mapToDouble(Book::getPrice).sum();
    }

}
