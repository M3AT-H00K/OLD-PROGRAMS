import java.util.Scanner;
public class sosc
{
  public static void main()
  {
      int a,i,s=0,n=15;
      
      for(i=1;i<=n;i++)
      {
          a=i*i++;
          s=s+a;
        }
        System.out.println(s);
    }
}
