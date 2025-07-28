package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bd  reason: default package */
public final class bd {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public bd(t97 t97, t97 t972, t97 t973) {
        this.a = t973;
        this.b = t97;
        this.c = t972;
    }

    public final in7 a() {
        return (in7) this.b.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a07, java.lang.Object] */
    public final void b(String str, Map map) {
        if (!a().c()) {
            ? obj = new Object();
            obj.a = System.currentTimeMillis();
            obj.c = "PUSH";
            obj.o = str;
            obj.c(ju7.W(map));
            j(obj.d());
        }
    }

    public final void c(jo7 jo7, f03 f03, rf4 rf4) {
        ym8 ym8;
        if (!a().c() && ((fb6) ((tf4) rf4).g).a()) {
            long currentTimeMillis = System.currentTimeMillis();
            lqc lqc = (lqc) f03;
            long j = lqc.g.getLong("app.last.firebase_push_time", 0);
            if (j == 0) {
                lqc.k("app.last.firebase_push_time", Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis - j >= 86400000) {
                boolean z = false;
                for (j22 j22 : jo7.o) {
                    if (!(j22.A0 == 0 || (ym8 = j22.x0) == null)) {
                        long j2 = ym8.b;
                        if (j2 > j && j2 < currentTimeMillis - (86400000 / ((long) 2))) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    String str = Build.MANUFACTURER;
                    if (str == null || str.length() == 0) {
                        str = "UNKNOWN";
                    }
                    g("FIREBASE_PUSH_SKIPPED", str);
                }
            }
        }
    }

    public final void d(int i, String str) {
        if (!a().c()) {
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap = new HashMap();
            hashMap.put("value", valueOf);
            if (r1g.p("ACTION") || r1g.p(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (hashMap.size() <= 10) {
                j(new ln7(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a07, java.lang.Object] */
    public final void e(long j, String str, String str2) {
        if (!a().c()) {
            ? obj = new Object();
            obj.c = "ACTION";
            obj.o = str;
            obj.b(Long.valueOf(j), "duration");
            if (str2 != null) {
                obj.b(str2, "value");
            }
            j(obj.d());
        }
    }

    public final void f(String str) {
        if (!a().c()) {
            if (r1g.p("ACTION") || r1g.p(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            }
            j(new ln7(System.currentTimeMillis(), 0, 0, "ACTION", str, (Map) null));
        }
    }

    public final void g(String str, String str2) {
        if (!a().c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("value", str2);
            if (r1g.p("ACTION") || r1g.p(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (hashMap.size() <= 10) {
                j(new ln7(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a07, java.lang.Object] */
    public final void h(String str, HashMap hashMap) {
        if (!a().c()) {
            ? obj = new Object();
            obj.c = "ACTION";
            obj.o = str;
            obj.c(hashMap);
            j(obj.d());
        }
    }

    public final void i(long j, String str) {
        if (!a().c()) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = new HashMap();
            hashMap.put("duration", valueOf);
            if (r1g.p("ACTION") || r1g.p(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (hashMap.size() <= 10) {
                j(new ln7(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [a07, java.lang.Object] */
    public final boolean j(ln7 ln7) {
        if (a().c()) {
            return false;
        }
        long j = ln7.b;
        if (j == 0) {
            ? obj = new Object();
            obj.a = ln7.a;
            obj.b = j;
            obj.c = ln7.c;
            obj.o = ln7.d;
            obj.X = ln7.f;
            obj.c(ln7.e);
            obj.b = ((lqc) ((f03) this.a.getValue())).s();
            ln7 = obj.d();
        }
        in7 a2 = a();
        if (a2.c()) {
            return true;
        }
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "LogController", "store " + ln7, (Throwable) null);
        }
        mw mwVar = a2.Z;
        if (((AtomicBoolean) mwVar.k).get()) {
            hcd hcd = (hcd) mwVar.j;
            if (((Number) hcd.i().getValue()).intValue() != 0) {
                hcd.g(ln7);
                return true;
            }
        }
        ((CopyOnWriteArrayList) mwVar.m).add(ln7);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r2 = a().f(true, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.ln7 r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            in7 r0 = r2.a()
            boolean r0 = r0.c()
            jue r1 = jue.a
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r3 = r2.j(r3)
            if (r3 == 0) goto L_0x0021
            in7 r2 = r2.a()
            r3 = 1
            java.lang.Object r2 = r2.f(r3, r4)
            pu3 r3 = pu3.a
            if (r2 != r3) goto L_0x0021
            return r2
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd.k(ln7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(long j, String str) {
        if (!a().c() && str.length() != 0) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = new HashMap();
            hashMap.put("duration", valueOf);
            if (r1g.p("SCREEN") || r1g.p(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (hashMap.size() <= 10) {
                j(new ln7(System.currentTimeMillis(), 0, 0, "SCREEN", str, hashMap));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }
}
