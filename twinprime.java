import java.util.Scanner;
class twinprime
{
    public static void main ()
    {
        Scanner ob=new Scanner(System.in);
        int i,a,b,d=0,ctr1=0,ctr2=0,j;
        System.out.println("enter 2 numbers");
        a=ob.nextInt();
        b=ob.nextInt();
        for(i=2;i<a;i++){
            if(a%i==0){
                ctr1++;
            }
            
        }
        for(j=2;j<b;j++){
            if(b%i==0){
                ctr2++;
            }
            
        }
        if(ctr1==0&&ctr2==0){
            d=a>b?a-b:b-a;
        }
        else{
            System.out.println("no");
        }
        if(d==2){
            System.out.println("twinprime");
        }
        else{
            System.out.println("no");
        }
    }
}
                