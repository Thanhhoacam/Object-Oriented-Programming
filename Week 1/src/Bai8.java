//Viết chương trình in ra dãy số Fibonaci là dãy số tự nhiên có số sau bằng
//tổng 2 số đi liền trước nó: 0, 1, 1, 2, 3, 5, 8, 13... cho đến n.

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        printFi(n);

    }
        private static void printFi(int n){

           int n1 = 0;
           int n2 = 1;
           int nextNumber = n1 + n2;
            System.out.println("Fibonacies : ");
            System.out.print(n1 + " ");
            System.out.print(n2 + " ");
           while(nextNumber<=n){

               System.out.print(nextNumber + " ");
               n1 = n2;
               n2 = nextNumber;
               nextNumber = n1 + n2;

           }
        }
}
