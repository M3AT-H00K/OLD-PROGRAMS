import java.util.Scanner;
class reples{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = new int[5];
      int i;
      int temp=0;
     
      for(i=0;i<=4;i++){
           System.out.println("enter number");
          a[i]=ob.nextInt();
         }
         temp=a[0];
         a[0]=a[4];
         a[4]=temp;
      for(i=0;i<=4;i++){
           System.out.println(a[i]);
         
         }

      
    }
}

      