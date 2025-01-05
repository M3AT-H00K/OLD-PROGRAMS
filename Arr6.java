import java.util.Scanner;
class Arr6{
    public static void main(String[]args){
     Scanner ob=new Scanner(System.in);
     String a[] = {"nah","monday","tuesday","wednesday","thursday","friday","saturday","sumday"};
     int pos=-1;
     int i,j,k;
     System.out.println("enter number");
     i=ob.nextInt();
     for(j=0;j<=7;j++){
         if(j==i){
             pos=i;
            }
        }
      System.out.println(a[pos]);
        
    }
}