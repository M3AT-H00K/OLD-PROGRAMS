import java.util.Scanner;
class mpal{
    public static void main(){
        palin(15);
        palin("hambirhre");
    }
    public static void palin(int a){
        Scanner ob=new Scanner(System.in);
        int a1,r,rev=0;
        System.out.println("enter number");
        a=ob.nextInt();
        a1=a;
        while(a>0){
            r=a%10;
            a=a/10;
            rev=rev*10+r;
        }
        if(rev==a1){
            System.out.println("palindrom");

        }
        else {
            System.out.println("nop");
        }
    }

    public static void palin(String s){
        Scanner ob=new Scanner(System.in);
        int i;
        char c;
        String s1="";
        System.out.println("enter word");
        s=ob.nextLine();
        int l=s.length();
        for(i=l-1;i>=0;i--){
            c=s.charAt(i);
            s1=s1+c;
        }
        if(s.equals(s1)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
}