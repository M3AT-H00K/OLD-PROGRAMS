
/**
 * Q146(New Notes) / Q129(Old Notes)
 * s=1! + 2! + 3! + 4! + 5! ...... n!
 * 
 * 4! means 4 factorial
 * 
 * 4!= 1*2*3*4
 * 
 * s=1+(1*2)+(1*2*3)+(1*2*3*4)+(1*2*3*4*5)......(1*2*3*4*5*...n)
 */

import java.util.Scanner;
class Series_146b
{
    int factorial(int n)        //n=4           f=1
    {                           //  i   i<=n    f*=i
        int i,f=1;              //  1   true    1
        for(i=1;i<=n;i++)       //  2   true    2
        {                       //  3   true    6
            f*=i;               //  4   true    24
        }                       //  5   false
        return f;
    }

    void series(int n)
    {
        int i,s=0;
        for(i=1;i<=n;i++)   //n=5
        {
            s+=factorial(i);    //Calling Factorial Function
                    //1 + 2 + 6 + 24 + 120
        }
        System.out.println("Answer is "+s);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Series_146b obj=new Series_146b();
        int n;
        System.out.println("Enter the Limit ");
        n=sc.nextInt();
        obj.series(n);
    }
}
/**
 *          Variable Description
 *  Variable    Data Type   Description
 *  i           int         Controls the Outer loop
 *  j           int         Controls the Inner loop
 *  n           int         Limit of the Series
 *  f           int         Factorial
 *  s           int         Sum of the Factorial
 */