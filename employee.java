import java.util.Scanner;
class employee{
    int empID,salary,hra,salaryttl;
    String name,grade;
     
    public void input(){
        Scanner ob=new Scanner(System.in);
       name=ob.nextLine();
        grade=ob.nextLine();
        empID=ob.nextInt();
        salary=ob.nextInt();
    }
    public void display(){
        System.out.println("employee "+empID+" "+name+" grade= "+grade+" salary= "+salary);
    }
    public void calculate(){
        if(grade.charAt(0)=='a'||grade.charAt(0)=='A'){
            salaryttl=(88*salary)/100;
        }
        else if(grade.charAt(0)=='b'||grade.charAt(0)=='B'){
            salaryttl=(92*salary)/100;
        }
        else{
            salaryttl=(98*salary)/100;
        }
         System.out.println("salary without hra= "+ salaryttl);
    }

     
}