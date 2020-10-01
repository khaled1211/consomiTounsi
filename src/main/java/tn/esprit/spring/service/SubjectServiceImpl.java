package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	SubjectRepository subjectRepository;
	private static final Logger l = LogManager.getLogger(SubjectServiceImpl.class);

	@Override
	public Subject addSubject(Subject s) {

		return subjectRepository.save(s);
	}

	@Override
	public void deleteSubject(Long ids) {
		subjectRepository.deleteById(ids);
	}

	@Override
	public Subject updateSubject(Subject s) {

		return subjectRepository.save(s);
	}

	@Override
	public Subject retrieveSubject(String ids) {
		// TODO Auto-generated method stub
		return subjectRepository.findById(Long.parseLong(ids)).orElse(null);
	}

	@Override
	public List<Subject> retrieveAllSubjects() {
		// TODO Auto-generated method stub
		List<Subject> subjects = (List<Subject>) subjectRepository.findAll();
		for (Subject subject : subjects) {
	            
			l.info("subject +++:" + subject);
		}
		return subjects;
	}
	

	@Override
	public List<Subject> searchbest() {

		return subjectRepository.searchbest();

	}

	@Override
	public List<Subject> findByTitle(String title) {
		// TODO Auto-generated method stub
		return subjectRepository.findByTitle(title);
	}

	@Override
	public List<Subject> Subjectnew() {
		// TODO Auto-generated method stub
		return subjectRepository.Subjectnew();
	}

	@Override
	public List<Subject> search(String title) {
		 List<Subject> list =  (List<Subject>) subjectRepository.search(title); 
		  return list; }



	
	}


