package com.becoder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.becoder.Model.Student;
import com.becoder.Repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentrepo;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		Student student = studentrepo.findById(id).get();
		
		if(student != null)
		{
			studentrepo.delete(student);
			return "Student deleted successfully";
		}
		return "Something went wrong";
	}

	@Override
	public Student editStudent(Student student, Integer id) {
		// TODO Auto-generated method stub
		Student oldStudent = studentrepo.findById(id).get();
		
		oldStudent.setName(student.getName());
		oldStudent.setAddress(student.getAddress());
		oldStudent.setContact(student.getContact());
		
		return studentrepo.save(oldStudent);
	}

}
