package com.LinearSearch;

import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Mansvi";
        char goal = 'M';
//		boolean ans = LinearSearchReturnBooleanValue(name, goal);
//		System.out.println(ans);

        boolean ans = LinearSearchReturnCharacterArray(name, goal);
        System.out.println(ans);

        //to iterate the String
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    //	search the target and return the boolean value True / False for string
    static boolean LinearSearchReturnBooleanValue(String name, char goal) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (goal == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean LinearSearchReturnCharacterArray(String name,char goal) {
        if (name.length() == 0) {
            return false;
        }

        for(char ch : name.toCharArray()) {
            if (ch == goal) {
                return true;
            }
        }
        return false;
    }

}



