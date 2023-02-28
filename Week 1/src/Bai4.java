//Viết hàm tính tổng S = 1 + 2 + 3 + … + n với n nhận qua đối số của hàm.

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();

        System.out.println("Sum from 1 to "+ n +" : " + calcSum(n));

    }
   private static int calcSum(int n){
        int s=0;
        for (int i=1;i<=n;i++){
            s = s +i;
        }

        return s;
   }
}
