import java.util.Scanner;
class Arr2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int b[]=new int[10];
        for(i=0;i<=9;i++){
            System.out.println("enter number");
            b[i]=sc.nextInt();
        }
        for(i=9;i>=0;i--){
            System.out.println(b[i]);
        }
    }
}
