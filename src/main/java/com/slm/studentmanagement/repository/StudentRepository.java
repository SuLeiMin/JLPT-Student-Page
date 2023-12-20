package com.slm.studentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slm.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	
	 @Query("SELECT s FROM Student s WHERE CONCAT(s.name, s.level, s.levelJP) LIKE %?1%")
	 public List<Student> search(String keyword);

}
