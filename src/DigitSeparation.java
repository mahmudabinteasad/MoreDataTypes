import java.util.Scanner;
public class DigitSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
       /* while(number!=0){
            int reminder = number % 10;
            System.out.printf(reminder + " ");
            number /= 10;
        }*/
        String numberString = String.valueOf(number);
        for (char digitChar : numberString.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            System.out.print(digit + " ");
        }
    }
}


