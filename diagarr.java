import java.util.Scanner;
class diagarr{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[][] = new int[5][5];
      int i,j,k=4;
      for(j=0;j<=4;j++){
          for(i=0;i<=4;i++){
                  System.out.print("enter");
                  a[j][i]=ob.nextInt();
                }
            }
          for(j=0;j<=4;j++){
          for(i=0;i<=4;i++){
              if(j==i||j+k==i||j-k==i){
              System.out.print(a[j][i] + " ");
            }
            else{
                System.out.print(" "+" ");
            }
            
            }
            System.out.println();
            k-=2;
        }
        }
    }
