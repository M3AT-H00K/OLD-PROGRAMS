import java.util.Scanner;
class empirp{
    int n;
    int rev;
    int f;
    empirp(int nn){
        n=nn;
        rev=0;
        f=2;
    }

    int isprime(int x){
        f++;
        if(x==f){
            return 1;
        }
        else if(x%f!=0){
            return isprime(x);
        }
        else{
            return 0;
        }
    }
    void isempirp(){
        int temp=n;
        int rem;
        System.out.println(n);
        while(temp!=0){
            rem=0;
            rem=temp%10;
            temp=temp/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
        int s1=isprime(n);
        System.out.println(s1);
        int s2=isprime(rev);
        System.out.println(s2);
        if(s1==1&&s2==1){
            System.out.println("empirp");
        }
        else{
            System.out.println("nope");
        }
    }
    public static void main(){
        empirp obj=new empirp(13);
        obj.isempirp();
    }
}