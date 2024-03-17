import java.util.Scanner;
public class MilitaryFormatTime {
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Please enter first number: ");
     int number1 = scanner.nextInt();
     System.out.print("Please enter second number: ");
     int number2 = scanner.nextInt();
     if(number2 > number1) {
         int result = (number2 - number1);
         int hour = result / 100;
         int minute = result % 100;
         System.out.printf("%d hours %d minutes.", hour, minute);
     }
     else if(number2 < number1) {
         int pm = (2360 - number1);
         int result = (pm + number2);
             int hour = result / 100;
             int minute = result % 100;
             System.out.printf("%d hours %d minutes.",hour,minute);
         }
 }
}
