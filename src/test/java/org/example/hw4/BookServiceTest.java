package org.example.hw4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

class BookServiceTest {
    static BookRepository mockBookRepository = mock(BookRepository.class);
    static Book book = new Book("1","aa","bb");
    static List<Book> books= Arrays.asList(book);
    BookService mockBookService = new BookService(mockBookRepository);
    @BeforeAll
    static void beforeTesting(){
        when(mockBookRepository.findById("1")).thenReturn(book);
        when(mockBookRepository.findAll()).thenReturn(books);
    }
    @Test
    @DisplayName("Отработка поиска книги по ID")
    void findBookById() {
        assertThat(mockBookService.findBookById("1")).isEqualTo(book);
    }

    @Test
    @DisplayName("Отработка поиска всех книг")
    void findAllBooks() {
        assertThat(mockBookService.findAllBooks()).isEqualTo(books);
    }
}