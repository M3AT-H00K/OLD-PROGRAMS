import java.util.Scanner;
class revarr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[]=new int[5];
        int b[]=new int[5];
        
        for(i=0;i<=4;i++){
            System.out.println("enter number");
            b[i]=sc.nextInt();
        
        
         for(j=4;j>=0;j--){
            
            b[i]=a[j];
            
         }
         
      }
      for(i=0;i<=4;i++){
          System.out.println(a[i]);
        }
    }
}
        
    

