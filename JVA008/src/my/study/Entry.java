package my.study;

/**
 * Created with IntelliJ IDEA.
 * User: SChmutov
 * Date: 11.05.16
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
public class Entry {
    Object key;
    Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "<"+  key +
                ", " + value +
                '>';
    }
}
