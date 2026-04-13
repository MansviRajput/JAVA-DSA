package com.BinarySearch;

public class Problem01 {

    public static void main(String[] args) {
        char[] letter = { 'a','c','j','m','q'};
        char target = 'e';
        char ans = CeelingInLetter(letter,target);
        System.out.println(ans);


    }

    static char CeelingInLetter(char[] letter,char target) {
        int start = 0;
        int end = letter.length - 1;

        while(start<=end) {
            int mid =  start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
//		if(target > letter[letter.length - 1]) {
//			return letter[0];
//		}
//		else {
//		return letter[start];
//		}
        //more optimize way
        return letter[start % letter.length];
    }


}
