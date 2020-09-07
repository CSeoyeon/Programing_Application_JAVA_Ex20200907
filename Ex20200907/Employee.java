
/**
 * 프로그래밍 응용1 기말고사 연습 
 *
 * @author (2019315027 최서연)
 * @version (2020.09.07)
 */
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
