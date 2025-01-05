import java.util.Scanner;
class amazon{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        Scanner lo=new Scanner(System.in);
        String brand[] = {"camlin","doms","hauser","staedler","apsara","camlin","hauser"};
        String prod[] = {"pencil","colours","gel pen","pencil","eraser","eraser","ball pen"};
        int mrp[] = {10,50,30,15,8,12,20};
        int cart[] = new int[7];
        int i,j,opt,p,pos1=-1,x=0,y=0,ctr=0;
        String a,u,v,r,s,z;
        int l=brand.length;
        System.out.println("our products");
        for(i=0;i<=l-1;i++){
            System.out.println( brand[i] + " " + prod[i] + " price= " + mrp[i]);
        }
        

        System.out.println("please type 1 to search a product...type 2 to show items by brand...3 to show items under a certain price...4 to show items over a price");
        System.out.println("...5 to arrange by price...6 to arrange by name...7 to add to cart...8 to show bill...9 to exit");
        opt=ob.nextInt();
        
            switch(opt)
            {
                case 1:
                System.out.println("please type the kind of product you need");
                a=sc.nextLine();
                for(j=0;j<=l-1;j++){
                    pos1++;
                    if(a.equals(prod[j])){
                        System.out.println(brand[pos1] + " " + prod[pos1] + " price= " + mrp[pos1]);
                    }
                }
                break;
                case 2:
                System.out.println("please type the brand you need");
                a=sc.nextLine();
                for(j=0;j<=l-1;j++){
                    pos1++;
                    if(a.equals(brand[j])){
                        System.out.println(brand[pos1] + " " + prod[pos1] + " price= " + mrp[pos1]);
                    }
                }
                break;
                case 3:
                System.out.println("enter your budget");
                p=sc.nextInt();
                for(j=0;j<=l-1;j++){
                    pos1++;
                    if(p>mrp[j]){
                        System.out.println(brand[pos1] + " " + prod[pos1] + " price= " + mrp[pos1]); 
                    }
                }
                break;
                case 4:
                System.out.println("enter your minimum price");
                p=sc.nextInt();
                for(j=0;j<=l-1;j++){
                    pos1++;
                    if(p<mrp[j]){
                        System.out.println(brand[pos1] + " " + prod[pos1] + " price= " + mrp[pos1]); 
                    }
                }
                break;
                case 5:
                for(i=0;i<l;i++)
                {
                    for(j=i+1;j<l;j++)
                    {
                        if(mrp[i]>mrp[j])
                        {
                            x=mrp[i];
                            y=mrp[j];
                            mrp[i]=y;
                            mrp[j]=x;

                            u=brand[i];
                            v=brand[j];
                            brand[i]=v;
                            brand[j]=u;

                            r=prod[i];
                            s=prod[j];
                            prod[i]=s;
                            prod[j]=r;
                        }
                    }
                }
                for(i=0;i<l;i++)
                {
                    System.out.println(brand[i] + " " + prod[i] + " " + mrp[i]);
                }
                break;
                case 6:
                for(i=0;i<l;i++)
                {
                    for(j=i+1;j<l;j++)
                    {
                        if(brand[i].compareTo(brand[j])>0)
                        {
                            u=brand[i];
                            v=brand[j];
                            brand[i]=v;
                            brand[j]=u;

                            x=mrp[i];
                            y=mrp[j];
                            mrp[i]=y;
                            mrp[j]=x;

                            r=prod[i];
                            s=prod[j];
                            prod[i]=s;
                            prod[j]=r;
                        }
                    }
                }
                for(i=0;i<l;i++)
                {
                    System.out.println(brand[i] + " " + prod[i] + " " + mrp[i]);
                }
                break;
                
            }
        
            
        
    }

}

