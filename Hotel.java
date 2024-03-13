import java.util.*;
public class Hotel{
    public static void main(String[] args)
    {
        int qty, amt,bill=0,i;
        Scanner sc=new Scanner(System.in);
 do{
       System.out.println("JEMO Hotel");
       System.out.println("1. Dosa");
       System.out.println("2. Idli");
       System.out.println("3. Appam");
       System.out.println("4. Vada");
       System.out.println("5. Sambar");
       System.out.println("What is your choice?");
       int ch=sc.nextInt();
       switch(ch)
       {
        case 1:
          System.out.print("Dosa qty?");
          qty=sc.nextInt();
          amt=qty*10;
          bill=bill+amt;
          break;
        case 2:
          System.out.print("Idli qty?");
          qty=sc.nextInt();
          amt=qty*10;
          bill=bill+amt;
          break;
        case 3:
          System.out.print("Appam qty?");
          qty=sc.nextInt();
          amt=qty*12;
          bill=bill+amt;
          break;
        case 4:
          System.out.print("Vada qty?");
          qty=sc.nextInt();
          amt=qty*8;
          bill=bill+amt;
          break;
        case 5:
          System.out.print("Sambar qty?");
          qty=sc.nextInt();
          amt=qty*10;
          bill=bill+amt;
          break;
        default:
           System.out.println("Sorry!!. Invalid food. So choice the valid food!");
           break;
       }
       System.out.println("If you want Continue.. Press 1 or Press 0");
       i=sc.nextInt();
    }while(i==1);
    System.out.println("Your Total Bill is = "+bill);
}
}