package defpackage;

import android.util.LruCache;

/* renamed from: x2f  reason: default package */
public final class x2f {
    public static final LruCache a = new LruCache(1000);

    public static v2f a(String str) {
        LruCache lruCache = a;
        w2f w2f = (w2f) lruCache.get(str);
        if (w2f == null) {
            return null;
        }
        if (w2f.b + 3600000 > System.currentTimeMillis()) {
            return w2f.a;
        }
        lruCache.remove(str);
        return null;
    }
}
