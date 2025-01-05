import java.util.*;
public class neon
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,a1,r,sum=0,sqr=1;
      System.out.println("enter number");
      a=ob.nextInt();
      a1=a;
      sqr=a*a;
      while(sqr>0){
          r=sqr%10;
          sqr=sqr/10;
          sum=sum+r;
         
          
            
        }
        if(a1==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
            
        }
    }
    
}