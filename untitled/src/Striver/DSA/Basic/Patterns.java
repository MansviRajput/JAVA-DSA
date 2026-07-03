package Striver.DSA.Basic;

public class Patterns {
    public static void main(String[] args) {
//        Rectangular(5);
//        sideTriangle(4);
//        sideTriangleWithIncrementedNumber(4);
//        sideTriangleWithSameNumber(5);
//        downwardTriangleWithDecreased(4);
//        downwardTriangleWithDecreasedNumber(4);
//        triangle(4);
//        triangleDownward(4);
//        diamond(4);
//        rightSideTriangle(4);
//        binaryTriangle(4);
//        mountainNumber(5);
//        triangleWithIncrementNumber(5);
//        triangleWithAlphabeticalNumber(5);
//        triangleWithAlphabeticalNumberDownward(5);
//        triangleWithAlphabeticalNumberCommon(5);
//        triangleWithAlphabetWhole(4);
        complexSideTriangle(4);
    }

    private static void Rectangular(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void sideTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void sideTriangleWithIncrementedNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void sideTriangleWithSameNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void downwardTriangleWithDecreased(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void downwardTriangleWithDecreasedNumber(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleDownward(int n){
//        for(int i=0;i<n;i++){                       //1.
//            for(int s=0;s<i;s++){
//                System.out.print(" ");
//            }
//            for(int j=2*(n-i)-1;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){                       //2.
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int k=n-1-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamond(int n){

        //upward
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i + 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //downward
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightSideTriangle(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void binaryTriangle(int n){
        for(int i=0;i<n;i++){
            int start = (i%2 == 0) ? 1 : 0;
            for(int j=0;j<=i;j++){
                System.out.print(start+ " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    private static void mountainNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int s=0;s<=2*(n-i)-1;s++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void triangleWithIncrementNumber(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    private static void triangleWithAlphabeticalNumber(int n){
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    private static void triangleWithAlphabeticalNumberDownward(int n){
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=n;j>=i;j--){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    private static void triangleWithAlphabeticalNumberCommon(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    private static void triangleWithAlphabetWhole(int n){
        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print(ch);
            for(int j=0;j<i;j++){
                ch++;
                System.out.print(ch);
            }
            for(int j=1;j<=i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private static void complexSideTriangle(int n){
        for(int i=0; i<n; i++) {
            for(int j=n-i; j<=n; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }


}
