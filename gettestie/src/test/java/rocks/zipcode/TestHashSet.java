package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    // Hash Set implements Set Interface

    @Test
    public void testRemove() {
        HashSet<Person> al = new HashSet<Person>();
        Person person1 = new Person("Mary", 1992);
        Person person2 = new Person("Pete", 1993);
        Person person3 = new Person("Kelly", 1994);

        al.add(person1);
        al.add(person2);
        al.add(person3);

        al.remove(person1);
        boolean actual1 = al.contains(person1);
        boolean actual2 = al.contains(person2);

        assertEquals(false, actual1);
        assertEquals(true, actual2);
    }

    @Test
    public void testSize() {
        HashSet<Person> al = new HashSet<Person>();
        Person person1 = new Person("Mary", 1992);
        Person person2 = new Person("Pete", 1993);
        Person person3 = new Person("Kelly", 1994);

        al.add(person1);
        al.add(person2);
        al.add(person3);

        int actual = al.size();

        assertEquals(3, actual);
    }
}
