// Practicum 15 (Membership Fee Program)
// (TO COMPLETE)
//
// This program should prompt the user for one of three 
// membership levels for an online site AND whether they are
// a student or not.
//
//    1 - Standard Membership
//    2 - Enhanced Membership
//    3 - Pro Membership
//
// The membership fees are $5.00/month for Standard membership,
// $10.00/month for Enhanced membership and $25.00/month for Pro 
// membership. Students get a 50% discount on all memberships.
//
// REQUIRED INPUT:
// Must prompt for membership level first (1, 2 or 3).
// Must then prompt if a student (input of "y","Y","n" or "N").
//
// REQUIRED OUTPUT:
// The program MUST display the results EXACTLY as shown below:
//
//   "Standard Membership Fee: $5.00/month"
//   "Enhanced Membership Fee: $5.00/month (student)"
//    etc.
//
// NOTE:
// The use of printf and %.2f within the printed string allows
// for the formatting of output to display a given number of
// decimal places (in this case, two decimal places). The
// specification of %.2f is called a format specifier.
//
// Below is an example of the use of such a format specifier
// (where cost is a variable of type double).
//
//    System.out.printf(
//      "Your total cost is: $%.2f", cost);
//
//    displays
//       Your total cost is: $21.50
// --------------------------------------------------------------
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
        double fee1 = 0.0;
        double fee2 = 0.0;
        String yn_response;
     
        Scanner input = new Scanner(System.in);

        // prompt user for value membership level
        // (to complete)

        // scan past lingering end-of-line character
        input.nextLine();
      
        // IMPORTANT: 
        // When reading the integer value above, the scanning
        // of digit characters stops at the end-of-line character.
        // If the next method called after nextInt is nextLine,
        // then nextLine will read the current end-of-line
        // character as a blank line and not wait for input from
        // the user. Thus, to fix this issue we do an extra call
        // to nextLine to scan past the end-of-line character so
        // that it will wait for the input of the Y/N reply below.

        // ask if a student
        System.out.print("Are you a student? (y/Y, n/N): ");
        yn_response = input.nextLine();

        // use nested if statements to determine membership fee
        // and assign to variable fee1
        // (to complete)
    
          
        // use switch statement to determine membership fee
        // and assign to variable fee2
        // (to complete)

        
        System.out.println("\nResult of nested if statements:");
        // (to complete)
      
        System.out.println("\nResult of switch statement:");
        // (to complete)
    }
}
