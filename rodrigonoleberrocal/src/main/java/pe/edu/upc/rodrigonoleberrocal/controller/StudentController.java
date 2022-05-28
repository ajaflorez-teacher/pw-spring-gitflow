package pe.edu.upc.rodrigonoleberrocal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.rodrigonoleberrocal.model.entity.Student;
import pe.edu.upc.rodrigonoleberrocal.business.crud.StudentService;


@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

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
}
