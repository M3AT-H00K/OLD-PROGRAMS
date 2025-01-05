import java.util.Scanner;
class armstrong{
    int n,l;
    armstrong(int nn){
        n=nn;
        l=0;
    }

    int sumpow(int i){

        if(i>0){
            return(int)Math.pow(i%10,l)+sumpow(i/10);
        }
        else{
            return 0;
        }
    }

    void isArmstrong(){
        int sum=0;
        for(int i=n;i>0;i=i/10){
            ++l;
            
        }
        sum=sumpow(n);
        if(sum==n){
            System.out.println("arms");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(){
        armstrong obj=new armstrong(1634);
        obj.isArmstrong();
    }
}
