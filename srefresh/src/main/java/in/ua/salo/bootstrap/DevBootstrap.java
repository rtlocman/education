package in.ua.salo.bootstrap;

import in.ua.salo.Repository.AuthorRepository;
import in.ua.salo.Repository.BookRepository;
import in.ua.salo.model.Author;
import in.ua.salo.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        System.out.println("The part of initData!!!");
        Author eric = new Author("Erik","Evant");
        Book ddd = new Book("Domain Driven Design","123","Harper", Set.of(eric));
        eric.getBooks().add(ddd);

        Author rod = new Author("Rod","Jhonson");
        Book noEJB = new Book("J2EE develop with out EJB","124","Worx");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(eric);
        authorRepository.save(rod);
        bookRepository.save(ddd);
        bookRepository.save(noEJB);

    }
}
