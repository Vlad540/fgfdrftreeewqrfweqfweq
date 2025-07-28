package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: f6d  reason: default package */
public final class f6d extends l5e implements i26 {
    public final /* synthetic */ k6d A0;
    public final /* synthetic */ t97 B0;
    public Iterator X;
    public Long Y;
    public k6d Z;
    public ht7 w0;
    public ht7 x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f6d(k6d k6d, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.A0 = k6d;
        this.B0 = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wn0) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f6d f6d = new f6d(this.A0, this.B0, continuation);
        f6d.z0 = obj;
        return f6d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            pu3 r1 = pu3.a
            int r2 = r0.y0
            jue r3 = jue.a
            r4 = 2
            r5 = 1
            k6d r6 = r0.A0
            if (r2 == 0) goto L_0x0038
            if (r2 == r5) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            wx3.H(r20)
            goto L_0x0149
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            ht7 r2 = r0.x0
            ht7 r4 = r0.w0
            k6d r7 = r0.Z
            java.lang.Long r8 = r0.Y
            java.util.Iterator r9 = r0.X
            java.lang.Object r10 = r0.z0
            wn0 r10 = (defpackage.wn0) r10
            wx3.H(r20)
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r4
            r4 = r20
            goto L_0x009c
        L_0x0038:
            wx3.H(r20)
            java.lang.Object r2 = r0.z0
            wn0 r2 = (defpackage.wn0) r2
            boolean r7 = r2 instanceof defpackage.tn0
            r8 = 0
            if (r7 == 0) goto L_0x0109
            r6.z0 = r8
            r4 = r2
            tn0 r4 = (defpackage.tn0) r4
            ik3 r4 = r4.a
            java.util.List r4 = r4.X
            java.util.Iterator r4 = r4.iterator()
            r10 = r2
            r9 = r4
        L_0x0053:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r9.next()
            r8 = r2
            java.lang.Long r8 = (java.lang.Long) r8
            ht7 r2 = new ht7
            r2.<init>()
            grd r4 = r6.x0
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = (java.util.Map) r4
            r2.putAll(r4)
            boolean r4 = r2.containsKey(r8)
            if (r4 != 0) goto L_0x00c9
            t97 r4 = r0.B0
            java.lang.Object r4 = r4.getValue()
            ap3 r4 = (defpackage.ap3) r4
            long r11 = r8.longValue()
            r0.z0 = r10
            r0.X = r9
            r0.Y = r8
            r0.Z = r6
            r0.w0 = r2
            r0.x0 = r2
            r0.y0 = r5
            java.lang.Comparable r4 = r4.b(r11, r0)
            if (r4 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r7 = r2
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r6
        L_0x009c:
            tf3 r4 = (defpackage.tf3) r4
            if (r4 == 0) goto L_0x00c6
            k77[] r12 = defpackage.k6d.D0
            r8.getClass()
            sn0 r8 = new sn0
            long r14 = r4.n()
            fj0 r12 = defpackage.fj0.b
            java.lang.String r16 = r4.p(r12)
            java.lang.String r12 = r4.d()
            if (r12 != 0) goto L_0x00b9
            java.lang.String r12 = ""
        L_0x00b9:
            r17 = r12
            java.lang.CharSequence r18 = r4.m()
            r13 = r8
            r13.<init>(r14, r16, r17, r18)
            r2.put(r9, r8)
        L_0x00c6:
            r2 = r7
            r9 = r10
            goto L_0x00ca
        L_0x00c9:
            r11 = r10
        L_0x00ca:
            ht7 r2 = r2.b()
            grd r4 = r6.x0
        L_0x00d0:
            java.lang.Object r7 = r4.getValue()
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            boolean r7 = r4.b(r7, r2)
            if (r7 == 0) goto L_0x00d0
            r10 = r11
            goto L_0x0053
        L_0x00e0:
            int r0 = r6.A0
            tn0 r10 = (defpackage.tn0) r10
            ik3 r1 = r10.a
            java.util.List r1 = r1.X
            int r1 = r1.size()
            int r1 = r1 + r0
            r6.A0 = r1
            ik3 r0 = r10.a
            java.util.List r1 = r0.X
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0103
            java.util.List r0 = r0.X
            int r0 = r0.size()
            r1 = 40
            if (r0 >= r1) goto L_0x0149
        L_0x0103:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r6.A0 = r0
            goto L_0x0149
        L_0x0109:
            boolean r5 = r2 instanceof defpackage.un0
            if (r5 == 0) goto L_0x012d
            r0.y0 = r4
            t97 r2 = r6.w0
            java.lang.Object r2 = r2.getValue()
            pae r2 = (defpackage.pae) r2
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            h6d r4 = new h6d
            r4.<init>(r6, r8)
            java.lang.Object r0 = xs7.U(r2, r4, r0)
            if (r0 != r1) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r0 = r3
        L_0x012a:
            if (r0 != r1) goto L_0x0149
            return r1
        L_0x012d:
            boolean r0 = r2 instanceof defpackage.vn0
            if (r0 == 0) goto L_0x014a
            vn0 r2 = (defpackage.vn0) r2
            long r0 = r2.a
            java.lang.Long r2 = r6.z0
            if (r2 != 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            long r4 = r2.longValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0149
            r6.z0 = r8
            int r0 = r6.A0
            r6.q(r0)
        L_0x0149:
            return r3
        L_0x014a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6d.o(java.lang.Object):java.lang.Object");
    }
}
