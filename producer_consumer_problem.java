package ospractical;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuj
 */
import java.util.Scanner;
public class os3lab
{
    public static void main(String [] args)
    {
        int n;
        items i=new items();
         
            System.out.println("menu");
            System.out.println("n1 for produce item\n n2 for consume item\n 3 for exit");
           do
        {  
            System.out.println("enter your choice");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            switch(n)
            {
                case 1:
                    i.produce_item();
                    break;
                case 2:
                   i. consume_item();
                    break;
                case 3:
                    System.exit(0);
                    
                  
                default:
                    System.out.println("please enter the valid choice");
                break;
                    
            }
            
            
            
            
               
            
        }while(n!=3);
    }
}
class items
{
    
    int buffer=5;
    int count=0;
    void produce_item()
    {
        if(count<5)
        {
            System.out.println("the item is produced ");
            count++;
        }
        else
        {
            System.out.println("the buffer is sleeping so get hell out");
            
        }
    }
    void consume_item()
    {
        if(count>0)
        {
            System.out.println("the item is consumed");
            count--;
            
        }
        else 
        {
            System.out.println("there is no item in buffer to consume so gone to sleep");
            
        }
    }
}