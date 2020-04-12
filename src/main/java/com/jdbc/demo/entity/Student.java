package com.jdbc.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("student")
public class Student {
  @Id
  private Integer id;
  @Column("name")
  private String name;
  @Column("gender")
  private String gender;
  @Column("classId")
  private String classId;

  public Student(Integer id, String name, String gender, String classId) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.classId = classId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  @Override
  public String toString() {
    return "Student{" + id + ", " + name + ", " + gender + ", " + classId + "}";
  }
}