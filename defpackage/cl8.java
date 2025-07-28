package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: cl8  reason: default package */
public final class cl8 extends taf {
    public static final /* synthetic */ k77[] O0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final li8 E0;
    public final e3 F0 = hwf.t();
    public final e3 G0 = hwf.t();
    public final e3 H0 = hwf.t();
    public final LongSparseArray I0 = new LongSparseArray();
    public final grd J0;
    public final t0c K0;
    public final l05 L0;
    public final r7e M0;
    public final String N0;
    public final xzc X;
    public final f03 Y;
    public final pae Z;
    public final long b;
    public final long c;
    public final long o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<cl8> cls = cl8.class;
        O0 = new k77[]{new hc9(cls, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;")};
    }

    public cl8(long j, long j2, long j3) {
        xv8 xv8 = xv8.a;
        pae dispatchers = xv8.getDispatchers();
        r7e d = xv8.getAccessor().d(bv2.class);
        r7e d2 = xv8.getAccessor().d(b29.class);
        r7e d3 = xv8.getAccessor().d(ap3.class);
        r7e d4 = xv8.getAccessor().d(q2b.class);
        r7e d5 = xv8.getAccessor().d(v86.class);
        r7e d6 = xv8.getAccessor().d(l86.class);
        r7e d7 = xv8.getAccessor().d(o2b.class);
        r7e d8 = xv8.getAccessor().d(r59.class);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = (xzc) xv8.getAccessor().c(xzc.class);
        this.Y = (f03) xv8.getAccessor().c(f03.class);
        this.Z = dispatchers;
        this.w0 = d;
        this.x0 = d2;
        this.y0 = d3;
        this.z0 = d4;
        this.A0 = d5;
        this.B0 = d6;
        this.C0 = d7;
        this.D0 = d8;
        w4 w4Var = ((ww8) xv8.getAccessor().c(ww8.class)).a;
        this.E0 = new li8(j2, j, (tt0) w4Var.c(tt0.class), (pae) w4Var.c(pae.class));
        grd a = hrd.a(hw4.a);
        this.J0 = a;
        this.K0 = new t0c(a);
        this.L0 = new l05(0);
        this.M0 = new r7e(new qk8(0, this));
        this.N0 = cl8.class.getName();
    }

    public static final void q(cl8 cl8) {
        Iterator it;
        LongSparseArray longSparseArray;
        di8 di8;
        cl8 cl82 = cl8;
        LongSparseArray longSparseArray2 = cl82.I0;
        if (longSparseArray2.size() != 0) {
            grd grd = cl82.J0;
            List list = (List) grd.getValue();
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                di8 di82 = null;
                if (it2.hasNext()) {
                    Object obj = (pg7) it2.next();
                    if (obj instanceof di8) {
                        di82 = obj;
                    }
                    if (di82 != null) {
                        long j = di82.a;
                        if (longSparseArray2.indexOfKey(j) >= 0) {
                            di8 di83 = (di8) obj;
                            long j2 = di83.a;
                            boolean z = di83.x0;
                            boolean z2 = di83.y0;
                            CharSequence charSequence = di83.b;
                            mge mge = di83.c;
                            String str = di83.o;
                            boolean z3 = di83.X;
                            longSparseArray = longSparseArray2;
                            it = it2;
                            boolean z4 = z2;
                            long j3 = di83.Y;
                            boolean z5 = z;
                            di8 = new di8(j2, charSequence, mge, str, z3, j3, di83.Z, (ryb) longSparseArray2.get(j), z5, z4);
                            arrayList.add(di8);
                            it2 = it;
                            longSparseArray2 = longSparseArray;
                        }
                    }
                    longSparseArray = longSparseArray2;
                    it = it2;
                    di8 = obj;
                    arrayList.add(di8);
                    it2 = it;
                    longSparseArray2 = longSparseArray;
                } else {
                    grd.m((Object) null, arrayList);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.cl8 r9, defpackage.i22 r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof defpackage.uk8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            uk8 r0 = (defpackage.uk8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            uk8 r0 = new uk8
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r6) goto L_0x0044
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r9 = r0.o
            mc9 r9 = (mc9) r9
            wx3.H(r11)
            goto L_0x00a7
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.o
            mc9 r9 = (mc9) r9
            wx3.H(r11)
            goto L_0x0095
        L_0x0044:
            i22 r10 = r0.X
            java.lang.Object r9 = r0.o
            cl8 r9 = (defpackage.cl8) r9
            wx3.H(r11)
            goto L_0x0068
        L_0x004e:
            wx3.H(r11)
            t97 r11 = r9.x0
            java.lang.Object r11 = r11.getValue()
            b29 r11 = (defpackage.b29) r11
            r0.o = r9
            r0.X = r10
            r0.w0 = r6
            long r6 = r9.c
            java.lang.Object r11 = r11.a(r6, r0)
            if (r11 != r1) goto L_0x0068
            goto L_0x00b2
        L_0x0068:
            vo8 r11 = (defpackage.vo8) r11
            boolean r2 = r9.w()
            grd r6 = r9.J0
            r7 = 0
            if (r2 == 0) goto L_0x00ac
            if (r11 != 0) goto L_0x0076
            goto L_0x00ac
        L_0x0076:
            o62 r2 = r10.b
            int r2 = r2.c()
            o62 r8 = r10.b
            java.util.Map r8 = r8.e
            int r8 = r8.size()
            if (r2 > r8) goto L_0x0099
            r0.o = r6
            r0.X = r7
            r0.w0 = r5
            r2 = 0
            java.io.Serializable r11 = r9.u(r10, r11, r2, r0)
            if (r11 != r1) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            r9 = r6
        L_0x0095:
            r9.setValue(r11)
            goto L_0x00aa
        L_0x0099:
            r0.o = r6
            r0.X = r7
            r0.w0 = r4
            java.io.Serializable r11 = r9.v(r10, r11, r0)
            if (r11 != r1) goto L_0x00a6
            goto L_0x00b2
        L_0x00a6:
            r9 = r6
        L_0x00a7:
            r9.setValue(r11)
        L_0x00aa:
            r1 = r3
            goto L_0x00b2
        L_0x00ac:
            hw4 r9 = hw4.a
            r6.m(r7, r9)
            goto L_0x00aa
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.r(cl8, i22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A[LOOP:0: B:20:0x007f->B:22:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.cl8 r5, defpackage.i22 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.wk8
            if (r0 == 0) goto L_0x0013
            r0 = r7
            wk8 r0 = (defpackage.wk8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            wk8 r0 = new wk8
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            cl8 r5 = r0.o
            wx3.H(r7)
            goto L_0x0054
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            wx3.H(r7)
            java.lang.String r7 = r5.N0
            java.lang.String r2 = "load reactions"
            udd.q(r7, r2)
            pae r7 = r5.Z
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            xk8 r2 = new xk8
            r2.<init>(r5, r6, r3)
            r0.o = r5
            r0.Z = r4
            java.lang.Object r7 = xs7.U(r7, r2, r0)
            if (r7 != r1) goto L_0x0054
            goto L_0x0097
        L_0x0054:
            as8 r7 = (defpackage.as8) r7
            java.lang.String r6 = r5.N0
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x005d
            goto L_0x0074
        L_0x005d:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0074
            tn7 r1 = defpackage.tn7.X
            java.util.List r2 = r7.a
            int r2 = r2.size()
            java.lang.String r4 = "reactions count: "
            java.lang.String r2 = defpackage.wn6.h(r2, r4)
            r0.d(r1, r6, r2, r3)
        L_0x0074:
            android.util.LongSparseArray r6 = r5.I0
            r6.clear()
            java.util.List r6 = r7.a
            java.util.Iterator r6 = r6.iterator()
        L_0x007f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0095
            java.lang.Object r7 = r6.next()
            ur8 r7 = (defpackage.ur8) r7
            android.util.LongSparseArray r0 = r5.I0
            long r1 = r7.a
            ryb r7 = r7.b
            r0.put(r1, r7)
            goto L_0x007f
        L_0x0095:
            jue r1 = jue.a
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.s(cl8, i22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        this.I0.clear();
        li8 li8 = this.E0;
        li8.c.f(li8);
    }

    public final i22 t() {
        return (i22) ((aw2) ((bv2) this.w0.getValue())).m(this.b).a.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable u(defpackage.i22 r17, defpackage.vo8 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r2 = 2
            boolean r3 = r1 instanceof defpackage.rk8
            if (r3 == 0) goto L_0x0018
            r3 = r1
            rk8 r3 = (defpackage.rk8) r3
            int r4 = r3.y0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0018
            int r4 = r4 - r5
            r3.y0 = r4
            goto L_0x001d
        L_0x0018:
            rk8 r3 = new rk8
            r3.<init>(r0, r1)
        L_0x001d:
            java.lang.Object r1 = r3.w0
            pu3 r4 = pu3.a
            int r5 = r3.y0
            r6 = 3
            r7 = 1
            if (r5 == 0) goto L_0x006e
            if (r5 == r7) goto L_0x005b
            if (r5 == r2) goto L_0x0046
            if (r5 != r6) goto L_0x003e
            java.io.Serializable r0 = r3.Y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r3.X
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r3.o
            java.util.List r3 = (java.util.List) r3
            wx3.H(r1)
            goto L_0x024d
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.io.Serializable r0 = r3.Y
            l7c r0 = (l7c) r0
            java.lang.Object r5 = r3.X
            vo8 r5 = (defpackage.vo8) r5
            java.lang.Object r8 = r3.o
            i22 r8 = (defpackage.i22) r8
            wx3.H(r1)
            r1 = r5
            r5 = r0
            r0 = r8
        L_0x0058:
            r8 = r3
            goto L_0x0197
        L_0x005b:
            int r0 = r3.Z
            java.io.Serializable r5 = r3.Y
            l7c r5 = (l7c) r5
            java.lang.Object r8 = r3.X
            vo8 r8 = (defpackage.vo8) r8
            java.lang.Object r9 = r3.o
            i22 r9 = (defpackage.i22) r9
            wx3.H(r1)
            goto L_0x0120
        L_0x006e:
            wx3.H(r1)
            l7c r1 = new l7c
            r1.<init>()
            r1.a = r0
            r0 = r17
            r5 = r1
            r8 = r3
            r1 = r18
            r3 = r19
        L_0x0080:
            java.lang.Object r9 = r5.a
            cl8 r9 = (defpackage.cl8) r9
            t97 r9 = r9.w0
            java.lang.Object r9 = r9.getValue()
            bv2 r9 = (defpackage.bv2) r9
            r8.o = r0
            r8.X = r1
            r8.Y = r5
            r8.Z = r3
            r8.y0 = r7
            aw2 r9 = (defpackage.aw2) r9
            t52 r9 = r9.l()
            r9.getClass()
            bp8 r10 = r1.y0
            bp8 r11 = defpackage.bp8.SENDING
            if (r10 == r11) goto L_0x00ad
            bp8 r11 = defpackage.bp8.ERROR
            if (r10 == r11) goto L_0x00ad
            bp8 r11 = defpackage.bp8.UNKNOWN
            if (r10 != r11) goto L_0x00b0
        L_0x00ad:
            r16 = r8
            goto L_0x0113
        L_0x00b0:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            o62 r11 = r0.b
            java.util.Map r11 = r11.e
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00c1:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x010f
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            r16 = r8
            long r7 = r1.Y
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x010b
            java.lang.Object r7 = r12.getValue()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r13 = r1.o
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x010b
            nj4 r7 = r9.r
            java.lang.Object r7 = r7.get()
            di3 r7 = (defpackage.di3) r7
            java.lang.Object r8 = r12.getKey()
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            r8 = 0
            tf3 r7 = r7.i(r12, r8)
            if (r7 == 0) goto L_0x010b
            r10.add(r7)
        L_0x010b:
            r8 = r16
            r7 = 1
            goto L_0x00c1
        L_0x010f:
            r16 = r8
            r7 = r10
            goto L_0x0117
        L_0x0113:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0117:
            if (r7 != r4) goto L_0x011a
            return r4
        L_0x011a:
            r9 = r0
            r8 = r1
            r0 = r3
            r1 = r7
            r3 = r16
        L_0x0120:
            java.util.List r1 = (java.util.List) r1
            r7 = 0
            if (r0 != 0) goto L_0x01a1
            zb9 r0 = new zb9
            r0.<init>(r7)
            java.util.Iterator r10 = r1.iterator()
        L_0x012e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0148
            java.lang.Object r11 = r10.next()
            tf3 r11 = (defpackage.tf3) r11
            boolean r12 = r11.w()
            if (r12 == 0) goto L_0x012e
            long r11 = r11.n()
            r0.a(r11)
            goto L_0x012e
        L_0x0148:
            java.util.ArrayList r10 = r9.i()
            java.util.Iterator r10 = r10.iterator()
        L_0x0150:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x016a
            java.lang.Object r11 = r10.next()
            tf3 r11 = (defpackage.tf3) r11
            boolean r12 = r11.w()
            if (r12 == 0) goto L_0x0150
            long r11 = r11.n()
            r0.a(r11)
            goto L_0x0150
        L_0x016a:
            boolean r10 = r0.j()
            if (r10 == 0) goto L_0x01a1
            java.lang.Object r1 = r5.a
            cl8 r1 = (defpackage.cl8) r1
            t97 r1 = r1.D0
            java.lang.Object r1 = r1.getValue()
            r59 r1 = (defpackage.r59) r1
            r3.o = r9
            r3.X = r8
            r3.Y = r5
            r3.y0 = r2
            int r7 = zp4.o
            eq4 r7 = eq4.o
            long r10 = mt0.P(r2, r7)
            java.lang.Object r0 = r1.t(r0, r10, r3)
            if (r0 != r4) goto L_0x0193
            return r4
        L_0x0193:
            r1 = r8
            r0 = r9
            goto L_0x0058
        L_0x0197:
            java.lang.Object r3 = r5.a
            cl8 r3 = (defpackage.cl8) r3
            r5.a = r3
            r3 = 1
            r7 = 1
            goto L_0x0080
        L_0x01a1:
            lg7 r0 = hwf.c()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r1.iterator()
        L_0x01ae:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01fc
            java.lang.Object r12 = r11.next()
            tf3 r12 = (defpackage.tf3) r12
            boolean r13 = r12.w()
            if (r13 == 0) goto L_0x01c4
            r17 = r3
            r2 = r7
            goto L_0x01f1
        L_0x01c4:
            java.lang.Object r13 = r5.a
            cl8 r13 = (defpackage.cl8) r13
            bh2 r14 = new bh2
            uj3 r15 = defpackage.fu7.t(r12)
            java.lang.Object r7 = r5.a
            cl8 r7 = (defpackage.cl8) r7
            t97 r7 = r7.C0
            java.lang.Object r7 = r7.getValue()
            o2b r7 = (defpackage.o2b) r7
            r17 = r3
            long r2 = r12.n()
            l2b r2 = r7.b(r2)
            m2b r2 = defpackage.fu7.m(r2)
            r6 = 0
            r14.<init>(r15, r2, r6)
            di8 r2 = r13.y(r14)
        L_0x01f1:
            if (r2 == 0) goto L_0x01f6
            r10.add(r2)
        L_0x01f6:
            r3 = r17
            r2 = 2
            r6 = 3
            r7 = 0
            goto L_0x01ae
        L_0x01fc:
            r17 = r3
            r0.addAll(r10)
            java.util.ArrayList r2 = r9.i()
            es r3 = new es
            r6 = 2
            r3.<init>(r6, r2)
            to1 r2 = new to1
            r6 = 7
            r2.<init>(r1, r5, r8, r6)
            sg5 r1 = myc.L(r3, r2)
            e98 r2 = new e98
            r3 = 4
            r2.<init>(r3, r5)
            vqe r3 = new vqe
            r3.<init>(r1, r2)
            u23.L(r0, r3)
            long r1 = r8.Y
            java.lang.Object r3 = r5.a
            cl8 r3 = (defpackage.cl8) r3
            f03 r3 = r3.Y
            lqc r3 = (defpackage.lqc) r3
            long r6 = r3.s()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0252
            java.lang.Object r1 = r5.a
            cl8 r1 = (defpackage.cl8) r1
            r3 = r17
            r3.o = r0
            r3.X = r0
            r3.Y = r0
            r2 = 3
            r3.y0 = r2
            java.lang.Object r1 = r1.x(r3)
            if (r1 != r4) goto L_0x024b
            return r4
        L_0x024b:
            r2 = r0
            r3 = r2
        L_0x024d:
            r0.add(r1)
            r0 = r2
            goto L_0x0253
        L_0x0252:
            r3 = r0
        L_0x0253:
            zo4 r1 = defpackage.zo4.Y
            t23.J(r0, r1)
            lg7 r0 = hwf.a(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.u(i22, vo8, boolean, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: vo8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable v(defpackage.i22 r8, defpackage.vo8 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.sk8
            if (r0 == 0) goto L_0x0013
            r0 = r10
            sk8 r0 = (defpackage.sk8) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            sk8 r0 = new sk8
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            lg7 r7 = r0.Z
            lg7 r8 = r0.Y
            java.lang.Object r9 = r0.X
            java.util.List r9 = (java.util.List) r9
            cl8 r0 = r0.o
            wx3.H(r10)
            goto L_0x00c5
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            java.lang.Object r7 = r0.X
            r9 = r7
            vo8 r9 = (defpackage.vo8) r9
            cl8 r7 = r0.o
            wx3.H(r10)
            goto L_0x006d
        L_0x0049:
            wx3.H(r10)
            java.lang.String r10 = r7.N0
            java.lang.String r2 = "load members from server"
            udd.q(r10, r2)
            pae r10 = r7.Z
            n3a r10 = (n3a) r10
            ju3 r10 = r10.b()
            tk8 r2 = new tk8
            r2.<init>(r7, r8, r3)
            r0.o = r7
            r0.X = r9
            r0.y0 = r5
            java.lang.Object r10 = xs7.U(r10, r2, r0)
            if (r10 != r1) goto L_0x006d
            return r1
        L_0x006d:
            dh2 r10 = (defpackage.dh2) r10
            hw4 r8 = hw4.a
            if (r10 == 0) goto L_0x00f0
            java.util.ArrayList r10 = r10.c
            if (r10 != 0) goto L_0x0079
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0080
            return r8
        L_0x0080:
            lg7 r8 = hwf.c()
            es r2 = new es
            r5 = 2
            r2.<init>(r5, r10)
            ka r10 = new ka
            r5 = 20
            r10.<init>(r7, r5, r9)
            sg5 r10 = myc.L(r2, r10)
            e98 r2 = new e98
            r5 = 5
            r2.<init>(r5, r7)
            vqe r5 = new vqe
            r5.<init>(r10, r2)
            u23.L(r8, r5)
            long r9 = r9.Y
            f03 r2 = r7.Y
            lqc r2 = (defpackage.lqc) r2
            long r5 = r2.s()
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00ca
            r0.o = r7
            r0.X = r8
            r0.Y = r8
            r0.Z = r8
            r0.y0 = r4
            java.lang.Object r10 = r7.x(r0)
            if (r10 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            r0 = r7
            r7 = r8
            r9 = r7
        L_0x00c5:
            r7.add(r10)
            r7 = r0
            goto L_0x00cb
        L_0x00ca:
            r9 = r8
        L_0x00cb:
            zo4 r10 = defpackage.zo4.Y
            t23.J(r8, r10)
            lg7 r8 = hwf.a(r9)
            java.lang.String r7 = r7.N0
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x00db
            goto L_0x00f0
        L_0x00db:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00f0
            tn7 r10 = defpackage.tn7.X
            int r0 = r8.getSize()
            java.lang.String r1 = "members count from server: "
            java.lang.String r0 = defpackage.wn6.h(r0, r1)
            r9.d(r10, r7, r0, r3)
        L_0x00f0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.v(i22, vo8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final boolean w() {
        i22 t = t();
        if (t == null || t.J() || t.G() || this.o == 0) {
            return false;
        }
        o62 o62 = t.b;
        return o62.c() <= ((Number) this.M0.getValue()).intValue() && o62.c() > 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yk8
            if (r0 == 0) goto L_0x0013
            r0 = r5
            yk8 r0 = (defpackage.yk8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            yk8 r0 = new yk8
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            cl8 r4 = r0.X
            cl8 r0 = r0.o
            wx3.H(r5)
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            wx3.H(r5)
            t97 r5 = r4.y0
            java.lang.Object r5 = r5.getValue()
            ap3 r5 = (defpackage.ap3) r5
            r0.o = r4
            r0.X = r4
            r0.w0 = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            tf3 r5 = (defpackage.tf3) r5
            uj3 r5 = defpackage.fu7.t(r5)
            t97 r1 = r0.C0
            java.lang.Object r1 = r1.getValue()
            o2b r1 = (defpackage.o2b) r1
            f03 r0 = r0.Y
            lqc r0 = (defpackage.lqc) r0
            long r2 = r0.s()
            l2b r0 = r1.b(r2)
            m2b r0 = defpackage.fu7.m(r0)
            bh2 r1 = new bh2
            r2 = 0
            r1.<init>(r5, r0, r2)
            di8 r4 = r4.y(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final di8 y(bh2 bh2) {
        mge lge;
        bh2 bh22 = bh2;
        int i = ((o2b) this.C0.getValue()).b(bh22.a.a).a;
        boolean z = i == 10 || i == 20 || i == 40;
        fj0 fj0 = fj0.c;
        uj3 uj3 = bh22.a;
        String d = uj3.d(fj0);
        tj3 tj3 = tj3.BOT;
        List list = uj3.y0;
        boolean contains = list.contains(tj3);
        long j = uj3.a;
        if (contains && list.contains(tj3.SERVICE_ACCOUNT)) {
            lge = new hge(c7a.s0);
        } else if (list.contains(tj3)) {
            lge = new hge(c7a.u);
        } else {
            q2b q2b = (q2b) this.z0.getValue();
            q2b.getClass();
            tf3 h = ((di3) ((dqc) q2b.X.getValue()).a.c(di3.class)).h(j, false);
            boolean z2 = h != null && h.c();
            m2b m2b = bh22.b;
            lge = new lge(q2b.a(j, z2, m2b != null ? fu7.l(m2b) : null));
        }
        mge mge = lge;
        String a = uj3.a();
        String str = "";
        String str2 = a == null ? str : a;
        if (d == null) {
            d = str;
        }
        ryb ryb = (ryb) this.I0.get(j);
        boolean z3 = j == ((lqc) this.Y).s();
        Pattern pattern = t5a.a;
        String b2 = uj3.b();
        if (b2 != null) {
            str = b2;
        }
        return new di8(uj3.a, str2, mge, d, z, bh22.c, t5a.b(str, uj3.c()), ryb, true, z3);
    }
}
