import java.util.Scanner;
class factorial
{
    public static void main ()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,i,j,k,fac=1,fac2=1,fac3=1;
        System.out.println("enter 3 numbers");
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        for(i=1;i<=a;i++){
            fac=fac*i;
        }
        for(j=1;j<=b;j++){
            fac2=fac2*j;
        }
        for(k=1;k<=c;k++){
            fac3=fac3*k;
        }
        if(fac+fac2==fac3){
            System.out.println("yup");
        }
        else{
            System.out.println("nah");
        }
    }
}