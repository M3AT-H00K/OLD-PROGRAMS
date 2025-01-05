import java.util.*;
public class split
{
    public static void main(){
        int x;
        
        x=sumDig();
        System.out.println(x);
    }

    public static int sumDig()
    {
        Scanner ob=new Scanner(System.in);
        int a,r=1,sum=0;
        System.out.println("enter nnduwdaer");
        a=ob.nextInt();
        while(a>0){
            r=a%10;
            a=a/10;
            sum=sum+r;
        }
        return sum;
    }
}