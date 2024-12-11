package theory.comporator;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {

    @Override
    public int compare(Square o1, Square o2) {

        return Double.compare(o1.getWight(), o2.getWight());

    }
}
