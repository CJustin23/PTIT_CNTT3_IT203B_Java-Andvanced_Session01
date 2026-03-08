public class Bai05 {
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String msg) {
            super(msg);
        }
    }

    public static class User {
        private int age;

        public void setAge(int age) throws InvalidAgeException {
            if (age < 0) {
                throw new InvalidAgeException("Lỗi nghiệp vụ: Tuổi không được phép là số âm (" + age + ")!");
            }
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public class Main {
        public static void main(String[] args) {
            User user = new User();
            try {
                user.setAge(-10);
            } catch (InvalidAgeException e) {
                System.err.println("Thông báo lỗi: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.println("Chương trình vẫn tiếp tục chạy sau khi xử lý Custom Exception.");
        }
    }
}