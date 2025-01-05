import java.util.Scanner;
class Number{
    int num1,num2,sum,difference,product;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        num1=ob.nextInt();
        num2=ob.nextInt();
    }

    public void calculate(){
        sum=num1+num2;
        difference=num1>num2?num1-num2:num2-num1;
        product=num1*num2;
    }

     public void display(){
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
    }
}