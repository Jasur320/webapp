package spring4test.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring4test.webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
