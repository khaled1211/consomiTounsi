package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.CategorySubject;
import tn.esprit.spring.entities.Subject;



public interface CategorySubjectService  {
	List<CategorySubject> retrieveAllCategorySubjects();

	 
	   
	CategorySubject addCategorys(CategorySubject s);

	void deleteCategorySubject(Long idc);
	




}
