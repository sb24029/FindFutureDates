/* This program promts the user to enter an integer for today's day of the week,
and it also promts he user to enter the number of days after tday for a future day
and displays the future day of the week.
 */
import java.util.Scanner;
public class FindFutureDates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter today's date: ");
        int date = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = sc.nextInt();

        int futureDate = (date + elapsed) % 7; // after the sum is divided by 7, the remainder is the answer.
        String dow = "";
        switch (date) {
            case 0:
                dow = "Sunday";
                break;
            case 1:
                dow = "Monday";
                break;
            case 2:
                dow = "Tuesday";
                break;
            case 3:
                dow = "Wednesday";
                break;
            case 4:
                dow = "Thursday";
                break;
            case 5:
                dow = "Friday";
                break;
            case 6:
                dow = "Saturday";
                break;

        }
        if (futureDate == 0){
            System.out.printf("Todays is %s and the future day is Sunday", dow);
        }else if(futureDate == 1){
            System.out.printf("Todays is %s and the future day is Monday", dow);
        }else if(futureDate == 2){
            System.out.printf("Todays is %s and the future day is Tuesday", dow);
        }else if(futureDate == 3){
            System.out.printf("Todays is %s and the future day is Wednesday", dow);
        }else if(futureDate == 4){
            System.out.printf("Todays is %s and the future day is Thursday",dow);
        }else if(futureDate == 5){
            System.out.printf("Todays is %s and the future day is Friday", dow);
        }else if(futureDate == 6){
            System.out.printf("Todays is %s and the future day is Saturday", dow);
        }
    }
}