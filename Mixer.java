import java.util.Scanner;
class Mixer
{
    int arr[],n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter "+arr.length+" numbers in Asc. order.");
        System.out.println("Please don't enter duplicate number");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(i>0 && arr[i-1]>=arr[i])//not necessary
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
    }
    
    Mixer mix(Mixer obj)//just know mixer is a return type
    {
        Mixer t=new Mixer(this.arr.length+obj.arr.length);
        int i;
        for(i=0;i<this.arr.length;i++)
        {
            t.arr[i]=this.arr[i];
        }
        for(i=0;i<obj.arr.length;i++)
        {
            t.arr[this.arr.length+i]=obj.arr[i];
        }
        return t;
    }
    
    void display()
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int x,y,z;
        System.out.println("cock");
        x=ob.nextInt();
        System.out.println("cock2");
        y=ob.nextInt();
        z=x+y;
        Mixer a1=new Mixer(x);
        Mixer a2=new Mixer(y);
        Mixer a3=new Mixer(z);
        
        a1.accept();
        a2.accept();

        a3=a1.mix(a2);
        
        a3.display();
    }
}