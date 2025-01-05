import java.util.Scanner;
class wordrep{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        String s,s1="",sr,re;
        boolean flag=false;
        int i,l,k,ctr=0,sctr=0,pos=0,j;
        char c,ch,cha;
        System.out.println("enter string");
        s=ob.nextLine();
        s=s.trim();
        s=s+" ";
        l=s.length();
        System.out.println("enter word to replase");
        sr=sc.nextLine();
        System.out.println("enter replasement word");
        re=sc.nextLine();

        for(i=0;i<l;i++){
            c=s.charAt(i);
            if(c!=' '){
                s1=s1+c;
                ctr++;
                continue;
            }
            if(s1.equals(sr)==true){

                for(j=0;j<ctr;j++){
                    for(k=0;k<l;k++){
                        ch=re.charAt(k);
                    }
                    cha=s1.charAt(j);
                    cha=ch;

                }
            }

            s1="";
        }

    }
}
