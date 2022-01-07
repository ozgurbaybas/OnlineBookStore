package ozgurbaybas.OnlineBookStore.service;

import ozgurbaybas.OnlineBookStore.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
