package seminar4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    /*
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача написать unit-тесты для BookService, используя Mockito для
     * создания мок-объекта BookRepository.
     */
    private BookRepository bookRepositoryMock;
    private BookService bookService;
    private Book book;

    @BeforeEach
    void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
        book = new Book("11", "Mu-mu", "Тургенев");
    }

    @Test
    void testBookServiceFindBookById() {
        when(bookRepositoryMock.findById("11")).thenReturn(book);

        assertEquals(bookService.findBookById("11"), book);
    }

    @Test
    void testBookServiceFindAllBooks() {
        List<Book> listBooks = new ArrayList<>();
        listBooks.add(book);
        when(bookRepositoryMock.findAll()).thenReturn(listBooks);

        assertEquals(bookService.findAllBooks(), listBooks);
    }
}
