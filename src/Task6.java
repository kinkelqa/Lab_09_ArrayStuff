import java.util.Random;
import java.util.Scanner;

public class Task6
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

        int searchValue = SafeInput.getRangedInt(in, "Enter a number to search for", 1, 100);

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue)
            {
                count++;
            }
        }
        System.out.println("The value " + searchValue + " was found " + count + " times in the dataPoints array.");
    }
}