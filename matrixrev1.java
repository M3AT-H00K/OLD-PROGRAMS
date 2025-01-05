import java.util.Scanner;
class matrixrev1{
    int arr[][];
    int m,n;
    matrixrev1(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kro");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int reverse(int x){
        int rev=0;
        while(x>0){
            int rem=0;
            rem=x%10;
            x=x/10;
            rev=(rev*10)+rem;
        }
        return rev;
    }
    void revmat(matrixrev1 P){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                this.arr[i][j]=reverse(P.arr[i][j]);
            }
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(){
        matrixrev1 obj1= new matrixrev1(3,3);
        matrixrev1 obj2= new matrixrev1(3,3);
        obj1.fillarray();
        obj2.revmat(obj1);
        obj1.display();
        obj2.display();
    }
}