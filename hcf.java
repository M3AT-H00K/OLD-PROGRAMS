import java.util.Scanner;
class hcf
{
    public static void main ()
    {
        Scanner ob=new Scanner(System.in);
        int i,a,b,hcf=0,x;
        System.out.println("enter");
        a=ob.nextInt();
        b=ob.nextInt();
        
        x=(a<b? a:b);
        for(i=1;i<x;i++){
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}