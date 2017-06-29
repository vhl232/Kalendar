package iNterface_polimorfizm;

import javax.naming.OperationNotSupportedException;

/**
 * Created by vladimir on 29.06.17.
 */
public class Insected  implements Alive ,Flying {


    @Override
    public void live() {

        System.out.println("zgaluy");

    }

    @Override
    public void fly() throws OperationNotSupportedException {

        System.out.println("pischit");

    }
}



