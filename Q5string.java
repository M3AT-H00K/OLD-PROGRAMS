import java.util.Scanner;
class Q5string{
    String word,newword="";
    int len;
    String shifted="";
    String consonants="";
    String vowels="";
    Q5string(){
        word="";
        len=0;
    }
    void readword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("COCk again");
        word=sc.nextLine();
        word=word.toLowerCase();
    }
    void shiftcons(){
        int  i;
        char c;
        int l=word.length();
        for(i=0;i<=l-1;i++){
            c=word.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels=vowels+c;
            }
            else{
                consonants=consonants+c;
            }
        }
        shifted=consonants+vowels;
    }
    void changeword(){
        consonants=consonants.toUpperCase();
        newword=consonants+vowels;
    }
    void show(){
        System.out.println(word);
        System.out.println(shifted);
        System.out.println(newword);
    }
    public static void main(){
        Q5string obj=new Q5string();
        obj.readword();
        obj.shiftcons();
        obj.changeword();
        obj.show();
    }
}