package baitapthem1.model;

import java.util.Objects;

public class Student extends Person{
    private String classname;
    private double point;

    public Student(int code) {
        super(code);
    }
    public Student(){}

    public Student(int code, String name, String dayOfBirth, String gender, String classname, double point) {
        super(code, name, dayOfBirth, gender);
        this.classname = classname;
        this.point = point;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code:" + getCode()+ '-' +
                "name:" + getName()+ '-' +
                "date of birth:" + getDayOfBirth()+ '-' +
                "gender:" + getGender()+ '-' +
                "classname='" + classname + '-' +
                "point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getCode(), student.getCode());
    }
}
