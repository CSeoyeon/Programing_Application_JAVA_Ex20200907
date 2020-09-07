import MyInterface.*;
/**
 * 프로그래밍 응용1 기말고사 연습 
 *
 * @author (2019315027 최서연)
 * @version (2020.09.07)
 */
public class Application
{
    public static void main(String[] args){
        /*** (1) ***/
        Employee[] list = {
            new Professor("홍길동", 20, 16),
            new Professor("이순신", 19, 10),
            new Professor("강감찬", 31, 16),
            new Staff("김유신", 50),
            new Staff("유관순", 27)
        };
        
        /*** (2) ***/
        double totalPay = 0.0; 
        
        /*** (3) ***/
        for( Employee em : list){
            ((CanSpeak) em).say();//객체의 정보를 출력
            totalPay += em.pay();//급여의 총합을 계산
        }
        
        /*** (4) ***/
        System.out.println("급여총합 = " + totalPay);
    }
}
