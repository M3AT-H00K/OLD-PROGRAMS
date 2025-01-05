import java.util.Scanner;
class big{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        String s,s1="";
        char ch1,ch2;
        int i,j,k,l,c=0,pos=-1;
        System.out.println("enter strinc");
        s=ob.nextLine();
        s=s.trim();
        s=" "+s;
        l=s.length();
        for(i=0;i<l;i++){
            ch1=s.charAt(i);
            if(ch1==' '){
                c++;
            }
        }
        String arr[] = new String[c];
        for(j=0;j<c;j++){
            for(i=pos+1;i<l;i++){
                ch2=s.charAt(i);
                if(ch2!=' '){
                    s1=s1+ch2;
                    pos++;
                    continue;
                }
                pos++;
            }
            arr[j]=s1;
            s1="";
        }
        for(k=0;k<c;k++){
            System.out.println(arr[k]);
        }
    }
}

            
