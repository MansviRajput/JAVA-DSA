package practice;

// Write code that input is aaabbbbcccd return a3b4c3d1

public class problem {

    public static void main(String[] args) {
        String str = "aaabbbbcccd";
        System.out.println(solution1(str));
    }

    private static String solution(String str){
        if(str.length() == 0 || str==null){
            return "";
        }
        char[] arr = str.toCharArray();
        StringBuilder ans=new StringBuilder();
        int start=0;
        int end=1;
        int count=1;
        while(end<arr.length){
            if(arr[start]==arr[end]){
                end++;
                count++;
            }else{
                ans.append(arr[start]).append(count);
                start= end;
                end++;
                count=1;
            }
        }
        ans.append(arr[start]).append(count);
        return ans.toString();
    }

    private static String solution1(String str) {
        if (str == null || str.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();
    }
}
