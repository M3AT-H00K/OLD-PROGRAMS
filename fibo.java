import java.util.*;
public class fibo
{
  public static void main(String[]args)
  {
      int a=0,b=1,c,i;
      for(i=0;i<=20;i++){
          System.out.print(a + " ");
          c=a+b;
          a=b;
          b=c;
          c=0;
        }
    }
}