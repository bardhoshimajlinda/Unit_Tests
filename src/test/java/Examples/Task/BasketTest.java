package Examples.Task;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    public void setUp() {
        basket = new Basket();
    }

    @AfterEach
    public void tearDown() {
        basket = null;
    }


    @Test
    public void testGetAllBooks() {
        Book book1 = new Book("Book1", "Author1", 20.0);
        Book book2 = new Book("Book2", "Author2", 25.0);

        basket.addBook(book1);
        basket.addBook(book2);

        assertEquals(2, basket.getAllBooks().size());
        assertTrue(basket.getAllBooks().contains(book1));
        assertTrue(basket.getAllBooks().contains(book2));
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Book3", "Author3", 30.0);

        basket.addBook(book);

        assertEquals(1,basket.getAllBooks().size());
        assertTrue(basket.getAllBooks().contains(book));
    }

    @Test
    public void testClearCart() {
        Book book1 = new Book("Book1", "Author1", 20.0);
        Book book2 = new Book("Book2", "Author2", 25.0);

        basket.addBook(book1);
        basket.addBook(book2);

        basket.clearCart();
        assertEquals(0,basket.getAllBooks().size());
        assertFalse(basket.getAllBooks().contains(book1));
        assertFalse(basket.getAllBooks().contains(book2));
    }

    @Test
    public void testCalculateTotalPrice() {
        Book book1 = new Book("Book1", "Author1", 20.0);
        Book book2 = new Book("Book2", "Author2", 25.0);

        basket.addBook(book1);
        basket.addBook(book2);

        assertEquals(45.0,basket.calculateTotalPrice());
    }

}