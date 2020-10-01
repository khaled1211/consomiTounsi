package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Comment;
import tn.esprit.spring.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;
	private static final Logger l= LogManager.getLogger(CommentServiceImpl.class);


	@Override
	public Comment addComment(Comment c) {
		// TODO Auto-generated method stub
		return commentRepository.save(c);
	}

	@Override
	public void deleteComment(Long id) {
          commentRepository.deleteById(id);		
	}

	@Override
	public Comment updateComment(Comment c) {
		// TODO Auto-generated method stub
		return commentRepository.save(c);
	}

	@Override
	public Comment retrieveComment(String id) {
		// TODO Auto-generated method stub
		return commentRepository.findById(Long.parseLong(id)).orElse(null);
	}

	@Override
	public List<Comment> retrieveAllComment() {
		// TODO Auto-generated method stub
		List<Comment>comments=(List<Comment>)commentRepository.findAll();
		  for (Comment comment:comments) {
			  l.info("comment +++:" +comment);
		  }	
		  return comments;
		
	}

	@Override
	public List<Comment> CommentTop() {
		// TODO Auto-generated method stub
		return commentRepository.CommentTop();
	}

	
	

	
		
	}
	


