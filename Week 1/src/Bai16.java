// Viết hàm biến đổi số thập phân thành chuỗi nhị phân 8 bít.

// thập phân sang nhị phân thì chia 2 lien tục, lấy số dư * 10^p

import java.lang.Math;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your decimal number");
        int d = input.nextInt();
        decToBin(d);
    }

    private static void decToBin (int d){
        long bin = 0;
        int p = 0;
        int count = 0;
        while(d > 0){
            count ++;
            bin += (d%2) * Math.pow(10,p);
            p++;
            d = d/2;
        }
        if (bin>11111111){ // bigger than 8 bit is overloading
            System.out.println("Overloading");
        }else if (count ==0 ){
            System.out.println(bin);
        }else{
            for (int i= 0; i<(8-count); i++){ // print 0 for 8 bit enough
                System.out.print("0");

            }
            System.out.println(bin);
        }



    }
}
