import java.util.Scanner;
import java.util.StringTokenizer;
class Q8string{
    String sent,rev="";
    int size;
    Q8string(){
        sent="";
        size=0;
    }
    void readsentence(){
        Scanner sc=new Scanner(System.in);
        sent=sc.nextLine();
        sent=sent.trim();
        size=sent.length();
    }
    void exfirstlast(){
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens()){
            String temp="";
            temp=st.nextToken();
            
            int length=temp.length();
            String sub=temp.substring(1,(length-1));
            char cfirst;
            char clast;
            
            cfirst=temp.charAt(0);
            clast=temp.charAt((length)-1);
            temp=clast+sub+cfirst;
            rev+=temp+ " ";
        }
    }
    void display(){
        System.out.println(sent);
        System.out.println(rev);
    }
    public static void main(){
        Q8string obj=new Q8string();
        obj.readsentence();
        obj.exfirstlast();
        obj.display();
    }
}