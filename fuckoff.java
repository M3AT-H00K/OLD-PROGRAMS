import java.util.Scanner;
class fuckoff{
    public static void main(){
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int i,j;
        int num;
        Scanner ob=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                num=ob.nextInt();
                a[i][j]=num;
                int temp=num;
                int rev=0;
                int rem=0;
                while(temp>0){
                    rem=temp%10;
                    temp=temp/10;
                    
                    rev=(rev*10)+rem;
                    
                }
                b[i][j]=rev;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+  " ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(b[i][j]+  " ");
            }
            System.out.println();
        }
        
    }
}