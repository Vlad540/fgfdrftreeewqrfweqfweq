package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: va5  reason: default package */
public final class va5 extends l5e implements i26 {
    public List X;
    public int Y;
    public final /* synthetic */ ab5 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ zb9 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public va5(ab5 ab5, long j, zb9 zb9, Continuation continuation) {
        super(2, continuation);
        this.Z = ab5;
        this.w0 = j;
        this.x0 = zb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new va5(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.Y
            r2 = 3
            r3 = 2
            r4 = 1
            ab5 r5 = r11.Z
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.util.List r11 = r11.X
            wx3.H(r12)
            goto L_0x00c5
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0020:
            java.util.List r1 = r11.X
            wx3.H(r12)
            goto L_0x0086
        L_0x0026:
            wx3.H(r12)
            goto L_0x0046
        L_0x002a:
            wx3.H(r12)
            r11.Y = r4
            pae r12 = r5.X
            n3a r12 = (n3a) r12
            ju3 r12 = r12.b()
            wa5 r1 = new wa5
            r4 = 0
            long r6 = r11.w0
            r1.<init>(r5, r6, r4)
            java.lang.Object r12 = xs7.U(r12, r1, r11)
            if (r12 != r0) goto L_0x0046
            return r0
        L_0x0046:
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r12 = new java.util.ArrayList
            r4 = 10
            int r4 = q23.H(r1, r4)
            r12.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x0058:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x006f
            java.lang.Object r6 = r4.next()
            cb5 r6 = (defpackage.cb5) r6
            long r6 = r6.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            r12.add(r8)
            goto L_0x0058
        L_0x006f:
            zb9 r12 = lp.V(r12)
            java.util.ArrayList r12 = lp.U(r12)
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.X = r1
            r11.Y = r3
            java.lang.Object r12 = defpackage.ab5.q(r5, r12, r11)
            if (r12 != r0) goto L_0x0086
            return r0
        L_0x0086:
            xb9 r12 = (xb9) r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0091:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b7
            java.lang.Object r4 = r1.next()
            r6 = r4
            cb5 r6 = (defpackage.cb5) r6
            long r7 = r6.a
            int r7 = r12.b(r7)
            if (r7 < 0) goto L_0x00ab
            long[] r8 = r12.c
            r7 = r8[r7]
            goto L_0x00ad
        L_0x00ab:
            r7 = -9223372036854775808
        L_0x00ad:
            long r9 = r6.g
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0091
            r3.add(r4)
            goto L_0x0091
        L_0x00b7:
            r11.X = r3
            r11.Y = r2
            zb9 r12 = r11.x0
            java.io.Serializable r12 = defpackage.ab5.p(r5, r3, r12, r11)
            if (r12 != r0) goto L_0x00c4
            return r0
        L_0x00c4:
            r11 = r3
        L_0x00c5:
            java.util.Map r12 = (java.util.Map) r12
            ui2 r0 = new ui2
            int r11 = r11.size()
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va5.o(java.lang.Object):java.lang.Object");
    }
}
