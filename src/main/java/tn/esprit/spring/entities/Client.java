package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Client extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
//	@ManyToMany
  //  private List<Subject> subjects;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	//private Set<Comment> comments;
	
	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public Client(long id, String firstName, String lastName, int telephone, String adresse, String email,
			Date datenaissance, Role role, Long id2) {
		super(id, firstName, lastName, telephone, adresse, email, datenaissance, role);
		id = id2;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
