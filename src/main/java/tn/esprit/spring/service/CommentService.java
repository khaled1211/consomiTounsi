package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Comment;



public interface CommentService {
	List<Comment> retrieveAllComment();

	 
   
	Comment addComment(Comment c);

	void deleteComment(Long id);

	Comment updateComment(Comment c);

	Comment retrieveComment(String id);
	 public List<Comment> CommentTop();
	 

}
