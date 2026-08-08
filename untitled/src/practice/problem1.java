package practice;

import java.util.ArrayList;
import java.util.List;

public class problem1 {

    public static void main(String[] args) {
        System.out.println(isPalindrome3("abcba"));
        System.out.println(substrings("abcbad"));

    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    private static boolean isPalindrome3(String s) {
        return solve(s,0,s.length()-1);
    }

    private static boolean solve(String s,int i,int j) {
        if(s.charAt(i) != s.charAt(j)) {
            return false;
        }
        if(i >= j){
            return true;
        }
        return solve(s,i+1,j-1);
    }


//    private static String solution(String s){
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<s.length();j++){
//                if(solve(s,i,j)){
//
//                }
//            }
//        }
//    }

    private static String substrings(String s){
        int max = 0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(s,i,j)){
                    if(max<j-i+1){
                        max = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }

}

