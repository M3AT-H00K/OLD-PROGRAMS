import java.util.Scanner;
class emale{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        String s;
        char ch;
        System.out.println("enter email id");
        s=ob.nextLine();
        a=s.indexOf('@');
        b=s.indexOf('.');
        if(a==-1||b==-1){
            System.out.println("invalid");
        }
        else if(a>b){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
        }
         
        }
    }