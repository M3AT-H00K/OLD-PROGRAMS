import java.util.*;
public class amstrong//amstrong means sum of cubes of the digits of number is equal to the number
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,r,cube=1,sum=0,a1;
      System.out.println("enter number");
      a=ob.nextInt();
      a1=a;
      while(a>0){
          r=a%10;
          a=a/10;
          cube=r*r*r;
          sum=sum+cube;
        }
        if(sum==a1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
    }
}
}