import java.util.Scanner;
class palin{
    int num,revnum;
    palin(){
        num=0;
        revnum=0;
    }

    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("entr");
        num=sc.nextInt();
    }

    int reverse(int y){
        if(y!=0){
            revnum=revnum*10+y%10;
            return reverse(y/10);
            
        }
        else{
            return revnum;
        }
    }
    
    void check(){
        int s=reverse(num);
        if(s==num){
            System.out.println("yep");
        }
        else{
            System.out.println("nope");
        }
    }
    
    public static void main(){
        palin obj=new palin();
        obj.accept();
        obj.check();
    }
}
