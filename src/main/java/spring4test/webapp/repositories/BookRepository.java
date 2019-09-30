package spring4test.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring4test.webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
