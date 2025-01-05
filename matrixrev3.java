import java.util.Scanner;
class matrixrev3{
    int a[];
    int m;
    matrixrev3(int mm){
        m=mm;
        a=new int[m];
    }

    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entr kro");
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
    }

    matrixrev3 arrange(matrixrev3 P,matrixrev3 Q){
        matrixrev3 t= new matrixrev3(P.a.length+Q.a.length);
        int i;

        for(i=0;i<P.a.length;i++)
        {
            if(P.a[i]%2!=0)
                t.a[i]=P.a[i];
                else
                continue;
        }
        for(i=0;i<Q.a.length;i++)
        {
            if(Q.a[i]%2!=0)
                t.a[P.a.length+i]=Q.a[i];
                else
                continue;
        }
        for(i=0;i<P.a.length;i++)
        {
            if(P.a[i]%2==0)
                t.a[i]=P.a[i];
                else
                continue;
        }
        for(i=0;i<Q.a.length;i++)
        {
            if(Q.a[i]%2==0)
                t.a[P.a.length+i]=Q.a[i];
                else
                continue;
        }
        return t;
    }

    void display()
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(){
        Scanner ob=new Scanner(System.in);
        int x,y,z;
        System.out.println("cock");
        x=ob.nextInt();
        System.out.println("cock2");
        y=ob.nextInt();
        z=x+y;
        matrixrev3 a1=new matrixrev3(x);
        matrixrev3 a2=new matrixrev3(y);
        matrixrev3 a3=new matrixrev3(z);

        a1.fillarray();
        a2.fillarray();

        a3=a3.arrange(a1,a2);

        a3.display();
    }
}