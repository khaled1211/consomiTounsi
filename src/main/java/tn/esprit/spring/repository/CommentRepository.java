package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Comment;

public interface CommentRepository   extends CrudRepository<Comment,Long>  {
	 @Query("select c from Comment c  order by nblike desc")
	    List<Comment> CommentTop();
	
}

