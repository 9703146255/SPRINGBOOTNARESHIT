package in.thiru.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student implements Serializable
{
	private static final long serialVersionUID = -6985152490215779106L;
	private Integer stdId;
	private String stdName;
	private Double stdFee;
	
	
	
	public Student(Integer stdId, String stdName, Double stdFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	
	
	
	
	
	
	
	

}
