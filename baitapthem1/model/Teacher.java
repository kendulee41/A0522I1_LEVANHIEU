package baitapthem1.model;

import java.util.Objects;

public class Teacher extends Person {
    private String specialize;

    public Teacher(int code, String name, String dayOfBirth, String gender, String specialize) {
        super(code, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public Teacher(int code) {
        super(code);
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
    @Override
    public String toString() {
        return "Person{" +
                "code='" + getCode() + '-' +
                "name='" + getName() + '-' +
                "dayOfBirth='" + getDayOfBirth() + '-' +
                "gender=" + getGender() + '-' +
                "specialize: "+ specialize+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getCode(), teacher.getCode());
    }
}
