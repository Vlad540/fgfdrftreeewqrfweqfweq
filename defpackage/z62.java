package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z62  reason: default package */
public final class z62 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z62(n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((rr4) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z62 z62 = new z62(this.Y, continuation);
        z62.X = obj;
        return z62;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r11.a((defpackage.es4) r10.j.getValue()) == true) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            wx3.H(r11)
            java.lang.Object r11 = r10.X
            rr4 r11 = (defpackage.rr4) r11
            n72 r10 = r10.Y
            k77[] r0 = defpackage.n72.E
            r10.getClass()
            x7b r0 = new x7b
            java.lang.String r2 = r11.a
            long r3 = r11.b
            java.lang.String r5 = r11.d
            java.lang.CharSequence r6 = r11.c
            grd r11 = r10.i
            java.lang.Object r11 = r11.getValue()
            rr4 r11 = (defpackage.rr4) r11
            r1 = 0
            if (r11 == 0) goto L_0x0033
            grd r7 = r10.j
            java.lang.Object r7 = r7.getValue()
            es4 r7 = (defpackage.es4) r7
            boolean r11 = r11.a(r7)
            r7 = 1
            if (r11 != r7) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r7 = r1
        L_0x0034:
            boolean r8 = r10.p
            r9 = 1
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            ur4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            grd r1 = r10.b
        L_0x0045:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            x7b r3 = (defpackage.x7b) r3
            boolean r2 = r1.b(r2, r0)
            if (r2 == 0) goto L_0x0045
            grd r2 = r10.c
        L_0x0054:
            java.lang.Object r10 = r2.getValue()
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r10 = r2.b(r10, r11)
            if (r10 == 0) goto L_0x0054
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z62.o(java.lang.Object):java.lang.Object");
    }
}
