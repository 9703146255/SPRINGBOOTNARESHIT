package in.thiru.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_tbl")
public class Ticket 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer TicketId;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStation;
	
	@Column(name="date_of_journey")
	private Date dateOfJourney;
	
	
	private String emailId;


	public Integer getTicketId() {
		return TicketId;
	}


	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestStation() {
		return destStation;
	}


	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}


	public Date getDateOfJourney() {
		return dateOfJourney;
	}


	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Ticket(String passengerName, String sourceStation, String destStation, Date dateOfJourney,
			String emailId) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destStation = destStation;
		this.dateOfJourney = dateOfJourney;
		this.emailId = emailId;
	}
	
	public Ticket() {}


	@Override
	public String toString() {
		return "Ticket [TicketId=" + TicketId + ", passengerName=" + passengerName + ", sourceStation=" + sourceStation
				+ ", destStation=" + destStation + ", dateOfJourney=" + dateOfJourney + ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	
}
