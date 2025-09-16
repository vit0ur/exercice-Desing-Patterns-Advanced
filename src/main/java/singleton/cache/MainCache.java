package singleton.cache;

public class MainCache {
    public static void main(String[] args) throws InterruptedException {
        CacheManager cache = CacheManager.getInstance(2000);
        System.out.println(cache.get("user1"));
        Thread.sleep(1000);
        System.out.println(cache.get("user1"));
        Thread.sleep(2000);
        System.out.println(cache.get("user1"));
    }
}
