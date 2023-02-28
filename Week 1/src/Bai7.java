//Viết chương trình in ra các số hoàn thiện từ 1 đến n. Số hoàn thiện là số có
//tổng các ước thực sự của nó bằng chính nó: Ví dụ: 6 = 1 + 2 + 3 là số hoàn
//thiện.

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            if (checkPerfectNumber(i))
                System.out.print(i + " ");
        }
    }

    private static boolean checkPerfectNumber(int n){
        int s = 0;
        for (int i = 1; i<=(n/2); i++){
            if (checkDivisor(i,n)){
                s = s + i;
            }
        }
        if (s==n)
            return true;
             return false;
    }
    private static boolean checkDivisor (int i, int n){
        if (n % i ==0)
            return true;
        return false;
    }
}
