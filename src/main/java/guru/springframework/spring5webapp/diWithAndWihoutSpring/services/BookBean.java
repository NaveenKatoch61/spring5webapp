package guru.springframework.spring5webapp.diWithAndWihoutSpring.services;

import org.springframework.stereotype.Component;

@Component
public class BookBean {
	
	String book="sumit";
	
	
	
	public String getBook() {
		return book;
	}



	public void setBook(String book) {
		this.book = book;
	}



	public BookBean() {
		System.out.println("ss");
	}

}
