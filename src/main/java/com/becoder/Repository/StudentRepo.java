package com.becoder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
