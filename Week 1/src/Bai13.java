// Viết hàm nhận đối số là một mảng điểm số từ 0 đến 10. Hàm trả về các
//điểm số >= 5. Nếu có điểm số không hợp lệ hoặc không có điểm nào >= 5
//thì hàm trả về null. Gọi hàm này và in kết quả ra màn hình.

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of your score ");
        int n = input.nextInt();
        double[] score = new double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Enter your score (" + (i+1) + "/" + n + ") : " );
            score[i] = input.nextDouble();
        }
// array number > 5
        double[] a = printScore(score);
        for (int i = 0 ; i< a.length; i++){
            System.out.print(a[i] + " ");
        }

    }

    private static double[] printScore(double[] score){
        int count = 0;


        for (int i = 0; i< score.length ; i++){
            if(score[i] > 5){
                count++; // lấy length array
            }
        }
        if (count == 0){
            return null;
        }

        double[] big5 = new double[count];
        int k = 0;
        for (int i = 0; i < score.length ; i++){

            if(score[i] > 5){
                big5[k] = score[i];
                k++;
            }
        }
            return big5;

    }
}
