import java.util.Scanner;
class sevenonethree{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int i=1;
      while(i>0){
          if(i%7==0 && i%13==0){
              break;
            }
        }
        System.out.println(i);
    }
}