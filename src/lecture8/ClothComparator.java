package lecture8;

import java.util.Comparator;

public class ClothComparator implements Comparator<Clothing> {
    @Override
    public int compare(Clothing o1, Clothing o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
