import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator(+-*/): "); // nếu để dòng này ở dưới thì nó sẽ nhận dấu enter
        op = sc.nextLine();

        System.out.println("Enter num1");
        num1 = sc.nextFloat();
        System.out.println("Enter num2");
        num2 = sc.nextFloat();

        if (op.equals("+")){
            System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1+num2));
        }else if(op.equals("-")){
            System.out.println("The result of " + num1 +" "+ op +" "+ num2 + " = " + (num1-num2));
        }else if(op.equals("*")){
            System.out.println("The result of " + num1 +" "+ op +" "+ num2 + " = " + (num1*num2));
        }else {
            System.out.println("The result of " + num1 +" "+ op +" "+ num2 + " = " + (num1/num2));
        }
    }
}
