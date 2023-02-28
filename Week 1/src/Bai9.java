



public class Bai9 {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);

        float e = Float.parseFloat(args[1]);
        System.out.println("S = " + tinhTong(a,e));
    }

    private static double tinhTong(int a, float e){
        double s = 0d;
        while(1/(float)a > e){
            s = s + 1/(float)a;

            a = a*a;
        }
        return s;
    }

}
