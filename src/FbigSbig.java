import java.util.Scanner;

public class FbigSbig
{
    static int a[]={1, 15, -1, 23, 45, 70, 99, -13, -5};
    public static void main(String[] args)
    {
        bigSbig();
        small();
        search();
    }
    public static void bigSbig()
    {
        int fBig=0;
        int sBig=0;
        for(int i=0; i<=a.length-1; i++)
        {
            if(a[i]>fBig)
            {
                sBig=fBig;
                fBig=a[i];
            }
            else if (a[i]>sBig)
            {
                sBig=a[i];

            }
        }

        System.out.println("First Biggest no is: "+fBig);
        System.out.println("Second Biggest no is: "+sBig);

    }

    public static void small()
    {
        int big=a[0];
        int smal=a[0];
        for(int i=1; i<=a.length-1; i++)
        {
            if(a[i]>big)
            {
                big=a[i];
            }
            else if (a[i]<smal)
            {
                smal=a[i];

            }
        }

        System.out.println("Biggest no is: "+big);
        System.out.println("Smallest no is: "+smal);
        System.out.println("Difference between Highest and lowest is: "+ (big-smal));

    }

    public static void search()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int s= sc.nextInt();
        int cnt =0;
        for(int i=0; i<=a.length-1;i++)
        {
            if(a[i]==s)
            {
                cnt++;
                System.out.println("Position is:"+ i);
            }

        }
        if (cnt>0)
            System.out.println("Given no is present");
        else
            System.out.println("Not present");
    }
}


