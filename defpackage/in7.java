package defpackage;

import java.util.EnumSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: in7  reason: default package */
public final class in7 implements pp7 {
    public final t97 X;
    public final t97 Y;
    public final mw Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final r7e w0;

    public in7(aq aqVar, pae pae, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        t97 t978 = t97;
        t97 t979 = t973;
        this.a = t972;
        this.b = t979;
        this.c = t974;
        this.o = t978;
        this.X = t976;
        this.Y = t977;
        int i = zp4.o;
        n3a n3a = (n3a) pae;
        this.Z = new mw(n3a.b(), n3a.a(), mt0.P(1000, eq4.c), new xz6(6), new gn7(t978, (Continuation) null), new dn7(this, t975));
        this.w0 = new r7e(new xq(19, t979));
        ((kdf) aqVar).i.add(new en7(0, this));
    }

    public static void g(in7 in7, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (!in7.c()) {
            boolean z2 = ((ed3) in7.X.getValue()).b() == wd3.c;
            boolean e = in7.e();
            boolean contains = ((EnumSet) in7.w0.getValue()).contains(fn7.b);
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, "LogController", "Trying to flush analytics, timeFromLastSend=" + ez3.T(Long.valueOf(((lqc) ((f03) in7.a.getValue())).g.getLong("user.lastSentLogTime", 0))) + ", timeToSend=" + e + ", wifi=" + z2 + ", force=" + z + ", sendOnAnyNetwork=" + contains, (Throwable) null);
            }
            if (contains || z2 || e || z) {
                ((luf) in7.c.getValue()).a(new b1d(false, true));
            }
        }
    }

    public final void a() {
    }

    public final zec b() {
        return (zec) this.o.getValue();
    }

    public final boolean c() {
        kb5 kb5 = (kb5) ((jb5) this.Y.getValue());
        kb5.getClass();
        return !kb5.m(PmsKey.f2analyticsenabled, true);
    }

    public final boolean d() {
        int i = zp4.o;
        vqc vqc = (vqc) ((xzc) this.b.getValue());
        vqc.getClass();
        long Q = mt0.Q(vqc.o(PmsKey.f104sendlogsintervalsec, 10800) / ((long) 12), eq4.o);
        long currentTimeMillis = System.currentTimeMillis();
        eq4 eq4 = eq4.c;
        return zp4.c(zp4.g(mt0.Q(currentTimeMillis, eq4), mt0.Q(((lqc) ((f03) this.a.getValue())).g.getLong("user.lastSentCriticalLogTime", 0), eq4)), Q) >= 0;
    }

    public final boolean e() {
        int i = zp4.o;
        long currentTimeMillis = System.currentTimeMillis();
        eq4 eq4 = eq4.c;
        long g = zp4.g(mt0.Q(currentTimeMillis, eq4), mt0.Q(((lqc) ((f03) this.a.getValue())).g.getLong("user.lastSentLogTime", 0), eq4));
        vqc vqc = (vqc) ((xzc) this.b.getValue());
        vqc.getClass();
        long Q = mt0.Q(vqc.o(PmsKey.f104sendlogsintervalsec, 10800), eq4.o);
        if (zp4.c(Q, 0) < 0) {
            Q = mt0.P(3, eq4.Y);
        }
        return zp4.c(g, Q) > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.hn7
            if (r0 == 0) goto L_0x0013
            r0 = r12
            hn7 r0 = (defpackage.hn7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            hn7 r0 = new hn7
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            in7 r10 = r0.o
            wx3.H(r12)
            goto L_0x00a1
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            wx3.H(r12)
            boolean r12 = r10.c()
            if (r12 == 0) goto L_0x003e
            return r3
        L_0x003e:
            boolean r12 = r10.d()
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0047
            goto L_0x0090
        L_0x0047:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0090
            tn7 r5 = defpackage.tn7.X
            t97 r6 = r10.a
            java.lang.Object r6 = r6.getValue()
            f03 r6 = (defpackage.f03) r6
            lqc r6 = (defpackage.lqc) r6
            x97 r6 = r6.g
            java.lang.String r7 = "user.lastSentCriticalLogTime"
            r8 = 0
            long r6 = r6.getLong(r7, r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.String r6 = ez3.T(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Trying to flush critical analytics, awaitFlush="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", timeFromLastSend="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", timeToSend="
            r7.append(r6)
            r7.append(r12)
            java.lang.String r6 = r7.toString()
            r7 = 0
            java.lang.String r8 = "LogController"
            r2.d(r5, r8, r6, r7)
        L_0x0090:
            if (r12 == 0) goto L_0x00b2
            if (r11 == 0) goto L_0x00a1
            mw r11 = r10.Z
            r0.o = r10
            r0.Z = r4
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            t97 r10 = r10.c
            java.lang.Object r10 = r10.getValue()
            luf r10 = (defpackage.luf) r10
            b1d r11 = new b1d
            r12 = 0
            r11.<init>(r12, r12)
            r10.a(r11)
        L_0x00b2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in7.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
