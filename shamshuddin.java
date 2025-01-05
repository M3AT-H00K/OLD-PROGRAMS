import java.util.*;
public class shamshuddin{
    public static void main(String[]args){
        int a,b,c;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter time");
        a=ob.nextInt();
        b=a/60;
        c=a%60;
        System.out.println(b+"minutes"+c+"seconds");
    }
}