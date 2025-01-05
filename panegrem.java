import java.util.Scanner;
class panegrem{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,j,k,l,ctr=0;
        char c,d,e=' ';
        boolean flag=true;
        String s,s1="";
        System.out.println("enter string");
        s=ob.nextLine();
        l=s.length();
        for(i=0;i<l;i++){
            c=s.charAt(i);
            c=Character.toLowerCase(c);
            s1=s1+c;
        }
        for(j='a';j<'z';j++){
            e=(char)(j);
            ctr=0;
            for(k=0;k<l;k++){
                d=s1.charAt(k);
                if(j==d){
                    ctr++;
                }
            }
            if(ctr<1){
                flag=false;
                break;
            }
            else{
                continue;
            }
        }
        if(flag=true){
            System.out.println("panagram");
        }
        else{
            System.out.println("nope hahahaha lol");
        }
    }
}