import java.util.Scanner;
public class TransformNumberToMonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 to 12: ");
        int monthNum = scanner.nextInt();
        switch (monthNum) {
            case 1:
                System.out.printf("January.");
                break;
            case 2:
                System.out.printf("February.");
                break;
            case 3:
                System.out.printf("March.");
                break;
            case 4:
                System.out.printf("April.");
                break;
            case 5:
                System.out.printf("May.");
                break;
            case 6:
                System.out.printf("June.");
                break;
            case 7:
                System.out.printf("July.");
                break;
            case 8:
                System.out.printf("August.");
                break;
            case 9:
                System.out.printf("September.");
                break;
            case 10:
                System.out.printf("October.");
                break;
            case 11:
                System.out.printf("November.");
                break;
            case 12:
                System.out.printf("December.");
                break;
        }
    }
}


