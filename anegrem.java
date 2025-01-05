import java.util.Scanner;
class anegrem{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int i,j,k,l1,l2;
        char c,d;
        String s1,s2;
        boolean flag=false;
        System.out.println("enter string");
        s1=ob.nextLine();
        System.out.println("enter string");
        s2=ob.nextLine();
        l1=s1.length();
        l2=s2.length();
        if(l1!=l2)
        {
            System.out.println("nope, not even same length");
            System.exit(0);
        }
        for(i=0;i<l1;i++){
            c=s1.charAt(i);
            for(j=0;j<l2;j++){
                d=s2.charAt(i);
                if(d==c){
                    flag=true;
                    
                }
                else{
                    flag=false;
                    break;
                }
            }
            
        }
        if(flag=true){
            System.out.println("yup");
        }
        else if(flag=false)
        {
            System.out.println("hahahahahaaahahaha lolllll");
        }
    }
}