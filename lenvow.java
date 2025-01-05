import java.util.Scanner;
class lenvow{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,ctr=0;
        char c,ch;
        String s,s1="";
        System.out.println("enter sentence");
        s=ob.nextLine();
        int l=s.length();
        int l1=0,l2=0,j;
        for(i=l1;i<l;i++){
            c=s.charAt(i);
            if(c!=' '){
                s1=s1+c;
                l1++;
                l2++;
                continue;
            }
            ctr=0;
            for(j=0;j<l1;j++){
                ch=s.charAt(i);
                if(ch=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                    ctr++;
                }

            }
            System.out.println("word= " + s1 + " length= "+l2+" vowels= "+ctr);

            s1="";
            l1=l1+1;
            l2=0;
            
        }

    }
}