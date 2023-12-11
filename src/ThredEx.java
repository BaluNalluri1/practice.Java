public class ThredEx extends Thread
{
    public void run()
    {

    }

    public void run(int a)
    {
        for(int i=0; i<=a; i++)
            System.out.println("Run "+a+" Run...");
    }
    public void kick()
    {
        for(int i=0; i<=10; i++)
            System.out.println("Kickkkkkkkkk...");
    }

}

class Clas extends ThredEx implements Runnable
{
public void run()
{
    for(int i=0; i<=10; i++)
        System.out.println("Run bhai Run...");

}
public void sing()
{
    for(int i=0; i<=10; i++)
        System.out.println("Sing bhai Sing...");
}
}