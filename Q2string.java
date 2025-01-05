import java.util.Scanner;
class Q2string{
    String wrd,newwrd="";
    Q2string(){
        wrd="";
    }
    void readwowrd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("COCk");
        wrd=sc.nextLine();
        wrd=wrd.toLowerCase();
    }
    void freqvowcon(){
        int  ctrv=0,ctrc=0,i;
        char c;
        int l=wrd.length();
        for(i=0;i<=l-1;i++){
            c=wrd.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ctrv++;
            }
            else{
                ctrc++;
            }
        }
        System.out.println("vowels= "+ ctrv+" consonants= "+ ctrc);
    }
    
    void arrange(){
        int  i;
        char c;
        int l=wrd.length();
        String consonants="";
        String vowels="";
        for(i=0;i<=l-1;i++){
            c=wrd.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels=vowels+c;
            }
            else{
                consonants=consonants+c;
            }
        }
        newwrd=vowels+consonants;
    }
    
    void display(){
        System.out.println(newwrd);
    }
    
    public static void main(){
        Q2string ob=new Q2string();
        ob.readwowrd();
        ob.freqvowcon();
        ob.arrange();
        ob.display();
    }
}