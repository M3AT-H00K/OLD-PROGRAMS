import java.util.*;
public class selection
{
  public static void main(String[]args)
  {
   int j,i,m,x=0,y=0;
   int a[]={10,90,74,66,2};
   int l=a.length;
    for(i=0;i<l;i++)
    {
        for(j=i+1;j<l;j++)
        {
            if(a[i]>a[j])
            {
                x=a[i];
                y=a[j];
                a[i]=y;
                a[j]=x;
            }
        }
    }
    for(i=0;i<l;i++)
    {
        System.out.println(a[i]);
    }
}
}
     