import java.util.Scanner;
class Q4string{
    String swapwrd="";
    String sortwrd="";
    String wrd;
    int len;
    Q4string(){
        wrd="";
        len=0;
    }
    void readword(){
        Scanner sc=new Scanner(System.in);
        wrd=sc.nextLine();
        wrd=wrd.toUpperCase();
        len=wrd.length();
    }
    void swapchar(){
        char cfirst=wrd.charAt(0);
        char clast=wrd.charAt(len-1);
        swapwrd= clast+wrd.substring(1,len-1)+cfirst;
    }
    void sort(){
        char i;
        int j;
        for(i='A';i<='Z';i++){
            for(j=0;j<len;j++){
                if(wrd.charAt(j)==i){
                    sortwrd=sortwrd+i;
                }
            }
        }
        
    }
    void display(){
        System.out.println(swapwrd);
        System.out.println(sortwrd);
    }
    public static void main(){
        Q4string obj=new Q4string();
        obj.readword();
        obj.swapchar();
        obj.sort();
        obj.display();
    }
}