import java.util.*;
public class pronic{
    int a;
    int i=0;

    public static void main(){
        int num;
        Scanner ob=new Scanner(System.in);
        num=ob.nextInt();
        pronic p=new pronic();
        p.acceptnum(num);
        p.check();
    }

    void acceptnum(int n){
        a=n;
    }

    void check(){
        
        if(i<a){
            if(i*(i+1)==a){
                System.out.println("yep " + i + " + " + (i+1));
            }
            else{
                i=i+1;
                check();
            }
        }
        else{
            System.out.println("no");
        }
    }
}