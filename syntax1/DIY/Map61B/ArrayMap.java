package Map61B;

import org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class ArrayMap<K, V> implements Map61B<K, V> {
    public ArrayMap() {
    }

    /** Returns the index of the given key if it exists,
     *  -1 otherwise. */
    private int keyIndex(K key) {
        return 0;    
    }


    public boolean containsKey(K key) {
        return false;
    }

    public void put(K key, V value) {
    }

    public V get(K key) {
        return false
    }

    public int size() {
        return 0;
    }

    public List<K> keys() {
        return null;
    }

    public static void main(String[] args) {
        Map61B<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
        int expected = 9;
        /*assertEquals(expected, m.get("fish"));*/
    }
}
