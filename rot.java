import java.util.*;
class rot{
    public static void main(){
        Scanner ob=new Scanner(System.in);
        String s1=ob.nextLine();
        int len=s1.length();
        
        if(len<=3||len>=100){
            System.out.println("fuck off");
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<len;i++){
            char ch = s1.charAt(i);
            if((ch>='A'&&ch<='M')||(ch>='a'&&ch<='m')){
                sb.append((char)(ch+13));
            }
            else if((ch>='N'||ch<='Z')||(ch>='n'||ch<='z')){
                sb.append((char)(ch-13));
            }
            else{
                sb.append(ch);
            }
        }
        String cipher=sb.toString();
        System.out.println("what the fuck is this:");
        System.out.println(cipher);
    }
}