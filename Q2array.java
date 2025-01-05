import java.util.Scanner;
import java.io.*;
class Q2array{
    public static void main(){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        boolean flag=true;
        int A[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("row "+ (i+1) + " column "+ (j+1));
                A[i][j]=ob.nextInt();
            }
        }
        System.out.println("array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j&&A[i][j]!=0){
                    flag=false;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        if(flag==false){
            System.out.println("not lower triangle");
        }
        if(flag==true){
            System.out.println("lower triangle");
        }
    }
}