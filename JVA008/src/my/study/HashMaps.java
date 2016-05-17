package my.study;

import java.util.*;
import java.util.function.Consumer;


public class HashMaps implements Iterable,Iterator<Entry>{//
    ArrayList[] allBackets;
    int count;

    public HashMaps(int size) {
        this.allBackets = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            this.allBackets[i] = new ArrayList();
        }
    }

    private ArrayList getBacket(Object key) {
        int index = Math.abs(key.hashCode()) % allBackets.length;
        return allBackets[index];
    }

    private Entry getEntry(Object key) {
        ArrayList backet = getBacket(key);
        for (Object o : backet) {
            Entry e = (Entry) o;
            if (e.key.equals(key)) {
                return e;
            }
        }
        return null;
    }

    private void addEntry(Object key, Object value) {
        Entry entry = new Entry(key, value);
        ArrayList arrayList = getBacket(key);
        arrayList.add(entry);
        count++;
    }

    public void put(Object key, Object value) {
        Entry e = getEntry(key);
        if (e != null) {
            e.value = value;
        } else {
            addEntry(key, value);
        }
    }

    public void putIfAbsent(Object key, Object value) {
        Entry e = getEntry(key);
        if (e == null) {
            addEntry(key, value);
        }
    }

    public Object get(Object key) {
        return getEntry(key).value;
    }

    public boolean containsKey(Object key) {
        return getEntry(key) != null;
    }

    public int getCount() {
        return count;
    }
    public void remove(Object key){
        ArrayList arrayList = getBacket(key);
        for(int i=0;i<arrayList.size();++i){
            Entry e = (Entry) arrayList.get(i);
            if(e.key.equals(key)){
                arrayList.remove(i);
                count--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "HashMaps{" +
                "allBackets=" + Arrays.toString(allBackets) +
                ", count=" + count +
                '}';
    }


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    int curBacketIdx;
    int curElementIdx;
    @Override
    public Iterator<Entry> iterator() {
        curBacketIdx = 0;
        curElementIdx = 0;
        return this;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
//        allBackets[curBacket].
        return hasNextElement() && (nextBacket()>=0);
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws java.util.NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Entry next() {
        int backet = nextBacket();
        if(backet<0){
            return null;
        }else {
            if (hasNextElement()) {
                curElementIdx++;
            } else {
                curElementIdx = 0;
            }
            curBacketIdx = backet;
//            Objects e = allBackets[backet]{curElementIdx];
//            return (Entry) e;
        }

        return null;
    }
    protected boolean hasNextElement(){
        return (curElementIdx + 1) < allBackets[curBacketIdx].size();
    }
    protected int nextBacket(){
        int nextBacket = (hasNextElement()? 0 : 1);
        return (nextBacket<allBackets.length)?nextBacket:-1;
    }
}
