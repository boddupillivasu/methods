package com.methods.java;

public class Objects {
    public static void main(String[] args) {


        StateAndBehaviour StudentDetails = new StateAndBehaviour();

        System.out.println("student1 name:" + StudentDetails.NAME);
        System.out.println("student1 id :" + StudentDetails.id);
        System.out.println("student1 branch:" + StudentDetails.branch);
        System.out.println("student1 percentage:" + StudentDetails.age);

        StudentDetails.NAME = "hari";
        StudentDetails.id = 13;
        StudentDetails.branch = "ece";
        StudentDetails.age = 92;

        System.out.println("student1 name:" + StudentDetails.NAME);
        System.out.println("student1 id :" + StudentDetails.id);
        System.out.println("student1 branch:" + StudentDetails.branch);
        System.out.println("student1 percentage:" + StudentDetails.age);

        StateAndBehaviour StudentDetails1;

        StudentDetails1 = new StateAndBehaviour();

        StudentDetails1.NAME = "ramesh";
        StudentDetails1.id = 115;
        StudentDetails1.branch = "cse";
        StudentDetails1.age = 95;

        // StudentDetails1.percentage = StudentDetails.percentage ;

        System.out.println("student2 name:" + StudentDetails1.NAME);
        System.out.println("student2 id :" + StudentDetails1.id);
        System.out.println("student2 branch:" + StudentDetails1.branch);
        System.out.println("student2 percentage:" + StudentDetails1.age);

        StateAndBehaviour StudentDetails3;
        StudentDetails3 = StudentDetails1;

        System.out.println("student3 name:" + StudentDetails3.NAME + "babu");
        System.out.println("student3 id :" + StudentDetails3.id);
        System.out.println("student3 branch:" + StudentDetails3.branch);
        System.out.println("student3 percentage:" + StudentDetails3.age);
    }
}


