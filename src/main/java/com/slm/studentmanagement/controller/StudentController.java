package com.slm.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.slm.studentmanagement.model.Student;
import com.slm.studentmanagement.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	 // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model,@Param("keyword") String keyword) {
    	List<Student> studentList = studentService.listAll(keyword);
        model.addAttribute("listStudents", studentList);
        model.addAttribute("keyword", keyword);
        return "index";
    }
    
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        // create model attribute to bind form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }
    
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        // save employee to database
       studentService.saveStudent(student);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
        Student student = studentService.getStudentById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("student", student);
        return "update_student";
    }
    
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.studentService.deleteStudentById(id);
        return "redirect:/";
    }
    
    

}
