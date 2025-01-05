import java.util.*;
public class dwna
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int age,choice;
        String name;
        do{
            System.out.println("1.age check");
            System.out.println("2.exit");
            choice=ob.nextInt();
            switch(choice)
            {
                
                case 1:
                System.out.println("enter name and age");
                name=sc.nextLine();
                age=sc.nextInt();
                if(age<18){
                 System.out.println("minor"); 
                }
                else{
                    System.out.println("big boi");
                }
                break;
                
                case 2:
                System.out.println("thank you");
                break;
            }
        }while(choice>0&&choice<2);
    }
}