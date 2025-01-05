
import java.util.Scanner;
public class proj{
    public static void main(){
        Scanner ob=new Scanner(System.in); main()main() System.out.println("1.)Register, 2.)Shopping, 3.)Im Feelin Lucky, 4.)Exit");
        int choice=ob.nextInt();
        String mob[]={"iphone 15","s20","tab A","note 4","note 4","R.O.G 12","G13","iphone 12+"};
        String lap[]={"macbook","tab 20","tab21+","model2.0","tab 21","R.O.G","G15+","Mac12"};
        String acs[]={"airpods","earphones","earphones(wireless)","R31","S11","gaming headphones","dolby1","airpods+"};
        String comp[]={"Apple","Samsung","Samsung","RedMi","Samsung","Asus","Huawei","Apple"};
        int priceM[]={50000,60000,25000,50000,30000,120000,40000,60000};
        int priceC[]={100000,89999,89000,91000,90000,170000,950000,100000};
        int priceA[]={5000,1000,2500,1000,3000,6000,1000,7000};
        String nm="",addres="",email="";
        int mobno,lol2,i;
        int bill=0,disc=0,choic=0;
        String lol=""; 
        
        
            switch(choice){
                case 1:
                Scanner sc=new Scanner(System.in);
                System.out.println("name");
                nm=sc.nextLine();
                System.out.println("address");
                addres=sc.next();
                System.out.println("email");
                email=sc.next();
                System.out.println("mobno");
                mobno=sc.nextInt();
                break;

                case 2:
                System.out.println("1.) mobiles,2.) laptops,3.) accessories,4.) sort by company,5.) show bugdet");
                Scanner oj=new Scanner(System.in);
                choic=oj.nextInt();
                switch(choic){
                    case 1:
                    
                    for(i=0;i<9;i++){
                        System.out.println(mob[i]);
                    }

                    System.out.println("choose model");
                    lol=oj.nextLine();
                    for(i=0;i<9;i++){
                        if(lol.equals(mob[i])){
                            bill=bill+priceM[i];
                        }
                    }
                    break;
                    case 2:
                    
                    for(i=0;i<9;i++){
                        System.out.println(lap[i]);
                    }

                    System.out.println("choose model");
                    lol=oj.nextLine();
                    for(i=0;i<9;i++){
                        if(lol.equals(lap[i])){
                            bill=bill+priceC[i];
                        }
                    }
                    break;
                    case 3:
                    
                    for(i=0;i<9;i++){
                        System.out.println(acs[i]);
                    }

                    System.out.println("choose model");
                    lol=oj.nextLine();
                    for(i=0;i<9;i++){
                        if(lol.equals(acs[i])){
                            bill=bill+priceA[i];
                        }
                    }
                    break;
                    case 4:
                    
                    for(i=0;i<9;i++){
                        System.out.println(comp[i]);
                    }

                    System.out.println("choose company");
                    lol=oj.nextLine();
                    for(i=0;i<9;i++){
                        if(lol.equals(comp[i])){
                            System.out.println(mob[i]);
                            System.out.println(lap[i]);
                            System.out.println(acs[i]);
                        }
                        continue;
                    }
                    break;
                    case 5:
                    
                    System.out.println("enter budget");
                    lol2=oj.nextInt();
                    for(i=0;i<9;i++){
                        if(lol2>=priceM[i]){
                            System.out.println(mob[i]);
                        }

                    }
                    for(i=0;i<9;i++){
                        if(lol2>=priceC[i]){
                            System.out.println(lap[i]);
                        }

                    }
                    for(i=0;i<9;i++){
                        if(lol2>=priceA[i]){
                            System.out.println(acs[i]);
                        }

                    }
                    break;
                }
                case 3:
                disc=(int)(Math.random()*100);
                if(disc>50){
                    System.out.println("lucky person lucky person man lucky yes yes hamburger your discount is "+ disc +"%");
                }
                else{
                    System.out.println("oh no very sadge life F in chat stupid luck no no pasta bolognese "+disc+"%");
                }
                bill=((disc*bill)/100);
                break;
                case 4:
                System.out.println("more?");
                break;
            }
        }while(choice<4);
        System.out.println("lol good bye "+nm+" your billllllllll is "+bill+" lot of moneyeyey");
    }
}

                
