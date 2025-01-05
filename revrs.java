import java.util.Scanner;
class revrs{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i;
        char c;
        String s,s1="";
        System.out.println("enter word");
        s=ob.nextLine();
        int l=s.length();
        for(i=l-1;i>=0;i--){
            c=s.charAt(i);
            s1=s1+c;
        }
        System.out.println(s1);
    }
}