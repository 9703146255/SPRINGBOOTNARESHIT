package in.thiru.dao;

import java.util.Map;

import in.thiru.model.Student;

public interface IStudentDao 
{
  void addStudent(Student s);
  void modifyStudent(Student s);
  Student getOneStudent(Integer id);
  Map<Integer,Student> getAllStudents();
  void removeStudent(Integer id);
}
