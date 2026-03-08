import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai06 {


    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String msg) {
            super(msg);
        }
    }

    public static class User {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) throws InvalidAgeException {
            if (age < 0) {
                throw new InvalidAgeException("Tuổi không được phép là số âm: " + age);
            }
            this.age = age;
        }

        public void displayName() {
            if (this.name != null) {
                System.out.println("Tên người dùng: " + this.name.toUpperCase());
            } else {
                System.out.println("Tên người dùng chưa được thiết lập (Null).");
            }
        }
    }

    public class UserManagementSystem {

        private static void logError(String message) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.err.println("[ERROR] " + timestamp + " - " + message);
        }

        public static void divideUsersIntoGroups(int totalUsers, int groups) {
            if (groups == 0) {
                logError("Thao tác chia nhóm thất bại: Số lượng nhóm bằng 0.");
                return;
            }
            System.out.println("Mỗi nhóm có: " + (totalUsers / groups) + " người.");
        }

        public static void main(String[] args) {
            User user = new User();

            try {
                user.setAge(-5);
            } catch (InvalidAgeException e) {
                logError("Vi phạm quy tắc nghiệp vụ: " + e.getMessage());
            }

            user.displayName();

            divideUsersIntoGroups(100, 0);

            System.out.println("Hệ thống kết thúc vận hành an toàn.");
        }
    }
}