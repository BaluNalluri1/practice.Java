import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxDiff
{
    static int a[]= {15,56,12,-45,7,9,-3,-11,99,-99,1,10,-19};
    

    static int min=a[0];
    static int max=a[0];
    static int ct=0;

    static Scanner scanner= new Scanner(System.in);
    public static void find()
    {
        System.out.println("enter a num");
        int x = scanner.nextInt();
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                ct++;
                System.out.println(i+" is the location of the num");;
            }
        }
        if(ct>0)
            System.out.println("num found");
        else
            System.out.println("not found");
    }

    public static void diff()
    {

        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Max num is "+max);
        System.out.println("Min num is "+min);
        System.out.println("Diff of Min and Max is " +(max-min));
    }

    public static void rev()
    {
        for (int i=a.length-1;i<=0;i--)
        {


        }

    }

    public static void div()
    {
        int y = 0,x=0,z=0;
        for(int i =0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                x++;
            }
            if(a[i]%3==0)
            {
                y++;
            }
            if(a[i]%5==0)
            {
                z++;
            }

        }
        System.out.println("numbers that are devisible by 2:"+x +"  by 3:"+y+"  by 5:"+z);

    }

    public static void avg()
    {
        int x=0;
        for(int i=0; i<a.length;i++)
        {
            x = x+a[i];
        }
        System.out.println("Average is "+ (x/a.length));
    }

    public static void digits()
    {
        int ct=0;
        int x=54321;

        while (x!=0)
        {
            x=x/10;
            ct++;

        }
        System.out.println("num of digits in num is "+ct);
    }

    public static void evenPos()
    {
        int[] x = new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                int i1 = a[i];
                x[i] = i1;
            }
        }
        System.out.println("Even positions in array is "+x);

    }

    public static void factors()
    {
        System.out.println("enter a number");
        int x = scanner.nextInt();
        String fact="";

        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                fact=fact+i+" ";
            }
        }
        System.out.println(fact);
    }

    public static void prime()
    {
        System.out.println("enter a number");
        int x = scanner.nextInt();
        int ct = 0;
        for (int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                ct++;
            }
        }
        if (ct>0)
            System.out.println("given num is not prime");
        else
            System.out.println("given num is prime");

    }

    public static void primes()
    {
        int ct = 0;
        String pr="";
        for (int y=2;y<=100;y++)
        {
            for (int i = 2; i < y; i++)
            {
                if (y % i == 0)
                {
                    ct++;
                }
                pr=pr+i+" ";
            }
            if (ct > 0)
                System.out.println(pr);
        }
    }

    public static void swap()
    {
        System.out.println("enter 2 numbers:");
        int x = scanner.nextInt();
        //System.out.println("enter a number2:");
        int y = scanner.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("Nums after swapping "+x+" "+y);

    }

    public static void fibonaci()
    {
        int fib=0;
        String s="";
        for (int i=1;i<=100;i++)
        {
            fib = fib+i;
            s=fib+" ";
        }
        System.out.println(s);

        System.out.println(fib);
    }


    public static void main(String[] args)
    {
        MinMaxDiff.find();
        rev();
        diff();
        div();
        avg();
        digits();
        evenPos();
        factors();
        prime();
        primes();
        swap();
        fibonaci();


    }


}
