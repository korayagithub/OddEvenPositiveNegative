import java.util.Scanner;

public class OddEvenPositiveNegative{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter Number Here: ");
        int number = input.nextInt();

        if (number == 0)
        {
            System.out.println("The number is zero. It is neither positive nor negative.");
        }
        else
        {
            int num = number % 2;
            if (num == 0)
            {
                System.out.println("The number is even.");
            }
            else
            {
                System.out.println("The number is odd.");
            }

            if(num < 0)
            {
                System.out.println("The number is a negative number.");
            }
            else
            {
                System.out.println("The number is a positive number.");
            }
        }
    }
}
