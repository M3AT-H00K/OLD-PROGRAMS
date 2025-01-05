import java.util.Scanner;
class megaArray{
    public static void main(String[]args){
      Scanner ob=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      String city[] = {"dehli","mumbai","kolkata","chennai","goa"};
      int temp[] = {38,32,36,34,33};
      double sum=0,avg;
      int l=city.length;
      int i,opt,j,a=0,b=0;
      String o,x,y;
      System.out.println("welcome to weather");
     
        for(i=0;i<l;i++){
         System.out.println("city= " + city[i] + " temp= " + temp[i]);
         sum=sum+temp[i];
        }
      System.out.println("please enter 1 if you want the average temperature...2 if you want to search a city from the menu...");
      System.out.println("please enter 3 for sorting by name... and 4 for sorting by temperature");  
      opt=ob.nextInt();
      
        switch (opt)
        {
          case 1:
          avg=sum/l;
          System.out.println("average temperature is= " + avg);
          break;
          case 2:
          System.out.println("enter city name");
          o=sc.nextLine();
          for(j=0;j<l;j++){
              if(o.equals(city[j])){
                  System.out.println(city[j] + temp[j]);
                }
            }
          break;
          case 3:
           for(i=0;i<l;i++)
          {
            for(j=i+1;j<l;j++)
             {
             if(city[i].compareTo(city[j])>0)
              {
                x=city[i];
                y=city[j];
                city[i]=y;
                city[j]=x;
              }
             }
          }
          for(i=0;i<l;i++){
              System.out.println(city[i] + temp[i]);
            }
          break;
          case 4:
          for(i=0;i<l;i++)
              {
                for(j=i+1;j<l;j++)
                 {
                    if(temp[i]>temp[j])
                   {
                     a=temp[i];
                     b=temp[j];
                     temp[i]=b;
                     temp[j]=a;
                   }
                }
             }
             for(i=0;i<l;i++){
                 System.out.println(temp[i] + city[i]);
                }
                break;
          default:
          System.out.println("errororor404");
        }
    }
}
             
           
          
          
        
                  
                  
                  
                  
                  
                  
                  
                  
                  