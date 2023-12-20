package com.slm.studentmanagement.service;

import java.util.List;

import com.slm.studentmanagement.model.Student;

public interface StudentService {

	List < Student > getAllStudent();
    Student getStudentById(long id);
    void deleteStudentById(long id);
	void saveStudent(Student student);
	List<Student> listAll(String keyword);
}
