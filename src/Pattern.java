import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       // printPattern1(number);
       // printPattern2(number);
       // printPattern3(number);
       //printPattern4(number);
        //printPattern5(number);
        printPattern6(number);

    }
    static void printPattern1(int number){
        for (int i = 1; i<= number; i++){
            for (int j = 1; j <= i - 1; j++){
                System.out.print(j);
            }
            System.out.println();
            /*
            1
12
123
1234
12345

             */
        }
    }
    static void printPattern2(int number){
        /*
1234567
1234567
1234567
1234567
1234567
1234567
1234567

         */
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void printPattern3(int number){
        for (int i = 0; i < number; i++){
            /*
1
22
333
4444
55555
666666

             */
            for (int j = 0; j < i + 1; j++){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
    static void printPattern4(int number) {
        /*
1
12
123
1234
12345
         */
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void printPattern5(int number) {
        /*
         *    *
         **  **
         * ** *
         *    *
         *    *
         *    *
         */
        int n = number;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && i <= n/2) || (i + j == n + 1 && i <= n/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void printPattern6(int number){
        /*
         *
        ***
       *****
      *******
     *********
    ***********
         */
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number - i - 1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            for (int s = 0; s<number-i-1; s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
