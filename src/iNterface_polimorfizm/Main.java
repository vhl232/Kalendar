package iNterface_polimorfizm;

import javax.naming.OperationNotSupportedException;

/**
 * Created by vladimir on 29.06.17.
 */
public class Main {
    public static void main(String[] args) {

        Alive a = AliveFactory.getAlive();

        a.live();

        try {


            if (a instanceof Flying) {   // proverca prinadlegnost class

                ((Flying) a).fly();

            }


        }
        catch (CantFlyException e){

            System.out.println("Sorry, I can't fly");


        }

        catch (OperationNotSupportedException e){
            e.printStackTrace();
        }
    }
}
