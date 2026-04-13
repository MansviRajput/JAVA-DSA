package com.BinarySearch;

//Split array largest sum
//given non negative array where you can split the array into m non empty continuos subarrays
//write an algorithm to minimize the largest sum among these m arrays
//[7,2,5,10,8]
//split1					split2				largest sum
//[7,2,5,10](24)			[8](8)				24
//[7,2,5](14)				[10,8](18)			18(minimize)
//[7,2](9)					[5,10,8](23)		23
//[7](7)					[2,5,10,8](25)		25

public class Problem08 {

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.print(splitArray(arr,m));

    }

    static int splitArray(int[] nums,int m) {
        int start = 0;
        int end = 0;

        for(int i = 0;i < nums.length;i++) {
            start = Math.max(start,nums[i]);//in the end this contain the max items from the array
            end += nums[i];
        }

        //binary search
        while(start < end) {
            //try for the middle as a potential answer
            int mid = start + (end-start)/2;

            //calculate how many pieces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                    //you can not excced the limit make new array
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }



    //another method to work with it
    public int splitArrayAnotherMethod(int[] nums, int k) {
        int left = 0, right = 0;

        for (int num : nums) {
            left = Math.max(left, num); // max element
            right += num;               // sum of all elements
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int pieces = 1;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    pieces++;
                    sum = num;

                    if (pieces > k) break; // ✅ early exit
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // ✅ same as right
    }
}

