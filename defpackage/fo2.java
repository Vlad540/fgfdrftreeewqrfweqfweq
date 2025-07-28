package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: fo2  reason: default package */
public final class fo2 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final xzc b;
    public final bv2 c;
    public final s16 d;
    public final t97 e;
    public g37 f;
    public volatile m62 g;
    public volatile long h;
    public volatile long i = 0;
    public volatile boolean j;
    public final t97 k = ez3.O(2, new nl1(11, this));
    public final hu3 l;

    public fo2(long j2, lhd lhd, t97 t97, xzc xzc, bv2 bv2, yzb yzb) {
        this.a = j2;
        this.b = xzc;
        this.c = bv2;
        this.d = yzb;
        this.e = t97;
        int i2 = zp4.o;
        this.l = ((ju3) lhd.b).plus(new do2(zl3.b, 0));
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "fo2", us8.i(j2, "init #"), (Throwable) null);
        }
    }

    public final i22 a() {
        return (i22) ((aw2) this.c).m(this.a).a.getValue();
    }

    public final boolean b() {
        if (a() != null) {
            i22 a2 = a();
            Long l2 = null;
            Long valueOf = a2 != null ? Long.valueOf(a2.a) : null;
            kv2 kv2 = ((aw2) this.c).b;
            i22 i22 = (i22) ((zqd) ((ConcurrentHashMap) kv2.Z).computeIfAbsent(0L, new di(4, new l(27, kv2)))).getValue();
            if (i22 != null) {
                l2 = Long.valueOf(i22.a);
            }
            if (hhd.f(valueOf, l2)) {
                return true;
            }
        }
        return false;
    }

    public final jue c(long j2, Continuation continuation) {
        boolean b2 = b();
        jue jue = jue.a;
        if (!b2 || j2 != 0) {
            int i2 = zp4.o;
            long Q = mt0.Q(System.nanoTime(), eq4.b);
            long g2 = zp4.g(Q, this.i);
            if (zp4.c(g2, ((zp4) this.k.getValue()).a) < 0) {
                udd.R("fo2", (IOException) null, "requestForChatSubscribeIfNeed #%d: request diff = %s", Arrays.copyOf(new Object[]{new Long(this.a), new zp4(g2)}, 2));
                return jue;
            } else if (!((Boolean) this.d.invoke()).booleanValue()) {
                udd.U("fo2", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!");
                return jue;
            } else {
                this.i = Q;
                gy9 gy9 = (gy9) ((pk) this.e.getValue());
                gy9.v(gy9, new xn2(((j2b) gy9.z()).a.n(), j2, true));
                bv2 bv2 = this.c;
                ((aw2) bv2).l().Y(this.a, true);
                return jue;
            }
        } else {
            udd.R("fo2", (IOException) null, "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", Arrays.copyOf(new Object[]{new Long(this.a)}, 1));
            return jue;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r5 = ((zp4) r7.k.getValue()).a;
        r0.o = r7;
        r0.Z = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (defpackage.ek8.r(r5, r0) != r1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r7.j == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r0.o = null;
        r0.Z = 5;
        r7.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r3 != r1) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r0.o = null;
        r0.Z = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r7.d(r0) != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.eo2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            eo2 r0 = (defpackage.eo2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            eo2 r0 = new eo2
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0043;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002c:
            wx3.H(r8)
            goto L_0x00db
        L_0x0031:
            wx3.H(r8)
            goto L_0x00ce
        L_0x0036:
            fo2 r7 = r0.o
            wx3.H(r8)
            goto L_0x00bf
        L_0x003d:
            fo2 r7 = r0.o
            wx3.H(r8)
            goto L_0x00a9
        L_0x0043:
            wx3.H(r8)
            goto L_0x0069
        L_0x0047:
            wx3.H(r8)
            long r5 = r7.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "fo2"
            java.lang.String r5 = "subscribe() #%d"
            udd.p(r2, r5, r8)
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x006a
            r8 = 1
            r0.Z = r8
            r7.e(r0)
            if (r3 != r1) goto L_0x0069
            return r1
        L_0x0069:
            return r3
        L_0x006a:
            i22 r8 = r7.a()
            if (r8 == 0) goto L_0x0075
            i22 r8 = r7.f(r8)
            goto L_0x0076
        L_0x0075:
            r8 = r4
        L_0x0076:
            if (r8 != 0) goto L_0x008e
            bv2 r8 = r7.c
            long r5 = r7.a
            r0.o = r7
            r2 = 2
            r0.Z = r2
            aw2 r8 = (defpackage.aw2) r8
            t52 r8 = r8.l()
            r2 = 0
            r8.Y(r5, r2)
            if (r3 != r1) goto L_0x00a9
            return r1
        L_0x008e:
            o62 r2 = r8.b
            m62 r2 = r2.c
            r7.g = r2
            o62 r2 = r8.b
            long r5 = r2.a
            r7.h = r5
            o62 r8 = r8.b
            long r5 = r8.a
            r0.o = r7
            r8 = 3
            r0.Z = r8
            r7.c(r5, r0)
            if (r3 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            t97 r8 = r7.k
            java.lang.Object r8 = r8.getValue()
            zp4 r8 = (zp4) r8
            long r5 = r8.a
            r0.o = r7
            r8 = 4
            r0.Z = r8
            java.lang.Object r8 = defpackage.ek8.r(r5, r0)
            if (r8 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x00cf
            r0.o = r4
            r8 = 5
            r0.Z = r8
            r7.e(r0)
            if (r3 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            return r3
        L_0x00cf:
            r0.o = r4
            r8 = 6
            r0.Z = r8
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L_0x00db
            return r1
        L_0x00db:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jue e(Continuation continuation) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "fo2", us8.i(this.a, "unsubscribe() #"), (Throwable) null);
        }
        int i2 = zp4.o;
        this.i = 0;
        i22 f2 = f(a());
        jue jue = jue.a;
        if (f2 == null) {
            return jue;
        }
        ((gy9) ((pk) this.e.getValue())).k(f2.b.a, false);
        bv2 bv2 = this.c;
        ((aw2) bv2).l().Y(this.a, false);
        return jue;
    }

    public final i22 f(i22 i22) {
        i22 a2 = a();
        long j2 = this.a;
        if (a2 == null) {
            udd.T("fo2", "validate #%d: chat is null", new Object[]{Long.valueOf(j2)});
            return null;
        } else if (b()) {
            return a2;
        } else {
            o62 o62 = a2.b;
            if (o62.a == 0) {
                udd.T("fo2", "validate #%d: chatServerId == 0L", new Object[]{Long.valueOf(j2)});
                return null;
            } else if (a2.A() || a2.O()) {
                udd.p("fo2", "validate #%d: chat is valid!", new Object[]{Long.valueOf(j2)});
                return i22;
            } else {
                udd.T("fo2", "validate #%d: invalid chat status %s", new Object[]{Long.valueOf(j2), o62.c});
                return null;
            }
        }
    }
}
