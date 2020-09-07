package Ex20200907;


public abstract class Employee
{
    public int hoursWorked;
    public String name;
    protected int salary;
    
    public abstract double pay();
    
    public String toString(){
        return name; 
    }
}
