package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* renamed from: d82  reason: default package */
public final class d82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ Collection w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d82(b92 b92, LinkedHashSet linkedHashSet, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = linkedHashSet;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d82(this.Z, (LinkedHashSet) this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r0 = pu3.a
            int r1 = r12.Y
            r2 = 1
            b92 r3 = r12.Z
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0023
            if (r1 == r5) goto L_0x001d
            if (r1 != r4) goto L_0x0015
            wx3.H(r13)
            goto L_0x006c
        L_0x0015:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001d:
            b92 r3 = r12.X
            wx3.H(r13)
            goto L_0x005e
        L_0x0023:
            wx3.H(r13)
            goto L_0x004d
        L_0x0027:
            wx3.H(r13)
            java.lang.String r13 = defpackage.b92.O0
            udc r13 = r3.e()
            r12.Y = r2
            r13.getClass()
            lm4 r1 = new lm4
            long r9 = r12.x0
            java.util.Collection r6 = r12.w0
            r8 = r6
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8
            r11 = 3
            r6 = r1
            r7 = r13
            r6.<init>((java.lang.Object) r7, (java.util.Collection) r8, (long) r9, (int) r11)
            aec r13 = r13.a
            java.lang.Object r13 = r1g.h(r13, r1, r12)
            if (r13 != r0) goto L_0x004d
            return r0
        L_0x004d:
            java.lang.String r13 = defpackage.b92.O0
            udc r13 = r3.e()
            r12.X = r3
            r12.Y = r5
            java.lang.Object r13 = r13.d(r12)
            if (r13 != r0) goto L_0x005e
            return r0
        L_0x005e:
            java.util.List r13 = (java.util.List) r13
            r1 = 0
            r12.X = r1
            r12.Y = r4
            java.lang.Object r12 = defpackage.b92.j(r3, r13, r2, r12)
            if (r12 != r0) goto L_0x006c
            return r0
        L_0x006c:
            jue r12 = jue.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d82.o(java.lang.Object):java.lang.Object");
    }
}
