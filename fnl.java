import java.util.Scanner;
class fnl{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i;
        char c;
        String s;
        System.out.println("enter string");
        s=ob.nextLine();
        int l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            System.out.println(c);
        }
    }
}