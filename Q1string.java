import java.util.Scanner;
class Q1string{
    String wrd,Wrd="";
    int len;
    
    Q1string(){
        wrd="";
        len=wrd.length();
    }
    void feedword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("talk yo shit");
        wrd=sc.next();
        len=wrd.length();
    }
    
    void mixWord(Q1string P,Q1string Q){
        int l1,l2,l,i;
        
        String big;
        
        l1=P.len;
        l2=Q.len;
        if(l1<l2){
            l=l1;
            big=Q.wrd;
        }
        else{
            l=l2;
            big=P.wrd;
        }
        String temp1,temp2;
        temp1=P.wrd;
        temp2=Q.wrd;
        for(i=0;i<l;i++){
            Wrd+=temp1.charAt(i);
            Wrd+=temp2.charAt(i);
        }
        Wrd=Wrd+big.substring(i);
        len=Wrd.length();
    }
    
    void display(){
        System.out.println(Wrd);
    }
    
    public static void main(){
        Q1string wacko=new Q1string();
        Q1string lacko=new Q1string();
        Q1string blacko=new Q1string();
        wacko.feedword();
        lacko.feedword();
        blacko.mixWord(wacko,lacko);
        blacko.display();
    }
}