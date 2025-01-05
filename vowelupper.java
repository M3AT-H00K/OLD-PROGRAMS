import java.util.Scanner;
class vowelupper{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i;
        char c;
        String s,s1=" ";
        System.out.println("enter word");
        s=ob.nextLine();
        int l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                c=Character.toUpperCase(c);
            }
            s1=s1+c;
        }
        System.out.println(s1);
    }
}
    
