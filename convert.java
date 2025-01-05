import java.util.Scanner;
class convert{
    int n,d,m,y;
    convert(){
        n=0;
        d=0;
        m=0;
        y=0;
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of days");
        n=sc.nextInt();
        System.out.println("enter year");
        y=sc.nextInt();
    }

    void daytodate(){
        int a[]= {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0){
            a[1]+=1;
        }
        while(n>a[m]){
            n=n-a[m];
            m++;
        }
        d=n;m++;
    }

    void display(){
        String s="";
        switch(m){
            case 1: s="january";
                break;
            case 2: s="february";
                break;
            case 3: s="march";
                break;
            case 4: s="april";
                break;
            case 5: s="may";
                break;
            case 6: s="june";
                break;
            case 7: s="july";
                break;
            case 8: s="august";
                break;
            case 9: s="september";
                break;
            case 10: s="october";
                break;
            case 11: s="november";
                break;
            case 12: s="december";
                break;
        }
        System.out.println(s +" "+ d +" " +y);
    }
    
    public static void man(){
        convert obj= new convert();
        obj.accept();
        obj.daytodate();
        obj.display();
    }
}
