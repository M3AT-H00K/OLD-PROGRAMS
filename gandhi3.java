import java.util.Scanner;
class gandhi3{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        String s,s1="",last,s2="";
        int i,l,x,l2;
        char c,d,e;
        System.out.println("enter string");
        s=ob.nextLine();
        s=s.trim();
        s=" "+s;
        l=s.length();
        x=s.lastIndexOf(' ');
        last=s.substring(x+2);
        for(i=0;i<x+1;i++){
            c=s.charAt(i);

            if(c==' '){
                d=s.charAt(i+1);
                d=Character.toUpperCase(d);
                s1=s1+d+'.';
                continue;
            }

        }
        l2=s1.length();
        
        for(i=0;i<l2-1;i++){
            e=s1.charAt(i);
            s2=s2+e;
            
        }
       
        System.out.println(s2);
    }
}