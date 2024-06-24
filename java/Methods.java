package com.methods.java;

public class Methods {
    public static void main(String[] args) {


        StateAndBehaviour StudentDetails1 = new StateAndBehaviour();

        StudentDetails1.NAME = "hari";
        StudentDetails1.id = 13;
        StudentDetails1.branch = "ece";
        StudentDetails1.age = 34;
        StudentDetails1.percentage = 95;

        StudentDetails1.basicInformation();

        StateAndBehaviour StudentDetails2 = new StateAndBehaviour();

        StudentDetails2.NAME = "ramesh";
        StudentDetails2.id = 115;
        StudentDetails2.branch = "cse";
        StudentDetails2.age = 43;
        StudentDetails2.percentage = 92;
        StudentDetails2.basicInformation();

        StateAndBehaviour StudentDetails3 = new StateAndBehaviour();

        StudentDetails3.NAME = "swapna";
        StudentDetails3.id = 115;
        StudentDetails3.branch = "cse";
        StudentDetails3.age = 65;
        StudentDetails3.percentage = 68;

        StudentDetails3.basicInformation();


        StudentDetails2.memberShip(StudentDetails2.NAME + "product name:" + "laptop");

        System.out.println(StudentDetails2.NAME + " discount percentage:" + StudentDetails2.discountPercentageByAge());

        System.out.println("theFinalPrice:" + StudentDetails1.NAME + "is $" + StudentDetails1.discountPercentageByPercentage(256543));


    }
}


