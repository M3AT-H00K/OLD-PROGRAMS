import java.util.Scanner;
public class lulz
{
  public static void main(String[]args)
  {
      Scanner ob =new Scanner(System.in);
      int a,b,c=0;
      System.out.println("enter number");
      a=ob.nextInt();
      while(a!=0){
          b=a%10;
          a=a/10;
          c=c+b;
        }
       if(c%19==0)
       {
           System.out.println("covid number");
        }
        else{
            System.out.println("its not infected");
        }
    }
}