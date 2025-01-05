import java.util.Scanner;
class perfect{
    int num;
    perfect(int nn){
        num=nn;
    }

    int sumof(int x){
        if(x==num){
            return 0;
        }
        else if(num%x==0){
            return x+=sumof(x+1);
        }
        else{
            return sumof(x+1);
        }
    }
    
    void check(){
        int s=sumof(1);
        if(s==num){
            System.out.println("perfect");
        }
        else{
            System.out.println("nope");
        }
    }
    
    public static void main(){
        perfect obj=new perfect(6);
        obj.check();
    }
}