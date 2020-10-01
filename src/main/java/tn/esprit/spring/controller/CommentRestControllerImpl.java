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

import tn.esprit.spring.entities.Comment;
import tn.esprit.spring.entities.Dictionnaire;
import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.service.CommentService;
import tn.esprit.spring.service.SubjectService;

@RestController

public class CommentRestControllerImpl {
 

	@Autowired
	CommentService commentservice;
	
	 @PostMapping("/addcomment")
	  @ResponseBody 
	  public Comment addComment(@RequestBody Comment c) {
		 if(c.getContents().contains(Dictionnaire.hp.toString()) || c.getContents().contains(Dictionnaire.azerty.toString() ) || c.getContents().contains(Dictionnaire.corona.toString())) {
			 c.setContents("???");;
			
			
			// throw new Exception("attention");
			 return commentservice.addComment(c);
			
		
			 
		 }else {
			
			  return commentservice.addComment(c);
			 

		}}
		
		 
	 
	 @GetMapping("/retrieveallcomments")
	  
	  @ResponseBody 
	  public List<Comment> getComment() { 
		  List<Comment> list=commentservice.retrieveAllComment();
	  return list; }
	 
      @DeleteMapping("/remove-comment/{comment-id}")
	  
	  @ResponseBody 
	  public void deleteComment(@PathVariable("comment-id") Long id) {
		  commentservice.deleteComment(id);; } // //
	  
	  @GetMapping("/showcomment/{comment-id}")
	  @ResponseBody
	  public Comment getComment(@PathVariable("comment-id") String id)
	  { return commentservice.retrieveComment(id);}


@PutMapping("/modify-comment")

@ResponseBody
public Comment modifyComment(@RequestBody Comment c) { 
	  return commentservice.updateComment(c); }


 
 

  @GetMapping("/top")
	  
 @ResponseBody
	  public List<Comment> getTopComment() { 
    	 List<Comment> list =  commentservice.CommentTop(); 
    	 return list; }
	




}

