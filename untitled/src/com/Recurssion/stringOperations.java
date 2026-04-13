package com.Recurssion;

import java.util.ArrayList;

public class stringOperations {
    public static void main(String[] args) {
//        skipCharacter("", "baccad");        //skip the c character
//
//        String string = skipCharacterReturnTypeString("baccdgstaa");        //skip the a charcter
//        System.out.println(string);
//
//        String string1 = skipTheString("bccdappleghji");            //skip the apple string
//        System.out.println(string1);
//
//        String str1 = skipTheRequiredString("angghkjappghjcnapple");        //skip the app string but not apple
//        System.out.println(str1);

//        subsetString("","abc");

//        ArrayList<String> list = subsetStringInList("", "abc");
//        System.out.println(list);

//        ArrayList<String> list01 = subsetStringInListWithAsciiValue("","abc");
//        System.out.println(list01);

//        subsetWithItsAsciiAndCharacter("","abc");

    }

    static void skipCharacter(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'c'){
            skipCharacter(p,up.substring(1));       //we can modify the substring if we write 2 then ch will be ignore the charchetr + 1
        }else{
            skipCharacter(p+ch,up.substring(1));
        }
    }


    static String skipCharacterReturnTypeString(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipCharacterReturnTypeString(up.substring(1));          //up.substring(1) -> "Take the string WITHOUT the first letter."
        }else{
            return ch + skipCharacterReturnTypeString(up.substring(1));
        }
    }

    static String skipTheString(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipTheString(s.substring(5));
        }else{
            return s.charAt(0) + skipTheString(s.substring(1));
        }
    }

    static String skipTheRequiredString(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple") ){
            return skipTheRequiredString(s.substring(3));
        }else{
            return s.charAt(0) + skipTheRequiredString(s.substring(1));
        }
    }

    static void subsetString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetString(p+ch,up.substring(1));
        subsetString(p,up.substring(1));
    }

    static ArrayList<String> subsetStringInList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetStringInList(p+ch,up.substring(1));
        ArrayList<String> right = subsetStringInList(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subsetStringInListWithAsciiValue(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetStringInListWithAsciiValue(p+ (ch+0) ,up.substring(1));
        ArrayList<String> right = subsetStringInListWithAsciiValue(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subsetWithItsAsciiAndCharacter(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsetWithItsAsciiAndCharacter(p + ch, up.substring(1));
        subsetWithItsAsciiAndCharacter(p + (int) ch, up.substring(1));
        subsetWithItsAsciiAndCharacter(p, up.substring(1));
    }

}
