import java.util.Scanner;
class stringrev2{
    String wrd,newwrd;
    stringrev2(){
        wrd="";
        newwrd="";
    }
    void readword(){
        Scanner sc=new Scanner(System.in);
        wrd=sc.nextLine();
        wrd=wrd.trim();
        wrd=wrd.toUpperCase();
    }
    void vowfreqconfreq(){
        int len=wrd.length();
        char c;
        int vowctr=0;
        int conctr=0;
        for(int i=0;i<len;i++){
            c=wrd.charAt(i);
            
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowctr++;
            }
            else{
                conctr++;
            }
        }
        System.out.println(vowctr+" vowels "+conctr+" consonants");
    }
    void arrange(){
        int len=wrd.length();
        char c;
        String vow="";
        String con="";
        for(int i=0;i<len;i++){
            c=wrd.charAt(i);
            
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vow+=c;
            }
            else{
                con+=c;
            }
        }
        newwrd=vow+con;
        System.out.println(newwrd);
    }
    public static void main(){
        stringrev2 obj= new stringrev2();
        obj.readword();
        obj.vowfreqconfreq();
        obj.arrange();
    }
}