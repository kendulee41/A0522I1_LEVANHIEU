package ss5_accessModifier_static.excercise.e2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setClasses("CO3");
        System.out.println(student.toString());
    }
}
