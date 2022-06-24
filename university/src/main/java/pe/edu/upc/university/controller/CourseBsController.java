package pe.edu.upc.university.controller;

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

import pe.edu.upc.university.business.crud.CourseService;
import pe.edu.upc.university.business.crud.TeacherService;
import pe.edu.upc.university.business.logic.CourseBsService;
import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Enrollment;
import pe.edu.upc.university.model.entity.Student;
import pe.edu.upc.university.model.entity.Teacher;
import pe.edu.upc.university.utils.UserAuthentication;

@Controller
@RequestMapping("/courses-teacher")
@SessionAttributes("{course}")
public class CourseBsController {

	@Autowired
	private CourseBsService courseBsService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private UserAuthentication userAuthentication;
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping
	public String getCoursesTeacher(Model model) {
		if (userAuthentication.isAuthenticated()) {	// Enviar los datos del Segmento al html
			Integer id = userAuthentication.getIdSegment();
			try {
				List<Course> courses = courseBsService.findByTeacher(id);
				model.addAttribute("courses", courses);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "courses/list-course-teacher";
		}
		return "redirect:/";	// Fala corregir, genera un bucle infinito
	}
	
	@GetMapping("new-course")
	public String newCourse(Model model) {		
		Course course = new Course();
		model.addAttribute("course", course);
		return "courses/new-course-teacher";
	}
	
	@PostMapping("save-new-course")
	public String saveNewCourse(Model model, @ModelAttribute("course") Course course ) {
		if (userAuthentication.isAuthenticated()) {	// Enviar los datos del Segmento al html
			Integer id = userAuthentication.getIdSegment();
			try {				
				if (teacherService.existsById(id)) {
					System.out.println("encontro teacher");
					Optional<Teacher> optional = teacherService.findById(id);
					course.setTeacher(optional.get());
					courseService.create(course);
					System.out.println("grabo course");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:/courses-teacher";
	}
	
	
}





