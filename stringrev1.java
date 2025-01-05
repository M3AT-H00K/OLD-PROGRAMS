import java.util.Scanner;
class stringrev1{
    String str;
    stringrev1(){
        str="";
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kro");
        str=sc.nextLine();
    }
    void arrange(){
        int len=str.length();
        char c;
        String upper="";
        String lower="";
        for(int i=0;i<len;i++){
            c=str.charAt(i);
            if(Character.isUpperCase(c)==true){
                upper+=c;
            }
            else if(Character.isLowerCase(c)==true){
                lower+=c;
            }
            else{
                continue;
            }
        }
        str="";
        str=lower+upper;
    }
    void show(){
        System.out.println(str);
    }
    public static void main(){
        stringrev1 obj=new stringrev1();
        obj.input();
        obj.arrange();
        obj.show();
    }
}