package MentorTasks.lesson27;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {

    private final Map<K, V> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    public void add(K key, V value) {

        cache.put(key, value);
    }

    public V get(K key) {

        return cache.get(key);
    }

    public void remove(K key) {

        cache.remove(key);
    }

    public boolean contains(K key) {

        return cache.containsKey(key);
    }

    public void displayCache() {

        System.out.println("Cache Contents: " + cache);
    }

    public static void main(String[] args) {

        // Cache for String keys and Integer values
        Cache<String, Integer> intCache = new Cache<>();
        intCache.add("one", 1);
        intCache.add("two", 2);
        System.out.println("Value for key 'one': " + intCache.get("one"));
        intCache.remove("two");
        System.out.println("Contains key 'two': " + intCache.contains("two"));
        intCache.displayCache();

        // Cache for Integer keys and String values
        Cache<Integer, String> stringCache = new Cache<>();
        stringCache.add(1, "Java");
        stringCache.add(2, "Cache");
        System.out.println("Value for key 1: " + stringCache.get(1));
        stringCache.remove(2);
        System.out.println("Contains key 2: " + stringCache.contains(2));
        stringCache.displayCache();
    }
}