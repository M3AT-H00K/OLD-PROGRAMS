import java.util.Scanner;
public class sosd
{
  public static void main()
  {
      int a,i,s=0,n=64;
      
      for(i=4;i<=n;i*=4)
      {
          a=1%i;
          s=s+a;
        }
        System.out.println(s);
    }
}
