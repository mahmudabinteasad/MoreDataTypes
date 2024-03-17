import java.util.Scanner;
public class PunctuationRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        int number = scanner.nextInt();
        if (number >= 1000 && number <= 999999) {
            System.out.printf("The number without comma is: %d\n",number);
        }
    }
}
