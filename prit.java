import java.util.Scanner;
class prit{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        printTable(a);
    }
    public static void printTable(int num)
    {
        int i,prod;
        for(i=1;i<=10;i++){
            prod=num*i;
            System.out.println(num+"*"+i+"="+prod);
        }
    }
}