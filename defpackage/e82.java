package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e82  reason: default package */
public final class e82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ List x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e82(b92 b92, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = str;
        this.x0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e82(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.Y
            r2 = 1
            b92 r3 = r8.Z
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0023
            if (r1 == r5) goto L_0x001d
            if (r1 != r4) goto L_0x0015
            wx3.H(r9)
            goto L_0x0066
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001d:
            b92 r3 = r8.X
            wx3.H(r9)
            goto L_0x0058
        L_0x0023:
            wx3.H(r9)
            goto L_0x0047
        L_0x0027:
            wx3.H(r9)
            java.lang.String r9 = defpackage.b92.O0
            udc r9 = r3.e()
            r8.Y = r2
            r9.getClass()
            d25 r1 = new d25
            java.util.List r6 = r8.x0
            java.lang.String r7 = r8.w0
            r1.<init>((defpackage.udc) r9, (java.util.List) r6, (java.lang.String) r7)
            aec r9 = r9.a
            java.lang.Object r9 = r1g.h(r9, r1, r8)
            if (r9 != r0) goto L_0x0047
            return r0
        L_0x0047:
            java.lang.String r9 = defpackage.b92.O0
            udc r9 = r3.e()
            r8.X = r3
            r8.Y = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.util.List r9 = (java.util.List) r9
            r1 = 0
            r8.X = r1
            r8.Y = r4
            java.lang.Object r8 = defpackage.b92.j(r3, r9, r2, r8)
            if (r8 != r0) goto L_0x0066
            return r0
        L_0x0066:
            jue r8 = jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e82.o(java.lang.Object):java.lang.Object");
    }
}
