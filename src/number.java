import java.lang.reflect.Array;
import java.util.*;

public class number {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int ball = 0;
        int strike = 0;

        Random random = new Random();

        ArrayList computer = new ArrayList();
        ArrayList me = new ArrayList();

        while (computer.size() < 4) {
            int number = (random.nextInt(9));
            if (!computer.contains(number)) {
                computer.add(number);
            }
        }
        //System.out.println(computer); 상대 컴퓨터 숫자

        int i = 1 ;

        while (i < 100){
            for(int g = 0 ; g <= 3 ; g++) {
                int menumber = in.nextInt();
                me.add(menumber);
            }
            System.out.print(me);
            //System.out.print(computer); 상대 컴퓨터 숫자
            System.out.println();
            for(int j = 0 ; j <= 3 ; j++) {
                for(int p = 0 ; p <= 3 ; p++) {
                    if(computer.get(j) == me.get(p)) {
                        if(j == p) {
                            strike ++;
                        } else  {
                            ball ++ ;
                        }
                    }
                }
            }
            System.out.println(strike + "스트라이크!" + ball + "볼");
            if(strike == 4 && ball == 0) {
                break;
            }
            i++ ;
            me.clear();
            ball = 0 ;
            strike = 0 ;
        }
    }
}



