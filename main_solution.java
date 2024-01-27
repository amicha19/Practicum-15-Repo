// Membership Fee Program Solution (Original Version)
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
// The program MUST display the results formatted as follows:
//
//   Standard Membership Fee: $5.00/month
//   OR
//   Standard Membership Fee: $2.50/month (student)
//   OR
//   Enhanced Membership Fee: $10.00/month
//   OR
//   etc.
//
// --------------------------------------------------------------
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // constant declarations
        // NOTE: The use of these "named constants" makes the
        //       program more readable easier to modify fees
        final double standard_membership_fee = 5.00;
        final double enhanced_membership_fee = 10.00;
        final double pro_membership_fee = 25.00;
        final double student_discount = 0.5;  // 50% discount
      
        // var declarations
        int membership_level;

        // NOTE: If fee1/fee2 not initialized to a value here,
        // Java will give a "variable not initialized" error.
        // This is because in the code below fee1 and fee2 may
        // possibly not be assigned a value if membership_level
        // is not 1, 2 or 3.
      
        double fee1 = 0.0; 
        double fee2 = 0.0;
                           
        boolean is_student;
        String yn_response;
        String membership_type = "";
        String  student_label = "";
        String output_line = "";
     
        Scanner input = new Scanner(System.in);

        // prompt user for value membership level
        System.out.print("\nWhat membership level (1, 2 or 3)? ");
        membership_level = input.nextInt();

        // scan past lingering end-of-line character
        input.nextLine();
      
        // NOTE: 
        // When reading the integer value above, the scanning
        // of digit characters stops at the end-of-line character.
        // If the next method called after nextInt is nextLine,
        // then nextLine will read the current end-of-line
        // character as a blank line and not wait for input from
        // the user. Thus, to fix this issue we do an extra call
        // to nextLine to scan past the end-of-line character so
        // that it will wait for the input of the Y/N reply below.
        // (If input.next() is used here, the extra call to 
        // nextLine is not needed)

        // ask if a student
        System.out.print("Are you a student? (y/Y, n/N): ");
        yn_response = input.nextLine();

        // NOTE: This is a more elegant way to compare rather
        // than comparing to both 'y' and 'Y'. This also is
        // an example of "chained" method (function) calls
        if(yn_response.toUpperCase().equals("Y"))
          is_student = true;
        else
          is_student = false;

        // use nested if statements to determine membership fee
        // and assign to variable fee1
        if(membership_level == 1) {
          fee1 = standard_membership_fee;
          membership_type = "Standard";
        }
        else
        if(membership_level == 2) {
          fee1 = enhanced_membership_fee;
          membership_type = "Enhanced";
        }
        else
        if(membership_level == 3) {
          fee1 = pro_membership_fee;
          membership_type = "Pro";
        }
    
        // apply applicable student discount
        if(is_student)
          fee1 = student_discount * fee1;
          
        // use switch statement to determine membership fee
        // and assign to variable fee2
        switch(membership_level) {
          case 1: fee2 = standard_membership_fee; 
                         membership_type = "Standard"; break;
          case 2: fee2 = enhanced_membership_fee; 
                         membership_type = "Enhanced"; break;
          case 3: fee2 = pro_membership_fee; 
                         membership_type = "Pro"; break;
        }

        if(is_student)
          fee2 = student_discount * fee2;
      
        // display results
        if(is_student)
          student_label = " (student)";

        // Note: If variable student_label contains the empty string,
        // then has no affect on what is output
        output_line = membership_type + " Membership Fee: $%.2f/month" +
                      student_label + "\n";
        
        System.out.println("\nResult of nested if statements:");
        System.out.printf(output_line, fee1);
      
        System.out.println("\nResult of switch statement:");
        System.out.printf(output_line, fee2);
    }
}
