package Ex20200907;

import MyInterface.*;

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
