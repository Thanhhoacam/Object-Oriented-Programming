
//Viết chương trình Hello.java in ra màn hình dòng chữ “Welcome Andy” –
//Andy là họ tên của bạn – được truyền qua đối số hàm main khi chạy
//chương trình.
public class Bai1 {
    public static void main(String[] args) {
        String myName = args[0];
        System.out.println("Welcome " + myName);
    }
}
