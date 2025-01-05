import java.util.Scanner;
class nrln{
    public static void main(String[]args){
     Scanner ob=new Scanner(System.in);
     String nm[] = {"jash","not jash","aniket","sameet","mri","link","batma...bruce wayne","amar","akbar","anthony"};
     int perc[] = {97,81,93,73,85,86,97,18,19,20};
     int l=nm.length;
     int i,j,k;
     boolean flag=false;
     String a;
     System.out.println("name");
     a=ob.nextLine();
     for(i=0;i<l;i++){
         if(a.equals(nm[i])){
             System.out.println(perc[i]);
             flag=true;
            }
            else{
                continue;
            }
        }
        if(flag==true){
            System.out.println("not a real person lol");
        }
    }
}