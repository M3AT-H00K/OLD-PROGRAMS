import java.util.Scanner;
class st36{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        String s1,s2,s3="",s4,s5;
        int l1,l2,x,y,i,j,k,z=0;
        char c,d;
        System.out.println("enter 2 words");
        s1=ob.nextLine();
        s2=ob.nextLine();
        l1=s1.length();
        l2=s2.length();
        x=Math.max(l1,l2);
        y=Math.min(l1,l2);
        z=x-y;
        
        if(l1>l2){
            for(i=0;i<l2;i++){
             c=s2.charAt(i);
             s3=s3+c;
            }
        }
        else{
            for(j=0;j<l1;j++){
             d=s1.charAt(j);
             s3=s3+d;
            }
        }
        if(l1>l2){
            s4=s1.substring(z);
        }
        else{
            s4=s2.substring(z);
        }
        s5=s3+s4;
        System.out.println(s5);
    }
}