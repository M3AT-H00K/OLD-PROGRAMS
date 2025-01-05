import java.util.Scanner;
class efac
{
    public static void main (String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int i,a,s=0;
        a=ob.nextInt();
        for(i=2;i<a;i+=2){
            if(a%i==0){
                s=s+i;
            }
        }
        System.out.println(s);
    }
}