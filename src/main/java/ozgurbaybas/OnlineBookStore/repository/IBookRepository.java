package ozgurbaybas.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ozgurbaybas.OnlineBookStore.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {


}
