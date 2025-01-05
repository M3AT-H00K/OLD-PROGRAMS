import java.util.Scanner;
class vowelstrng{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,ctr=0;
        char c;
        String s;
        System.out.println("enter word");
        s=ob.nextLine();
        int l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                ctr++;
            }
        }
        if(ctr==1){
            System.out.println(ctr + " one vowel in string");
        }
        
        else{
            System.out.println(ctr + " vowels in string");
        }
        if(ctr==l){
            System.out.println("only vowels are present in this string");
        }
    }
}