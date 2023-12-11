import javax.swing.*;
import java.util.Scanner;

public class GUI_example
{

    public static void main(String[] args)
    {
        guimeth();
        rev();
    }

    public static void rev()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        String c="";
        for(int i=s.length()-1; i>=0;i--)
        {
            c = c+s.charAt(i);
        }
        System.out.println(c);
    }
    public static void guimeth()
    {
            String name = JOptionPane.showInputDialog("Enter your name");
            if((name.charAt(0)>=65)&&(name.charAt(0)<=90))
                JOptionPane.showMessageDialog(null, "Hello " + name);
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter your name again ");
            }
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            if(age>0)
            {
                JOptionPane.showMessageDialog(null,"You are "+age+" year old");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter your correct age ");
            }
    }

}



/*There is some error with age we have to use try catch*/
