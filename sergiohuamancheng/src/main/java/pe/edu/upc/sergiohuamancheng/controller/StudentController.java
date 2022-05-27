package pe.edu.upc.sergiohuamancheng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.sergiohuamancheng.business.crud.StudentService;
import pe.edu.upc.sergiohuamancheng.model.entity.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping // /students
	public String listStudents(Model model) {
		try {
			List<Student> students = studentService.getAll();
			model.addAttribute("students", students);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "students/list-students";
	}
}
