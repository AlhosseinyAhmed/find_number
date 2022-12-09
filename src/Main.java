import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numbers [] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println("enter number " + (i+1) + " number ");
            numbers[i] = scanner.nextInt();
        }
        int number;
        boolean found = false;
        System.out.println(" please enter your number ");
        number = scanner.nextInt();
        for (int i = 0 ; i < 10 ; i++)
        {
            if (numbers[i]==number)
            {
                found = true;
                break;
            }
        }
        System.out.println(" The number You Enter " + found);


    }
}