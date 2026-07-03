package Striver.DSA.Basic;

class whileLoop {
    public static void main(String[] args) {
        int sum = whileLoop(2);
        System.out.println(sum);
    }

    private static int whileLoop(int d) {
        // Your code goes here
        int sum = 0;
        
            int num = 1;
            int count = 0;
            
            while(count < 50){
                if(num % 10 == d){
                    sum += num;
                    count++;
                }
                num++;
            }
        
        return sum;  
    }
}