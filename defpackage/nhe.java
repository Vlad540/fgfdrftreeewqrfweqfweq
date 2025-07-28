package defpackage;

import android.util.LruCache;

/* renamed from: nhe  reason: default package */
public final class nhe {
    public static final LruCache a = new LruCache(5);

    public static void a(ud0 ud0, rhe rhe) {
        if (ud0 != null) {
            udd.q("ThemeBackgroundCache", "Save theme " + ud0 + " to cache.");
            a.put(ud0, rhe);
        }
    }
}
