package com.jdbc.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jdbc.demo.repository.StudentRepository;
import com.jdbc.demo.entity.Student;


@Service
public class StudentService {
  @Autowired
  private StudentRepository studentRepository;

  public Iterable<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public Student getByStudentName(String name) {
    return studentRepository.get(name);
  }

  public Student postStudent(Student student) {
    Student result = getByStudentName(student.getName());
    if (result != null) {
      return null;
    } else {
      studentRepository.post(student.getId(), student.getName(), student.getGender(), student.getClassId());
      return student;
    }
  }

  public int deleteByStudentName(String name) {
    return studentRepository.delete(name);
  }
}
