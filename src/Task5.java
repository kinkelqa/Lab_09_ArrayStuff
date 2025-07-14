import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int userValue = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);

        System.out.println("You entered: " + userValue);
    }
}
