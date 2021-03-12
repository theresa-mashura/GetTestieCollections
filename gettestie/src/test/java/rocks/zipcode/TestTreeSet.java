package rocks.zipcode;

import org.junit.Test;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TestTreeSet {

    @Test
    public void testCeiling() {
        TreeSet<Integer> al = new TreeSet<Integer>();
        al.add(22);
        al.add(105);
        al.add(104);
        al.add(9);

        int actual = al.ceiling(100);

        assertEquals(104, actual);

    }

    @Test
    public void testFloor() {
        TreeSet<Integer> al = new TreeSet<Integer>();
        al.add(22);
        al.add(105);
        al.add(104);
        al.add(9);

        int actual = al.floor(10);

        assertEquals(9, actual);
    }

    @Test
    public void testFirst() {
        TreeSet<Integer> al = new TreeSet<Integer>();
        al.add(22);
        al.add(105);
        al.add(104);
        al.add(9);

        int actual = al.first();

        assertEquals(9, actual);

    }

}
