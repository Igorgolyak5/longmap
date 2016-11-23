/**
 * Created by Igor on 22.11.16.
 */
public interface Map<V>  {

        V put(long key, V value);
        V get(long key);
        V remove(long key);

        boolean isEmpty();
        boolean containsKey(long key);
        boolean containsValue(V value);

        long[] keys();
        V[] values(Class<V> clazz);

        long size();
        void clear();
}
