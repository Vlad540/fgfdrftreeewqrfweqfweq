package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xy8  reason: default package */
public final class xy8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ zz8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xy8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.w0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xy8 xy8 = new xy8(this.w0, this.Z, continuation);
        xy8.Y = obj;
        return xy8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.X
            jue r2 = jue.a
            r3 = 2
            r4 = 0
            r5 = 3
            r6 = 1
            zz8 r7 = r11.w0
            if (r1 == 0) goto L_0x002d
            if (r1 == r6) goto L_0x0025
            if (r1 == r3) goto L_0x0021
            if (r1 != r5) goto L_0x0019
            wx3.H(r12)
            goto L_0x009c
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0021:
            wx3.H(r12)
            goto L_0x0071
        L_0x0025:
            java.lang.Object r1 = r11.Y
            yc4 r1 = (yc4) r1
            wx3.H(r12)
            goto L_0x0066
        L_0x002d:
            wx3.H(r12)
            java.lang.Object r12 = r11.Y
            ou3 r12 = (ou3) r12
            java.util.List r1 = r11.Z
            java.lang.Object r1 = o23.X(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x009c
            long r8 = r1.longValue()
            pae r1 = r7.Y
            n3a r1 = (n3a) r1
            ju3 r1 = r1.b()
            wy8 r10 = new wy8
            r10.<init>(r7, r8, r4)
            zc4 r1 = xs7.d(r12, r1, r10, r3)
            t97 r12 = r7.P0
            java.lang.Object r12 = r12.getValue()
            cr8 r12 = (defpackage.cr8) r12
            r11.Y = r1
            r11.X = r6
            java.lang.Object r12 = r12.a(r8, r11)
            if (r12 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r11.Y = r4
            r11.X = r3
            java.lang.Object r12 = r1.a(r11)
            if (r12 != r0) goto L_0x0071
            return r0
        L_0x0071:
            vo8 r12 = (defpackage.vo8) r12
            if (r12 == 0) goto L_0x009c
            r11.X = r5
            k77[] r1 = defpackage.zz8.I1
            r7.getClass()
            long r3 = r12.o
            r5 = 1
            long r3 = r3 - r5
            l05 r12 = r7.z1
            r12.getClass()
            yue r1 = new yue
            r1.<init>(r3)
            lc9 r12 = r12.b
            java.lang.Object r11 = r12.a(r1, r11)
            if (r11 != r0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r11 = r2
        L_0x0095:
            if (r11 != r0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r11 = r2
        L_0x0099:
            if (r11 != r0) goto L_0x009c
            return r0
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy8.o(java.lang.Object):java.lang.Object");
    }
}
