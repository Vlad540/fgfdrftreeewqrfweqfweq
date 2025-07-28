package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: z72  reason: default package */
public final class z72 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ Collection Z;
    public final /* synthetic */ b92 w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z72(Set set, b92 b92, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = set;
        this.w0 = b92;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z72((Set) this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.Y
            r2 = 1
            b92 r3 = r10.w0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0028
            if (r1 == r2) goto L_0x0024
            if (r1 == r5) goto L_0x001e
            if (r1 != r4) goto L_0x0016
            wx3.H(r11)
            goto L_0x008d
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            b92 r3 = r10.X
            wx3.H(r11)
            goto L_0x007f
        L_0x0024:
            wx3.H(r11)
            goto L_0x006e
        L_0x0028:
            wx3.H(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.Collection r1 = r10.Z
            r6 = 10
            int r6 = q23.H(r1, r6)
            r11.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            z22 r7 = new z22
            long r8 = r10.x0
            r7.<init>(r8, r6)
            r11.add(r7)
            goto L_0x003c
        L_0x0053:
            java.lang.String r1 = defpackage.b92.O0
            udc r1 = r3.e()
            r10.Y = r2
            r1.getClass()
            uh r6 = new uh
            r7 = 22
            r6.<init>(r1, r7, r11)
            aec r11 = r1.a
            java.lang.Object r11 = r1g.h(r11, r6, r10)
            if (r11 != r0) goto L_0x006e
            return r0
        L_0x006e:
            java.lang.String r11 = defpackage.b92.O0
            udc r11 = r3.e()
            r10.X = r3
            r10.Y = r5
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L_0x007f
            return r0
        L_0x007f:
            java.util.List r11 = (java.util.List) r11
            r1 = 0
            r10.X = r1
            r10.Y = r4
            java.lang.Object r10 = defpackage.b92.j(r3, r11, r2, r10)
            if (r10 != r0) goto L_0x008d
            return r0
        L_0x008d:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z72.o(java.lang.Object):java.lang.Object");
    }
}
