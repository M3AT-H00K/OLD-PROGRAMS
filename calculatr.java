import java.util.Scanner;
class calculatr
{
    public static void main(){
        area(5);
    }
    public static int area(int a){
        int b;
        b=a*a;
        return b;
    }
    public static int area(int a,int b){
        int c;
        c=a*b;
        return c;
    }
    public static double area(double a){
        double b= 3.14,c;
        c=a*a*b;
        return c;
    }
    public static double area(double a, double b){
        double c=1.5,d;
        d=a*b*c;
        return d;
    }
}