package com.jdbc.demo.repository;

import com.jdbc.demo.entity.Student;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository<Student, Integer> {

  @Query("SELECT * FROM student WHERE name = :name;")
  Student get(@Param("name") String name);

  @Modifying
  @Query("INSERT INTO student VALUES (:id, :name, :gender, :classId);")
  void post(@Param("id") Integer id,
           @Param("name") String name,
           @Param("gender") String gender,
           @Param("classId") String classId);

  @Modifying
  @Query("DELETE FROM student WHERE name = :name;")
  int delete(@Param("name") String name);
}
