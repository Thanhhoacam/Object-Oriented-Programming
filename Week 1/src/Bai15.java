// Viết hàm nhận đối số là điểm chữ, qui đổi ra điểm số theo qui tắc A: 4, B:
//3, C: 2, D: 1, F: 0. Nếu đối số không phải là A - F thì trả về -1.

import java.util.Scanner;


public class Bai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        char score = input.next().charAt(0); // return the first character in string
            int cScore = convertScore(score);
        System.out.println("Your score is : " + cScore);

    }
    private static int convertScore(char score){
        if (score == 'A' || score == 'a'){
            return 4;
        }else if (score=='B' || score == 'b'){
            return 3;
        }else if (score=='C' || score == 'c') {
            return 2;
        }else if (score=='D' || score == 'd'){
            return 1;
        }else if (score=='F' || score == 'f') {
            return 0;
        }else{
            return -1;
        }
    }
}
