import java.util.Scanner;
class Q7string{
    String x,y,z;
    int n;
    Q7string(){
        x="a";
        y="b";
        z="ba";
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter terms");
        n=sc.nextInt();
    }
    void generate(){
        int i;
        System.out.println(x+"\t");
        System.out.println(y+"\t");
        for(i=3;i<=n;i++){
            z=y+x;
            System.out.println(z+"\t");
            x=y;
            y=z;
        }
    }
    public static void main(){
        Q7string obj=new Q7string();
        obj.accept();
        obj.generate();
    }
}