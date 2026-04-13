package com.OOP;

public class wrapperFinal {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        swap(a,b);
        System.out.println("a = " + a + " b = " + b);
        //cant swap or modify things bcz its primitive datatype

        Integer x = 5;
        Integer y = 15;
        swap(x,y);
        System.out.println("x = " + x + " y = " + y);
        //cant modify bcz its the final class

//        final int bonus = 5;
//        bonus = 2;
//        cant modify bcz its the final

        final Student man = new Student("man");
        man.name = "amann";
        System.out.println(man.name);
        //the value is change

        //by this swapping is possible
        man.swap(0,0);
        System.out.println(man.num + " & " + man.num1);

//        man = new Student("new Name");
        //when non primitive is final you cant reassign them



    }

    static  void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }



}

class Student {
    int num = 10;
    int num1 = 20;
    String name;

    public Student(String name){
        this.name = name;
    }

    void swap(int num, int num1){
        int temp = this.num;
        this.num = this.num1;
        this.num1 = temp;
    }
}
