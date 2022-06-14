package pe.edu.upc.juantorres.controller;

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

import pe.edu.upc.juantorres.business.crud.CareerService;
import pe.edu.upc.juantorres.business.crud.StudentService;
import pe.edu.upc.juantorres.model.entity.Career;
import pe.edu.upc.juantorres.model.entity.Student;

@Controller
@RequestMapping("/students")

//esto es obligatorio para que se pueda guardar los elementos en la base de datos
@SessionAttributes("{student}")//esto se crea porque este elemento estoy creando en el html, y luego de agregar uno nuevo desde el html, se tiene que regresar al controller para guardar
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CareerService careerService;
	
	@GetMapping
	public String listStudents(Model model) {//el modelo ayuda en envia informacion al html
		try {
			List<Student> students=studentService.getAll();
			model.addAttribute("students", students);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "students/list-students";
	}
	
	@GetMapping("new") // esto es como hacer -> /students/new
	public String newStudent(Model model) {
		Student student =new Student();
		model.addAttribute("student", student);
		try {
			List<Career> careers=careerService.getAll();
			model.addAttribute("careers", careers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "students/new-student";
	}
	
	@PostMapping("savenew") // esto es lo mismo que -> /students/savenew
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {//el modelattribute asegura de guardar el elemento y solo va en los que son post
		try {
			Student studentSaved = studentService.create(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students";//el redirect es para que cargue la pagina despues de realizar algo(por ejemplo agregar un estudiante)
	}
	
	@GetMapping("{id}/edit") // esto es como hacer -> /students/1/edit
	public String editStudent(Model model,@PathVariable("id") Integer id) {//pathvariable se refiere al id, o sea para capturar el valor que viene
		try {
			if(studentService.existsById(id)) {
				Optional<Student> optional = studentService.findById(id);//esto es para buscar el elemento con ese id
				model.addAttribute("student", optional.get());//se pone get porque el optional es un contenedor y de ese contenedor tengo que sacar el elemento
				List<Career> careers = careerService.getAll();
				model.addAttribute("careers", careers);
			}
			else {
				return "redirect:/students";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "students/edit-student";
	}
	
	@PostMapping("{id}/update") // esto es lo mismo que -> /students/1->id/update
	public String updateStudent(Model model, @ModelAttribute("student") Student student, @PathVariable("id") Integer id) {
		try {
			if(studentService.existsById(id)) {//esot es para ver si existe el id
				studentService.update(student);
			}
			else {
				return "redirect:/students";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students";
	}
	
	@GetMapping("{id}/del") // esto es lo mismo que -> /students/1->id/del
	public String deleteStudent(Model model,  @PathVariable("id") Integer id) {
		try {
			if(studentService.existsById(id)) {
				studentService.deleteById(id);
			}
			else {
				return "redirect:/students";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/students";
	}
	

}
