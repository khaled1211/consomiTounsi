package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; // Clé primaire

	private String contents;
	@Temporal(TemporalType.DATE)
	private Date datecomment;
	private int nblike;
	private int nbdeslike;
	
	/*
	 * @Enumerated(EnumType.STRING) //@NotNull private Dictionnaire dic;
	 */
 
		
	@JsonIgnore
	@ManyToOne
	 private Subject subject;
	@ManyToOne
	 private Client client;


	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(long id, String contents, Date datecomment, int nblike, int nbdeslike) {
		super();
		this.id = id;
		this.contents = contents;
		this.datecomment = datecomment;
		this.nblike = nblike;
		this.nbdeslike = nbdeslike;
	}

	public Comment(long id, String contents, Date datecomment, int nblike, int nbdeslike, Subject subject) {
		super();
		this.id = id;
		this.contents = contents;
		this.datecomment = datecomment;
		this.nblike = nblike;
		this.nbdeslike = nbdeslike;
		this.subject = subject;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getDatecomment() {
		return datecomment;
	}
	public void setDatecomment(Date datecomment) {
		this.datecomment = datecomment;
	}
	public int getNblike() {
		return nblike;
	}
	public void setNblike(int nblike) {
		this.nblike = nblike;
	}
	public int getNbdeslike() {
		return nbdeslike;
	}
	public void setNbdeslike(int nbdeslike) {
		this.nbdeslike = nbdeslike;
	}

	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}


}
