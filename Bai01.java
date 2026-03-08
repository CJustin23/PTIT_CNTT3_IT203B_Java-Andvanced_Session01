import java.util.Scanner;
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập năm sinh của bạn: ");
            String input = sc.nextLine();
            int namsinh = Integer.parseInt(input);
            int namhientai = 2026;
            int tuoi = namhientai - namsinh;
            System.out.println("Tuổi của bạn là: "+ tuoi);
        }catch (NumberFormatException e){
            System.out.println("Nhập năm sinh bằng số");
        }finally {
            sc.close();
            System.out.println("dọn dẹp tài nguyên...");
        }
    }
}