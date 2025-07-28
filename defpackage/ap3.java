package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ap3  reason: default package */
public final class ap3 {
    public final di3 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public ap3(di3 di3, r7e r7e, t97 t97, t97 t972) {
        this.a = di3;
        this.b = r7e;
        this.c = t97;
        this.d = t972;
        di3.q = this;
    }

    public final tf3 a(long j) {
        return tf3.b(j, ((j2b) ((g2b) this.d.getValue())).a.e("server.timeDelta", 0), (w6a) this.c.getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable b(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.zo3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            zo3 r0 = (defpackage.zo3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            zo3 r0 = new zo3
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r7)     // Catch:{ all -> 0x0062 }
            goto L_0x005f
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r7)
            di3 r4 = r4.a
            java.util.concurrent.ConcurrentHashMap r7 = r4.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r7.get(r2)
            tf3 r7 = (defpackage.tf3) r7
            if (r7 == 0) goto L_0x0043
            return r7
        L_0x0043:
            qh0 r7 = new qh0     // Catch:{ all -> 0x0062 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0062 }
            mv9 r4 = new mv9     // Catch:{ all -> 0x0062 }
            r5 = 1
            r4.<init>(r5, r7)     // Catch:{ all -> 0x0062 }
            qmc r5 = cnc.b()     // Catch:{ all -> 0x0062 }
            yhd r4 = r4.m(r5)     // Catch:{ all -> 0x0062 }
            r0.Y = r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r7 = e07.d(r4, r0)     // Catch:{ all -> 0x0062 }
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            tf3 r7 = (defpackage.tf3) r7     // Catch:{ all -> 0x0062 }
            return r7
        L_0x0062:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap3.b(long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final t0c c(long j) {
        return new t0c((mc9) this.e.computeIfAbsent(Long.valueOf(j), new di(8, new yo3(this, j, 0))));
    }

    public final Object d(Continuation continuation) {
        return udd.M(new nl1(24, this), continuation);
    }

    public final Integer e() {
        di3 di3 = this.a;
        di3.getClass();
        EnumSet enumSet = di3.r;
        Set set = di3.s;
        int i = 0;
        tf3 i2 = di3.i(((j2b) di3.h).a.s(), false);
        Collection<tf3> values = di3.a.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            int i3 = 0;
            for (tf3 tf3 : values) {
                try {
                    if (tf3 != i2 && set.contains(tf3.a.c.k)) {
                        i3++;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            i = i3;
        }
        return new Integer(i);
    }
}
