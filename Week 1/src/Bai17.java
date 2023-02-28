//Viết hàm biến đối chuỗi nhị nhân thành số thập phân

import java.util.Scanner;

// biến nhị phân sang thập phân thì chia liên tục cho 10, lấy số dư nhân với 2^p
public class Bai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your binary number");
        int b = input.nextInt();
        binToDec(b);
    }

    private static void binToDec (int b){
        long dec = 0;
        int p = 0;
        int count = 0;
        while(b > 0){
            count = count +1;
            dec += (b%10) * Math.pow(2,p);
            p++;
            b = b/10;
        }
        System.out.println(dec);


    }
}
