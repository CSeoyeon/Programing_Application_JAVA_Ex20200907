import MyInterface.*;
/**
 * 프로그래밍 응용1 기말고사 연습 
 *
 * @author (2019315027 최서연)
 * @version (2020.09.07)
 */
public class Staff extends Employee implements CanSpeak
{ 
    public Staff(String name, int salary)
    {
       this.name = name;
       this.salary = salary;
       hoursWorked = 80;
    }

    public double pay()
    {
        return(salary * hoursWorked +80);
    }
    
    public void say()
    {
        System.out.println("<직원:" + name+ "," + this.pay()+">");
    }
}
