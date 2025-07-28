package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: nv5  reason: default package */
public final class nv5 extends l5e implements i26 {
    public final /* synthetic */ Long A0;
    public gv5 X;
    public Set Y;
    public int Z;
    public final /* synthetic */ pv5 w0;
    public final /* synthetic */ CharSequence x0;
    public final /* synthetic */ Set y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nv5(pv5 pv5, CharSequence charSequence, Set set, boolean z, Long l, Continuation continuation) {
        super(2, continuation);
        this.w0 = pv5;
        this.x0 = charSequence;
        this.y0 = set;
        this.z0 = z;
        this.A0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nv5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nv5(this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r32) {
        /*
            r31 = this;
            r6 = r31
            pu3 r7 = defpackage.pu3.a
            int r0 = r6.Z
            jue r8 = defpackage.jue.a
            r9 = 0
            boolean r10 = r6.z0
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 1
            pv5 r5 = r6.w0
            if (r0 == 0) goto L_0x0048
            if (r0 == r15) goto L_0x0041
            if (r0 == r14) goto L_0x0038
            if (r0 == r13) goto L_0x002e
            if (r0 == r12) goto L_0x002e
            if (r0 != r11) goto L_0x0026
            gv5 r0 = r6.X
            defpackage.wx3.H(r32)
            r11 = r5
            goto L_0x0177
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.util.Set r0 = r6.Y
            gv5 r1 = r6.X
            defpackage.wx3.H(r32)
            r11 = r5
            goto L_0x00d1
        L_0x0038:
            gv5 r0 = r6.X
            defpackage.wx3.H(r32)
            r1 = r32
            r11 = r5
            goto L_0x0076
        L_0x0041:
            defpackage.wx3.H(r32)
            r0 = r32
            r11 = r5
            goto L_0x0067
        L_0x0048:
            defpackage.wx3.H(r32)
            t97 r0 = r5.h
            java.lang.Object r0 = r0.getValue()
            et0 r0 = (defpackage.et0) r0
            r6.Z = r15
            java.lang.CharSequence r3 = r6.x0
            java.util.Set r4 = r6.y0
            java.util.Set r1 = r5.a
            java.lang.Long r2 = r5.d
            r11 = r5
            r5 = r31
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0067
            return r7
        L_0x0067:
            gv5 r0 = (defpackage.gv5) r0
            j54 r1 = r11.c
            r6.X = r0
            r6.Z = r14
            java.lang.Object r1 = r1.F(r6)
            if (r1 != r7) goto L_0x0076
            return r7
        L_0x0076:
            java.util.Set r1 = (java.util.Set) r1
            jv5 r2 = new jv5
            java.util.Set r3 = r11.a
            t0c r4 = r11.t
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r21 = r4 ^ 1
            java.lang.CharSequence r4 = r6.x0
            java.lang.Long r5 = r11.d
            boolean r14 = r11.e
            r16 = r2
            r17 = r3
            r18 = r5
            r19 = r14
            r20 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.Long r3 = r11.d
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r11.e
            if (r3 == 0) goto L_0x00d7
            t97 r3 = r11.i
            java.lang.Object r3 = r3.getValue()
            zu5 r3 = (zu5) r3
            java.util.List r4 = defpackage.o23.s0(r1)
            r6.X = r0
            r6.Y = r1
            r6.Z = r13
            r3.getClass()
            yu5 r5 = new yu5
            r5.<init>(r3, r2, r4, r9)
            java.lang.Object r2 = defpackage.n1g.f(r5, r6)
            if (r2 != r7) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            if (r2 != r7) goto L_0x00cc
            return r7
        L_0x00cc:
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x00d1:
            r30 = r1
            r1 = r0
            r0 = r30
            goto L_0x00fc
        L_0x00d7:
            t97 r3 = r11.j
            java.lang.Object r3 = r3.getValue()
            iv5 r3 = (iv5) r3
            java.util.List r4 = defpackage.o23.s0(r1)
            r6.X = r0
            r6.Y = r1
            r6.Z = r12
            r3.getClass()
            hv5 r5 = new hv5
            r5.<init>(r3, r2, r4, r9)
            java.lang.Object r2 = defpackage.n1g.f(r5, r6)
            if (r2 != r7) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r2 = r8
        L_0x00f9:
            if (r2 != r7) goto L_0x00cc
            return r7
        L_0x00fc:
            java.util.Set r2 = r6.y0
            int r3 = r2.size()
            if (r3 <= r15) goto L_0x017a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r3 = r11.f
            android.content.res.Resources r3 = r3.getResources()
            int r4 = defpackage.d2a.a
            java.util.Set r5 = r11.a
            int r5 = r5.size()
            java.lang.String r3 = r3.getQuantityString(r4, r5)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            android.content.Context r3 = r11.f
            android.content.res.Resources r3 = r3.getResources()
            int r4 = defpackage.d2a.b
            int r5 = r2.size()
            java.lang.String r3 = r3.getQuantityString(r4, r5)
            int r2 = r2.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r15)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.append(r2)
            t97 r2 = r11.g
            java.lang.Object r2 = r2.getValue()
            pae r2 = (pae) r2
            n3a r2 = (defpackage.n3a) r2
            zr7 r2 = r2.c()
            mv5 r3 = new mv5
            r3.<init>(r11, r1, r9)
            r6.X = r0
            r6.Y = r9
            r1 = 5
            r6.Z = r1
            java.lang.Object r1 = defpackage.xs7.U(r2, r3, r6)
            if (r1 != r7) goto L_0x0177
            return r7
        L_0x0177:
            r28 = r0
            goto L_0x019b
        L_0x017a:
            if (r10 != 0) goto L_0x0177
            hcd r2 = r11.p
            qv5 r3 = new qv5
            java.lang.Object r1 = defpackage.o23.U(r1)
            r17 = r1
            java.lang.Long r17 = (java.lang.Long) r17
            r19 = 0
            r20 = 0
            r18 = 0
            r22 = 14
            r16 = r3
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.g(r3)
            goto L_0x0177
        L_0x019b:
            if (r10 == 0) goto L_0x01b5
            hcd r0 = r11.p
            qv5 r1 = new qv5
            r26 = 0
            r27 = 0
            java.lang.Long r2 = r6.A0
            r25 = 0
            r29 = 14
            r23 = r1
            r24 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r0.g(r1)
        L_0x01b5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv5.o(java.lang.Object):java.lang.Object");
    }
}
