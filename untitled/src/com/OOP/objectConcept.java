package com.OOP;

public class objectConcept {
    public static void main(String[] args) {

        //constructor with default value
        Student man = new Student();
//        System.out.println(man.rno);
//        System.out.println(man.name);
//        System.out.println(man.marks);

        //argument constructor
        Student man2 = new Student(15,"jaydev",93);
//        System.out.println(man2.rno);
//        System.out.println(man2.name);
//        System.out.println(man2.marks);

        //calling the constructor for modify the arguement value
//        man2.changeName("jahan");
//        System.out.println(man2.name);

        //passing object in the object argument
//        Student obj = new Student(man3);
//        System.out.println(obj.marks);

        //calling another function with the function using this -> imp for that comment out other Student with same method
//        Student self = new Student();
//        System.out.println(self.marks);

        //reference behavior on object
        Student one = new Student();
        Student two = one;
        one.name = "yuvi";
        System.out.println(two.name);
    }

    static class Student{
        int rno;
        String name;
        float marks;

//        Student(){
//            this.rno=50;
//            this.name="Mansvi";
//            this.marks=96.5f;
//        }

        //calling another function with the function using this -> imp for that comment out other Student with same method
        Student(){
            this (53,"natin",63.2f);
        }


        //calling the constructor with the argument
        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }

        //calling the constructor for modify the arguement value
        void changeName(String name){
            this.name=name;
        }

        //passing object in the object argument
        Student(Student obj){
            this.rno=obj.rno;
            this.name=obj.name;
            this.marks=obj.marks;
        }


    }
}
