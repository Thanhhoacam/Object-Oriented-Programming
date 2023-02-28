
//Viết chương trình giải phương trình ax + b = 0 với a, b là các số nguyên
//        nhập qua đối hàm main.




public class Bai2 {
    public static void main(String[] args) {

        float x;

        int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);
        if (a==0){
            System.out.println("Vo Nghiem");
        }else {
            x = (float)b/a;
            System.out.println("Solving " + a + "x + " + b + " = 0" );
            System.out.println("x = " + x);
        }
    }
}
