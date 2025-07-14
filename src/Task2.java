import java.util.Random;

public class Task2
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("First 100 random values in dataPoints:");
        for (int i = 0; i < 100; i++)
        {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }
    }
}
