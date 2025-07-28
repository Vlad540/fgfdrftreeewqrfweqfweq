package defpackage;

import java.util.Map;

/* renamed from: nr9  reason: default package */
public final class nr9 {
    public static final /* synthetic */ k77[] c;
    public static final String d;
    public final nj4 a;
    public final nj4 b;

    static {
        Class<nr9> cls = nr9.class;
        c = new k77[]{new khb(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), wn6.e(m7c.a, cls, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
        d = cls.getName();
    }

    public nr9(nj4 nj4, nj4 nj42) {
        this.a = nj42;
        this.b = nj4;
    }

    public static void a(Map map, oa5 oa5) {
        map.put("trid", Long.valueOf(oa5.a));
        String str = oa5.h;
        if (str != null) {
            map.put("eKey", str);
        }
        Long l = oa5.g;
        if (l != null) {
            map.put("ttime", l);
            map.put("dtime", Long.valueOf(oa5.j - l.longValue()));
            map.put("fcmdtime", Long.valueOf(oa5.i - l.longValue()));
        }
        Long l2 = oa5.e;
        if (l2 != null) {
            map.put("suid", l2);
        }
    }

    public final bd b() {
        k77 k77 = c[1];
        return (bd) this.b.get();
    }

    public final g15 c() {
        k77 k77 = c[0];
        return (g15) this.a.get();
    }
}
