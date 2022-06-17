package pe.edu.upc.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.university.business.crud.CourseService;
import pe.edu.upc.university.business.crud.EnrollmentService;
import pe.edu.upc.university.business.crud.StudentService;
import pe.edu.upc.university.business.crud.TeacherService;
import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Enrollment;
import pe.edu.upc.university.model.entity.Student;
import pe.edu.upc.university.utils.UserAuthentication;

@Controller
@RequestMapping("/enrollments")	// GET y POST
@SessionAttributes("{enrollment}")
public class EnrollmentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@Autowired
	private UserAuthentication userAuthentication;
	
	@GetMapping
	public String getEnrollments(Model model) {
		try {
			List<Enrollment> enrollments = enrollmentService.getAll();
			model.addAttribute("enrollments", enrollments);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "enrollments/list-enrollments";
	}
	
	@GetMapping("new")
	public String newEnrollment(Model model) {
		Enrollment enrollment = new Enrollment();
		model.addAttribute("enrollment", enrollment);
		try {
			List<Course> courses = courseService.getAll();
			model.addAttribute("courses", courses);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "enrollments/new-enrollment";
	}
	
	@PostMapping("savenew")
	public String saveEnrollment(Model model, @ModelAttribute("enrollment") Enrollment enrollment ) {
		if (userAuthentication.isAuthenticated()) {	// Enviar los datos del Segmento al html
			Integer id = userAuthentication.getIdSegment();
			try {				
				if (studentService.existsById(id)) {
					System.out.println("encontro");
					Optional<Student> optional = studentService.findById(id);
					enrollment.setStudent(optional.get());
					enrollmentService.create(enrollment);
					System.out.println("grabo");
					return "redirect:/enrollments";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:/enrollments";
	}
	
}
