public class MethodsDemo
{
    static int a;
    static int b;
    int c;
    long l;
public void run()
{
    a=1;
    b=2;
    System.out.println(a+b);
}
public void run2()
{
    a=11;
    b=22;
    System.out.println(a+b);
}
public static void main(String[] args)
    {
        MethodsDemo m = new MethodsDemo();
        m.run();
        m.run2();
        a=10;
        b=20;

        m.c=3;
        System.out.println(a+b+ m.c);
        m.run3();
    }
public void run3()
{
    a=11;
    b=22;
    System.out.println((a+l)%c);
    l=1740L;
    System.out.println((11+1740)%35);
}
}
