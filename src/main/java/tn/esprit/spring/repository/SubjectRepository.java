package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Subject;



public interface SubjectRepository extends CrudRepository<Subject,Long> {

	public List<Subject>findByTitle (@Param("title") String title);
	/* public List<Subject>OrderByDate (); */
	
	
	
	  @Query("SELECT s FROM Subject s WHERE s.title LIKE '%' || :title || '%' ")
	  public List<Subject> search(@Param("title") String title);
	  
	 
	  @Query("SELECT s FROM Subject s WHERE s.evaluation>=8") 
	  public List<Subject>searchbest();
	  @Query("select s from Subject s  order by date desc ")
	
	    List<Subject> Subjectnew();
	  @Query("SELECT * FROM Subject s  join CategorySubject cs on  s.categorysubject=cs.idc where cs.nom:=nom ")
	  public List<Subject> searchbycategory(@Param("nom") String nom);
}