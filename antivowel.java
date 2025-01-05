import java.util.Scanner;
class antivowel{
    public static void main(String[]args){
     Scanner ob=new Scanner(System.in);
        int i,l;
        char c,d;
        String s,s1="";
        System.out.println("enter strinc");
        s=ob.nextLine();
        l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                d=(char)(c+1);
                s1=s1+d;
            }
            else{
                s1=s1+c;
            }
        }
        System.out.println(s1);
    }
}