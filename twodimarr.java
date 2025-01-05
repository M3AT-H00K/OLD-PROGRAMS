import java.util.Scanner;
class twodimarr{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[][] = {{2,31,24},{15,14,12},{9,18,16}};
      int i,j;
      for(j=0;j<=2;j++){
          for(i=0;i<=2;i++){
              if(a[j][i]%2==0){
                  System.out.print(a[j][i]+" ");
                }
                else{
                    System.out.print("#"+" ");
                }
            }
            System.out.println();
        }
    }
}