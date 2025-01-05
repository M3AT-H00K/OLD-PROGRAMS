import java.util.*;
public class rec
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,a1,r=1,i=0,ctr=0;
      System.out.println("enter number");
      a=ob.nextInt();
      a1=a;
      while(i<9){
          while(a>0){
              r=a%10;
              a=a/10;
              if(r==i){
                  ctr++;
                }
              
            }
            if(ctr>=1)
            {
                System.out.println(" number "+i +"appears"+  ctr+ "times");
            }
            i++;
            ctr=0;
            a=a1;
        }
    }
}