package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ids; // Clé primaire
	@Column(name = "title", nullable = false, unique = true)

	private String title;

	@Temporal(TemporalType.DATE)
	private Date date;

	private int evaluation;

	
	
	@ManyToOne
	private CategorySubject categorysubject;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
	public Set<Comment> comments;


	@ManyToMany(cascade = CascadeType.ALL)
	private List<Client> clients;

	public Subject(long ids, String title, Date date, int evaluation) {
		super();
		this.ids = ids;
		this.title = title;

		this.date = date;
		this.evaluation = evaluation;
	}

	

	public Subject(long ids, String title, Date date, int evaluation, CategorySubject categorysubject,
			Set<Comment> comments) {
		super();
		this.ids = ids;
		this.title = title;
		this.date = date;
		this.evaluation = evaluation;
		this.categorysubject = categorysubject;
		this.comments = comments;
	}

	public CategorySubject getCategorysubject() {
		return categorysubject;
	}

	public void setCategorysubject(CategorySubject categorysubject) {
		this.categorysubject = categorysubject;
	}

	public long getIds() {
		return ids;
	}

	public void setIds(long ids) {
		this.ids = ids;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Subject(long ids, String title, Date date, int evaluation, Set<Comment> comments) {
		super();
		this.ids = ids;
		this.title = title;

		this.date = date;
		this.evaluation = evaluation;

		this.comments = comments;

	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
