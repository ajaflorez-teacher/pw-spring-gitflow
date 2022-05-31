package pe.edu.upc.diegovasquez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.diegovasquez.business.crud.CareerService;
import pe.edu.upc.diegovasquez.business.crud.StudentService;
import pe.edu.upc.diegovasquez.model.entity.Career;
import pe.edu.upc.diegovasquez.model.entity.Student;

@Controller
@RequestMapping("/students")
@SessionAttributes("{student}")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CareerService careerService;

	@GetMapping		//	/students
	public String listStudents(Model model) {
		
		try {
			List<Student> students = studentService.getAll();
			model.addAttribute("students", students);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "students/list-students";
	}
	
	@GetMapping("new")
	public String newStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		try {
			List<Career> careers = careerService.getAll();
			model.addAttribute("careers", careers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "students/new-student";
	}
	@PostMapping("savenew")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		try {
			Student studentSaved = studentService.create(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students";
	}
	
	
	
	
}