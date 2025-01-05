import java.util.Scanner;
class transpose{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int a[][] = new int[5][5];
        int a1[][] = new int[5][5];
        int b[][] = new int[5][5];
        int i,j;
        for(j=0;j<=4;j++){
            for(i=0;i<=4;i++){
                System.out.print("enter");
                a[j][i]=ob.nextInt();
            }
        }
        for(j=0;j<=4;j++){
            for(i=0;i<=4;i++){
                a1[j][i]=a[j][i];
            }
        } 
        for(j=0;j<=4;j++){
            for(i=0;i<=4;i++){
                b[j][i]=a[i][j];
            }
        } 
        for(j=0;j<=4;j++){
            for(i=0;i<=4;i++){
                if(b[j][i]==a1[j][i]){
                    System.out.println("symmetric");
                }
                else{
                    System.out.println("not symmetric");
                }
            }
        } 

    }
}

        
        
    
