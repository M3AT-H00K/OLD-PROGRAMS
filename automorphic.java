import java.util.*;
public class automorphic
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,r=1,a1,b=1,rev=0,ctr=0,r1=1,i=0;
      
      System.out.println("entr numbr");
      a=ob.nextInt();
      a1=a;
      b=a*a;
      while(a>0){
          r=a%10;
          a=a/10;
 
          r1=b%10;
          b=b/10;
          if(r!=r1){
          ctr++;
        }
    }
      if(ctr==0){
          System.out.println("automorphic");
        }
        else{
            System.out.println("not automorphic");
        }
    }
}

    
    
    
    