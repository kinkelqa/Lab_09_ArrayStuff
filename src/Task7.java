import java.util.Random;
import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        int searchValue = SafeInput.getRangedInt(in, "Enter a value to find its first position", 1, 100);

        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue)
            {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found)
        {
            System.out.println("The value " + searchValue + " was found at array index " + foundIndex + ".");
        }
        else
        {
            System.out.println("The value " + searchValue + " was not found in the dataPoints array.");
        }
    }
}