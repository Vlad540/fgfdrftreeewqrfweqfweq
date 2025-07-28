package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m0c  reason: default package */
public final class m0c {
    public static final /* synthetic */ int j = 0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final r7e g;
    public final t97 h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public m0c(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978) {
        this.a = t973;
        this.b = t977;
        this.c = t978;
        this.d = t972;
        this.e = t976;
        this.f = t97;
        this.g = new r7e(new xq(26, t974));
        this.h = t975;
    }

    public static /* synthetic */ long e(m0c m0c, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i2) {
        return m0c.d(j2, j3, j4, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, false);
    }

    public final t52 a() {
        return (t52) this.a.getValue();
    }

    public final void b(i22 i22) {
        xm8 xm8 = i22.c;
        if (xm8 != null) {
            long j2 = i22.b.a;
            vo8 vo8 = xm8.a;
            e(this, j2, vo8.o, vo8.c, false, false, false, 88);
            ((p7a) this.b.getValue()).a(j2);
        }
    }

    public final void c(i22 i22) {
        vo8 vo8;
        xm8 xm8 = i22.c;
        if (xm8 != null && (vo8 = xm8.a) != null) {
            long j2 = vo8.o;
            if (j2 > 0) {
                e(this, i22.b.a, j2, vo8.c, true, false, false, 112);
            }
        }
    }

    public final long d(long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        long j5;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        boolean z5 = z;
        long j9 = z5 ? j7 - 1 : j7;
        StringBuilder k = hr1.k(j6, "sendReadMark: chatServerId = ", ", mark = ");
        k.append(j7);
        k.append(", messageServerId = ");
        k.append(j8);
        udd.q("m0c", k.toString());
        i22 y = a().y(j6);
        if (y == null) {
            kq9 kq9 = (kq9) this.c.getValue();
            if (kq9 != null) {
                kq9.f(j6, j9);
            }
        } else {
            t52 a2 = a();
            long s = ((j2b) ((g2b) this.d.getValue())).a.s();
            a2.getClass();
            long j10 = y.a;
            j52 j52 = new j52(a2, s, j9, j10);
            Object obj = new Object();
            if (z5 || z2) {
                int a3 = z5 ? (int) ((to8) this.e.getValue()).a(j10, j9) : 0;
                Integer valueOf = Integer.valueOf(a3);
                a().getClass();
                obj = new h52(a3);
                num = valueOf;
            } else {
                num = null;
            }
            a().getClass();
            g52 g52 = new g52(z5, 0);
            udd.p("m0c", "update chat %d, setAsUnread = %b, count = %s", new Object[]{Long.valueOf(j10), Boolean.valueOf(z), num});
            t52 a4 = a();
            Object[] objArr = {j52, obj, g52};
            a4.getClass();
            if (!a4.h(j10, false, new zx1(4, objArr)).b0()) {
                return 0;
            }
        }
        gy9 gy9 = (gy9) ((pk) this.f.getValue());
        if (!gy9.q(j8)) {
            j5 = 0;
        } else {
            qa2 qa2 = r1;
            qa2 qa22 = new qa2(((j2b) gy9.z()).a.n(), j2, j3, j4, z, z3, z4);
            j5 = sce.d(gy9.A(), qa2, false, 0, 12);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        xi4 xi4 = (xi4) concurrentHashMap.get(Long.valueOf(j2));
        if (xi4 != null) {
            xi4.f();
        }
        concurrentHashMap.remove(Long.valueOf(j2));
        concurrentHashMap.put(Long.valueOf(j2), ((qmc) this.g.getValue()).b(new ox4(2, j5, j2, this)));
        return j5;
    }
}
