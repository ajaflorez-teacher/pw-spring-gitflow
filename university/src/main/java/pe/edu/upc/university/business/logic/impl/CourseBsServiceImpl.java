package pe.edu.upc.university.business.logic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.university.business.logic.CourseBsService;
import pe.edu.upc.university.model.entity.Course;
import pe.edu.upc.university.model.entity.Teacher;
import pe.edu.upc.university.model.repository.CourseRepository;
import pe.edu.upc.university.model.repository.TeacherRepository;

@Service
public class CourseBsServiceImpl implements CourseBsService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public List<Course> findByTeacher(Integer id) throws Exception {
		if (teacherRepository.existsById(id)) {
			Optional<Teacher> optional = teacherRepository.findById(id);
			return courseRepository.findByTeacher(optional.get());
		} else {
			return new ArrayList<Course>();
		}
	}
	
}
