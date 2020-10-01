package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CategorySubject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idc; // Clé primaire
	@Column(nullable =false,unique=true )
	 
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="categorysubject")
	public Set<Subject> subjects;
	public long getIdc() {
		return idc;
	}
	public void setIdc(long idc) {
		this.idc = idc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

}
