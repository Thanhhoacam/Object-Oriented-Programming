//Viết chương trình in ra các số nguyên tố từ a đến b, với a, b nhập qua đối
//hàm main.




public class Bai5 {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);
        for (int i=a;i<=b;i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }
    private static boolean isPrime(int n){
        for (int i = 2; i <= (n/2); i++){
            if (n % i == 0){
                return false;
            }
        }


        return true;
    }
}
