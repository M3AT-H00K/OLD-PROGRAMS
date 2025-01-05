import java.util.Scanner;
class matrixrev2{
    int com[];
    int size,size2;
    matrixrev2(int nn){
        size=nn;
        com=new int[size];
    }
    void inputarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kro");
        for(int i=0;i<size;i++){
            com[i]=sc.nextInt();
        }
    }
    void mix(matrixrev2 P, matrixrev2 Q){
        for(int i=0;i<P.size;i++){
            this.com[i]=P.com[i];
        }
        for(int j=0;j<Q.size;j++){
            this.com[(P.size)+j]=Q.com[j];
        }
        size=P.size+Q.size;
    }
    void sort(){
        
            for(int i=0;i<=size-1;i++){
            for(int j=(i+1);j<=size-1;j++){
                int temp=0;
                if(com[i]>com[j]){
                    temp=com[i];
                    com[i]=com[j];
                    com[j]=temp;
                }
                
            }
        
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(com[i]+" ");
        }
    }
    public static void main(){
        matrixrev2 obj1= new matrixrev2(5);
        matrixrev2 obj2= new matrixrev2(3);
        matrixrev2 obj3= new matrixrev2(8);
        obj1.inputarray();
        obj2.inputarray();
        obj3.mix(obj1,obj2);
        obj3.sort();
        obj3.display();
    }
}