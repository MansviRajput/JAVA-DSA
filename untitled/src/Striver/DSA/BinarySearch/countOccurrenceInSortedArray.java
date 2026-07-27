package Striver.DSA.BinarySearch;

public class countOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;
        System.out.println(solution1(nums,target));
        System.out.println(solution2(nums,target));
    }

    private static int solution1(int[] nums, int target){
        if(nums.length == 0){
            return 0;
        }
        int first = countOccurrence(nums,target,true);
        if(first == -1){
            return 0;
        }
        int last = countOccurrence(nums,target,false);

        return last - first + 1;
    }

    private static int countOccurrence(int[] nums,int target,boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    private static int solution2(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start < nums.length && nums[start] != target){
            start++;
        }
        while(end >= 0 && nums[end] != target){
            end--;
        }
        return end-start+1;
    }
}
