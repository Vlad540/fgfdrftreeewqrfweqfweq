package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: mw  reason: default package */
public final class mw implements yt {
    public final long a;
    public final String b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Serializable m;

    public mw(long j2, pae pae, md4 md4, lh6 lh6, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, aqc aqc) {
        this.a = j2;
        this.c = pae;
        this.d = md4;
        this.e = lh6;
        this.f = aqc;
        this.b = mw.class.getName();
        ContextScope a2 = n1g.a(((n3a) pae).b());
        this.g = a2;
        this.h = t973;
        this.i = t97;
        this.j = t972;
        this.k = t974;
        this.l = t975;
        this.m = new r7e(new c6(10, this));
        if (lh6.e()) {
            xs7.E(a2, (hu3) null, (ru3) null, new gw(t974, this, (Continuation) null), 3);
        }
    }

    public static final Object a(mw mwVar, ur0 ur0) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) mwVar.m;
        boolean z = !copyOnWriteArrayList.isEmpty();
        ArrayList arrayList = (ArrayList) mwVar.l;
        if (z) {
            arrayList.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
        boolean z2 = !arrayList.isEmpty();
        jue jue = jue.a;
        if (!z2) {
            return jue;
        }
        List s0 = o23.s0(arrayList);
        arrayList.clear();
        Object f2 = mwVar.f(s0, ur0);
        return f2 == pu3.a ? f2 : jue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: i22} */
    /* JADX WARNING: type inference failed for: r6v0, types: [i22, mw] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0158 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r0 = r16
            r9 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.iw
            if (r2 == 0) goto L_0x001a
            r2 = r1
            iw r2 = (defpackage.iw) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.w0 = r3
        L_0x0018:
            r12 = r2
            goto L_0x0020
        L_0x001a:
            iw r2 = new iw
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r12.Y
            pu3 r13 = pu3.a
            int r2 = r12.w0
            r15 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r3) goto L_0x003b
            if (r2 != r15) goto L_0x0033
            wx3.H(r1)
            goto L_0x0159
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            i22 r0 = r12.X
            mw r2 = r12.o
            wx3.H(r1)
            r14 = r0
            r0 = r2
            goto L_0x012b
        L_0x0046:
            wx3.H(r1)
            java.lang.Object r1 = r0.i
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            long r4 = r0.a
            aw2 r1 = (defpackage.aw2) r1
            t0c r1 = r1.m(r4)
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            r11 = r1
            i22 r11 = (defpackage.i22) r11
            hw4 r1 = hw4.a
            if (r11 != 0) goto L_0x0083
            java.lang.String r2 = r0.b
            long r3 = r0.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "No chat="
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r3 = " in cache for loaded messages!"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            udd.U(r2, r0)
            return r1
        L_0x0083:
            java.lang.Long r2 = new java.lang.Long
            r4 = r20
            r2.<init>(r4)
            long r4 = r2.longValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r2 == 0) goto L_0x009e
            long r4 = r2.longValue()
        L_0x009c:
            r6 = r4
            goto L_0x00a4
        L_0x009e:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x009c
        L_0x00a4:
            java.lang.String r2 = r0.b
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x00ad
        L_0x00aa:
            r3 = r18
            goto L_0x00fb
        L_0x00ad:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x00aa
            tn7 r5 = defpackage.tn7.X
            java.lang.Long r8 = new java.lang.Long
            r20 = r4
            r3 = r18
            r8.<init>(r3)
            java.lang.String r8 = ez3.T(r8)
            java.lang.Object r10 = r0.d
            md4 r10 = (defpackage.md4) r10
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r14 = "getMessagesForward: "
            r15.<init>(r14)
            r15.append(r8)
            java.lang.String r8 = ", \n                |count: "
            r15.append(r8)
            r15.append(r9)
            java.lang.String r8 = ", \n                |forwardTimeTo: "
            r15.append(r8)
            r15.append(r6)
            java.lang.String r8 = ", \n                |itemType: "
            r15.append(r8)
            r15.append(r10)
            java.lang.String r8 = "\n                |"
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            java.lang.String r8 = i0e.E(r8)
            r14 = r20
            r10 = 0
            r14.d(r5, r2, r8, r10)
        L_0x00fb:
            if (r9 <= 0) goto L_0x015b
            java.lang.Object r1 = r0.k
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            b29 r1 = (defpackage.b29) r1
            long r14 = r0.a
            java.lang.Object r2 = r0.d
            md4 r2 = (defpackage.md4) r2
            boolean r8 = r2.a()
            java.lang.Object r2 = r0.d
            r10 = r2
            md4 r10 = (defpackage.md4) r10
            r12.o = r0
            r12.X = r11
            r2 = 1
            r12.w0 = r2
            r2 = r14
            r4 = r18
            r9 = r17
            r14 = r11
            r11 = r12
            java.lang.Object r1 = r1.c(r2, r4, r6, r8, r9, r10, r11)
            if (r1 != r13) goto L_0x012b
            return r13
        L_0x012b:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = r0.b
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x0135
        L_0x0133:
            r6 = 0
            goto L_0x014b
        L_0x0135:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0133
            tn7 r4 = defpackage.tn7.X
            int r5 = r1.size()
            java.lang.String r6 = "getForwardMessages: size="
            java.lang.String r5 = defpackage.wn6.h(r5, r6)
            r6 = 0
            r3.d(r4, r2, r5, r6)
        L_0x014b:
            r12.o = r6
            r12.X = r6
            r2 = 2
            r12.w0 = r2
            java.lang.Object r1 = r0.e(r14, r1, r12)
            if (r1 != r13) goto L_0x0159
            return r13
        L_0x0159:
            java.util.List r1 = (java.util.List) r1
        L_0x015b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.or0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            or0 r0 = (defpackage.or0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            or0 r0 = new or0
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r6)
            goto L_0x0060
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            a73 r5 = r0.o
            wx3.H(r6)
            goto L_0x0054
        L_0x0038:
            wx3.H(r6)
            a73 r6 = z3d.a()
            java.lang.Object r5 = r5.i
            hcd r5 = (hcd) r5
            i7e r2 = new i7e
            r2.<init>(r6)
            r0.o = r6
            r0.Z = r4
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r6
        L_0x0054:
            r6 = 0
            r0.o = r6
            r0.Z = r3
            java.lang.Object r5 = r5.awaitInternal(r0)
            if (r5 != r1) goto L_0x0060
            return r1
        L_0x0060:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: i22} */
    /* JADX WARNING: type inference failed for: r6v0, types: [i22, mw] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(int r18, long r19, long r21, kotlin.coroutines.Continuation r23) {
        /*
            r17 = this;
            r0 = r17
            r9 = r18
            r1 = r23
            boolean r2 = r1 instanceof defpackage.hw
            if (r2 == 0) goto L_0x001a
            r2 = r1
            hw r2 = (defpackage.hw) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.w0 = r3
        L_0x0018:
            r12 = r2
            goto L_0x0020
        L_0x001a:
            hw r2 = new hw
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r12.Y
            pu3 r13 = pu3.a
            int r2 = r12.w0
            r15 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r3) goto L_0x003b
            if (r2 != r15) goto L_0x0033
            wx3.H(r1)
            goto L_0x0153
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            i22 r0 = r12.X
            mw r2 = r12.o
            wx3.H(r1)
            r14 = r0
            r0 = r2
            goto L_0x0125
        L_0x0046:
            wx3.H(r1)
            java.lang.Object r1 = r0.i
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            long r4 = r0.a
            aw2 r1 = (defpackage.aw2) r1
            t0c r1 = r1.m(r4)
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            r11 = r1
            i22 r11 = (defpackage.i22) r11
            hw4 r1 = hw4.a
            if (r11 != 0) goto L_0x0083
            java.lang.String r2 = r0.b
            long r3 = r0.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "No chat="
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r3 = " in cache for loaded messages!"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            udd.U(r2, r0)
            return r1
        L_0x0083:
            java.lang.Long r2 = new java.lang.Long
            r4 = r21
            r2.<init>(r4)
            long r4 = r2.longValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r2 == 0) goto L_0x009d
            long r4 = r2.longValue()
            goto L_0x009f
        L_0x009d:
            r4 = -9223372036854775808
        L_0x009f:
            java.lang.String r2 = r0.b
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x00aa
        L_0x00a5:
            r14 = r19
            r16 = r1
            goto L_0x00f6
        L_0x00aa:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00a5
            tn7 r7 = defpackage.tn7.X
            java.lang.Long r8 = new java.lang.Long
            r14 = r19
            r8.<init>(r14)
            java.lang.String r8 = ez3.T(r8)
            java.lang.Object r10 = r0.d
            md4 r10 = (defpackage.md4) r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r16 = r1
            java.lang.String r1 = "getMessages: "
            r3.<init>(r1)
            r3.append(r8)
            java.lang.String r1 = ", \n                |count: "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", \n                |backwardTimeFrom: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = ", \n                |itemType: "
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = "\n                |"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = i0e.E(r1)
            r3 = 0
            r6.d(r7, r2, r1, r3)
        L_0x00f6:
            if (r9 <= 0) goto L_0x0156
            java.lang.Object r1 = r0.k
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            b29 r1 = (defpackage.b29) r1
            long r2 = r0.a
            java.lang.Object r6 = r0.d
            md4 r6 = (defpackage.md4) r6
            boolean r8 = r6.b()
            java.lang.Object r6 = r0.d
            r10 = r6
            md4 r10 = (defpackage.md4) r10
            r12.o = r0
            r12.X = r11
            r6 = 1
            r12.w0 = r6
            r6 = r19
            r9 = r18
            r14 = r11
            r11 = r12
            java.lang.Object r1 = r1.c(r2, r4, r6, r8, r9, r10, r11)
            if (r1 != r13) goto L_0x0125
            return r13
        L_0x0125:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = r0.b
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x012f
        L_0x012d:
            r6 = 0
            goto L_0x0145
        L_0x012f:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x012d
            tn7 r4 = defpackage.tn7.X
            int r5 = r1.size()
            java.lang.String r6 = "getForwardMessages: size="
            java.lang.String r5 = defpackage.wn6.h(r5, r6)
            r6 = 0
            r3.d(r4, r2, r5, r6)
        L_0x0145:
            r12.o = r6
            r12.X = r6
            r2 = 2
            r12.w0 = r2
            java.lang.Object r1 = r0.e(r14, r1, r12)
            if (r1 != r13) goto L_0x0153
            return r13
        L_0x0153:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0158
        L_0x0156:
            r1 = r16
        L_0x0158:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        if (r1.b.f(((defpackage.aqc) r0.f).a()) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0134 A[LOOP:1: B:39:0x012e->B:41:0x0134, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(defpackage.i22 r18, java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof defpackage.kw
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kw r3 = (defpackage.kw) r3
            int r4 = r3.x0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.x0 = r4
            goto L_0x001e
        L_0x0019:
            kw r3 = new kw
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Z
            pu3 r4 = pu3.a
            int r5 = r3.x0
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x004a
            if (r5 == r8) goto L_0x003a
            if (r5 != r7) goto L_0x0032
            wx3.H(r2)
            goto L_0x0155
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            java.util.List r0 = r3.Y
            i22 r1 = r3.X
            mw r5 = r3.o
            wx3.H(r2)
            r16 = r5
            r5 = r0
            r0 = r16
            goto L_0x010d
        L_0x004a:
            wx3.H(r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r5 = r19.size()
            r2.<init>(r5)
            java.lang.Object r5 = r0.e
            lh6 r5 = (defpackage.lh6) r5
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x0094
            java.io.Serializable r5 = r0.m
            r7e r5 = (r7e) r5
            java.lang.Object r5 = r5.getValue()
            r9 = r5
            sze r9 = (defpackage.sze) r9
            a6 r14 = new a6
            r5 = 2
            r14.<init>(r5, r0)
            l r15 = new l
            r5 = 10
            r15.<init>(r5, r2)
            u1c r11 = new u1c
            r5 = 22
            r11.<init>(r5)
            u1c r12 = new u1c
            r5 = 23
            r12.<init>(r5)
            u1c r13 = new u1c
            r5 = 24
            r13.<init>(r5)
            r10 = r19
            java.util.List r5 = r9.a(r10, r11, r12, r13, r14, r15)
            goto L_0x00b0
        L_0x0094:
            java.util.Iterator r5 = r19.iterator()
        L_0x0098:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00ae
            java.lang.Object r9 = r5.next()
            vo8 r9 = (defpackage.vo8) r9
            long r9 = r9.c
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r2.add(r9)
            goto L_0x0098
        L_0x00ae:
            r5 = r19
        L_0x00b0:
            o62 r9 = r1.b
            long r9 = r9.a
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00ca
            java.lang.Object r9 = r0.f
            aqc r9 = (defpackage.aqc) r9
            long r9 = r9.a()
            o62 r11 = r1.b
            boolean r9 = r11.f(r9)
            if (r9 == 0) goto L_0x00d7
        L_0x00ca:
            java.lang.Object r9 = r0.l
            t97 r9 = (t97) r9
            java.lang.Object r9 = r9.getValue()
            n86 r9 = (defpackage.n86) r9
            r9.a(r1, r2)
        L_0x00d7:
            java.lang.String r2 = r0.b
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x00de
            goto L_0x00f3
        L_0x00de:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00f3
            tn7 r10 = defpackage.tn7.X
            int r11 = r5.size()
            java.lang.String r12 = "getMessages: preprocessed messages of size="
            java.lang.String r11 = defpackage.wn6.h(r11, r12)
            r9.d(r10, r2, r11, r6)
        L_0x00f3:
            java.lang.Object r2 = r0.h
            t97 r2 = (t97) r2
            java.lang.Object r2 = r2.getValue()
            l3a r2 = (defpackage.l3a) r2
            r3.o = r0
            r3.X = r1
            r3.Y = r5
            r3.x0 = r8
            r2.g(r5)
            jue r2 = jue.a
            if (r2 != r4) goto L_0x010d
            return r4
        L_0x010d:
            java.lang.Object r2 = r0.c
            pae r2 = (defpackage.pae) r2
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            if (r2 != 0) goto L_0x011b
            hu3 r2 = r3.b
        L_0x011b:
            kotlinx.coroutines.internal.ContextScope r2 = n1g.a(r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = q23.H(r5, r9)
            r8.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x012e:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0146
            java.lang.Object r9 = r5.next()
            jw r10 = new jw
            r10.<init>(r9, r6, r0, r1)
            r9 = 3
            zc4 r9 = xs7.d(r2, r6, r10, r9)
            r8.add(r9)
            goto L_0x012e
        L_0x0146:
            r3.o = r6
            r3.X = r6
            r3.Y = r6
            r3.x0 = r7
            java.lang.Object r2 = lp.c(r8, r3)
            if (r2 != r4) goto L_0x0155
            return r4
        L_0x0155:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = o23.T(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw.e(i22, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.rr0
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rr0 r0 = (defpackage.rr0) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            rr0 r0 = new rr0
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            long r8 = r0.Y
            java.util.ArrayList r1 = r0.X
            mw r0 = r0.o
            wx3.H(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x009d
        L_0x0030:
            r8 = move-exception
            goto L_0x00e2
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            wx3.H(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0047:
            boolean r2 = r9.hasNext()
            r5 = 0
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r9.next()
            java.lang.Object r6 = r8.e     // Catch:{ all -> 0x005b }
            u16 r6 = (u16) r6     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r6.invoke(r2)     // Catch:{ all -> 0x005b }
            goto L_0x0062
        L_0x005b:
            r2 = move-exception
            kcc r6 = new kcc
            r6.<init>(r2)
            r2 = r6
        L_0x0062:
            java.lang.Throwable r6 = mcc.a(r2)
            if (r6 != 0) goto L_0x006a
            r5 = r2
            goto L_0x0071
        L_0x006a:
            java.lang.Object r2 = r8.g
            u16 r2 = (u16) r2
            r2.invoke(r6)
        L_0x0071:
            if (r5 == 0) goto L_0x0047
            r10.add(r5)
            goto L_0x0047
        L_0x0077:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x007e
            return r3
        L_0x007e:
            long r6 = java.lang.System.nanoTime()
            java.lang.Object r9 = r8.c     // Catch:{ all -> 0x00df }
            ju3 r9 = (ju3) r9     // Catch:{ all -> 0x00df }
            sr0 r2 = new sr0     // Catch:{ all -> 0x00df }
            r2.<init>(r8, r10, r5)     // Catch:{ all -> 0x00df }
            r0.o = r8     // Catch:{ all -> 0x00df }
            r0.X = r10     // Catch:{ all -> 0x00df }
            r0.Y = r6     // Catch:{ all -> 0x00df }
            r0.x0 = r4     // Catch:{ all -> 0x00df }
            java.lang.Object r9 = xs7.U(r9, r2, r0)     // Catch:{ all -> 0x00df }
            if (r9 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r0 = r8
            r1 = r10
            r8 = r6
        L_0x009d:
            boolean r10 = r1.isEmpty()     // Catch:{ all -> 0x0030 }
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x00e9
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0030 }
            long r4 = r4 - r8
            eq4 r8 = eq4.b     // Catch:{ all -> 0x0030 }
            long r8 = mt0.Q(r4, r8)     // Catch:{ all -> 0x0030 }
            long r8 = zp4.e(r8)     // Catch:{ all -> 0x0030 }
            java.lang.Object r10 = r0.h     // Catch:{ all -> 0x0030 }
            i26 r10 = (i26) r10     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r0.b     // Catch:{ all -> 0x0030 }
            int r1 = r1.size()     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = "inserted "
            r4.append(r5)     // Catch:{ all -> 0x0030 }
            r4.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = " items in "
            r4.append(r1)     // Catch:{ all -> 0x0030 }
            r4.append(r8)     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = "ms"
            r4.append(r8)     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0030 }
            r10.invoke(r2, r8)     // Catch:{ all -> 0x0030 }
            goto L_0x00e9
        L_0x00df:
            r9 = move-exception
            r0 = r8
            r8 = r9
        L_0x00e2:
            java.lang.Object r9 = r0.g
            u16 r9 = (u16) r9
            r9.invoke(r8)
        L_0x00e9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw.f(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public mw(ju3 ju3, ju3 ju32, long j2, xz6 xz6, gn7 gn7, dn7 dn7) {
        vg0 vg0 = new vg0(1);
        this.c = ju3;
        this.d = ju32;
        this.a = j2;
        this.e = xz6;
        this.f = gn7;
        this.g = dn7;
        this.h = vg0;
        this.b = "Buffer:".concat("LogController");
        ContextScope a2 = n1g.a(x87.c().plus(ju32));
        this.i = icd.b(1, 0, 2, 2);
        this.j = icd.b(0, Integer.MAX_VALUE, 2, 1);
        this.k = new AtomicBoolean(false);
        this.l = new ArrayList();
        this.m = new CopyOnWriteArrayList();
        xs7.E(a2, (hu3) null, (ru3) null, new vr0(this, (Continuation) null), 3);
    }
}
