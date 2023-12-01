import java.util.Scanner;

public class Login {
    private Scanner scanner;
    private User[] users;
    private int userCount;

    public Login(Scanner scanner, int maxUsers) {
        this.scanner = scanner;
        this.users = new User[maxUsers];
        this.userCount = 0;
    }

    public User performLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
    
        // Thực hiện kiểm tra thông tin đăng nhập ở đây
        // Trong ví dụ này, đơn giản là kiểm tra nếu username là "admin" và password là "admin"
        if ("admin".equals(username) && "admin".equals(password)) {
            return new User(username);
        } else {
            return null; // Đăng nhập không thành công
        }
    }
    

    private User login() {
        // Hàm xử lý đăng nhập
        // ...
    }

    private User createAccount() {
        if (userCount < users.length) {
            System.out.print("Enter new username: ");
            String username = scanner.nextLine();
            System.out.print("Enter new password: ");
            String password = scanner.nextLine();

            User newUser = new User(username, false); // Tạo tài khoản mới với quyền user (không phải admin)
            users[userCount] = newUser; // Thêm vào mảng
            userCount++;

            System.out.println("Account created successfully!");
            return newUser;
        } else {
            System.out.println("Cannot create new account. Maximum users reached.");
            return null;
        }
    }

    public static class User {
        private String username;
        private boolean admin;

        public User(String username, boolean admin) {
            this.username = username;
            this.admin = admin;
        }

        public String getUsername() {
            return username;
        }

        public boolean isAdmin() {
            return admin;
        }
    }
}
