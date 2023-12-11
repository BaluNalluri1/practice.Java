import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class ScannerDemo
{
    int age;
    int year;
    int birthYear;
    static   String s;
    static String sn="";
    public static void main(String[] args)
    {
        // ScannerDemo sd = new ScannerDemo();
        // sd.ageCal();


    }
    public void ageCal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("when did you born?");
        birthYear = sc.nextInt();
        LocalDate date = LocalDate.now();
        year= date.getYear();
        age = year-birthYear;
        if(birthYear>year)
        {
            System.out.println("Please enter the correct year");
        }
        else {
            System.out.println("age is "+age);
        }
    }

    public static void duplic()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        s= sc.next();
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    sn=sn+s.charAt(j);
                    break;
                }
                      /*  else
                            sn=sn+s.charAt(i);
                        break; */
            }
        }

        System.out.println(sn);

    }
}
