// Viết hàm trả về các ước số của 1 số nguyên dương tùy ý – truyền qua đối
//số của hàm. Gọi hàm này và in kết quả ra màn hình.


import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0)");

        int n = input.nextInt();
        System.out.println("Divisors of " + n + " : ");
        for (int i = 1; i<= n;i++){
            if (checkDivisor(i,n)){
                System.out.print(i + " ");
            }
        }
    }


    private static boolean checkDivisor (int i, int n){
        if (n % i ==0)
            return true;
        return false;
    }
}
