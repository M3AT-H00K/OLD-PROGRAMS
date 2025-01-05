import java.util.Scanner;
class alternate{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,j,k,l,l2,bl,ctr=1;
        char c=' ',d=' ';
        String s1,s2,s3="",x;
        System.out.println("enter 2 words");
        s1=ob.nextLine();
        s2=ob.nextLine();
        l=s1.length();
        l2=s2.length();
        bl=Math.min(l,l2);
        
        for(i=0;i<bl;i++){
            c=s1.charAt(i);
            d=s2.charAt(i);
            s3=s3+c;
            s3=s3+d;
        }


        System.out.println(s3);
    }
}

