CREATE DATABASE student_sys;
USE student_sys;
SET SQL_SAFE_UPDATES = 0;

DROP TABLE IF EXISTS student;
CREATE TABLE student (
id SMALLINT,
name VARCHAR(160),
gender VARCHAR(8),
classId VARCHAR(20)
)