import java.util.*;
public class strpat2
{
  public static void main(String[]args)
  {   Scanner ob=new Scanner(System.in);
      String a;
      int j,i,l;
      char c;
      System.out.println("enter string");
      a=ob.nextLine();
      l=a.length();
      for(j=l-1;j>=0;j--)
      {
          
        for(i=0;i<=j;i++)
      {
          c=a.charAt(i);
          System.out.print(c);
        }
        System.out.println();
    }
}
}