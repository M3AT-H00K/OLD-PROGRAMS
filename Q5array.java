import java.util.Scanner;
class Q5array{
    int arr[][],m,n;

    Q5array(int mm, int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray(){
        Scanner ob=new Scanner(System.in);
        System.out.println("input elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=ob.nextInt();
            }
        }
    }

    int reverse(int x){
        int rev=0;
        while(x>=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev;
    }
    
    void revMat(Q5array p){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                this.arr[i][j]= reverse(p.arr[i][j]);
            }
        }
    }
    
    void show(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(){
        Scanner sc= new Scanner (System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        Q5array k =new Q5array(x,y);
        k.fillarray();
        Q5array l =new Q5array(x,y);
        l.revMat(k);
        l.show();
    }
}