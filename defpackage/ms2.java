package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ms2  reason: default package */
public final class ms2 extends l5e implements i26 {
    public /* synthetic */ Object A0;
    public final /* synthetic */ bt2 B0;
    public final /* synthetic */ boolean C0;
    public List X;
    public bt2 Y;
    public Collection Z;
    public Iterator w0;
    public List x0;
    public Collection y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms2(bt2 bt2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.B0 = bt2;
        this.C0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ms2 ms2 = new ms2(this.B0, this.C0, continuation);
        ms2.A0 = obj;
        return ms2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 2
            r2 = 1
            r3 = 0
            pu3 r4 = defpackage.pu3.a
            int r5 = r0.z0
            bt2 r6 = r0.B0
            r7 = 10
            if (r5 == 0) goto L_0x003d
            if (r5 == r2) goto L_0x0020
            if (r5 != r1) goto L_0x0018
            defpackage.wx3.H(r21)
            goto L_0x01aa
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            java.util.Collection r5 = r0.y0
            java.util.List r8 = r0.x0
            java.util.Iterator r9 = r0.w0
            java.util.Collection r10 = r0.Z
            bt2 r11 = r0.Y
            java.util.List r12 = r0.X
            java.lang.Object r13 = r0.A0
            ou3 r13 = (defpackage.ou3) r13
            defpackage.wx3.H(r21)
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r9
            r9 = r8
            r8 = r10
            r10 = r21
            goto L_0x00dd
        L_0x003d:
            defpackage.wx3.H(r21)
            java.lang.Object r5 = r0.A0
            ou3 r5 = (defpackage.ou3) r5
            i2c r8 = r6.b
            java.util.List r8 = r8.a()
            i2c r9 = r6.b
            java.util.List r9 = r9.b()
            oo3 r10 = r6.c
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.m
            boolean r11 = r11.get()
            if (r11 == 0) goto L_0x006c
            java.lang.String r11 = r10.k
            boolean r11 = defpackage.r1g.p(r11)
            if (r11 == 0) goto L_0x0065
            java.util.List r10 = r10.f
            goto L_0x0067
        L_0x0065:
            java.util.List r10 = r10.g
        L_0x0067:
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            goto L_0x0070
        L_0x006c:
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x0070:
            java.util.List r11 = defpackage.bt2.r(r6)
            defpackage.n1g.k(r5)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x00a0
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = defpackage.q23.H(r8, r7)
            r11.<init>(r12)
            java.util.Iterator r8 = r8.iterator()
        L_0x008a:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x00a0
            java.lang.Object r12 = r8.next()
            tf3 r12 = (tf3) r12
            bw2 r13 = r6.X
            t1c r12 = r13.b(r12)
            r11.add(r12)
            goto L_0x008a
        L_0x00a0:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r12 = defpackage.q23.H(r9, r7)
            r8.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
            r13 = r5
            r5 = r8
            r12 = r10
            r8 = r11
            r11 = r6
        L_0x00b2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00e9
            java.lang.Object r10 = r9.next()
            prc r10 = (prc) r10
            src r14 = r11.Y
            r0.A0 = r13
            r0.X = r12
            r0.Y = r11
            r0.Z = r5
            r0.w0 = r9
            r0.x0 = r8
            r0.y0 = r5
            r0.z0 = r2
            java.lang.Object r10 = r14.b(r10, r0)
            if (r10 != r4) goto L_0x00d7
            return r4
        L_0x00d7:
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r9
            r9 = r8
            r8 = r5
        L_0x00dd:
            nrc r10 = (defpackage.nrc) r10
            r5.add(r10)
            r5 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            goto L_0x00b2
        L_0x00e9:
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = defpackage.q23.H(r12, r7)
            r9.<init>(r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x00f8:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x010e
            java.lang.Object r10 = r7.next()
            tf3 r10 = (tf3) r10
            bw2 r11 = r6.X
            lk3 r10 = r11.a(r10)
            r9.add(r10)
            goto L_0x00f8
        L_0x010e:
            dp6 r7 = new dp6
            r7.<init>(r8, r5, r9)
            defpackage.n1g.k(r13)
            grd r5 = r6.I0
            js2 r8 = new js2
            is2 r15 = defpackage.is2.c
            hw4 r18 = defpackage.hw4.a
            boolean r9 = r0.C0
            java.lang.String r16 = ""
            r14 = r8
            r17 = r7
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            r7 = 0
            r5.m(r7, r8)
            t97 r5 = r6.G0
            java.lang.Object r5 = r5.getValue()
            rj3 r5 = (rj3) r5
            pj5 r5 = r5.a()
            t97 r8 = r6.F0
            java.lang.Object r8 = r8.getValue()
            xg0 r8 = (xg0) r8
            ck5 r8 = r8.b()
            pj5[] r9 = new defpackage.pj5[r1]
            r9[r3] = r5
            r9[r2] = r8
            q02 r5 = defpackage.ez3.Q(r9)
            int r8 = defpackage.zp4.o
            eq4 r8 = defpackage.eq4.SECONDS
            long r8 = defpackage.mt0.P(r2, r8)
            q02 r5 = defpackage.vx3.M(r5, r8)
            rs2 r8 = new rs2
            r8.<init>(r5, r6, r3)
            rs2 r5 = new rs2
            r5.<init>(r8, r6, r2)
            ts2 r2 = new ts2
            r2.<init>(r6, r7)
            ck5 r8 = new ck5
            r9 = 5
            r8.<init>(r5, r2, r9)
            z9 r2 = new z9
            r5 = 6
            r2.<init>(r6, r7, r5, r3)
            bc r5 = new bc
            r9 = 17
            r5.<init>(r8, r9, r2)
            pae r2 = r6.Z
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            pj5 r2 = defpackage.ez3.J(r5, r2)
            r5 = 3
            pj5 r2 = defpackage.ez3.f(r2, r3, r5)
            qod r2 = defpackage.ez3.N(r2, r13)
            r0.A0 = r7
            r0.X = r7
            r0.Y = r7
            r0.Z = r7
            r0.w0 = r7
            r0.x0 = r7
            r0.y0 = r7
            r0.z0 = r1
            java.lang.Object r0 = r2.join(r0)
            if (r0 != r4) goto L_0x01aa
            return r4
        L_0x01aa:
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms2.o(java.lang.Object):java.lang.Object");
    }
}
