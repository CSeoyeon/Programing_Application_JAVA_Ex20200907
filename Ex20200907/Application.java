package Ex20200907;

import MyInterface.*;
/**
 * ?”„ë¡œê·¸?˜ë°? ?‘?š©1 ê¸°ë§ê³ ì‚¬ ?—°?Šµ 
 *
 * @author (2019315027 ìµœì„œ?—°)
 * @version (2020.09.07)
 */
public class Application
{
    public static void main(String[] args){
        /*** (1) ***/
        Employee[] list = {
            new Professor("?™ê¸¸ë™", 20, 16),
            new Professor("?´?ˆœ?‹ ", 19, 10),
            new Professor("ê°•ê°ì°?", 31, 16),
            new Staff("ê¹??œ ?‹ ", 50),
            new Staff("?œ ê´??ˆœ", 27)
        };
        
        /*** (2) ***/
        double totalPay = 0.0; 
        
        /*** (3) ***/
        for( Employee em : list){
            ((CanSpeak) em).say();//ê°ì²´?˜ ? •ë³´ë?? ì¶œë ¥
            totalPay += em.pay();//ê¸‰ì—¬?˜ ì´í•©?„ ê³„ì‚°
        }
        
        /*** (4) ***/
        System.out.println("ê¸‰ì—¬ì´í•© = " + totalPay);
    }
}
