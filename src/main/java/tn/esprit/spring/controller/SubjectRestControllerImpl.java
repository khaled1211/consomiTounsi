package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.service.SubjectService;

@RestController
public class SubjectRestControllerImpl {
	@Autowired
	SubjectService subjectservice;
	// Ajouter subject : http://localhost:8081/SpringMVC/consomitounsi/add

	@PostMapping("/addsubject")
	@ResponseBody
	public Subject addSubject(@RequestBody Subject s) {
		Subject subject = subjectservice.addSubject(s);
		return subject;
	} // //

	@GetMapping("/retrieve-all-subjects")

	@ResponseBody
	public List<Subject> getSubjects() {
		List<Subject> list = subjectservice.retrieveAllSubjects();
	
		return list;
	}

	// http://localhost:8081/SpringMVC/servlet/remove-subject/{subject-id}

	@DeleteMapping("/remove-subject/{subject-id}")

	@ResponseBody
	public void deleteSubject(@PathVariable("subject-id") Long ids) {
		subjectservice.deleteSubject(ids);
		;
	} // //

	@GetMapping("/showsubject/{subject-id}")
	@ResponseBody
	public Subject getSubject(@PathVariable("subject-id") String ids) {
	
     
		return subjectservice.retrieveSubject(ids);
	}

	@PutMapping("/modify-subject")

	@ResponseBody
	public Subject modifySubject(@RequestBody Subject s) {
		return subjectservice.updateSubject(s);
	}

	@GetMapping("/bestevaluation")

	@ResponseBody
	public List<Subject> getbestsubjects() {
		List<Subject> list = subjectservice.searchbest();
		return list;
	}
	
	@GetMapping("/search/{title}")

	@ResponseBody
	public List<Subject> findByTitle(@PathVariable(value = "title") String title){
		List<Subject> list = subjectservice.findByTitle(title);
		return list;
	}
	
	  @GetMapping("/new")
	  
	  @ResponseBody
     public List<Subject> Subjectnew(){ 
    	 List<Subject> list =  subjectservice.Subjectnew(); 
    	 return list; }
	 
	
	  @GetMapping("/searchlike/{title}")
	  
	  @ResponseBody 
	  public  List<Subject> search(@PathVariable(value = "title") String title) {
		  List<Subject> list =  subjectservice.search(title); 
		  return list; }
 

}