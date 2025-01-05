/*Create a class Employee with the info given below

Data 
Employee Name, Salary, Class of Employee (A,B,C), Tax, Net Salary

Process/ActionAccept Details of the employee – input()
Calculate tax based on class  A class = 30% tax on salary , B class = 20% , C class =0    -  calculate()
Display all details of the employee()- show()
*/
import java.util.*;
class employeee{
    String name;
    char grade;
    int tax,salary,net;
    Scanner ob=new Scanner(System.in);
    public void input(){
        System.out.println("whats good fam");
        System.out.println("whats your name?");
        name=ob.nextLine();
        System.out.println("how good are you at your job? tell me your class?");
        grade=ob.next().charAt(0);
        System.out.println("how much you earn?");
        salary=ob.nextInt();
    }
    public void calculate(){
        if(grade=='a'){
            tax=30;
            net=(salary*tax)/100;
            net=salary-net;
        }
        else if(grade=='b'){
            tax=20;
            net=(salary*tax)/100;
            net=salary-net;
        }
        else{
            net=salary;
        }
    }
    public void show(){
        System.out.println("hi "+name+" you are "+grade+" class and you earn "+net);
    }
    public static void main(){
        employeee j=new employeee();
        j.input();
        j.calculate();
        j.show();
    }
}
        