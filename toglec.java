import java.util.Scanner;
class toglec{
    public static String toglec(String s){
        int i,l=s.length();
        char ch;
        String s1="";
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true){
                ch=Character.toLowerCase(ch);
                s1=s1+ch;
            }
             else if(Character.isLowerCase(ch)==true){
                 ch=Character.toUpperCase(ch);
                s1=s1+ch;
            }
            if(ch==' '){
                s1=s1+" ";
            }
        }
        return s1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String s=sc.nextLine();
        System.out.println(toglec(s));
    }
}