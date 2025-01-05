import java.util.Scanner;
class Arr3{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = new int[10];
      int i;
      int x;
     
      for(i=0;i<=9;i++){
          {
          System.out.println("enter number");
          a[i]=ob.nextInt();
        }
          if(a[i]%3==0||a[i]%7==0)
          {
              System.out.println(a[i] + " divisible by 3 or seven");
            }
     
        }

      
    }
}

      