import MyInterface.*;
/**
 * 프로그래밍 응용1 기말고사 연습 
 *
 * @author (2019315027 최서연)
 * @version (2020.09.07)
 */
public class Professor extends Employee implements CanSpeak
{
    public Professor(String name, int salary, int officeHours)
    {
        this.name = name;
        this.salary = salary;
        hoursWorked = officeHours;
       
    }

    public double pay(){
        return(salary * hoursWorked + bonus());
    }
    
    public void say(){
        System.out.println("<교수 : " + super.toString()+ ","+ this.pay() + ">");
    }
    
    private double bonus(){
        return(hoursWorked * 200);
    }
}
