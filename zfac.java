import java.util.Scanner;
class zfac 
{
    public static void main (String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int a,b=0,c=0,d,i;
        System.out.println("enter number(try keeping below 100)");
        a=ob.nextInt();
        for(i=0;i<=a;i++)
        {
            if(i%21==0)
            {
                b=i;
            }
            c=c+b;
        }
        if(c==21){
            System.out.println("lockdown number");
        }
        else{
            System.out.println("not lockdown");
        }
    }
}
            