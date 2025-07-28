package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: vdd  reason: default package */
public final class vdd extends l5e implements i26 {
    public ArrayList X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ ydd x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vdd(ydd ydd, Continuation continuation) {
        super(2, continuation);
        this.x0 = ydd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vdd) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vdd vdd = new vdd(this.x0, continuation);
        vdd.w0 = obj;
        return vdd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r9.Z
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.util.Iterator r1 = r9.Y
            java.util.ArrayList r4 = r9.X
            java.lang.Object r5 = r9.w0
            ou3 r5 = (defpackage.ou3) r5
            defpackage.wx3.H(r10)
            goto L_0x009e
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0022:
            java.util.ArrayList r1 = r9.X
            java.lang.Object r4 = r9.w0
            ou3 r4 = (defpackage.ou3) r4
            defpackage.wx3.H(r10)
            goto L_0x0065
        L_0x002c:
            defpackage.wx3.H(r10)
            java.lang.Object r10 = r9.w0
            ou3 r10 = (defpackage.ou3) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ydd r5 = r9.x0
            r7e r5 = r5.x0
            java.lang.Object r5 = r5.getValue()
            sdd r5 = (defpackage.sdd) r5
            r1.add(r5)
            ydd r5 = r9.x0
            t97 r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            bv2 r5 = (bv2) r5
            r9.w0 = r10
            r9.X = r1
            r9.Z = r4
            aw2 r5 = (aw2) r5
            t52 r4 = r5.l()
            java.util.ArrayList r4 = r4.w(r2)
            if (r4 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r8 = r4
            r4 = r10
            r10 = r8
        L_0x0065:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            yz r5 = t52.I
            java.util.List r10 = defpackage.o23.m0(r10, r5)
            defpackage.n1g.k(r4)
            java.util.Iterator r10 = r10.iterator()
            r5 = r4
            r4 = r1
            r1 = r10
        L_0x0077:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00a6
            java.lang.Object r10 = r1.next()
            i22 r10 = (i22) r10
            int r6 = r4.size()
            r7 = 5
            if (r6 >= r7) goto L_0x00a6
            defpackage.n1g.k(r5)
            ydd r6 = r9.x0
            r9.w0 = r5
            r9.X = r4
            r9.Y = r1
            r9.Z = r3
            java.lang.Object r10 = defpackage.ydd.b(r6, r10, r9)
            if (r10 != r0) goto L_0x009e
            return r0
        L_0x009e:
            sdd r10 = (defpackage.sdd) r10
            if (r10 == 0) goto L_0x0077
            r4.add(r10)
            goto L_0x0077
        L_0x00a6:
            ydd r9 = r9.x0
            java.lang.String r9 = r9.y0
            fn6 r10 = defpackage.udd.e
            if (r10 != 0) goto L_0x00af
            goto L_0x00c4
        L_0x00af:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x00c4
            tn7 r0 = tn7.X
            int r1 = r4.size()
            java.lang.String r3 = "buildShortcuts: result size: "
            java.lang.String r1 = wn6.h(r1, r3)
            r10.d(r0, r9, r1, r2)
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdd.o(java.lang.Object):java.lang.Object");
    }
}
