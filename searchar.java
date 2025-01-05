import java.util.Scanner;
class searchar{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = {1,12,13,16,18};
      int i;
      int x;
      boolean flag=false;
      System.out.println("enter number");
      x=ob.nextInt();
      for(i=0;i<=4;i++){
         if(x==a[i]){
             flag=true;
             break;
            }
         else{
             flag=false;
             continue;
            }
        }
      if(flag==true){
          System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

      
    }
}

      