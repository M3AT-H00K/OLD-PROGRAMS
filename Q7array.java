import java.util.Scanner;
class Q7array{
    int a[];
    Q7array(){
        a=new int[2];
        a[0]=0;
        a[1]=0;
    }
    void readtime(){
        Scanner sc=new Scanner(System.in);
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
    }
    void addtime(Q7array X,Q7array Y){
        this.a[0]=X.a[0]+Y.a[0];
        this.a[1]=X.a[1]+Y.a[1];
    }
    void disptime(){
        System.out.println(a[0]+" hours " + a[1]+" mins ");
    }
    public static void main(){
        Q7array A=new Q7array();
        Q7array B=new Q7array();
        A.readtime();
        B.readtime();
        A.addtime(A,B);
        A.disptime();
    }
}
//just make sure to do the min to hour conversion