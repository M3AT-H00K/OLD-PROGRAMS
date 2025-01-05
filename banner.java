import java.util.*;
public class banner{
    public static void main(){
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        String s1=ob.nextLine();
        
        if(n<=2||n>=9){
            System.out.println("inwaleed");
            return;
        }
        String teams[]=new String[n];
        int len=0;
        
        for(int i=0;i<n;i++){
            teams[i]=ob.nextLine();
            if(teams[i].length()>len){
                len=teams[i].length();
                
            }
        
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<n;j++){
            try{
                System.out.print((teams[j].charAt(i))+"\t");
                }
                catch(Exception e){
                    System.out.print("\t");
                }
            
            }
        
            System.out.println();
        }
    }
    
}