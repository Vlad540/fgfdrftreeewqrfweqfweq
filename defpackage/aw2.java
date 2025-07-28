package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: aw2  reason: default package */
public final class aw2 implements bv2, tr2, s52, pp7 {
    public static final /* synthetic */ int Y = 0;
    public final t97 X;
    public final pae a;
    public final kv2 b;
    public final t97 c;
    public final t97 o;

    /* JADX WARNING: type inference failed for: r0v0, types: [kv2, java.lang.Object] */
    public aw2(t97 t97, t97 t972, t97 t973, t97 t974, pae pae) {
        this.a = pae;
        ? obj = new Object();
        obj.a = kv2.class.getName();
        obj.b = t97;
        obj.c = t973;
        obj.o = t974;
        obj.X = new r7e(new dv2(pae, 0));
        obj.Y = new ConcurrentHashMap();
        obj.Z = new ConcurrentHashMap();
        this.b = obj;
        this.c = t974;
        this.o = t972;
        this.X = t973;
        xs7.E(n1g.a(((n3a) pae).b()), (hu3) null, (ru3) null, new pv2(t973, this, (Continuation) null), 3);
    }

    public static dyc i(es esVar, or2 or2) {
        if (or2 instanceof mr2) {
            return myc.M(esVar, new hd1(27));
        }
        if (or2 instanceof nr2) {
            return esVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a() {
        kv2 kv2 = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kv2.Y;
        for (mc9 value : concurrentHashMap.values()) {
            value.setValue((Object) null);
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) kv2.Z;
        for (mc9 value2 : concurrentHashMap2.values()) {
            value2.setValue((Object) null);
        }
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
    }

    public final void b(List list) {
        this.b.b(list);
    }

    public final void c(List list) {
        this.b.c(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(long r8, java.util.List r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.qv2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            qv2 r0 = (defpackage.qv2) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            qv2 r0 = new qv2
            r0.<init>(r7, r12)
        L_0x0018:
            java.lang.Object r12 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r11 = r0.Z
            long r8 = r0.Y
            java.util.List r10 = r0.X
            aw2 r7 = r0.o
            wx3.H(r12)
        L_0x002e:
            r1 = r8
            r5 = r10
            r6 = r11
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            wx3.H(r12)
            r0.o = r7
            r0.X = r10
            r0.Y = r8
            r0.Z = r11
            r0.y0 = r3
            java.lang.Object r12 = r7.d(r8, r0)
            if (r12 != r1) goto L_0x002e
            return r1
        L_0x004e:
            i22 r12 = (defpackage.i22) r12
            t52 r7 = r7.l()
            o62 r8 = r12.b
            long r3 = r8.a
            r7.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "addChatUsers, chatId = "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", ids = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "t52"
            udd.q(r9, r8)
            r7.d(r1, r5)
            nj4 r7 = r7.p
            java.lang.Object r7 = r7.get()
            pk r7 = (defpackage.pk) r7
            r0 = r7
            gy9 r0 = (defpackage.gy9) r0
            r0.d(r1, r3, r5, r6)
            jue r7 = jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.e(long, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final i22 f(long j, u16 u16) {
        return l().h(j, false, new xp(1, u16));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable g(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.rv2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            rv2 r0 = (defpackage.rv2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            rv2 r0 = new rv2
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r6)
            goto L_0x005e
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            wx3.H(r6)
            t52 r6 = r5.l()
            r6.getClass()
            e52 r2 = new e52
            r4 = 1
            r2.<init>(r6, r4)
            r4 = 0
            java.lang.Object r6 = r6.e0(r4, r2)
            i22 r6 = (defpackage.i22) r6
            if (r6 != 0) goto L_0x0060
            pae r6 = r5.a
            n3a r6 = (n3a) r6
            ju3 r6 = r6.b()
            sv2 r2 = new sv2
            r2.<init>(r5, r4)
            r0.Y = r3
            java.lang.Object r6 = xs7.U(r6, r2, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            i22 r6 = (defpackage.i22) r6
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.g(kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final dyc h(dyc dyc, or2 or2) {
        if (or2 instanceof mr2) {
            return dyc;
        }
        if (or2 instanceof nr2) {
            nr2 nr2 = (nr2) or2;
            return myc.L(dyc, new mv2(this, nr2.a, nr2.b, nr2.e, nr2.c, nr2.d));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable j(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.tv2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            tv2 r0 = (defpackage.tv2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            tv2 r0 = new tv2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r5 = r0.X
            aw2 r4 = r0.o
            wx3.H(r7)     // Catch:{ all -> 0x002b }
            goto L_0x004d
        L_0x002b:
            r7 = move-exception
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r7)
            t52 r7 = r4.l()     // Catch:{ all -> 0x002b }
            dhd r7 = r7.x(r5)     // Catch:{ all -> 0x002b }
            r0.o = r4     // Catch:{ all -> 0x002b }
            r0.X = r5     // Catch:{ all -> 0x002b }
            r0.w0 = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r7 = e07.d(r7, r0)     // Catch:{ all -> 0x002b }
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            i22 r7 = (defpackage.i22) r7     // Catch:{ all -> 0x002b }
            goto L_0x006a
        L_0x0050:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for #"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            udd.s(r4, r5, r7)
            r7 = 0
        L_0x006a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.j(long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x0061, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.uv2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            uv2 r0 = (defpackage.uv2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            uv2 r0 = new uv2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r8)
            goto L_0x0064
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            long r6 = r0.X
            aw2 r5 = r0.o
            wx3.H(r8)
            goto L_0x0052
        L_0x003a:
            wx3.H(r8)
            t52 r8 = r5.l()
            v63 r8 = r8.f()
            r0.o = r5
            r0.X = r6
            r0.w0 = r4
            java.lang.Object r8 = e07.c(r8, r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            nv2 r8 = new nv2
            r2 = 1
            r8.<init>(r5, r6, r2)
            r5 = 0
            r0.o = r5
            r0.w0 = r3
            java.lang.Object r8 = udd.M(r8, r0)
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final t52 l() {
        return (t52) this.X.getValue();
    }

    public final t0c m(long j) {
        kv2 kv2 = this.b;
        return new t0c((mc9) ((ConcurrentHashMap) kv2.Y).computeIfAbsent(Long.valueOf(j), new di(5, new ev2(kv2, j, 0))));
    }

    public final t0c n(long j) {
        kv2 kv2 = this.b;
        return new t0c((mc9) ((ConcurrentHashMap) kv2.Z).computeIfAbsent(Long.valueOf(j), new di(6, new ev2(kv2, j, 1))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(zb9 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wv2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            wv2 r0 = (defpackage.wv2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            wv2 r0 = new wv2
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r6)
            goto L_0x0042
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r6)
            x2 r6 = new x2
            r2 = 26
            r6.<init>(r4, r2, r5)
            r0.Y = r3
            java.lang.Object r6 = udd.M(r6, r0)
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.o(zb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.util.Set r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vv2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            vv2 r0 = (defpackage.vv2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            vv2 r0 = new vv2
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r6)
            goto L_0x0042
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r6)
            x2 r6 = new x2
            r2 = 25
            r6.<init>(r4, r2, r5)
            r0.Y = r3
            java.lang.Object r6 = udd.M(r6, r0)
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.p(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final i22 q(long j) {
        return l().E(j);
    }

    public final Object r(or2 or2) {
        if (or2 instanceof mr2) {
            List D = l().D(t52.J);
            ArrayList arrayList = new ArrayList();
            for (Object next : D) {
                if (((i22) next).K()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } else if (or2 instanceof nr2) {
            return hw4.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final List s(or2 or2, long j, Long l, int i) {
        dyc h = h(i(new es(2, l().D(or2.a())), or2), or2);
        Iterator it = h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 >= 0) {
                i22 i22 = (i22) next;
                if (j >= i22.n()) {
                    if (l == null) {
                        break;
                    }
                    if (i22.a != l.longValue()) {
                        break;
                    }
                }
                i2++;
            } else {
                p23.G();
                throw null;
            }
        }
        if (i2 == -1) {
            return hw4.a;
        }
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            i3 = i + i2 + 1;
        }
        return myc.U(h).subList(i2, Math.min(i3, myc.J(h)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(long r5, java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.xv2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xv2 r0 = (defpackage.xv2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            xv2 r0 = new xv2
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Set r7 = r0.X
            aw2 r4 = r0.o
            wx3.H(r8)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            wx3.H(r8)
            r0.o = r4
            r0.X = r7
            r0.w0 = r3
            java.lang.Object r8 = r4.d(r5, r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            i22 r8 = (defpackage.i22) r8
            t52 r4 = r4.l()
            o62 r5 = r8.b
            r4.getClass()
            b62 r4 = defpackage.t52.H(r5, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.t(long, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.yv2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            yv2 r0 = (defpackage.yv2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            yv2 r0 = new yv2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r8)
            goto L_0x004f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            wx3.H(r8)
            pae r8 = r5.a
            n3a r8 = (n3a) r8
            ju3 r8 = r8.b()
            nv2 r2 = new nv2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            c07 r5 = new c07
            r6 = 0
            r5.<init>(r2, r6)
            java.lang.Object r8 = xs7.U(r8, r5, r0)
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.u(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r5, java.util.Set r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.zv2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            zv2 r0 = (defpackage.zv2) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            zv2 r0 = new zv2
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r8 = r0.Z
            long r5 = r0.Y
            java.util.Set r7 = r0.X
            aw2 r4 = r0.o
            wx3.H(r9)
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            wx3.H(r9)
            r0.o = r4
            r0.X = r7
            r0.Y = r5
            r0.Z = r8
            r0.y0 = r3
            java.lang.Object r9 = r4.t(r5, r7, r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            b62 r9 = (defpackage.b62) r9
            t52 r0 = r4.l()
            ph0 r1 = new ph0
            r1.<init>((defpackage.b62) r9, (int) r8, (defpackage.aw2) r4, (java.util.Set) r7)
            r4 = 0
            r0.h(r5, r4, r1)
            jue r4 = jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw2.v(long, java.util.Set, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
