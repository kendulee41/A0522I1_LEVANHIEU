package ss4_class_object.excercise.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta: "+delta);
        if (delta<0){
            System.out.println("The equation has no roots");
        }else if (delta==0){
            System.out.println("x1 = x2 = "+(-b/(2*a)));
        }else {
            System.out.println("x1 = "+quadraticEquation.getRoot1()+",\tx2 = "+quadraticEquation.getRoot2());
        }
    }
}
