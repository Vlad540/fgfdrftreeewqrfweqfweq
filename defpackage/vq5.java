package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: vq5  reason: default package */
public final class vq5 extends l5e implements i26 {
    public Set X;
    public int Y;
    public final /* synthetic */ wq5 Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq5(wq5 wq5, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = wq5;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vq5(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r12.Y
            jue r2 = defpackage.jue.a
            r3 = 3
            r4 = 2
            wq5 r5 = r12.Z
            r9 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r9) goto L_0x0025
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            defpackage.wx3.H(r13)
            goto L_0x0080
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001f:
            java.util.Set r1 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x006d
        L_0x0025:
            defpackage.wx3.H(r13)
            goto L_0x0037
        L_0x0029:
            defpackage.wx3.H(r13)
            j54 r13 = r5.a
            r12.Y = r9
            java.lang.Object r13 = r13.F(r12)
            if (r13 != r0) goto L_0x0037
            return r0
        L_0x0037:
            r1 = r13
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r10 = r12.w0
            boolean r13 = defpackage.h0e.c0(r10)
            r13 = r13 ^ r9
            if (r13 == 0) goto L_0x006d
            t97 r13 = r5.b
            java.lang.Object r13 = r13.getValue()
            v72 r13 = (v72) r13
            java.util.List r7 = defpackage.o23.s0(r1)
            r12.X = r1
            r12.Y = r4
            b92 r13 = (b92) r13
            r13.getClass()
            a82 r4 = new a82
            r11 = 0
            r6 = r4
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            hu3 r13 = r13.Y
            java.lang.Object r13 = defpackage.xs7.U(r13, r4, r12)
            if (r13 != r0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r13 = r2
        L_0x006a:
            if (r13 != r0) goto L_0x006d
            return r0
        L_0x006d:
            hcd r13 = r5.d
            uq5 r4 = new uq5
            r4.<init>(r1)
            r1 = 0
            r12.X = r1
            r12.Y = r3
            java.lang.Object r12 = r13.a(r4, r12)
            if (r12 != r0) goto L_0x0080
            return r0
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq5.o(java.lang.Object):java.lang.Object");
    }
}
