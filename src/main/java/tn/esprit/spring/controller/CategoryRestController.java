package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.CategorySubject;
import tn.esprit.spring.service.CategorySubjectService;
@RestController
public class CategoryRestController {
	@Autowired
	CategorySubjectService cs;
	@PostMapping("/addcategory")
	@ResponseBody
	public CategorySubject addCategory(@RequestBody CategorySubject s) {
		CategorySubject categorysubject = cs.addCategorys(s);
		return categorysubject;
	} // //
	@GetMapping("/retrieve-all-categorys")

	@ResponseBody
	public List<CategorySubject> getCategorySubjects() {
		List<CategorySubject> list = cs.retrieveAllCategorySubjects();
	
		return list;
	}
	@DeleteMapping("/remove-category/{id-category}")

	@ResponseBody
	public void deleteCategory(@PathVariable("id-category") Long idc) {
		cs.deleteCategorySubject(idc);;
		;
	} // //
}
