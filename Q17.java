import java.util.*;
class Q17 {
    static int a[];
    Q17(int m)
    {
        a=new int[m];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the set of numbers through which you want to search through");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    static int binarySearch(int low, int high, int key)
    {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;
        if (key == a[mid])
            return mid;
        if (key > a[mid])
            return binarySearch( (mid + 1), high, key);
        return binarySearch( low, (mid - 1), key);
    }

    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the ammount of numbers you want through search through");
        int m=sc.nextInt();
        Q17 obj =new Q17(m);
        obj.input();
        System.out.println("Enter the number to be searched for");
        int x = sc.nextInt();
        int n;
        n = a.length - 1;

        
        System.out.println("Index: " + (binarySearch( 0, n, x)+1));
    }
}