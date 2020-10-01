package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.CategorySubject;

public interface CategorysRepository  extends CrudRepository<CategorySubject, Long>{
	
	 
	 

}
