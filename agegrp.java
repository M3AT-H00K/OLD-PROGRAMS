import java.util.Scanner;
public class agegrp
{
  public static void main()
  {
      Scanner ob =new Scanner(System.in);
      int a,i,ctr1=0,ctr2=0,ctr3=0;
      
      for(i=0;i<=50;i++)
      {
          System.out.println("enter age please");
      a=ob.nextInt();
          if(a<=17)
          {
             ctr1++;
            }
            if(a>=18&&a<=60)
          {
             ctr2++;
            }
            if(a>=60)
          {
             ctr3++;
            }
            
        }
         System.out.println("no of children= " + ctr1  + " no of adults= " + ctr2  + "no of senior citizens= " + ctr3);
    }
}
