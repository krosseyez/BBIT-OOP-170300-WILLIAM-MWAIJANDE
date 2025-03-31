
package com.mycompany.question1;

public class Question1 {

    public static void main(String[] args) {
          // Encapsulation
        Student student = new Student("John", 105);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        student.setGrade(85);
        System.out.println("Updated Grade: " + student.getGrade());

        // Method Overloading
        MathOperations mathOps = new MathOperations();
        System.out.println("2 * 3 = " + mathOps.multiply(2, 3));
        System.out.println("2 * 3 * 4 = " + mathOps.multiply(2, 3, 4));

        // Method Overriding
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
