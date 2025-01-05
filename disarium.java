import java.util.Scanner;
class disarium{
    int num,size;
    disarium(int nn){
        num=nn;
        size=0;
    }
    void countdigit(){
        int temp=num;
        int ctr=0;
        while(temp>0){
            temp=temp/10;
            ctr++;
        }
        size=ctr;
    }
    int sumofdigits(int n,int p){
        if(n==0){
            return 0;
        }
        else{
            return (int)Math.pow(n%10,p)+sumofdigits(n/10,p-1);
        }
    }
    void check(){
        if(num==sumofdigits(num,size)){
            System.out.println("yep");
        }
        else{
            System.out.println("fuck off");
        }
    }
    public static void main(){
        disarium obj= new disarium(135);
        obj.countdigit();
        obj.check();
    }
}