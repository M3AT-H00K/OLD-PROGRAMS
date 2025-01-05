import java.util.Scanner;
class ImVeryHungry
{
    public static void main(){
        
    }
    public static void shape(char a){
        int i,j;
        for(i=1;i<=6;i+=2){
            for(j=1;j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    public static void shape(char a,int b){
        int i,j;
        for(i=1;i<=b;i+=2){
           for(j=1;i<=i;j++){
               System.out.print(a);
            }
            System.out.println();
        }
    }
}