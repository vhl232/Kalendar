package iNterface_polimorfizm;

import javax.naming.OperationNotSupportedException;

/**
 * Created by vladimir on 29.06.17.
 */
public class LichincaBug extends Insected  {



    @Override
    public void fly() throws OperationNotSupportedException{

        throw new CantFlyException();
    }


}
