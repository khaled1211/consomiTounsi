package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Subject;


public interface SubjectService {

	List<Subject> retrieveAllSubjects();
	Subject addSubject(Subject s);

	void deleteSubject(Long ids);

	Subject updateSubject(Subject s);

	Subject retrieveSubject(String ids);
	public List<Subject>findByTitle (String title);
	 public List<Subject>searchbest();
	  public List<Subject> Subjectnew();
	  
	  

     public List<Subject> search( String title);
    
}
