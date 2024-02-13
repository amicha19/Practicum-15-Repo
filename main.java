import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // constant declarations
        final double standard_membership_fee = 5.0;
        final double enhanced_membership_fee = 10.0;
        final double pro_membership_fee = 25.0;
        final double student_discount = 0.5;  // 50% discount

        // var declarations
        int membership_level;
        double membership_fee;
        String yn_response;

        Scanner input = new Scanner(System.in);

        // prompt user for membership level
        System.out.print("Enter your membership level (1, 2, or 3): ");
        membership_level = input.nextInt();

        // scan past lingering end-of-line character
        input.nextLine();

        // ask if a student
        System.out.print("Are you a student? (y/Y, n/N): ");
        yn_response = input.nextLine();

        // determine membership fee using switch statement
        switch (membership_level) {
            case 1:
                membership_fee = standard_membership_fee;
                break;
            case 2:
                membership_fee = enhanced_membership_fee;
                break;
            case 3:
                membership_fee = pro_membership_fee;
                break;
            default:
                System.out.println("Invalid membership level. Please enter 1, 2, or 3.");
                return;
        }

        // apply student discount if applicable
        if (yn_response.equalsIgnoreCase("y")) {
            membership_fee *= (1 - student_discount);
        }

        // display results
        System.out.printf("Membership Fee: $%.2f/month (%sstudent)\n", membership_fee, (yn_response.equalsIgnoreCase("y") ? "" : "not "));
    }
}

