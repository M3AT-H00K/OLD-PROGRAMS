import java.util.Scanner;
class wordsrch{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        String s,s1="",sr;
        boolean flag=false;
        int i,l;
        char c;
        System.out.println("enter string");
        s=ob.nextLine();
        s=s.trim();
        s=s+" ";
        l=s.length();
        System.out.println("enter word");
        sr=sc.nextLine();

        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c!=' '){
                s1=s1+c;
                continue;
            }
            if(s1.equals(sr)==true){
                flag=true;
            }

            s1="";
        }
        if(flag==true){
            System.out.println("found");
        }
        else{
            System.out.println("nop");
        }
    }
}
