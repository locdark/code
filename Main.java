import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerList computerList = ObjectFileHandler.readObjectFromFile("data.txt", ComputerList.class);

        if (computerList == null) {
            computerList = new ComputerList(10);
        }

        Login loginManager = new Login(scanner, 10);
        Login.User loggedInUser = null;

        while (true) {
            System.out.println("---- Computer Management System ----");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới để xử lý lỗi nhập không mong muốn

            switch (choice) {
                case 1:
                    loggedInUser = loginManager.performLogin();
                    if (loggedInUser != null) {
                        System.out.println("Login successful. Welcome, " + loggedInUser.getUsername() + "!");
                        manageComputers(loggedInUser, computerList, scanner);
                    } else {
                        System.out.println("Login failed. Invalid username or password.");
                    }
                    break;
                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageComputers(Login.User user, ComputerList computerList, Scanner scanner) {
        if (user.isAdmin()) {
            // Menu quản lý cho admin
            while (true) {
                System.out.println("---- Admin Menu ----");
                System.out.println("1. Add Computer");
                System.out.println("2. Update Computer");
                System.out.println("3. Delete Computer");
                System.out.println("4. Search Computer");
                System.out.println("5. Display All Computers");
                System.out.println("6. Save and Exit");
                System.out.print("Enter your choice: ");

                int adminChoice = scanner.nextInt();
                scanner.nextLine(); // Đọc dòng mới để xử lý lỗi nhập không mong muốn

                switch (adminChoice) {
                    case 1:
                        Computer newComputer = new Computer();
                        newComputer.infoProduct();
                        newComputer.computerInfo();
                        computerList.addComputer(newComputer);
                        break;
                    case 2:
                        // Xử lý chức năng cập nhật cho admin
                        // ...
                        break;
                    case 3:
                        // Xử lý chức năng xóa cho admin
                        // ...
                        break;
                    case 4:
                        // Xử lý chức năng tìm kiếm cho admin
                        // ...
                        break;
                    case 5:
                        System.out.println("All Computers:");
                        computerList.displayAll();
                        break;
                    case 6:
                        ObjectFileHandler.writeObjectToFile(computerList, "data.txt");
                        System.out.println("Data has been saved to file.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            // Menu quản lý cho user thường
            while (true) {
                System.out.println("---- User Menu ----");
                System.out.println("1. Search Computer");
                System.out.println("2. Display All Computers");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int userChoice = scanner.nextInt();
                scanner.nextLine(); // Đọc dòng mới để xử lý lỗi nhập không mong muốn

                switch (userChoice) {
                    case 1:
                        // Xử lý chức năng tìm kiếm cho user
                        // ...
                        break;
                    case 2:
                        System.out.println("All Computers:");
                        computerList.displayAll();
                        break;
                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
