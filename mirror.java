import java.util.*;
public class mirror
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,b,r=1,rev=0;
      System.out.println("enter 2 numbers");
      a=ob.nextInt();
      b=ob.nextInt();
      
      while(a>0){
          r=a%10;
          a=a/10;
          rev=rev*10+r;
        }
        if(rev==b){
            System.out.println("yes");
        }
        else
        {
            System.out.println("nah");
        }
    }
}