package iNterface_polimorfizm;

/**
 * Created by vladimir on 29.06.17.
 */
public class Bird extends Alve implements Flying {

    @Override
    public void live() {

        System.out.println("kar-kar");
    }

    @Override
    public void fly() {

        System.out.println("ghuh- ghuh v nebe ptichka");
    }
}
