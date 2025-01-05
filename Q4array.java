import java.util.Scanner;
class Q4array{
    static int n,arr[];
    Q4array(int nn){
        n=nn;
        arr=new int[n];
    }

    void fillarray(){
        Scanner ob=new Scanner(System.in);
        System.out.println("input element");
        for(int i=0;i<n;i++){
            
            arr[i]=ob.nextInt();
        }
    }

    void sort(){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    static int search(int v, int high, int low){
        int m;
        if(high<low){
            return -1;
        }

        m=(low+high)/2;
        if(v>arr[m]){
            return( search(v, high, m+1));
        }

        if(v==arr[m]){
            return m;
        }

        return(search(v, m-1, low));
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);

        Q4array k=new Q4array(10);
        k.fillarray();
        k.sort();
        System.out.println("enter number");
        int z=sc.nextInt();
        
        System.out.println("fuck off "+ (search(z,9,0)+1));
    }
}
