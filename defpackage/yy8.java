package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yy8  reason: default package */
public final class yy8 extends l5e implements i26 {
    public i22 X;
    public int Y;
    public final /* synthetic */ zz8 Z;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yy8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = zz8;
        this.w0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yy8(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.Y
            jue r2 = jue.a
            r3 = 1
            r4 = 0
            java.util.List r5 = r11.w0
            zz8 r6 = r11.Z
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            i22 r11 = r11.X
            wx3.H(r12)
            goto L_0x0054
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001e:
            wx3.H(r12)
            t0c r12 = r6.r1
            zqd r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            i22 r12 = (defpackage.i22) r12
            if (r12 != 0) goto L_0x002e
            return r2
        L_0x002e:
            f03 r1 = r6.D0
            lqc r1 = (defpackage.lqc) r1
            long r7 = r1.s()
            o62 r1 = r12.b
            boolean r1 = r1.f(r7)
            if (r1 != 0) goto L_0x005f
            t97 r1 = r6.K0
            java.lang.Object r1 = r1.getValue()
            gn8 r1 = (defpackage.gn8) r1
            r11.X = r12
            r11.Y = r3
            java.lang.Object r11 = r1.a(r5, r11)
            if (r11 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x0054:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x005e
            r12 = r3
            goto L_0x0061
        L_0x005e:
            r12 = r11
        L_0x005f:
            r11 = r12
            r12 = r4
        L_0x0061:
            k77[] r0 = defpackage.zz8.I1
            t97 r0 = r6.K0
            java.lang.Object r0 = r0.getValue()
            gn8 r0 = (defpackage.gn8) r0
            r0.getClass()
            boolean r0 = r11.b0()
            if (r0 != 0) goto L_0x0076
        L_0x0074:
            r11 = r4
            goto L_0x007e
        L_0x0076:
            boolean r11 = r11.G()
            if (r11 == 0) goto L_0x007d
            goto L_0x0074
        L_0x007d:
            r11 = r3
        L_0x007e:
            kc3 r0 = defpackage.an8.a
            int r0 = r5.size()
            int r1 = defpackage.b7a.b
            dge r7 = new dge
            r7.<init>(r1, r0)
            lg7 r0 = hwf.c()
            if (r11 == 0) goto L_0x00a2
            kc3 r11 = new kc3
            int r1 = defpackage.a7a.m
            int r8 = defpackage.c7a.F
            hge r9 = new hge
            r9.<init>(r8)
            r11.<init>(r1, r9, r3, r4)
            r0.add(r11)
        L_0x00a2:
            if (r12 == 0) goto L_0x00b5
            kc3 r11 = new kc3
            int r12 = defpackage.a7a.n
            int r1 = defpackage.c7a.E
            hge r8 = new hge
            r8.<init>(r1)
            r11.<init>(r12, r8, r3, r4)
            r0.add(r11)
        L_0x00b5:
            kc3 r11 = defpackage.an8.a
            r0.add(r11)
            lg7 r11 = hwf.a(r0)
            ded r12 = new ded
            r0 = 0
            r12.<init>(r5, r7, r0, r11)
            l05 r11 = r6.y1
            defpackage.taf.o(r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy8.o(java.lang.Object):java.lang.Object");
    }
}
