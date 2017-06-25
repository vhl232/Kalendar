import kalend.Kalendar;

import java.util.Date;

/**
 * Created by vladimir on 06.06.17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date time = new Date();
        System.out.println(time.getYear() + 1900);
        System.out.println(Kalendar.getYear(-9999889578787l));
        System.out.println(Kalendar.isVisok2(1900));
        System.out.println( Kalendar.getDayOfTheWeek(-9999889578787l));
    }

}
