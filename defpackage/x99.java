package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x99  reason: default package */
public final class x99 {
    public static final /* synthetic */ k77[] i;
    public final ou3 a;
    public final pae b;
    public final zqd c;
    public final i26 d;
    public final t97 e;
    public final grd f;
    public final t0c g;
    public final e3 h = hwf.t();

    static {
        k77 hc9 = new hc9(x99.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public x99(t97 t97, ou3 ou3, pae pae, zqd zqd, zv zvVar) {
        this.a = ou3;
        this.b = pae;
        this.c = zqd;
        this.d = zvVar;
        this.e = t97;
        grd a2 = hrd.a(new r99());
        this.f = a2;
        this.g = new t0c(a2);
    }

    public static kea a(zm8 zm8) {
        int ordinal = zm8.ordinal();
        if (ordinal == 0) {
            return new kea(a7a.v, c7a.l, phc.Z1);
        }
        if (ordinal == 1) {
            return new kea(a7a.q, c7a.e, phc.u);
        }
        if (ordinal == 4) {
            return new kea(a7a.y, c7a.o, phc.Q1);
        }
        if (ordinal == 5) {
            return new kea(a7a.s, c7a.i, phc.x);
        }
        if (ordinal == 7) {
            return new kea(a7a.x, c7a.n, phc.D1);
        }
        if (ordinal != 8) {
            return null;
        }
        return new kea(a7a.C, c7a.s, phc.B1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable b(java.util.Set r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.s99
            if (r0 == 0) goto L_0x0013
            r0 = r6
            s99 r0 = (defpackage.s99) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            s99 r0 = new s99
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            lg7 r4 = r0.Y
            lg7 r5 = r0.X
            x99 r0 = r0.o
            wx3.H(r6)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r6)
            lg7 r6 = hwf.c()
            t97 r2 = r4.e
            java.lang.Object r2 = r2.getValue()
            gn8 r2 = (defpackage.gn8) r2
            r0.o = r4
            r0.X = r6
            r0.Y = r6
            r0.x0 = r3
            java.io.Serializable r5 = r2.e(r5, r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0057:
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
            lg7 r4 = hwf.a(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.util.ListIterator r4 = r4.listIterator(r6)
        L_0x006a:
            r6 = r4
            jg7 r6 = (jg7) r6
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0086
            java.lang.Object r6 = r6.next()
            zm8 r6 = (defpackage.zm8) r6
            r0.getClass()
            kea r6 = a(r6)
            if (r6 == 0) goto L_0x006a
            r5.add(r6)
            goto L_0x006a
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x99.b(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable c(one.me.messages.list.loader.MessageModel r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.t99
            if (r0 == 0) goto L_0x0013
            r0 = r7
            t99 r0 = (defpackage.t99) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            t99 r0 = new t99
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            lg7 r5 = r0.Y
            lg7 r6 = r0.X
            x99 r0 = r0.o
            wx3.H(r7)
            goto L_0x005e
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            wx3.H(r7)
            if (r6 != 0) goto L_0x003d
            hw4 r5 = hw4.a
            return r5
        L_0x003d:
            lg7 r7 = hwf.c()
            t97 r2 = r5.e
            java.lang.Object r2 = r2.getValue()
            gn8 r2 = (defpackage.gn8) r2
            r0.o = r5
            r0.X = r7
            r0.Y = r7
            r0.x0 = r3
            long r3 = r6.a
            java.io.Serializable r6 = r2.d(r3, r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r5
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x005e:
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            lg7 r5 = hwf.a(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.util.ListIterator r5 = r5.listIterator(r7)
        L_0x0071:
            r7 = r5
            jg7 r7 = (jg7) r7
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008d
            java.lang.Object r7 = r7.next()
            zm8 r7 = (defpackage.zm8) r7
            r0.getClass()
            kea r7 = a(r7)
            if (r7 == 0) goto L_0x0071
            r6.add(r7)
            goto L_0x0071
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x99.c(one.me.messages.list.loader.MessageModel, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final boolean d() {
        return !((r99) this.g.a.getValue()).a.isEmpty();
    }

    public final void e(long j) {
        qod D = xs7.D(this.a, this.b.a(), ru3.b, new v99(j, this, (Continuation) null));
        this.h.o1(this, i[0], D);
    }
}
