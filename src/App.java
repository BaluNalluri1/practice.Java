import static java.lang.Thread.sleep;

class printer  {
   synchronized void printdocument(int numcoi, String docname) throws InterruptedException
   {
       for (int i = 1; i <=numcoi; i++) {
           try {
               Thread.sleep(1000);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
            System.out.println("print" + docname + i);
        }
    }
}
class vikas extends Thread
{
    printer pr;

    public vikas(printer pr) {
        this.pr = pr;
    }
   public void run()
    {
        try {
            pr.printdocument(10,"vikA");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Balu extends Thread
{
    printer pr;

    public Balu(printer pr) {
        this.pr = pr;
    }
    public void run()
    {
        try {
            pr.printdocument(10,"Balu");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class App
{
    public static void main(String[] args) throws Throwable
    {
        printer p1 = new printer();
        vikas V = new vikas(p1);
        Balu B1 = new Balu(p1);
        V.start();
               B1.start();
    }
}
