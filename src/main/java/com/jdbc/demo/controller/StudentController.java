package com.jdbc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jdbc.demo.service.StudentService;
import com.jdbc.demo.entity.Student;

@RequestMapping("student_sys")
@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/get/all")
  public Iterable<Student> getAll() {
    return studentService.getAllStudents();
  }

  @GetMapping("/get/{name}")
  public void getByName(@PathVariable String name) {
    Student student = studentService.getByStudentName(name);
    if (student == null) {
      System.out.println("该学生不存在");
    } else {
      System.out.println(student);
    }
  }

  @PostMapping("/post")
  public void post(@RequestBody Student student) {
    Student result = studentService.postStudent(student);
    if (result == null) {
      System.out.println("姓名重复");
    } else {
      System.out.println("添加成功");
    }
  }

  @DeleteMapping("/delete/{name}")
  public void delete(@PathVariable String name) {
    int result = studentService.deleteByStudentName(name);
    if (result == 0) {
      System.out.println("该学生不存在");
    } else {
      System.out.println("删除成功");
    }
  }
}
