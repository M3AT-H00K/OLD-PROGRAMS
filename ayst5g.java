import java.util.*;
public class ayst5g
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int age,choice,standard,sum=0,avg=1,test=0,lit=0,stu=0,literrate=1;
        String name;
        do{
            System.out.println("1.test.....2.exit");
            choice=ob.nextInt();
            switch(choice){
                case 1:
                test++;
                System.out.println("name");
                name=sc.nextLine();
                System.out.println("age");
                age=sc.nextInt();
                System.out.println("standard");
                standard=sc.nextInt();
                if(standard>=5){
                    lit++;
                }
                else{
                    stu++;
                }
                sum=sum+age;
                avg=sum/test;
                System.out.println("avg age= "+avg);
                literrate=(lit*100)/test;
                System.out.println("literacy rate= "+literrate);
                break;
            }
        }while(choice>0 && choice<2);
        System.out.println("bye");
    }
}
          
                