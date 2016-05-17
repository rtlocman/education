package my.study;

//import junit.framework.TestCase;
import org.junit.Test;

import java.util.Deque;
import java.util.Objects;

import static org.junit.Assert.*;

public class HashMapsTest {
    @Test
    public void fastTest() {
        HashMaps hashMaps = new HashMaps(16);
        hashMaps.put("key1", "value1");
        hashMaps.put("key2", "value2");

        assertEquals("value1", hashMaps.get("key1"));
        assertEquals("value2", hashMaps.get("key2"));
        assertTrue(hashMaps.getCount() == 2);
    }
    @Test
    public void uniqueTest() {
        HashMaps hashMaps = new HashMaps(16);
        hashMaps.put("key1", "value1");
        hashMaps.put("key1", "value2");

        assertEquals("value2", hashMaps.get("key1"));
//        assertEquals("value2", hashMaps.get("key2"));
                assertTrue(hashMaps.getCount() == 1);
    }
    @Test
    public void remuveTest() {
        HashMaps hashMaps = new HashMaps(16);
        hashMaps.put("key1", "value1");
        hashMaps.put("key3", "value2");
        hashMaps.put("key4", "value5");

        assertTrue(hashMaps.getCount() == 3);
        assertTrue(hashMaps.containsKey("key1"));
        hashMaps.remove("key1");
        assertTrue(hashMaps.getCount() == 2);
        System.out.println(hashMaps.toString());
    }


    @Test
    public void iteratorTest() {
        HashMaps hashMaps = new HashMaps(16);
        assertTrue(hashMaps.getCount() == 0);
        for(int i=0;i<10;++i){
            hashMaps.put("key"+i, "value"+Math.random());
        }
        for (Object e : hashMaps) {
            System.out.println(e.getClass().getCanonicalName());

        }
//        hashMaps.put("key1", "value1");
//        hashMaps.put("key3", "value2");
//        hashMaps.put("key4", "value5");

//        assertTrue(hashMaps.getCount() == 3);
//        assertTrue(hashMaps.containsKey("key1"));
//        hashMaps.remove("key1");
//        assertTrue(hashMaps.getCount() == 2);
        System.out.println(hashMaps.toString());
    }

}