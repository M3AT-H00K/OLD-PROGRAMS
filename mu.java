import java.util.Scanner;
class mu{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int i,b=0;
      int a[] = new int[3];
      
      for(i=0;i<=2;i++){
          a[i]=ob.nextInt();
          
          b=a[i];
        }
        
      System.out.println(b);
    }
}