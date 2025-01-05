import java.util.Scanner;
class posar{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = new int[5];
      int i;
      int x;
     
      for(i=0;i<=4;i++){
          
          System.out.println("enter number");
          a[i]=ob.nextInt();
        
         
        }
        for(i=0;i<=4;i++){
         if(a[i]%2==0){
             System.out.print(a[i] + ",");
            }
            else{
                System.out.print("X,");
            }
      }
      

      
    }
}

      