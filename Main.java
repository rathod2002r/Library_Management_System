import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Java Basics", "Rahul Rathod"));
        library.addBook(new Book("OOP in Java", "Sun Microsystems"));

        System.out.println("Welcome to Library Management System");

        while (true) {
            System.out.println("\n1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Thank you for using the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
