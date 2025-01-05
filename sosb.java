import java.util.Scanner;
public class sosb
{
  public static void main()
  {
      int a,b,c,i,s=0,n=12;
      
      for(i=1;i<=n;i+=3)
      {
          a=i*i++;
          b=i+=2;
          c=a/b;
          s=s+c;
        }
        System.out.println(s);
    }
}
