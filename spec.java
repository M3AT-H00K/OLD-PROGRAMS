import java.util.*;
public class spec
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,r,i=1,fac=1,sum=0,a1;
      System.out.println("enter number");
      a=ob.nextInt();
      a1=a;
      while(a>0){
          r=a%10;
          a=a/10;
          for(i=1;i<=r;i++){
              fac=fac*i;
            }
          sum=sum+fac;
          fac=1;
        }
        if(sum==a1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
    }
}
}