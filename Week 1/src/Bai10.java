import java.util.Scanner;

// Viết hàm tính DTBC nhận đối số là một mảng số thực các điểm số từ 0 đến
//10.
// Tính và trả về điểm trung bình của các điểm số. Nếu có điểm số không
//hợp lệ thì hàm trả về giá trị -1.
// Viết chương trình để gọi hàm này trong hàm
//main và với một mảng điểm khai báo và khởi gán sẵn, in ra số liệu mảng và
//kết quả gọi hàm.
public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of mark to calculate: ");
        int n = input.nextInt();
        double [] mark = new double[n];

        for (int i = 0 ; i < n; i++){
            System.out.print("Enter your marks (" + (i+1) + "/" + n + ") : " );
            mark[i] = input.nextDouble();
        }


        for (int i = 0 ; i < n; i++){
            System.out.print(mark[i] + " ");

        }


        System.out.println("\nThe average of your marks : " + calcAverage(mark));
    }
    private static double calcAverage(double[] mark){
        double s = 0.0d;
        double avg;
        for (int i = 0; i< mark.length; i++){
            if (mark[i]<0){
                return -1;
            }
            s = s + mark[i];
        }
        avg = s/ mark.length;

        return avg;
    }

}
