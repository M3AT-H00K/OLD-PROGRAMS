import java.util.Scanner;
class Q9array{
    int adno[];
    Q9array(){
        adno=new int[10];
        for(int i=0;i<10;i++){
            adno[i]=0;
        }
    }

    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        int temp;
        for(int i=0;i<10;i++){
            adno[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;i<10;i++){
                if(adno[i]>adno[j]){
                    temp=adno[i];
                    adno[i]=adno[j];
                    adno[j]=temp;
                }
            }
        }
    }

    int search(int low, int high, int v){
        int m;
        m=(high+low)/2;
        if(high<low){
            return -1;
        }
        if(v>adno[m]){
            return (search( m+1, high, v));
        }
        if(v==adno[m]){
            return (m);
        }
        return (search( low, m-1, v));
    }
    
    public static void main(){
        Scanner sc=new Scanner(System.in);
        Q9array k=new Q9array();
        k.fillarray();
        System.out.println("search for: ");
        int z=sc.nextInt();
        System.out.println(k.search(0,9,z));
    }
}