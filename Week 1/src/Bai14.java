
//Viết hàm nhận đối số là một điểm số từ 0 đến 10, chuyển đổi điểm số này
//thành điểm chữ theo qui tắc điểm A: 8.5 - 10, B: 7 - 8.4, C: 5.5 – 6.9, D: 4 -
//5.4, F: 0 - 3.9.


import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        double score = input.nextDouble();
        convertScore(score);
    }
    private static void convertScore(double score){
        if (score<=10 && score>=8.5){
            System.out.println("A");
        }else if (score<=8.4 && score >=7){
            System.out.println("B");
        }else if (score<=6.9 && score >=5.5) {
            System.out.println("C");
        }else if (score<=5.4 && score >=4){
            System.out.println("D");
        }else if (score<=3.9 && score >=0) {
            System.out.println("F");
        }else{
            System.out.println("Invalid score");
        }
    }
}
