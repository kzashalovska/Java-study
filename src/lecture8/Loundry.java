package lecture8;

import java.lang.ref.Cleaner;

public class Loundry {
    public void clean(Cleanable thing){
        System.out.println("Was cleaned with " + thing.howToClean());
    }
}
