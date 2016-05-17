package ua.study;


import java.util.ArrayList;

public class HashMap {
    private int size;

    private ArrayList[] array = new ArrayList[16];

    {
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList();
        }
    }

    public void put(Object key, Object value) {
        Entry entry = new Entry(key, value);
        ArrayList arrayList = getBucket(key);
        boolean isReplaced = false;
        for (Object listValue : arrayList) {
            Entry tempEntry = (Entry) listValue;
            if (key.equals(tempEntry.key)) {
                tempEntry.value = value;
                isReplaced = true;
            }
        }
        if (!isReplaced) {
            arrayList.add(entry);
            size++;
        }
    }

    public Object get(Object key) {
        ArrayList arrayList = getBucket(key);
        for (Object value : arrayList) {
            Entry entry = (Entry) value;
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private ArrayList getBucket(Object key) {
        int index = Math.abs(key.hashCode()) % 16;
        return array[index];
    }

    public int size() {
        return size;
    }
}

class Entry {
    Object key;
    Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}