import java.util.*;
public class duck
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int a,r;
        boolean ans=false;
        System.out.println("enter number");
        a=ob.nextInt();

        while(a>0){
            r=a%10;
            a=a/10;
            if(r==0){
                ans=true;
                
            }
        }
        if(ans==true){
            System.out.println("duck");
        }
        else{
             System.out.println("no");
            }
    }
}