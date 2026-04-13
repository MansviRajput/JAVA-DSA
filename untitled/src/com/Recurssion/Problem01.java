package com.Recurssion;

//get the all possible solution to get the particular number in dice
//4 ->  1111,112,121,13,211,22,31,4
//4 with face 2 (1,2) -> 1111,112,121,211,22

import java.util.ArrayList;

public class Problem01 {

    public static void main(String[] args) {
//        dice("",4);
//        ArrayList<String> strings = diceNumberInList("", 4);
//        System.out.println(strings);

//        diceWithFace("",4,2);       //only the number till the face combination

        diceWithCount("",4,2,2);
    }

    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i <= 6 && i <= target;i++){
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceNumberInList(String p,int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1;i <= 6 && i <= target;i++){
            list.addAll(diceNumberInList(p+i,target-i));
        }
        return list;
    }

    static void diceWithFace(String p,int target,int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i <= face && i <= target;i++){
            diceWithFace(p+i,target-i,face);
        }
    }

    static ArrayList<String> diceNumberInListWithFace(String p,int target,int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1;i <= face && i <= target;i++){
            list.addAll(diceNumberInListWithFace(p+i,target-i,face));
        }
        return list;
    }

    static void diceWithCount(String p, int target, int face, int dice){

        if(target == 0 && dice == 0){
            System.out.println(p);
            return;
        }

        // invalid case
        if(target < 0 || dice == 0){
            return;
        }

        for(int i = 1; i <= face && i <= target; i++){
            diceWithCount(p + i, target - i, face, dice - 1);
        }
    }


}






