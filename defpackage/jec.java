package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: jec  reason: default package */
public final class jec extends l5e implements i26 {
    public nec X;
    public Collection Y;
    public Iterator Z;
    public Collection w0;
    public int x0;
    public final /* synthetic */ nec y0;
    public final /* synthetic */ Collection z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jec(nec nec, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.y0 = nec;
        this.z0 = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jec(this.y0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.x0
            r2 = 1
            nec r3 = r8.y0
            r4 = 2
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0023
            if (r1 != r4) goto L_0x001b
            java.util.Collection r1 = r8.w0
            java.util.Iterator r2 = r8.Z
            java.util.Collection r3 = r8.Y
            nec r5 = r8.X
            wx3.H(r9)
            goto L_0x00b8
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0023:
            wx3.H(r9)
            goto L_0x0087
        L_0x0027:
            wx3.H(r9)
            cw8 r9 = r3.d()
            r8.x0 = r2
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r5)
            java.util.Collection r5 = r8.z0
            int r6 = r5.size()
            a06.e(r1, r6)
            java.lang.String r7 = ")"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            pec r1 = pec.a(r6, r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0057:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r5.next()
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L_0x0069
            r1.W(r2)
            goto L_0x0070
        L_0x0069:
            long r6 = r6.longValue()
            r1.j(r2, r6)
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0073:
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            aw8 r5 = new aw8
            r6 = 1
            r5.<init>(r9, r1, r6)
            aec r9 = r9.a
            java.lang.Object r9 = r1g.g(r9, r2, r5, r8)
            if (r9 != r0) goto L_0x0087
            return r0
        L_0x0087:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L_0x0099:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00c0
            java.lang.Object r9 = r2.next()
            jp8 r9 = (defpackage.jp8) r9
            r8.X = r3
            r8.Y = r1
            r8.Z = r2
            r8.w0 = r1
            r8.x0 = r4
            java.lang.Object r9 = r3.h(r9, r8)
            if (r9 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            r5 = r3
            r3 = r1
        L_0x00b8:
            vo8 r9 = (defpackage.vo8) r9
            r1.add(r9)
            r1 = r3
            r3 = r5
            goto L_0x0099
        L_0x00c0:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jec.o(java.lang.Object):java.lang.Object");
    }
}
