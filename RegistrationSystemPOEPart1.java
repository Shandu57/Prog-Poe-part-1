import java.util.Scanner;

/**
 * CONVOS Part 1 - console registration and login application.
 */
public class RegistrationSystemPOEPart1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printHeader();

        System.out.println("Let's create your CONVOS account.");
        System.out.println();

        System.out.print("First name: ");
        String firstName = input.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();

        System.out.print("Username: ");
        String username = input.nextLine().trim();

        System.out.print("Password: ");
        String password = input.nextLine();

        System.out.print("Cell phone number (example: +27838968976): ");
        String cellPhoneNumber = input.nextLine().trim();

        Login user = new Login(username, password, cellPhoneNumber, firstName, lastName);

        System.out.println();
        System.out.println("---------- Registration Check ----------");

        showValidation("Username", user.checkUserName(),
                "Username successfully captured.",
                "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");

        showValidation("Password", user.checkPasswordComplexity(),
                "Password successfully captured.",
                "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");

        showValidation("Cell number", user.checkCellPhoneNumber(),
                "Cell number successfully captured.",
                "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.");

        if (user.checkUserName() && user.checkPasswordComplexity() && user.checkCellPhoneNumber()) {
            System.out.println();
            System.out.println("Registration successful!");
            System.out.println();
            runLogin(input, user);
        } else {
            System.out.println();
            System.out.println("Registration could not be completed.");
            System.out.println("Please correct the invalid information and try again.");
        }

        input.close();
        System.out.println();
        System.out.println("Thank you for using CONVOS.");
    }

    private static void runLogin(Scanner input, Login user) {
        System.out.println("-------------- Login --------------");
        System.out.print("Enter your username: ");
        String loginUsername = input.nextLine().trim();

        System.out.print("Enter your password: ");
        String loginPassword = input.nextLine();

        System.out.println();
        System.out.println(user.returnLoginStatus(loginUsername, loginPassword));
    }

    private static void showValidation(String field, boolean valid,
                                       String successMessage, String errorMessage) {
        System.out.println(field + ":");
        System.out.println(valid ? "  " + successMessage : "  " + errorMessage);
    }

    private static void printHeader() {
        System.out.println("==========================================");
        System.out.println("                 CONVOS");
        System.out.println("       Registration & Login | Part 1");
        System.out.println("==========================================");
        System.out.println();
    }
}
