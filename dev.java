import java.util.Scanner;
class dev{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      int a[] = {1,2,3,4,5};
      int i,j;
      int l=a.length;
      int x;
      for(i=0;i<l;i++){
          x=a[i];
          for(j=0;j<l-1;j++){
             a[j]=a[j+1];
            }
            a[l-1]=x;
        }
        for(i=0;i<l;i++){
            System.out.println(a[i]);
        }
    }
}
          