import java.util.Scanner;
class titlestng{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i;
        char c,a;
        String s,s1="",s2;
        System.out.println("enter sentence");
        s=ob.nextLine();
        s2=' '+s;
        int l=s2.length();
        for(i=0;i<l;i++){
            c=s2.charAt(i);
            if(c==' '){
                a=s2.charAt(i+1);
                a=Character.toUpperCase(a);
                s1=s1+' '+a;
                i++;
            }
            else{
                s1=s1+c;
            }
        }
        System.out.println(s1);
    }
}