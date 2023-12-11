import java.util.Random;
import java.util.Scanner;

public class RandomExample
{
    public static void main(String[] args)
    {
        Random r1 =  new Random();
        int a = r1.nextInt(10000,99999);
        System.out.println(a);
        switchEx();
    }
    public static void switchEx()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String a = sc.next();
        switch (a)
        {
           case "one": System.out.println("No 1");
           case "One": System.out.println("No 1");
                break;
           case "two": System.out.println("No 2");
           case "Two": System.out.println("No 2");
                break;
            case "three": System.out.println("No 3");
            case "Three": System.out.println("No 3");
                break;
            case "four": System.out.println("No 4");
            case "Four": System.out.println("No 4");
                break;
            case "five": System.out.println("No 5");
            case "Five": System.out.println("No 5");
                break;
            case "six": System.out.println("No 6");
            case "Six": System.out.println("No 6");
                break;
            case "seven": System.out.println("No 7");
            case "Seven": System.out.println("No 7");
                break;
            default: System.out.println("More than 7 ");
                break;
        }
    }
}
