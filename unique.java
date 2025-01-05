import java.util.*;
public class unique
{
  public static void main(String[]args)
  {
      Scanner ob=new Scanner(System.in);
      int a,r=1,i=0,ctr=0;
      boolean ans=false;
      System.out.println("enter number");
      a=ob.nextInt();
      while(i<9){
          while(a>0){
              r=a%10;
              a=a/10;
              if(r==i){
                  ctr++;
                }
              else{
                  ctr=ctr;
                }
                
            }
            i++;
            if(ctr==1){
                    ans=true;
                }
            
           
        }
        if (ans==true){
            System.out.println("unique");
        }
        else if(ans==false) {
            System.out.println("not unique");
        }
         ctr=0;
    }
}   