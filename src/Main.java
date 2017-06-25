import kalend.Kalendar;

import java.io.FileNotFoundException;
import java.util.Date;

/**
 * Created by vladimir on 06.06.17.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       /* System.out.println(System.currentTimeMillis());
        Date time = new Date();
        System.out.println(time.getYear() + 1900);
        System.out.println(Kalendar.getYear(-9999889578787l));
        System.out.println(Kalendar.isVisok2(1900));
        System.out.println( Kalendar.getDayOfTheWeek(-9999889578787l));*/

       Logger file = new Logger("/home/vladimir/text.txt");

       file.log("dikie sobaki");
       file.end();


    }

}
