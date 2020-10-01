package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CategorySubject;
import tn.esprit.spring.repository.CategorysRepository;

@Service
public class CategorySubjectImpl  implements CategorySubjectService {
	private static final Logger l= LogManager.getLogger(CategorySubjectImpl.class);
	@Autowired
	CategorysRepository categorysrepository;

	@Override
	public List<CategorySubject> retrieveAllCategorySubjects() {
		List<CategorySubject>categorysubjects=(List<CategorySubject>) categorysrepository.findAll();
		  for (CategorySubject categorysubject:categorysubjects) {
			  l.info("category +++:" +categorysubject);
		  }	
		  return categorysubjects;
		
	}

	@Override
	public CategorySubject addCategorys(CategorySubject s) {
		// TODO Auto-generated method stub
		return categorysrepository.save(s);
	}

	@Override
	public void deleteCategorySubject(Long idc) {
		// TODO Auto-generated method stub
		categorysrepository.deleteById(idc);
	}



	}

