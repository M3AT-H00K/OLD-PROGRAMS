import java.util.Scanner;
class PFR{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int choice,num,i,ctr=0,fac=1,num1,rev=0,r;
        System.out.println("1.)Prime 2.)Factorial 3.)Reverse");
        choice=ob.nextInt();
        switch(choice){
            case 1:
            System.out.println("enter number to check");
            num=sc.nextInt();
            for(i=2;i<num;i++){
                if(num%i==0){
                    ctr++;
                }
            }
            if(ctr>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            break;
            case 2:
            System.out.println("enter num for factorial");
            num=sc.nextInt();
            for(i=1;i<=num;i++){
                fac=fac*i;
            }
            System.out.println(fac);
            break;
            case 3:
            System.out.println("enter numbre");
            num=sc.nextInt();
            num1=num;
            while(num>0){
                r=num%10;
                num=num/10;
                rev=rev*10+r;
            }
            System.out.println(rev);
            break;
            default:
            System.out.println("lol thats not a real number");
            
        }
    }
}

