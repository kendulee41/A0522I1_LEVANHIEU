package baitapthem1.repository;

import baitapthem1.model.Student;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);

    void removeStudent();

    void getAll();
}
