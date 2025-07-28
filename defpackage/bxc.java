package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: bxc  reason: default package */
public final class bxc extends l5e implements i26 {
    public Set X;
    public j54 Y;
    public Iterator Z;
    public int w0;
    public final /* synthetic */ j54 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxc(j54 j54, Continuation continuation) {
        super(2, continuation);
        this.x0 = j54;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bxc) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bxc(this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r9.w0
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.util.Iterator r1 = r9.Z
            j54 r3 = r9.Y
            java.util.Set r4 = r9.X
            defpackage.wx3.H(r10)
            goto L_0x0080
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001b:
            defpackage.wx3.H(r10)
            j54 r10 = r9.x0
            java.lang.Object r1 = r10.X
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
            r3 = r10
        L_0x0035:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00a8
            java.lang.Object r10 = r1.next()
            zta r10 = (defpackage.zta) r10
            yta r5 = r10.b
            yta r6 = defpackage.yta.a
            long r7 = r10.a
            if (r5 == r6) goto L_0x0094
            java.lang.Object r10 = r3.a
            t97 r10 = (defpackage.t97) r10
            if (r10 != 0) goto L_0x0050
            goto L_0x0094
        L_0x0050:
            yta r10 = defpackage.yta.b
            if (r5 != r10) goto L_0x008e
            java.lang.Object r10 = r3.c
            t97 r10 = (defpackage.t97) r10
            java.lang.Object r10 = r10.getValue()
            f03 r10 = (f03) r10
            lqc r10 = (lqc) r10
            long r5 = r10.s()
            long r5 = r5 ^ r7
            java.lang.Object r10 = r3.a
            t97 r10 = (defpackage.t97) r10
            java.lang.Object r10 = r10.getValue()
            bv2 r10 = (bv2) r10
            r9.X = r4
            r9.Y = r3
            r9.Z = r1
            r9.w0 = r2
            aw2 r10 = (aw2) r10
            java.lang.Object r10 = r10.u(r5, r9)
            if (r10 != r0) goto L_0x0080
            return r0
        L_0x0080:
            i22 r10 = (i22) r10
            if (r10 == 0) goto L_0x008c
            java.lang.Long r5 = new java.lang.Long
            long r6 = r10.a
            r5.<init>(r6)
            goto L_0x0099
        L_0x008c:
            r5 = 0
            goto L_0x0099
        L_0x008e:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
            goto L_0x0099
        L_0x0094:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
        L_0x0099:
            if (r5 == 0) goto L_0x0035
            long r5 = r5.longValue()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r4.add(r10)
            goto L_0x0035
        L_0x00a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxc.o(java.lang.Object):java.lang.Object");
    }
}
