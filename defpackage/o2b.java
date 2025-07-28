package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: o2b  reason: default package */
public final class o2b implements pp7 {
    public final qod X;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public o2b(t97 t97, t97 t972, r7e r7e, pae pae, g15 g15) {
        this.a = t97;
        this.b = t972;
        this.c = r7e;
        this.X = xs7.E(n1g.a(((n3a) pae).a().limitedParallelism(1, "presences").plus(new qj(g15))), (hu3) null, (ru3) null, new n2b(this, (Continuation) null), 3);
    }

    public final void a() {
        this.X.cancel((CancellationException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r2 = (defpackage.l2b) (r2 = (mc9) r2.o.get(java.lang.Long.valueOf(r3))).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l2b b(long r3) {
        /*
            r2 = this;
            t97 r0 = r2.b
            java.lang.Object r0 = r0.getValue()
            di3 r0 = (defpackage.di3) r0
            boolean r0 = r0.g(r3)
            l2b r1 = defpackage.l2b.c
            if (r0 == 0) goto L_0x0028
            java.util.concurrent.ConcurrentHashMap r2 = r2.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            mc9 r2 = (mc9) r2
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r2.getValue()
            l2b r2 = (defpackage.l2b) r2
            if (r2 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2b.b(long):l2b");
    }

    public final mc9 c(long j) {
        return (mc9) this.o.computeIfAbsent(Long.valueOf(j), new di(16, new qq9(19)));
    }

    public final yr d() {
        ConcurrentHashMap concurrentHashMap = this.o;
        kgd kgd = new kgd(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            l2b l2b = (l2b) ((mc9) entry.getValue()).getValue();
            if (l2b != null) {
                kgd.put(Long.valueOf(longValue), l2b);
            }
        }
        return kgd;
    }

    public final boolean e(long j) {
        l2b l2b;
        if (!((di3) this.b.getValue()).g(j)) {
            return false;
        }
        mc9 mc9 = (mc9) this.o.get(Long.valueOf(j));
        if (mc9 == null || (l2b = (l2b) mc9.getValue()) == null) {
            l2b = l2b.c;
        }
        int i = l2b.a;
        return i == 40 || i == 10 || i == 20;
    }

    public final void f(long j, l2b l2b) {
        Object value;
        Object value2;
        l2b l2b2 = (l2b) c(j).getValue();
        if (l2b2 == null || l2b2.b <= l2b.b) {
            mc9 c2 = c(j);
            do {
                value = c2.getValue();
                l2b l2b3 = (l2b) value;
            } while (!c2.b(value, l2b));
        } else {
            mc9 c3 = c(j);
            do {
                value2 = c3.getValue();
                l2b l2b4 = (l2b) value2;
            } while (!c3.b(value2, new l2b(l2b.a, l2b2.b)));
        }
        if (((di3) this.b.getValue()).e) {
            tf3 i = ((di3) this.b.getValue()).i(j, false);
            if (i == null) {
                udd.R("ContactController", (IOException) null, "updatePresence failure! contact not found", Arrays.copyOf(new Object[0], 0));
            } else {
                i.a.o = l2b;
            }
        }
    }

    public final void g(zb9 zb9) {
        uq7 uq7 = new uq7(zb9.d);
        long[] jArr = zb9.b;
        long[] jArr2 = zb9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            uq7.f(j2, b(j2));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        ydc ydc = ((hz3) ((a04) this.a.getValue())).d;
        ((bec) ydc.b).m().q(new sbc(uq7, 1, ydc));
    }
}
