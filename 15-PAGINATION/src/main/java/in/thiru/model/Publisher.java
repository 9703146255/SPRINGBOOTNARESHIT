package in.thiru.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="publisher_table")
public class Publisher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pub_id")
	private Integer pubId;
	
	@Column(name="pub_name")
	private String pubName;
	
	
	//already relationship is  defined for publishers same relation exists
	@ManyToMany(mappedBy = "publishers")
	private Set<Book> books;


	public Integer getPubId() {
		return pubId;
	}


	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}


	public String getPubName() {
		return pubName;
	}


	public void setPubName(String pubName) {
		this.pubName = pubName;
	}


	public Set<Book> getBooks() {
		return books;
	}


	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	
	public Publisher(String pubName) {
		super();
		this.pubName = pubName;
	}


	public Publisher() {}


	@Override
	public String toString() {
		String result = String.format("Publisher [id=%d, name='%s']%n", pubId, pubName);
		if (books != null) {
			for (Book book : books) {
				result += String.format("Book[id=%d, name='%s']%n", book.getBookId(), book.getBookName());
			}
		}

		return result;
	}
	
	
	
	
	
	
	
	
}
