import java.util.*;
public class nar
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int a,a1,r,ctr=0,a2,r1;
        double prod,sum=0;
        System.out.println("enter number");
        a=ob.nextInt();
        a1=a;
        a2=a;
        while(a>0){
            r=a%10;
            a=a/10;
            ctr++;
        }
        while(a1>0){
            r1=a1%10;
            a1=a1/10;
            prod=Math.pow(r1,ctr);
            sum=sum+prod;
        }
        if(sum==a2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}