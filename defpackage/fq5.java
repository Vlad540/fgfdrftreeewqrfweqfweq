package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: fq5  reason: default package */
public final class fq5 extends l5e implements i26 {
    public ep5 X;
    public Set Y;
    public ArrayList Z;
    public int w0;
    public final /* synthetic */ rq5 x0;
    public final /* synthetic */ t97 y0;
    public final /* synthetic */ t97 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq5(rq5 rq5, t97 t97, t97 t972, Continuation continuation) {
        super(2, continuation);
        this.x0 = rq5;
        this.y0 = t97;
        this.z0 = t972;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fq5(this.x0, this.y0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = 0
            r2 = 2
            r3 = 1
            pu3 r4 = defpackage.pu3.a
            int r5 = r0.w0
            jue r6 = defpackage.jue.a
            r7 = 0
            if (r5 == 0) goto L_0x002e
            if (r5 == r3) goto L_0x0028
            if (r5 != r2) goto L_0x0020
            java.util.ArrayList r2 = r0.Z
            java.util.Set r4 = r0.Y
            ep5 r5 = r0.X
            defpackage.wx3.H(r26)
            r9 = r2
            r2 = r26
            goto L_0x00e5
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            defpackage.wx3.H(r26)
            r5 = r26
            goto L_0x0042
        L_0x002e:
            defpackage.wx3.H(r26)
            rq5 r5 = r0.x0
            v72 r8 = r5.X
            java.lang.String r5 = r5.b
            r0.w0 = r3
            b92 r8 = (b92) r8
            java.lang.Object r5 = r8.d(r5, r0)
            if (r5 != r4) goto L_0x0042
            return r4
        L_0x0042:
            ep5 r5 = (ep5) r5
            if (r5 != 0) goto L_0x0053
            rq5 r0 = r0.x0
            grd r0 = r0.x0
            bq5 r1 = new bq5
            r1.<init>()
            r0.m(r7, r1)
            return r6
        L_0x0053:
            rq5 r8 = r0.x0
            r8.E0 = r5
            t97 r8 = r0.y0
            java.lang.Object r8 = r8.getValue()
            v6a r8 = (defpackage.v6a) r8
            java.lang.CharSequence r9 = r5.b
            java.util.List r10 = r5.C0
            java.lang.CharSequence r8 = r8.a(r9, r10, 2, false, 0, true)
            rq5 r9 = r0.x0
            grd r10 = r9.x0
            cq5 r11 = new cq5
            java.lang.String r9 = r9.b
            r12 = 4
            r11.<init>((java.lang.String) r9, (java.lang.CharSequence) r8, (int) r12)
            r10.m(r7, r11)
            wp5 r9 = new wp5
            lge r10 = new lge
            r10.<init>(r8)
            java.util.Set r8 = r5.G0
            fr5 r11 = fr5.o
            boolean r8 = r8.contains(r11)
            r8 = r8 ^ r3
            r9.<init>(r10, r8)
            rq5 r8 = r0.x0
            grd r8 = r8.z0
            sq5 r10 = new sq5
            r10.<init>(r2)
            pg7[] r11 = new pg7[r2]
            r11[r1] = r9
            r11[r3] = r10
            java.util.List r10 = defpackage.p23.B(r11)
            r8.m(r7, r10)
            java.util.Set r8 = r5.z0
            sq5 r10 = new sq5
            boolean r11 = r8.isEmpty()
            r11 = r11 ^ r3
            if (r11 == 0) goto L_0x00ae
            r11 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x00af
        L_0x00ae:
            r11 = r2
        L_0x00af:
            r10.<init>(r11)
            pg7[] r11 = new pg7[r2]
            r11[r1] = r9
            r11[r3] = r10
            java.util.ArrayList r9 = defpackage.p23.C(r11)
            boolean r10 = r8.isEmpty()
            r10 = r10 ^ r3
            if (r10 == 0) goto L_0x0177
            rq5 r10 = r0.x0
            v72 r11 = r10.X
            java.lang.String r10 = r10.b
            r0.X = r5
            r0.Y = r8
            r0.Z = r9
            r0.w0 = r2
            b92 r11 = (b92) r11
            r11.getClass()
            h82 r2 = new h82
            r2.<init>(r11, r10, r7)
            hu3 r10 = r11.Y
            java.lang.Object r2 = defpackage.xs7.U(r10, r2, r0)
            if (r2 != r4) goto L_0x00e4
            return r4
        L_0x00e4:
            r4 = r8
        L_0x00e5:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            rq5 r8 = r0.x0
            t97 r10 = r0.z0
            java.util.Iterator r2 = r2.iterator()
            r11 = r1
        L_0x00f0:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0177
            java.lang.Object r12 = r2.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x0173
            i22 r12 = (i22) r12
            k77[] r14 = defpackage.rq5.H0
            r8.getClass()
            android.net.Uri r14 = defpackage.rq5.t(r12)
            int r15 = r4.size()
            int r15 = r15 - r3
            if (r11 != r15) goto L_0x0116
            r11 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x0113:
            r24 = r11
            goto L_0x011a
        L_0x0116:
            r11 = 1073741828(0x40000004, float:2.000001)
            goto L_0x0113
        L_0x011a:
            tq5 r11 = new tq5
            o62 r15 = r12.b
            r26 = r2
            long r1 = r15.a
            if (r14 == 0) goto L_0x012b
            java.lang.String r14 = r14.toString()
            r18 = r14
            goto L_0x012d
        L_0x012b:
            r18 = r7
        L_0x012d:
            java.lang.Object r14 = r10.getValue()
            ho2 r14 = (ho2) r14
            ma2 r14 = (defpackage.ma2) r14
            r14.getClass()
            r12.h0()
            java.lang.CharSequence r14 = r12.y0
            long r20 = r12.e()
            r12.i0()
            java.lang.CharSequence r15 = r12.B0
            boolean r16 = r12.U()
            if (r16 != 0) goto L_0x015d
            tf3 r12 = r12.k()
            if (r12 == 0) goto L_0x0159
            boolean r12 = r12.u()
            if (r12 != r3) goto L_0x0159
            goto L_0x015d
        L_0x0159:
            r12 = r15
            r23 = 0
            goto L_0x0160
        L_0x015d:
            r23 = r3
            r12 = r15
        L_0x0160:
            r15 = r11
            r16 = r1
            r19 = r14
            r22 = r12
            r15.<init>(r16, r18, r19, r20, r22, r23, r24)
            r9.add(r11)
            r2 = r26
            r11 = r13
            r1 = 0
            goto L_0x00f0
        L_0x0173:
            defpackage.p23.G()
            throw r7
        L_0x0177:
            java.util.Set r1 = r5.G0
            fr5 r2 = fr5.c
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0186
            pp5 r1 = defpackage.pp5.a
            r9.add(r1)
        L_0x0186:
            rq5 r0 = r0.x0
            grd r0 = r0.z0
            r0.setValue(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq5.o(java.lang.Object):java.lang.Object");
    }
}
