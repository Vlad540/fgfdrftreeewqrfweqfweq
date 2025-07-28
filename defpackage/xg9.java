package defpackage;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xg9  reason: default package */
public final class xg9 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final ContextScope e;
    public final String f = xg9.class.getName();
    public final tc9 g = uc9.a();
    public final AtomicInteger h = new AtomicInteger(1);
    public volatile long i;
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference(gsd.a);

    public xg9(pae pae, aq aqVar, hsd hsd, t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t972;
        this.b = t973;
        this.c = t97;
        this.d = t974;
        ContextScope a2 = n1g.a(((n3a) pae).b());
        this.e = a2;
        ((kdf) aqVar).i.add(new en7(1, this));
        ez3.N(new ck5(hsd.b, new tg9(2, this, xg9.class, "onNewCondition", "onNewCondition(Lone/me/sdk/statistics/conditions/StatsExternalConditions$ConditionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 5), a2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.xg9 r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.wg9
            if (r0 == 0) goto L_0x0016
            r0 = r8
            wg9 r0 = (defpackage.wg9) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            wg9 r0 = new wg9
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            tc9 r7 = r0.X
            xg9 r0 = r0.o
            wx3.H(r8)
            r8 = r7
            r7 = r0
            goto L_0x005e
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            wx3.H(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.k
            r8.set(r4)
            java.util.concurrent.atomic.AtomicReference r8 = r7.j
            r8.set(r4)
            java.util.concurrent.atomic.AtomicInteger r8 = r7.h
            r8.set(r3)
            r5 = 0
            r7.i = r5
            tc9 r8 = r7.g
            r0.o = r7
            r0.X = r8
            r0.w0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L_0x005e
            goto L_0x0087
        L_0x005e:
            t97 r0 = r7.a     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0088 }
            f03 r0 = (defpackage.f03) r0     // Catch:{ all -> 0x0088 }
            i03 r0 = (defpackage.i03) r0     // Catch:{ all -> 0x0088 }
            long r0 = r0.D()     // Catch:{ all -> 0x0088 }
            r2 = 1
            long r0 = r0 + r2
            t97 r7 = r7.a     // Catch:{ all -> 0x0088 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0088 }
            f03 r7 = (defpackage.f03) r7     // Catch:{ all -> 0x0088 }
            i03 r7 = (defpackage.i03) r7     // Catch:{ all -> 0x0088 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "app.stats.session.id"
            r7.k(r1, r0)     // Catch:{ all -> 0x0088 }
            r8.e(r4)
            jue r1 = jue.a
        L_0x0087:
            return r1
        L_0x0088:
            r7 = move-exception
            r8.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg9.a(xg9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void g(xg9 xg9, mnc mnc) {
        xg9.f(mnc, eja.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r6 = r7.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ht7 b(int r6, defpackage.ln7 r7, defpackage.eja r8) {
        /*
            r5 = this;
            ht7 r0 = new ht7
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = r5.h
            int r1 = r1.getAndIncrement()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "action_id"
            r0.put(r2, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "screen_to"
            r0.put(r1, r6)
            if (r7 == 0) goto L_0x0028
            java.util.Map r6 = r7.e
            if (r6 == 0) goto L_0x0028
            java.lang.Object r6 = r6.get(r1)
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 == 0) goto L_0x003b
            long r1 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "prev_time"
            r0.put(r1, r7)
            java.lang.String r7 = "screen_from"
            r0.put(r7, r6)
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference r5 = r5.l
            java.lang.Object r5 = r5.get()
            gsd r5 = (defpackage.gsd) r5
            eja r6 = defpackage.eja.e
            boolean r6 = hhd.f(r8, r6)
            r7 = 2
            r1 = 1
            gsd r2 = defpackage.gsd.c
            gsd r3 = defpackage.gsd.b
            java.lang.String r4 = "pip"
            if (r6 == 0) goto L_0x006a
            r5.getClass()
            if (r5 == r3) goto L_0x005a
            if (r5 != r2) goto L_0x00b7
        L_0x005a:
            if (r5 != r3) goto L_0x0060
            g02 r5 = defpackage.vwa.b
            r7 = r1
            goto L_0x0062
        L_0x0060:
            g02 r5 = defpackage.vwa.b
        L_0x0062:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0.put(r4, r5)
            goto L_0x00b7
        L_0x006a:
            vwa r6 = r8.a
            if (r6 == 0) goto L_0x0078
            int r5 = r6.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
            goto L_0x008e
        L_0x0078:
            r5.getClass()
            if (r5 == r3) goto L_0x007f
            if (r5 != r2) goto L_0x008e
        L_0x007f:
            if (r5 != r3) goto L_0x0085
            g02 r5 = defpackage.vwa.b
            r7 = r1
            goto L_0x0087
        L_0x0085:
            g02 r5 = defpackage.vwa.b
        L_0x0087:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0.put(r4, r5)
        L_0x008e:
            int r5 = r8.b
            if (r5 == 0) goto L_0x009f
            int r5 = defpackage.us8.c(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "reason"
            r0.put(r6, r5)
        L_0x009f:
            java.lang.Long r5 = r8.d
            if (r5 == 0) goto L_0x00b7
            uld r6 = r8.c
            if (r6 == 0) goto L_0x00b7
            java.lang.String r7 = "source_id"
            r0.put(r7, r5)
            int r5 = r6.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "source_type"
            r0.put(r6, r5)
        L_0x00b7:
            ht7 r5 = r0.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg9.b(int, ln7, eja):ht7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a07, java.lang.Object] */
    public final ln7 c(int i2, ht7 ht7) {
        String str;
        ? obj = new Object();
        obj.c = "NAV";
        t97 t97 = this.a;
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        if (i2 == 1) {
            str = "COLD_START";
        } else if (i2 == 2) {
            str = "WARM_START";
        } else if (i2 == 3) {
            str = "GO";
        } else {
            throw null;
        }
        obj.o = str;
        obj.X = ((i03) ((f03) t97.getValue())).D();
        obj.a = System.currentTimeMillis();
        obj.c(ht7);
        return obj.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer d() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.k
            java.lang.Object r2 = r2.get()
            ln7 r2 = (defpackage.ln7) r2
            r0 = 0
            if (r2 == 0) goto L_0x0016
            java.util.Map r2 = r2.e
            if (r2 == 0) goto L_0x0016
            java.lang.String r1 = "screen_to"
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x001e
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg9.d():java.lang.Integer");
    }

    public final boolean e() {
        vqc vqc = (vqc) ((xzc) this.b.getValue());
        vqc.getClass();
        return SystemClock.elapsedRealtime() - this.i < vqc.o(PmsKey.f108statsessionbackgroundthreshold, 60000);
    }

    public final void f(mnc mnc, eja eja) {
        Map map;
        ln7 ln7 = (ln7) this.k.get();
        int i2 = 3;
        int i3 = ln7 == null ? 1 : 3;
        Object obj = (ln7 == null || (map = ln7.e) == null) ? null : map.get("screen_to");
        if (hhd.f(obj, 1) && !e()) {
            gsd gsd = (gsd) this.l.get();
            gsd.getClass();
            if (!(gsd == gsd.b || gsd == gsd.c)) {
                return;
            }
        }
        xs7.E(this.e, (hu3) null, (ru3) null, new vg9(i3, this, mnc, eja, ln7, (Continuation) null), 3);
        if (obj != null) {
            boolean equals = Integer.valueOf(mnc.a).equals(1);
            boolean equals2 = obj.equals(150);
            t97 t97 = this.d;
            if (equals2) {
                uma uma = (uma) t97.getValue();
                if (equals) {
                    i2 = 2;
                }
                uma.e(2, i2);
            } else if (obj.equals(350)) {
                uma uma2 = (uma) t97.getValue();
                if (equals) {
                    i2 = 2;
                }
                uma2.d(2, i2);
            }
        }
    }

    public final Object h(int i2, ln7 ln7, int i3, eja eja, boolean z, Continuation continuation) {
        boolean z2 = false;
        if (ln7 != null) {
            Map map = ln7.e;
            Object obj = map.get("screen_to");
            if ((obj instanceof Integer) && i2 == ((Number) obj).intValue()) {
                Object obj2 = map.get("pip");
                vwa vwa = eja.a;
                Integer num = null;
                if (hhd.f(vwa != null ? Integer.valueOf(vwa.a) : null, obj2)) {
                    Object obj3 = map.get("reason");
                    int i4 = eja.b;
                    if (hhd.f(i4 != 0 ? Integer.valueOf(us8.c(i4)) : null, obj3)) {
                        Object obj4 = map.get("source_type");
                        uld uld = eja.c;
                        if (uld != null) {
                            num = Integer.valueOf(uld.a);
                        }
                        if (hhd.f(num, obj4)) {
                            z2 = hhd.f(eja.d, map.get("source_id"));
                        }
                    }
                }
            }
        }
        jue jue = jue.a;
        if (z2) {
            return jue;
        }
        ln7 c2 = c(i3, b(i2, ln7, eja));
        this.k.updateAndGet(new zx0(8, c2));
        if (i2 != 1) {
            this.j.updateAndGet(new zx0(9, eja));
        }
        t97 t97 = this.c;
        if (z) {
            Object k2 = ((bd) t97.getValue()).k(c2, continuation);
            return k2 == pu3.a ? k2 : jue;
        }
        ((bd) t97.getValue()).j(c2);
        return jue;
    }
}
