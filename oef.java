import java.util.Scanner;
class oef{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter nombereer");
        num=sc.nextInt();
        if(num%2!=0){
            odd();
        }
        else{
            even();
        }
    }
    public static void odd()
    {
        int i;
        for(i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void even()
    {
        int i;
        for(i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}