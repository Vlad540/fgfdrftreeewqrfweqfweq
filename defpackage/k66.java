package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: k66  reason: default package */
public final class k66 extends l5e implements i26 {
    public List X;
    public m66 Y;
    public Collection Z;
    public Iterator w0;
    public int x0;
    public final /* synthetic */ m66 y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k66(m66 m66, List list, Continuation continuation) {
        super(2, continuation);
        this.y0 = m66;
        this.z0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k66(this.y0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            pu3 r1 = pu3.a
            int r2 = r9.x0
            r3 = 0
            r4 = 1
            m66 r5 = r9.y0
            if (r2 == 0) goto L_0x0028
            if (r2 == r4) goto L_0x0024
            if (r2 != r0) goto L_0x001c
            java.util.Iterator r2 = r9.w0
            java.util.Collection r4 = r9.Z
            m66 r5 = r9.Y
            java.util.List r6 = r9.X
            wx3.H(r10)
            goto L_0x00a1
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0024:
            wx3.H(r10)
            goto L_0x0056
        L_0x0028:
            wx3.H(r10)
            q46 r10 = r5.b
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x005b
            grd r10 = r5.S0
            java.lang.Object r10 = r10.getValue()
            owc r2 = defpackage.owc.a
            if (r10 != r2) goto L_0x005b
            grd r10 = r5.S0
            r9.x0 = r4
            ik5 r2 = new ik5
            r2.<init>(r10, r0)
            ik5 r10 = new ik5
            r4 = 5
            r10.<init>(r2, r4)
            java.lang.Object r10 = ez3.D(r10, r9)
            if (r10 != r1) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            jue r10 = jue.a
        L_0x0053:
            if (r10 != r1) goto L_0x0056
            return r1
        L_0x0056:
            grd r10 = r5.S0
            r10.setValue(r3)
        L_0x005b:
            pwc r10 = r5.J0
            r10.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r10 = r10.a
            r2.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r4 = r9.z0
            java.util.Iterator r4 = r4.iterator()
            r6 = r2
            r2 = r4
            r4 = r10
        L_0x0075:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00a9
            java.lang.Object r10 = r2.next()
            yk7 r10 = (defpackage.yk7) r10
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            r9.w0 = r2
            r9.x0 = r0
            pae r7 = r5.s()
            n3a r7 = (n3a) r7
            ju3 r7 = r7.e()
            j66 r8 = new j66
            r8.<init>(r5, r10, r6, r3)
            java.lang.Object r10 = xs7.U(r7, r8, r9)
            if (r10 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            h56 r10 = (defpackage.h56) r10
            if (r10 == 0) goto L_0x0075
            r4.add(r10)
            goto L_0x0075
        L_0x00a9:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k66.o(java.lang.Object):java.lang.Object");
    }
}
