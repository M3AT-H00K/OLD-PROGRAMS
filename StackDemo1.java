import java.util.Scanner;
class StackDemo1
{
    int a[];//variable data type
    int top;
    StackDemo1()
    {
        a=new int[5];
        top=-1;  
    }

    StackDemo1(int size)
    {
        a=new int[size];
        top=-1;  //shouldnt this be size-1???
    }

    void push(int n)
    {
        if(top==a.length-1)
            System.out.println("Stack is Full");
        else
            a[++top]=n;
    }

    void pop()
    {
        if(top==-1)
            System.out.println("Stack is Empty");
        else
        {
            System.out.println("Number Poped is "+a[top--]);//top atnd then top--??
        }
    }

    int count()
    {
        return top+1;
    }

    void peak()
    {
        if(top==-1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top Most Element is "+a[top]);
    }

    void display()
    {
        if(top==-1)
            System.out.println("Stack is Empty");
        else
        {
            int i;
            System.out.println("Numbers are ");
            for(i=top;i>=0;i--)
                System.out.println(a[i]); //from top to bottom printed
        }
    }

    void controller()
    {
        Scanner sc=new Scanner(System.in);
        int ch,n;
        do
        {
            System.out.println("Menu\n1.Push\n2.Pop\n3.Count\n4.Peak\n5.Display\n6.Exit\nEnter Choice ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter a number ");
                    n=sc.nextInt();
                    push(n);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    System.out.println("Number of elements "+count());
                    break;
                case 4:
                    peak();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }while(ch!=6);
    }

    public static void main()
    {
        StackDemo1 obj=new StackDemo1();
        obj.controller();
    }
}