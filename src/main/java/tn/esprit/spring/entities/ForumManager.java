package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ForumManager extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; // Clé primaire
	
	
	
	
	public ForumManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ForumManager(long id, String firstName, String lastName, int telephone, String adresse, String email,
			Date datenaissance, Role role, long id2) {
		super(id, firstName, lastName, telephone, adresse, email, datenaissance, role);
		id = id2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}
