import java.util.Random;

public class Task4
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rand = new Random();


        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random values in the dataPoints array is: " + sum);
        System.out.println("The average of the random values in the dataPoints array is: " + average);
    }
}