import java.util.Scanner;
class Q6array{
    int a[][],m,n;
    Q6array(int mm,int nn){
        m=mm;
        n=nn;
        a=new int[m][n];
    }

    void readarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    int check(Q6array P,Q6array Q){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(P.a[i][j]!=Q.a[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
    
    void print(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(){
        Q6array Y=new Q6array(3,3);
        Q6array Z=new Q6array(3,3);
        Y.readarray();
        Z.readarray();
        Y.print();
        Z.print();
        if(Y.check(Y,Z)==1){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}