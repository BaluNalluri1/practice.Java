import java.util.Scanner;

public class TwoSum
{
   static int[] a = {3,4,4,6,7,5};
   static int target;

    public static void run()
    {
        System.out.println("This is run method");
        System.out.println("please enter the targeted num: ");
        Scanner scanner = new Scanner(System.in);
        target = scanner.nextInt();
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1;j<a.length;  j++)
            {
                if(a[i]+ a[j] == target)
                {
                    System.out.println("["+i+","+j+"]");
                }
                break;

            }
        }

    }
    public static void runn()
    {
        System.out.println("please enter the targeted num: ");
        Scanner scanner = new Scanner(System.in);
        target = scanner.nextInt();
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1;j<a.length;  j++)
            {
                if(target-a[i]==a[j])
                {
                    System.out.println(i+""+j);

                }

            }
        }

    }

    public static void main(String[] args)
    {
        run();

    }

}


