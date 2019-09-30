package spring4test.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring4test.webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
