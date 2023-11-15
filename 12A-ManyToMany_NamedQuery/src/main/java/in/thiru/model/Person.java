package in.thiru.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="table_person")

@NamedQueries(value = {
		 
		
		//Named query-1
		@NamedQuery(name="Person.giveDataByLastName", query="select p from Person p where p.lastName = ?1"),
		
		
		//Named query-2
		
		@NamedQuery(name="Person.giveDetails", query = "select p from Person p where p.lastName=?1 or p.firstName=?2"),
		
        
//		  @NamedQuery(name="Person.giveFewColumns",
//		  query = "select new in.thiru.model.CustomeType(p.firstName , p.lastName) from Person p where p.lastName=?1 "),
        
	


})
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="person_id")
	private Integer personId;
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="created_date")
	private Date createdDate;
	
	private String email;
	
	private Integer age;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated_Date() {
		return createdDate;
	}

	public void setCreated_Date(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public Person( String firstName, String lastName, String email, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdDate = new Date();
		this.email = email;
		this.age = age;
	}

	public Person() {}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", created_Date=" + createdDate + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
	
	
}
