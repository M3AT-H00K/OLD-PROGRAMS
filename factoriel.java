import java.util.Scanner;
class factoriel
{
    public static void main ()
    {
        Scanner ob=new Scanner(System.in);
        int a,i,j,fac=1,sum=0;
        for(j=1;j<=3;j++){
          for(i=1;i<=j;i++){
            fac=fac*i;
          }
          sum=sum+fac;
        }
        System.out.println(sum);
    }
}