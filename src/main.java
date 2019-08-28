import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //Write a program using a switch statement to print the month names given the exact number of days in the month.
        // If the user enters 30 then the program will display: "September April June November".
        // If the user enters 9 then program will alert the user that no months have exactly 9 days.
        //You can have more than one statement in each switch case.
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the exact number of days in the month: ");
        int monthNum = key.nextInt();
        String monthName;
        switch (monthNum) {
            case 28: monthName = "The month is February.";
                break;
            case 29: monthName = "The month is February on leap year.";
                break;
            case 30:  monthName = "The months are April, June, September, November.";
                break;
            case 31:  monthName = "The months are January, March, May, July, August, October, December.";
                break;
            default: monthName = "No months have " + monthNum + " number of days.";
                break;
        }
        System.out.println(monthName);
    }
}
