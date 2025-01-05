import java.util.Scanner;
class frequen{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,j,k,l,ctr=0;
        char c,d,e=' ';
        String s,s1="";
        System.out.println("enter string");
        s=ob.nextLine();
        l=s.length();
        for(j='a';j<'z';j++){
            e=(char)(j);
            for(k=0;k<l;k++){
                d=s.charAt(k);
                if(j==d){
                    ctr++;
                }
            }
            if(ctr!=0){
                System.out.println(e + " appears " + ctr + " times");
                ctr=0;
                e=' ';
            }
            
        }
    }
}