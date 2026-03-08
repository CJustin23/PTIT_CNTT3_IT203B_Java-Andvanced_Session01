import java.io.IOException;

public class Bai04 {

    public static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            System.out.println("Chốt chặn cuối cùng tại main: " + e.getMessage());
        }
        System.out.println("Chương trình kết thúc an toàn sau khi xử lý lỗi.");
    }

    public static void processUserData() throws IOException {
        saveToFile();
    }

    public static void saveToFile() throws IOException {
        throw new IOException("Lỗi: Không thể truy cập ổ cứng để lưu file!");
    }
}