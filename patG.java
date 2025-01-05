import java.util.*;
public class patG
{
  public static void main(String[]args)
  {int j,i,space=5,k;
      for(j=1;j<=5;j++)
      {
          for(k=1;k<=space;k++)
      {
          System.out.print(" ");
          
        }
      for(i=j;i>=1;i--)
      {
          System.out.print(i);
        }
        System.out.println();
       space--;
    }
}
}