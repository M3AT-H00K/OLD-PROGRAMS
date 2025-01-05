import java.util.Scanner;
class primorial
{
    public static void main (String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int a,b,i,j,ctr=0,p=1;
        System.out.println("enter number");
        a=ob.nextInt();
      for(i=1;i<=a;i++){
               for(j=1;j<=i;j++){ 
            if(i%j==0){
                ctr++;
            }
        }
         if(ctr==2){
                p=p*i;
            }
            ctr=0;
        }
        System.out.println(p);
    }
}