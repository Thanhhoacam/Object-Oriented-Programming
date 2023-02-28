



import java.lang.Math;

public class Bai3 {
    public static void main(String[] args) {

        float x,x1,x2,d;

        float a = Float.parseFloat(args[0]);

        float b = Float.parseFloat(args[1]);

        float c = Float.parseFloat(args[2]);

        if (a==0){

            if (b==0){
                System.out.println("The quadratic equation has no real solutions.");
            }else {
                x = c/b;
                System.out.println("Solving " + b + "x + " + c + " = 0" );
                System.out.println("x = " + x);
            }

        } else {

            d = b*b - (4*a*c);
            if (d<0){
                System.out.println("The quadratic equation has no real solutions.");

            } else if(d==0){
                System.out.println("The quadratic equation has one real solution.");
                x = (-b)/(2*a);
                System.out.println("x = " + x);
            } else{
                System.out.println("The quadratic equation has two real solutions");
                x1 = (float)(-b + Math.sqrt(d))/(4*a);
                x2 = (float)(-b - Math.sqrt(d))/(4*a);
                System.out.println("x1 = " + x1);
                System.out.printf("x2 = %.2f", x2);


            }
        }




    }
}
