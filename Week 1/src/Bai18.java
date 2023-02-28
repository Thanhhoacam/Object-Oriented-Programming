
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        String[] list1 = new String[20];
        String[] list2 = new String[20];
        String[] list3 = new String[20];

        //list1
        // input the list of names


            System.out.println("Enter fName");
            Scanner input = new Scanner(System.in);
            list1[19] = input.nextLine();

        // change the first character of all names to uppercase using toUpperCase()


            String temp = list1[19];


            list1[19] = "";
            list1[19] += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);



        //list2
        // input the list of names


        System.out.println("Enter mName");

        list2[19] = input.nextLine();

        // change the first character of all names to uppercase using toUpperCase()


        String temp2 = list2[19];
        list2[19] = "";
        list2[19] += String.valueOf(temp2.charAt(0)).toUpperCase() + temp2.substring(1);


        //list3
        // input the list of names


        System.out.println("Enter lName");

        list3[19] = input.nextLine();

        // change the first character of all names to uppercase using toUpperCase()


        String temp3 = list3[19];
        list3[19] = "";
        list3[19] += String.valueOf(temp3.charAt(0)).toUpperCase() + temp3.substring(1);
        // print out
        System.out.print(list1[19] + " " + list2[19] + " " + list3[19]);

    }
}
