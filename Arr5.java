import java.util.Scanner;
class Arr5{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = new int[10];
      int b[] = new int[10];
      int c[] = new int[10];
      int d[] = new int[10];
      int i,j,k;
      System.out.println("enter 10 numbers");
      for(i=0;i<=9;i++)
      {
          a[i]=ob.nextInt();
        }
        System.out.println("enter 10 more numbers");
      for(i=0;i<=9;i++)
      {
          b[i]=ob.nextInt();
        }
      for(i=0;i<=9;i++)
      {
          c[i]=a[i]+b[i];
        }
       for(i=0;i<=9;i++)
      {
          d[i]=a[i]-b[i];
        }
        for(i=0;i<=9;i++)
      {
        System.out.println(c[i]);
        
       }
        for(i=0;i<=9;i++)
      {
        System.out.println(d[i]);
        
       }
    }
}