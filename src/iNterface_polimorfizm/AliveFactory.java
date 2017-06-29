package iNterface_polimorfizm;

/**
 * Created by vladimir on 29.06.17.
 */
public class AliveFactory {

    public static Alive getAlive(){

        int a = (int) (Math.random()*7);

        switch (a){

            case 0: return new Cat();

            case 1: return new Dog();

            case 2: return new Hippo();

            case 3: return new Bird();

            case 4: return new Insected();

            case 5: return new LichincaBug();

            default: return new Human();

        }


    }
}
