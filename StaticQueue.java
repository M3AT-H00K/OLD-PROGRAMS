import java.util.Scanner;
class StaticQueue
{
    int a[],front,rear;  //the data type of array is variable(could be a string) variable names are variable
    StaticQueue()
    {
        a=new int[5];
        front=rear=-1;//0?
    }

    StaticQueue(int size) //use this constructor and the size is variable(obviously)
    {
        a=new int[size];
        front=rear=-1;
    }

    void addElement(int n)              //a[5][3][8][6][1]
    {                                   //  0  1  2  3  4
        if(rear==a.length-1)            //Add     front=-1,0
            System.out.println("Queue is Full"); //rear=-1,0,1,2,3,4  print sattement variable
        else
        {
            if(front==-1)
                front=rear=0;
            else
                rear++;

            a[rear]=n;
            System.out.println(n+" is added into the Queue ");
        }
    }//enqueue

    void removeElement()                      //REMOVE : 
    {                                               //front=0,1,2
        if(front==-1)                               //rear=4
            System.out.println("Queue is Empty");
        else
        {
            System.out.println(" Number Removed "+a[front++]);
            if(front>rear)//shouldnt this be >=???
                front=rear=-1;
        }
    }//dequeue

    int count()
    {
        if(front==-1)
            return 0;
        else
        {
            return rear-front+1;
        }
    }

    void display()
    {
        if(front==-1)
            System.out.println("Queue is Empty");
        else
        {
            int i;
            System.out.println(" Number are ");
            for(i=front;i<=rear;i++)
                System.out.println(a[i]);
        }
    }

    void mainMenu()
    {
        Scanner sc=new Scanner(System.in);
        int ch,n;
        do
        {
            System.out.println("                    Queue Menu");
            System.out.println("                    1.Add Element");
            System.out.println("                    2.Remove Element");
            System.out.println("                    3.Count");
            System.out.println("                    4.Display");
            System.out.println("                    5.Exit");
            System.out.print("                    ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a number to be pushed");
                n=sc.nextInt();
                addElement(n);
                break;
                case 2:
                removeElement();
                break;
                case 3:
                System.out.println(" Count = "+count());
                break;
                case 4:
                display();
                break;    
                case 5:
                System.out.println("Exiting.....");
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!=5);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want ");
        int a=sc.nextInt();
        StaticQueue obj=new StaticQueue(a);
        obj.mainMenu();
    }
}