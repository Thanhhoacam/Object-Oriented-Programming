//Viết chương trình in ra các số chính phương từ m đến n tùy ý.


import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter m");
        int m = input.nextInt();
        System.out.println("Enter n (n>m)");
        int n = input.nextInt();
        System.out.println("Perfect square from " + m + " to " + n + ": ");
        for (int i = m; i<=n; i++){
            if (checkPerfectSquare(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkPerfectSquare(int n){
        for (int i = 0; i<=(n/2); i++){
            if (i*i == n){
                return true;
            }
        }
        return false;
    }
}
