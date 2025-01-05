import java.util.Scanner;
class merger{
    long n1,n2,mergNum;
    merger(){
        n1=0;
        n2=0;
    }
    void readnum(){
        Scanner sc=new Scanner(System.in);
        n1=sc.nextLong();
        n2=sc.nextLong();
    }
    void joinnum(){
        long temp=n2;
        long rev=0;
        while(temp!=0){
            long rem=0;
            rem=temp%10;
            temp=temp/10;
            rev=rev*10+rem;
        }
        while(rev!=0){
            long rem=0;
            rem=rev%10;
            rev=rev/10;
            n1=n1*10+rem;
        }
    }
    void show(){
        System.out.println(n1);
    }
    public static void main(){
        merger obj=new merger();
        obj.readnum();
        obj.joinnum();
        obj.show();
    }
}