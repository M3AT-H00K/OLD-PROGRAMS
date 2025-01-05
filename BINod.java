import java.util.*;
public class BINod
{
  public static void main(String[]args)
  {
   Scanner ob=new Scanner(System.in);
   int a[]={10,12,14,16,20};
   int right =a.length-1;
   int left =0;
   int mid,f;
   boolean high=false;
   System.out.println("entr nombre");
   f=ob.nextInt();
   while(left<=right){
       mid=(right+left)/2;
       if(f==a[mid]){
           high=true;
           break;
        }
        else if(f<a[mid]){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
    }
    if(high==false){
        System.out.println("no");
    }
    else if(high=true){
        System.out.println("yes");
    }
}
}