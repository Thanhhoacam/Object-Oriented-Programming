// Viết hàm tính DTBCHT nhận đối số là điểm số của các môn học và hệ số
//tương ứng của các môn học.
// Tính trung bình chung có hệ số của các môn
//học.
// Viết chương trình để gọi hàm này trong hàm main với các điểm số và
//hệ số khai báo và khởi gán sẵn, in ra số liệu mảng và kết quả gọi hàm.


import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of mark to calculate: ");
        int n = input.nextInt();
        double [] mark = new double[n];
        double [] base = new double [n];

        for (int i = 0 ; i < n; i++){
            System.out.print("Enter your marks (" + (i+1) + "/" + n + ") : " );
            mark[i] = input.nextDouble();
            System.out.print("Enter your base (" + (i+1) + "/" + n + ") : " );
            base[i] = input.nextDouble();
        }

        System.out.println("Marks : ");
        for (int i = 0 ; i < n; i++){
            System.out.print(mark[i] + " ");

        }

        System.out.println("\nBases : ");
        for (int i = 0 ; i < n; i++){
            System.out.print(base[i] + " ");
        }

        System.out.println("\nThe average of your marks : " + calcAverage(mark, base));
    }

    private static double calcAverage(double[] mark, double[] base){
        double s = 0.0d;
        double sB = 0.0d;
        double avg;
        for (int i = 0; i< mark.length; i++){
            if (mark[i]<0 || base[i]<0){
                return -1;
            }

            s = s + mark[i];
            sB = sB + base[i];

        }
        avg = s/ sB;

        return avg;
    }
}
