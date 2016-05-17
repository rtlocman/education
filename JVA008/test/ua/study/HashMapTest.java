package ua.study;

import org.junit.*;

import static org.junit.Assert.*;

public class HashMapTest {
   @Test
   public void testPutAndGet() {
       HashMap hashMap = new HashMap();
       hashMap.put("key1", "value1");
       hashMap.put("key2", "value2");

       assertEquals("value1", hashMap.get("key1"));
       assertEquals("value2", hashMap.get("key2"));
       assertTrue(hashMap.size() == 2);
   }

   @Test
   public void testPutWithSameKeyAndGet() {
       HashMap hashMap = new HashMap();

       assertTrue(hashMap.size() == 0);
       hashMap.put("key1", "value1");
       hashMap.put("key1", "value2");
       assertEquals("value2", hashMap.get("key1"));
       assertTrue(hashMap.size() == 1);
   }

}