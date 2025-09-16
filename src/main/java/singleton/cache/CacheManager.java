package singleton.cache;

import java.util.*;
import java.util.concurrent.*;

class CacheItem {
    String value;
    long timestamp;
    CacheItem(String v, long t) { value = v; timestamp = t; }
}

public class CacheManager {
    private static CacheManager instance;
    private final Map<String, CacheItem> cache = new ConcurrentHashMap<>();
    private long expirationMillis;

    private CacheManager(long expirationMillis) {
        this.expirationMillis = expirationMillis;
    }

    public static synchronized CacheManager getInstance(long expirationMillis) {
        if (instance == null) {
            instance = new CacheManager(expirationMillis);
        }
        return instance;
    }

    public void put(String key, String value) {
        cache.put(key, new CacheItem(value, System.currentTimeMillis()));
    }

    public String get(String key) {
        CacheItem item = cache.get(key);
        if (item == null) return fetchFromDB(key);

        if (System.currentTimeMillis() - item.timestamp > expirationMillis) {
            System.out.println("❌ Expirado no cache. Buscando na base...");
            cache.remove(key);
            return fetchFromDB(key);
        }
        System.out.println("✅ Retornando do cache");
        return item.value;
    }

    private String fetchFromDB(String key) {
        String value = "Dado[" + key + "]";
        System.out.println("📦 Buscou na base: " + value);
        put(key, value);
        return value;
    }
}
