import java.util.Scanner;
class happy{
    int n;
    boolean flag;
    happy(){
        n=0;
    }

    void getnum(int nn){
        n=nn;
    }

    int sumsq(int x){
        if(x<=0){
            return 0;
        }
        else{
            return (int)Math.pow(x%10,2)+sumsq(x/10);
        }
    }

    void ishappy(){
        int s;
        do{
            s=0;
            s=sumsq(n);
            if(s==1){
                flag=true;
            }
            else{
                flag=false;
                n=s;
            }
        }while(s>10);
        if(flag==true){
            System.out.println("happy");
        }
        else{
            System.out.println("sad");
        }
    }
    public static void main(){
        happy obj=new happy();
        obj.getnum(28);
        obj.ishappy();
    }
}