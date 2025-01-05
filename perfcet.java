import java.util.Scanner;
class perfcet
{
    public static void main (String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int i,a,s=0;
        a=ob.nextInt();
        for(i=1;i<a;i++){
            if(a%i==0){
                s=s+i;
            }
        }
        if(s==a){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }
    }
}