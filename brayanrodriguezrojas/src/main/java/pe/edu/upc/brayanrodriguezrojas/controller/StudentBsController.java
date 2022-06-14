package pe.edu.upc.brayanrodriguezrojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.brayanrodriguezrojas.business.crud.CareerService;
import pe.edu.upc.brayanrodriguezrojas.business.crud.StudentService;
import pe.edu.upc.brayanrodriguezrojas.model.entity.Career;
import pe.edu.upc.brayanrodriguezrojas.model.entity.Student;

@Controller
@RequestMapping("/students-bs")	// GET y POST
@SessionAttributes("{student}")
public class StudentBsController {
	
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
		
		return "students-bs/list-students";
	}
	
	@GetMapping("new")	//	/students/new
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
		return "students-bs/new-student";
	}
	
	@PostMapping("savenew")	//	/students/savenew
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		try {
			Student studentSaved = studentService.create(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students-bs";
	}
	
	@GetMapping("{id}/edit")	//	/students/1/edit
	public String editStudent(Model model, @PathVariable("id") Integer id) {				
		try {
			if (studentService.existsById(id)) {
				Optional<Student> optional = studentService.findById(id);
				model.addAttribute("student", optional.get());
				List<Career> careers = careerService.getAll();
				model.addAttribute("careers", careers);
			} else {
				return "redirect:/students-bs";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "students-bs/edit-student";
	}
	
	@PostMapping("{id}/update")	//	/students/1/update
	public String updateStudent(Model model, @ModelAttribute("student") Student student, 
			@PathVariable("id") Integer id) {
		try {
			if (studentService.existsById(id)) {
				studentService.update(student);
			} else {
				return "redirect:/students-bs";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students-bs";
	}
	
	@GetMapping("{id}/del")	//	/students/1/del
	public String deleteStudent(Model model, @PathVariable("id") Integer id) {
		try {
			if (studentService.existsById(id)) {
				studentService.deleteById(id);
			} else {
				return "redirect:/students-bs";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students-bs";
	}
	
	
}













