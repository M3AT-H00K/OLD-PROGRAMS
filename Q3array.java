import java.util.Scanner;
import java.io.*;
class Q3array{
    Scanner ob=new Scanner(System.in);
    int m,n;
    int l;
    int arr1[];
    int arr2[];
    int arr[];
    int i,j;
    int l1,l2;
    Q3array(int mm,int nn){
        m=mm;
        n=nn;
    }

    public void fillarray(){
        
        arr1=new int[m];
        l1=arr1.length;
        arr2=new int[n];
        l2=arr2.length;
        l=(l1+l2);
        arr=new int[l];
        System.out.println("enter " +m+ " elements of array 1");
        for(int i=0;i<l1;i++){
            arr1[i]=ob.nextInt();
        }
        System.out.println("enter " +n+ " elements of array 2");
        for(int i=0;i<l2;i++){
            arr2[i]=ob.nextInt();
        }
    }

    public void merge(){
        for(i=0;i<=l1-1;i++){
            arr[i]=arr1[i];
            
        }
        
        for(j=0;j<=l2-1;j++){
            arr[l1+j]=arr2[j];
            
        }
        
        for(int i=0;i<=l-1;i++){
            for(int j=(i+1);j<=l-1;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
    }

    public void display(){
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(){
        Q3array bb=new Q3array(5,3);
        bb.fillarray();
        bb.merge();
        bb.display();
    }
}