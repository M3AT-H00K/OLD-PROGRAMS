import java.util.Scanner;
public class even
{
  public static void main(String[]args)
  {
      Scanner ob =new Scanner(System.in);
      int a=2,i;
      for(i=0;i<=100;i++)
      {
          if(i%a==0)
          {
              System.out.println(i);
            }
        }
    }
}
