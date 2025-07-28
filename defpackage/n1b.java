package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n1b  reason: default package */
public final class n1b {
    public final tt0 a;
    public final t97 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public n1b(tt0 tt0, t97 t97) {
        this.a = tt0;
        this.b = t97;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            o1b o1b = (o1b) value.getValue();
            o1b.g = null;
            o1b.h = null;
            o1b.i = null;
            o1b.j = null;
            o1b.k = null;
            o1b.l = null;
            o1b.m = null;
            o1b.n = null;
            o1b.o = false;
            o1b.p = false;
            o1b.q = false;
        }
        concurrentHashMap.clear();
    }

    public final void b(i22 i22, vo8 vo8) {
        o1b a2 = ((p1b) this.b.getValue()).a((i22) null, vo8);
        this.c.put(Long.valueOf(vo8.b), a2);
        a2.h(i22);
    }

    public final o1b c(vo8 vo8) {
        return (o1b) this.c.computeIfAbsent(Long.valueOf(vo8.b), new di(14, new ka(this, 26, vo8)));
    }

    public final void d() {
        for (Map.Entry value : this.c.entrySet()) {
            o1b o1b = (o1b) value.getValue();
            o1b.g = null;
            o1b.h = null;
            o1b.i = null;
            o1b.j = null;
            o1b.k = null;
            o1b.l = null;
            o1b.m = null;
            o1b.n = null;
            o1b.o = false;
            o1b.p = false;
            o1b.q = false;
            i22 i22 = o1b.f;
            if (i22 != null) {
                o1b.h(i22);
            }
        }
    }

    public final void e(vo8 vo8) {
        String format;
        o1b c2 = c(vo8);
        c2.d();
        if (c2.m == null) {
            w6a w6a = c2.a;
            long j = c2.d.o;
            Locale u = w6a.c.u();
            synchronized (xs7.o) {
                if (xs7.n == null) {
                    xs7.n = new SimpleDateFormat("LLLL yyyy", u);
                }
                format = xs7.n.format(Long.valueOf(j));
            }
            c2.m = format;
        }
    }
}
