import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số người dùng: ");
        int tongnguoi = sc.nextInt();
        System.out.println("Nhập số nhóm muốn chia: ");
        int sonhom = sc.nextInt();
        try {
            int moinhom = tongnguoi/sonhom;
            System.out.println("Mỗi nhóm có "+ moinhom + " Người");

        }catch (ArithmeticException e){
            System.out.println("Không thể chia cho 0");
        }
        System.out.println("Tiếp tục chạy ...");
    }
}