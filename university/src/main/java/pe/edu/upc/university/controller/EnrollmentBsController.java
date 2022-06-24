package pe.edu.upc.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.university.business.crud.CourseService;
import pe.edu.upc.university.business.logic.EnrollmentBsService;
import pe.edu.upc.university.model.entity.Enrollment;

@Controller
@RequestMapping("/enrollments-bs")	// GET y POST
public class EnrollmentBsController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private EnrollmentBsService enrollmentBsService;
	
	@GetMapping("{idCurso}/list-students")
	public String listStudents(Model model, @PathVariable("idCurso") String id) {
		try {
			if (courseService.existsById(id)) {
				List<Enrollment> enrollments = enrollmentBsService.findByCourse(id);
				model.addAttribute("enrollments", enrollments);
				return "enrollments/list-enrollment-students";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:/courses-teacher";
	}
}
