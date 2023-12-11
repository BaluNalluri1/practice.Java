public abstract class Employer
{
    String name;
    String code;
    String place;

    public abstract void hire();
    public abstract void pay();
    public abstract void work();

}

class TCS extends Employer
{

    @Override
    public void hire()
    {
        System.out.println("we are hiring");

    }

    @Override
    public void pay()
    {

    }

    @Override
    public void work()
    {

    }
}

class CTS extends TCS
{
    public static void main(String[] args)
    {
        RandomExample.switchEx();
        FbigSbig.bigSbig();
        Employer emp = new CTS();
        Infosys i1 = new Infosys();
        emp.hire();
        emp.pay();
        emp.work();
        i1.get();
        System.out.println(i1.giveName()+" Sal is "+i1.giveSal());
        i1.putName("Nalluri");
        i1.putSal(99999);
        i1.show();
       // i1.employee();

    }

        @Override
        public void hire()
        {
            System.out.println("We are hiring");
        }

        @Override
        public void pay()
        {
            System.out.println("We are paying");
        }

        @Override
        public void work()
        {
            System.out.println("We are working");

        }
}

class Infosys extends Kantar
{
    Kantar k3 = new Kantar();
   private String name = "Bala";
    private int sal = 100000;
    public void get() {
        System.out.println("get your Laptop");
    }
    public String giveName(){
        return name;
    }
    public int giveSal(){
        return sal;
    }
    public void putName(String n){
        name = n;
        System.out.println(name);
    }
    public void putSal(int s){
        sal = s;
        System.out.println(sal);
    }
    public void show()
    {
        System.out.println(name+" sal is "+sal);
        employee();
        //Kantar k1 = new Kantar();
        k3.employee();
    }
    public void employee()
    {
        System.out.println("We have an Employee");
        //Kantar k2 = new Kantar();
        k3.employee();
    }

}

interface Company
{
    public void employee();
}

class Kantar implements Company
{
    public void run()
    {
        System.out.println("run code, get error");
    }

    @Override
    public void employee() {
        System.out.println("Kantar employee");
    }
}