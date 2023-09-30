package HW04;

//У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных(Коллекции).
//Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
import HW03.Main;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {


    private BookRepository bookRepository;
    private BookService bookService;

    @Before
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {

        Book mockBook = new Book("1", "Book Mock", "Mock Author");

        when(bookRepository.findById("1")).thenReturn(mockBook);

        Book result = bookService.findBookById("1");
        verify(bookRepository).findById("1");

        assertEquals(mockBook, result);
    }

    @Test
    public void testFindAllBooks() {

        List<Book> mockBooks = new ArrayList<>();
        mockBooks.add(new Book("1", "Book 1", "Author 1"));
        mockBooks.add(new Book("2", "Book 2", "Author 2"));
        mockBooks.add(new Book("3", "Book 3", "Author 3"));


        when(bookRepository.findAll()).thenReturn(mockBooks);

        List<Book> result = bookService.findAllBooks();

        verify(bookRepository).findAll();

        assertEquals(mockBooks, result);
    }
}