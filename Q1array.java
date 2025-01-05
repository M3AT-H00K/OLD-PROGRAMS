import java.util.*;
import java.io.*;
public class Q1array{
    public static void main(){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        if(n>2||n<6){
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

            for(int i=0;i<A[0].length;i++){
                for(int j=0;j<A[0].length;j++){

                    int temp=0;

                    if(A[0][i]<A[0][j]){
                        temp=A[0][i];
                        A[0][i]=A[0][j];
                        A[0][j]=temp;
                    }

                }
            }

            System.out.println("upper triangle array: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i<=j){

                        System.out.print(A[i][j]);
                    }

                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

        }
        else{
            System.out.println("fuck off");
        }
    }
}