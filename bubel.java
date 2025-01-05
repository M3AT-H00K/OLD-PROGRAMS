import java.util.*;
public class bubel
{
  public static void main(String[]args)
  {
   int j,i,m,x=0;
   int a[]={10,90,74,66,22};
   int l=a.length;
    for(i=l-1;i>=0;i--)
    {
        for(j=0;j<i;j++)
        {
            if(a[j]>a[j+1])
            {
                x=a[j];
                a[j]=a[j+1];
                a[j+1]=x;
            }
        }
    }
    for(i=0;i<l;i++)
    {
        System.out.println(a[i]);
    }
}
}
     