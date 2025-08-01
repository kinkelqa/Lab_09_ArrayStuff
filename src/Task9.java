import java.util.Random;

public class Task9
{

    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values)
    {
        int sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}
