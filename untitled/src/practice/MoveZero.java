package practice;

public class MoveZero {

    public static void moveZeroes(int[] nums){

        int index=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=0){

                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;

                index++;
            }
        }
    }

    public static void main(String[] args){

        int nums[]={1,0,3,0,12};

        moveZeroes(nums);

        for(int i:nums)
            System.out.print(i+" ");
    }
}