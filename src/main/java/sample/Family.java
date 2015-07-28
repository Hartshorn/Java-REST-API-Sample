package sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The family class has two fields, a generated id and a lastName.
 */
@Entity
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String lastName;
	
	public long getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
}