import java.util.*;
public class palindrom
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,a1,r,rev=0;
      System.out.println("enter number");
      a=ob.nextInt();
      a1=a;
      while(a>0){
          r=a%10;
          a=a/10;
          rev=rev*10+r;
        }
        if(rev==a1){
              System.out.println("palindrom");
              
            }
            else {
                System.out.println("nop");
            }
    }
}