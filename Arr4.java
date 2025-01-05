import java.util.Scanner;
class Arr4{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = new int[10];
      int i;
      int x=0;
      for(i=0;i<=9;i++){
          System.out.println("enter number");
          a[i]=ob.nextInt();
          x=x+a[i];
        }
        System.out.println(x);
    }
}
