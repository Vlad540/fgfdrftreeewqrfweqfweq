package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yf  reason: default package */
public abstract class yf {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final r7e e;
    public static final lc f;
    public static final lc g;

    static {
        r7e r7e = new r7e(new m(4));
        e = r7e;
        lc lcVar = new lc(1);
        f = lcVar;
        lc lcVar2 = new lc(2);
        g = lcVar2;
        ((Handler) r7e.getValue()).post(lcVar);
        ((Handler) r7e.getValue()).post(lcVar2);
    }

    public static void a(dz5 dz5, int i) {
        bfe bfe = dz5.b;
        int j = gwf.j(bfe.g + i, (int) gwf.g(((float) dz5.a) * 0.5f, 1.0f), dz5.a);
        int i2 = bfe.g;
        if (j != i2 && j != i2) {
            bfe.g = gwf.j(j, 1, bfe.f);
            cs0 l = bfe.l();
            if (l != null) {
                l.a(bfe.g);
            }
        }
    }
}
