import java.util.Scanner;  

public class DuckNumberExample{  
    int n;
    DuckNumberExample(int nn){
        n=0;
        n=nn;
        
    }

    boolean check(int num){
        int rev=0;
        int temp=num;
        
        int zeroctr=0;
        int rem;
        while(temp>0){
            rem=0;
            rem=temp%10;
            temp=temp/10;
            rev+=rem;
            if(rem==0){
                zeroctr++;
            }
            else{
                continue;
            }
            rem=0;
        }
        
        rem=rev%10;
        if(zeroctr>=1&&rem!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    void display(){
        if(check(n)==true){
            System.out.println("ducky");
        }
        else{
            System.out.println("not ducky");
        }
    }
    
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        DuckNumberExample ob = new DuckNumberExample(x);
        ob.display();
    }
}  