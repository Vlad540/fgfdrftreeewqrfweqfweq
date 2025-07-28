package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zcb  reason: default package */
public final class zcb extends l5e implements i26 {
    public vcb X;
    public int Y;
    public final /* synthetic */ jdb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zcb(jdb jdb, Continuation continuation) {
        super(2, continuation);
        this.Z = jdb;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return n(bool, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zcb(this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.Y
            jue r2 = jue.a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            jdb r7 = r10.Z
            if (r1 == 0) goto L_0x002a
            if (r1 == r6) goto L_0x0024
            if (r1 == r5) goto L_0x0020
            if (r1 != r4) goto L_0x0018
            wx3.H(r11)
            goto L_0x0081
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            wx3.H(r11)
            goto L_0x0063
        L_0x0024:
            vcb r1 = r10.X
            wx3.H(r11)
            goto L_0x0058
        L_0x002a:
            wx3.H(r11)
            t97 r11 = r7.c
            java.lang.Object r11 = r11.getValue()
            bv2 r11 = (defpackage.bv2) r11
            long r8 = r7.b
            aw2 r11 = (defpackage.aw2) r11
            t0c r11 = r11.m(r8)
            zqd r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            i22 r11 = (defpackage.i22) r11
            if (r11 == 0) goto L_0x0081
            vcb r1 = defpackage.jdb.r(r7, r11)
            r10.X = r1
            r10.Y = r6
            r8 = 200(0xc8, double:9.9E-322)
            java.lang.Object r11 = defpackage.ek8.q(r8, r10)
            if (r11 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r10.X = r3
            r10.Y = r5
            java.lang.Object r11 = defpackage.jdb.q(r7, r1, r10)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            k77[] r11 = defpackage.jdb.F0
            t97 r11 = r7.o
            java.lang.Object r11 = r11.getValue()
            pae r11 = (defpackage.pae) r11
            n3a r11 = (n3a) r11
            zr7 r11 = r11.c()
            ycb r1 = new ycb
            r1.<init>(r7, r3)
            r10.Y = r4
            java.lang.Object r10 = xs7.U(r11, r1, r10)
            if (r10 != r0) goto L_0x0081
            return r0
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcb.o(java.lang.Object):java.lang.Object");
    }
}
