import java.util.Scanner;
import java.util.StringTokenizer;

class srting1{
    public static void main(){
        Scanner ob=new Scanner(System.in);
        String s1;
        int l,i;
        char c;
        
        s1=ob.nextLine().trim().toUpperCase();
        l=s1.length();
        if(s1.charAt(l-1)!='.' && s1.charAt(l-1)!='!' && s1.charAt(l-1)!='?'){
            System.out.println("invalid");
            
        }
        else{
            StringTokenizer st= new StringTokenizer(s1);
            String svowel=" ";
            String sconso=" ";
            while(st.hasMoreTokens()){
                String word=st.nextToken();
                if(word.charAt(0)!='A' && word.charAt(0)!='U' && word.charAt(0)!='O' && word.charAt(0)!='I' && word.charAt(0)!='E'){
                    sconso=sconso+word+" ";
                }
                else{
                    svowel=svowel+word+" ";
                }
            }
            System.out.println(svowel+sconso);
        }
    }
}