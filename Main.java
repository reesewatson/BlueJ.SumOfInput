 
import java.util.Scanner;

public class Main {
    private static int sum;
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                int num = input.nextInt();
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
        System.out.println("The sum of all digits within " + num + " is: " + sum);
    }
}
