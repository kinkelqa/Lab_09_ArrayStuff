    import java.util.Random;

    public class Task3
    {
        public static void main(String[] args)
        {
            int[] dataPoints = new int[100];
            Random rand = new Random();

            for (int i = 0; i < dataPoints.length; i++)
            {
                dataPoints[i] = rand.nextInt(100) + 1;
            }

            System.out.println("All values in dataPoints:");
            for (int i = 0; i < dataPoints.length; i++)
            {
                System.out.print(dataPoints[i]);
                if (i < dataPoints.length - 1)
                {
                    System.out.print(" | ");
                }
            }
        }
    }
