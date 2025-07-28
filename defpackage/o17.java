package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o17  reason: default package */
public final class o17 extends l5e implements i26 {
    public String X;
    public int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ r17 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o17(r17 r17, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.w0 = str2;
        this.x0 = r17;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o17) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o17(this.x0, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r10.Y
            jue r2 = defpackage.jue.a
            r3 = 3
            r4 = 2
            r5 = 1
            r17 r6 = r10.x0
            if (r1 == 0) goto L_0x002a
            if (r1 == r5) goto L_0x0024
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            defpackage.wx3.H(r11)
            goto L_0x0093
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            defpackage.wx3.H(r11)
            goto L_0x0078
        L_0x0024:
            java.lang.String r1 = r10.X
            defpackage.wx3.H(r11)
            goto L_0x005b
        L_0x002a:
            defpackage.wx3.H(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r10.Z
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            java.lang.String r1 = r10.w0
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            p7c r7 = r6.C0
            java.lang.String r8 = ""
            java.lang.String r11 = r7.b(r8, r11)
            r10.X = r11
            r10.Y = r5
            java.lang.Object r1 = defpackage.r17.q(r6, r11, r1, r10)
            if (r1 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x005b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x0064
            return r2
        L_0x0064:
            t97 r11 = r6.c
            java.lang.Object r11 = r11.getValue()
            u76 r11 = (defpackage.u76) r11
            r5 = 0
            r10.X = r5
            r10.Y = r4
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L_0x0078
            return r0
        L_0x0078:
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L_0x00b0
            long r4 = r11.longValue()
            t97 r11 = r6.o
            java.lang.Object r11 = r11.getValue()
            bv2 r11 = (bv2) r11
            r10.Y = r3
            aw2 r11 = (aw2) r11
            java.lang.Object r11 = r11.u(r4, r10)
            if (r11 != r0) goto L_0x0093
            return r0
        L_0x0093:
            i22 r11 = (i22) r11
            if (r11 == 0) goto L_0x00b0
            l05 r10 = r6.Z
            z07 r0 = defpackage.z07.c
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r0.<init>(r1)
            long r3 = r11.a
            java.lang.String r11 = "&type=local"
            java.lang.String r11 = wn6.k(r0, r3, r11)
            rf0.j(r11, r10)
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o17.o(java.lang.Object):java.lang.Object");
    }
}
