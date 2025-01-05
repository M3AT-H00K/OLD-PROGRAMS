import java.util.Scanner;
public class sosp
{
  public static void main()
  {
      Scanner ob=new Scanner(System.in);
      int x,i,s=0,n;
      System.out.println("enter number");
      x=ob.nextInt();
      System.out.println("enter limit");
      n=ob.nextInt();
      for(i=0;i<=n;i++)
      {
          s=s+((x-i)/i++);
        }
        System.out.println(s);
    }
}
