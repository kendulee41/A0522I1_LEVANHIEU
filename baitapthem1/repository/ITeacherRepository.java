package baitapthem1.repository;

import baitapthem1.model.Teacher;

public interface ITeacherRepository {
    void addTeacher(Teacher teacher);

    void removeTeacher();

    void getAll();
}
