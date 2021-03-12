package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    // Comparable
    @Test
    public void testComparableSort() {
        List<Person> al = new ArrayList<>();
        al.add(new Person("Theresa", 1998));
        al.add(new Person("Daniel", 1995));

        Collections.sort(al);
        boolean actual = al.get(0).getYearOfBirth() < al.get(1).getYearOfBirth();

        Assert.assertTrue(actual);

    }
}
