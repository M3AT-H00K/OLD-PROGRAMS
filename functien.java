import java.util.Scanner;
class functien
{
    public static void main(){
        sum();
        differens();
    }
    public static void sum()
    {
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        System.out.println("entr numbres");
        a=ob.nextInt();
        b=ob.nextInt();
        c=a+b;
        System.out.println(c);
    }
    public static void differens()
    {
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        System.out.println("entr numbres");
        a=ob.nextInt();
        b=ob.nextInt();
        c=a>b?a-b:b-a;
        System.out.println(c);
    }
}