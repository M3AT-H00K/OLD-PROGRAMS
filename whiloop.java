import java.util.*;
public class whiloop
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,r,ctr=0;
      System.out.println("enter number");
      a=ob.nextInt();
      while(a>0){
          r=a%10;
          a=a/10;
          ctr++;
          if(ctr%2==0){
              System.out.print(r);
            }
            
        }
    }
}