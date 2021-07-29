package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.Repositories.AuthorRepository;
import guru.springframework.spring5webapp.Repositories.BookRepository;
import guru.springframework.spring5webapp.Repositories.PublisherRepository;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Publisher publisher = new Publisher("NK Publication", "Sector 59", "Mohali", "Punjab", "160059");
		
		publisherRepository.save(publisher);
		
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Drtiven Design", "2121");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		ddd.setPublisher(publisher);
		authorRepository.save(eric);
		bookRepository.save(ddd);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development Wihtout EJB", "8080909");

		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		noEJB.setPublisher(publisher);
		authorRepository.save(rod);
		bookRepository.save(noEJB);

		publisher.getBooks().add(ddd);
		publisher.getBooks().add(noEJB);
		publisherRepository.save(publisher);
		System.out.println("------------------Started In Bootstrap");
		System.out.println("------------------Number of Books :" + bookRepository.count());
		System.out.println("------------------Number of Authors :" + authorRepository.count());
		System.out.println("------------------Number of Publisher" + publisherRepository.count());
	}

}
