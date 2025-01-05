import java.util.Scanner;
import java.util.StringTokenizer;
class Q3string{
    String sent;
    int freq=0;
    
    Q3string(){
        sent="";
    }
    
    void input(){
        Scanner sc=new Scanner(System.in);
        sent=sc.nextLine();
    }
    
    boolean isCap(String w){
        char c;
        c=w.charAt(0);
        if(c>='A' && c<='Z'){
            return true;
        }
        else{
            return false;
        }
    }
    
    void display(){
        sent=sent.trim();
        StringTokenizer st= new StringTokenizer(sent, " ");
        while(st.hasMoreTokens()){
            String currenttoken=st.nextToken();
            System.out.print(currenttoken+ " ");
            if(isCap(currenttoken)==true){
                freq++;
            }
            else{
                continue;
            }
            
        }
        System.out.println();
        System.out.println(freq+ " words are capitalised");
    }
    
    public static void main(){
        Q3string obj=new Q3string();
        obj.input();
        obj.display();
    }
    
    
}