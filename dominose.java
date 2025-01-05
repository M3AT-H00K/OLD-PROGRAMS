import java.util.*;
public class dominose
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int choice,veg=0,non=0,soft=0,no,softdrank,type;
        
        do{
            System.out.println("1.menu...2.exit");
            choice=ob.nextInt();
            switch(choice){
                case 1:
                System.out.println("1.veg pizza......2.nonveg pizza");
                type=sc.nextInt();
                if(type==1){
                    veg++;
                }
                else{
                    non++;
                }
                System.out.println("how many pizzas?????????????????????????????");
                no=sc.nextInt();
                System.out.println("pizzas are better with drinks! wanna buy?(1=yes/2=no)");
                softdrank=sc.nextInt();
                if(softdrank==1){
                    soft++;
                }
                else {
                }
                System.out.println("your bill:");
                System.out.println("veg pizzas " + veg);
                System.out.println("nonveg pizzas  " + non);
                System.out.println("soft drincs " + soft);
                break;
            }
        }while(choice>0 && choice<2);
        System.out.println("your order will arrive in:   Never");
    }
}