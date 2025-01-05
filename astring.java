import java.util.Scanner;
class astring{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,ctr=0;
        char c;
        String s;
        System.out.println("enter string");
        s=ob.nextLine();
        int l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c=='a'){
                ctr++;
            }
        }
        if(ctr==1){
            System.out.println(ctr + " time");
        }
        else{
            System.out.println(ctr + " times");
        }

    }
}