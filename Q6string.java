import java.util.Scanner;
import java.util.StringTokenizer;
class Q6string{
    String str;
    int len,wordcount,cons;
    Q6string(String ds){
        str=ds;
        str.trim();
        len=str.length();
    }
    void count(){
        int l=len;
        wordcount=0;
        cons=0;
        StringTokenizer st= new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            wordcount++;
            st.nextToken();
        }
        int i;
        char c;
        for(i=0;i<l;i++){
            c=str.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
                cons++;
            }
           
        }
        cons=cons-(wordcount-1);
    }
    void display(){
        System.out.println(str+" has "+wordcount+ " words and " +cons+" consonants" );
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        String input;
        input=sc.nextLine();
        Q6string obj=new Q6string(input);
        obj.count();
        obj.display();
    }
}