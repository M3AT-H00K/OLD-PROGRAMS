import java.util.Scanner;
public class sumof
{
  public static void main()
  {
      int a,i,s=0,n=100;
      
      for(i=1;i<=n;i+=2)
      {
          s=s+(i/i++);
        }
        System.out.println(s);
    }
}