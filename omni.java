import java.util.Scanner;
public class omni{
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        int a,b,c=0,d=0;
        System.out.println("enter nubmer");
        a=j.nextInt();
        while(a>0)
        {
            b=a%10;
            a=a/10;
            if(b%2==0)
            {
                c=c+b;
            }
            else{
                d=d+b;
            }
        }
    if(c==d){
        System.out.println("yes");
    }
    else{
        System.out.println("noep ");
    }
}
}
    
           