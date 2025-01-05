import java.util.Scanner;
class Node
{
    int num; //data
    Node next; //address of next node
}
class LinkList
{
    Node head;//what is head
    LinkList()
    {
        head=null;
    }

    void addAtBegin(int n)
    {
        Node newNode=new Node();
        if(newNode==null)
            System.out.println("Memory Over");
        else                                        //head=null,4000,5000
        {                                           //      newnode(4000) Fail: newnode=null
            newNode.num=n;                          //      [50][null]
            newNode.next=null;                      //      num  next
            if(head==null)
                head=newNode;                       //      newnode (5000)
            else                                    //      [30][4000]
            {                                       //      num next
                newNode.next=head;
                head=newNode;
                System.out.println(n+" is added at the beginning ");
            }
        }
    }

    void addAtEnd(int n)
    {
        Node newNode=new Node();
        if(newNode==null)
            System.out.println("Memory Over");
        else
        {                               //head=null,4000            ptr=4000,5000
            newNode.num=n;              //newnode(4000)
            newNode.next=null;          // [50][null,5000]
            if(head==null)              // num next
                head=newNode;           
            else                        //newnode(5000)
            {                           // [70][null,6000]
                Node ptr=head;          // num next
                while(ptr.next!=null)
                {                       // newnode(6000)
                    ptr=ptr.next;       //  [90][null]
                }                       //  num next
                ptr.next=newNode;
                System.out.println(n+" is added at the end ");
            }
        }
    }

    void insertByPosition(int n,int p)          //n=60, p=3
    {
        if(p<=1)                    
            addAtBegin(n);          
        else if(p>=count())
            addAtEnd(n);
        else
        {
            Node newNode=new Node();            
            if(newNode==null)                   
                System.out.println("Memory Over");
            else                             //head-> 30 -> 50 -> 70 -> 90 N
            {                                   // 300  500   700   900
                newNode.num=n;
                newNode.next=null;              //newNode(600)          ptr2=300    ptr1=300
                Node ptr1=head,ptr2=head;        //  [60][null,700]          300         500
                int i;                           //  num next                500         700
                for(i=1;i<p;i++)
                {                               //head-> 30 -> 50 -> 60-> 70 -> 90 N
                    ptr2=ptr1;                  // 300  500   600   700   900
                    ptr1=ptr1.next;
                }
                ptr2.next=newNode;
                newNode.next=ptr1;
                System.out.println(n+" is inserted at the position "+p);
            }
        }
    }

    void removeByPosition(int p)
    {
        if(p<=1)
        {
            //removeFromBegin();
        }
        else if(p>=count())
        {
            //removeFromEnd();
        }
        else
        {
            Node ptr1=head,ptr2=head;
            int i;
            for(i=1;i<p;i++)
            {
                ptr2=ptr1;
                ptr1=ptr1.next;
            }
            ptr2.next=ptr1.next;
            System.out.println(ptr1.num+" is deleted from the position "+p);
            ptr1=null;
        }
    }

    void display()
    {
        if(head==null)
            System.out.println("Link List is EMPTY");
        else
        {
            Node ptr=head;
            System.out.println("Number are ");
            while(ptr!=null)
            {
                System.out.println(ptr.num);
                ptr=ptr.next;
            }
        }
    }

    int count()
    {
        if(head==null)
            return 0;
        else
        {
            Node ptr=head;
            int c=0;
            while(ptr!=null)
            {
                c++;
                ptr=ptr.next;
            }
            return c;
        }
    }

    void controller()
    {
        Scanner sc=new Scanner(System.in);
        int ch,a,b;
        do
        {
            System.out.println("\n\nLink List\n\n   Menu\n\n1:Add at Begin \n2:Add at End \n3:Insert By Position \n4:Delete from Begin\n5:Delete from End \n6:Delete by Position \n7:Search \n8:Display \n9:Count \n10:Find Largest \n11:Find Smallest \n12:Sort List\n13:Split List \n14:Merge List \n15:Exit\nEnter Choice ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a Number ");
                a=sc.nextInt();
                addAtBegin(a);
                break;
                case 2:
                System.out.println("Enter a Number ");
                a=sc.nextInt();
                addAtEnd(a);
                break;
                case 3:
                System.out.println("Enter a Number & Position ");
                a=sc.nextInt();
                b=sc.nextInt();
                insertByPosition(a,b);
                break;
                case 4:
                //removeFromBegin();
                break;
                case 5:
                //removeFromEnd();
                break;
                case 6:
                System.out.println("Enter a Position ");
                a=sc.nextInt();
                removeByPosition(a);
                break;
                case 7:
                System.out.println("Enter a Number to Search ");
                a=sc.nextInt();
                /*if(search(a)==NULL)
                System.out.println("\nNumber Not Found");
                else
                System.out.println("\nNumber Found");
                 */
                break;
                case 8:
                display();
                break;
                case 9:
                System.out.println("\nNumber of Nodes "+count());
                break;
                case 10:
                /*a=findLargest();
                if(a==-1)
                System.out.println("\nList is empty");
                else
                System.out.println("\nLargest number is "+a);*/
                break;
                case 11:
                /*a=findSmallest();
                if(a==-1)
                System.out.println("\nList is empty");
                else
                System.out.println("\nSmallest number is "+a);*/
                break;
                case 12:
                //sortList();
                break;
                case 13:
                System.out.println("Enter a value to Split ");
                a=sc.nextInt();
                /*if(splitList(a)==-1)
                System.out.println("Operation Failed");
                else
                {
                System.out.println("\nAfter spliting the lists are \n");
                display(head);
                System.out.println("\n AND \n\n");
                display(split_head);
                }*/
                break;
                case 14:
                //mergeList();
                //display(head);
                break;
                case 15:
                System.out.println("\nExiting");
                break;
                default:
                System.out.println("\nInvalid choice entered");
            }
        }while(ch!=15);
    }

    public static void main()
    {
        LinkList obj=new LinkList();
        obj.controller();
    }
}