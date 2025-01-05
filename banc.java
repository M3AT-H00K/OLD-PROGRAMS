import java.util.Scanner;
class banc{
    int accid,balance,amt,choice;
    String name,address,type;
    public void input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("name and type");
        name=ob.nextLine();
        type=ob.nextLine();
        System.out.println("address");
        address=ob.nextLine();
        System.out.println("id");
        accid=ob.nextInt();
        System.out.println("balans");
        balance=ob.nextInt();
    }

    public void display(){
        System.out.println("id: "+accid+" , "+name+" account type "+type+" balance= "+balance);
    }

    public void transaction(){
        Scanner ob=new Scanner(System.in);
        System.out.println("amount");
        amt=ob.nextInt();
        System.out.println("1.withdrawl or 2.deposit?");
        choice=ob.nextInt();
        balance=choice<2?amt+balance:(amt>balance?amt-balance:balance-amt);
        System.out.println(balance);
    }
}