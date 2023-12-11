public class HighLow {


    public static void main(String[] args)
    {
         int numbers[] = {15, 7, -5, 99, 57, -22, 64, 1};
         int min = numbers[0];
         int max = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {

            if(numbers[i]<min)
            {
                min = numbers[i];

            }
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}