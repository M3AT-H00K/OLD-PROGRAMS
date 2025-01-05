import java.util.Scanner;
class dnt{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        String s,day="",month="",year="";
        int a,b,l;
        char ch;
        System.out.println("date");
        s=ob.nextLine();
        l=s.length();
        a=s.indexOf('/');
        b=s.lastIndexOf('/');
        day=s.substring(0,a);
        month=s.substring(a+1,b);
        year=s.substring(b+1,l);
        System.out.println(day+" "+month+" "+year);
    }
}
