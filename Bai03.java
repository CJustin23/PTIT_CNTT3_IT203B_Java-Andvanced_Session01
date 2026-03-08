public class Bai03 {
    public static class User {
        private int age;

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Tuổi không thể âm!");
            }
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public static void main(String[] args) {
            User user = new User();
            try {
                user.setAge(-5);
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi nghiệp vụ: " + e.getMessage());
            }
        }
    }
}
