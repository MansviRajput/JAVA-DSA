package Striver.DSA;

public class MultiplyStrings {

    private static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "45";

        String result = multiply(num1, num2);

        System.out.println(num1 + " * " + num2 + " = " + result);

        // More test cases
        System.out.println(multiply("2", "3"));        // 6
        System.out.println(multiply("99", "99"));      // 9801
        System.out.println(multiply("123", "456"));    // 56088
        System.out.println(multiply("0", "12345"));    // 0
    }

    private static int multiplyWithConverting(String num1,String num2){
        int a  = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return a * b;

//        long a = Long.parseLong(num1);
//        long b = Long.parseLong(num2);
//        return a * b;

//        BigInteger a = new BigInteger(num1);
//        BigInteger b = new BigInteger(num2);
//        return a.multiply(b).toString();

//        String result =
//                new java.math.BigInteger(num1)
//                        .multiply(new java.math.BigInteger(num2))
//                        .toString();
    }
}