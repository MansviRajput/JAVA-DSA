package Striver.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergeOverlappingSubInterval {
    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();

        intervals.add(Arrays.asList(1, 5));
        intervals.add(Arrays.asList(3, 6));
        intervals.add(Arrays.asList(8, 10));
        intervals.add(Arrays.asList(15, 18));

        System.out.println(mergeOverlap(intervals));
    }

    private static List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
        Collections.sort(intervals,(a,b) -> Integer.compare(a.get(0), b.get(0)));
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> interval : intervals){
            if(result.isEmpty() || result.get(result.size()-1).get(1) < interval.get(0)){
                result.add(new ArrayList<>(interval));
            }else{
                List<Integer> last = result.get(result.size()-1);
                last.set(1,Math.max(last.get(1), interval.get(1)));
            }
        }
        return result;
    }
}
