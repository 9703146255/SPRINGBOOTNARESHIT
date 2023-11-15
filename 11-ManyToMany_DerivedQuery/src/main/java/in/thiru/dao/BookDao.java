package in.thiru.dao;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Book;

public interface BookDao extends CrudRepository<Book, Integer>{
	
	
	public Iterable<Book> findByBookName(String bookName);

}
