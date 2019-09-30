package spring4test.webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import spring4test.webapp.model.Author;
import spring4test.webapp.model.Book;
import spring4test.webapp.model.Publisher;
import spring4test.webapp.repositories.AuthorRepository;
import spring4test.webapp.repositories.BookRepository;
import spring4test.webapp.repositories.PublisherRepository;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Publisher 1");

        publisherRepository.save(publisher);
        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234",publisher);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);



        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE development without EJB","12345",publisher);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);




    }
}
