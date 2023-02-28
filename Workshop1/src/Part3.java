
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[10];
        // input the list of names

        for(int i = 0; i<10;i++){
            System.out.println("Enter names");
            Scanner input = new Scanner(System.in);
            list[i] = input.nextLine();
        }
        // change the first character of all names to uppercase using toUpperCase()

        for (int i = 0;i<10;i++){
            String temp = list[i];
            list[i] = "";
            list[i] += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
            // print out
            System.out.print(list[i] + " ");
        }



    }
}
