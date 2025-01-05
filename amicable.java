import java.util.Scanner;
class amicable
{
    public static void main (String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int i,j,a,b,c=0,d=0;
         System.out.println("enter 2 numbers");
         a=ob.nextInt();
         b=ob.nextInt();
         for(i=1;i<a;i++){
             if(a%i==0){
                 c=c+i;
                }
            }
          for(j=1;j<b;j++){
             if(b%i==0){
                 d=d+j;
                }
            }
            if(c==b||d==a){
                System.out.println("amicable");
            }
            else{
                System.out.println("not amicable");
            }
        }
    }