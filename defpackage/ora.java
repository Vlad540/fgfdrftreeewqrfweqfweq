package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ora  reason: default package */
public final class ora extends l5e implements i26 {
    public grd X;
    public int Y;
    public final /* synthetic */ xra Z;
    public final /* synthetic */ bua w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ora(xra xra, bua bua, Continuation continuation) {
        super(2, continuation);
        this.Z = xra;
        this.w0 = bua;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ora) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ora(this.Z, this.w0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: sra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: sra} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        if (defpackage.h0e.c0(r1) == false) goto L_0x0110;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0228 A[EDGE_INSN: B:130:0x0228->B:116:0x0228 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            pu3 r5 = defpackage.pu3.a
            int r6 = r0.Y
            if (r6 == 0) goto L_0x0020
            if (r6 != r4) goto L_0x0018
            grd r0 = r0.X
            defpackage.wx3.H(r19)
            r7 = r0
            r0 = r19
            goto L_0x0250
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            defpackage.wx3.H(r19)
            xra r6 = r0.Z
            grd r7 = r6.B0
            r0.X = r7
            r0.Y = r4
            bua r0 = r0.w0
            r0.getClass()
            b9 r6 = r6.b
            java.lang.Object r8 = r6.c
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0041
            boolean r8 = defpackage.h0e.c0(r8)
            if (r8 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r8 = r3
            goto L_0x0042
        L_0x0041:
            r8 = r4
        L_0x0042:
            r8 = r8 ^ r4
            java.lang.Object r9 = r6.o
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x004e
            int r9 = r9.size()
            goto L_0x004f
        L_0x004e:
            r9 = r3
        L_0x004f:
            java.lang.Object r10 = r6.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x005a
            int r10 = r10.size()
            goto L_0x005b
        L_0x005a:
            r10 = r3
        L_0x005b:
            int r9 = r9 + r10
            java.lang.Object r10 = r6.Y
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto L_0x0067
            int r10 = r10.size()
            goto L_0x0068
        L_0x0067:
            r10 = r3
        L_0x0068:
            int r9 = r9 + r10
            java.lang.Object r10 = r6.Z
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0078
            boolean r10 = defpackage.h0e.c0(r10)
            if (r10 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r10 = r3
            goto L_0x0079
        L_0x0078:
            r10 = r4
        L_0x0079:
            r10 = r10 ^ r4
            int r9 = r9 + r10
            if (r9 <= 0) goto L_0x007f
            r10 = r4
            goto L_0x0080
        L_0x007f:
            r10 = r3
        L_0x0080:
            int r11 = cic.Q2
            hge r13 = new hge
            r13.<init>(r11)
            r11 = 0
            if (r8 == 0) goto L_0x00a7
            if (r10 != 0) goto L_0x00a7
            java.lang.Object r0 = r6.c
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x009b
            lge r1 = new lge
            r1.<init>(r0)
            r14 = r1
            r1 = r11
            goto L_0x022c
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            x51 r12 = defpackage.x51.x0
            x51 r14 = defpackage.x51.z0
            t97 r0 = r0.b
            if (r10 == 0) goto L_0x0191
            if (r9 != r4) goto L_0x0191
            if (r8 != 0) goto L_0x0191
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r6.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r15 = r6.Y
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.List[] r2 = new java.util.List[r2]
            r2[r3] = r8
            r2[r4] = r10
            r2[r1] = r15
            dyc r1 = defpackage.cs.K(r2)
            sg5 r1 = defpackage.myc.M(r1, r14)
            xi5 r1 = defpackage.myc.P(r1, r12)
            java.lang.Object r1 = defpackage.myc.O(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x010e
            java.lang.Object r0 = r0.getValue()
            u98 r0 = (u98) r0
            java.lang.String r1 = r1.toString()
            xh0 r0 = (xh0) r0
            eq3 r0 = r0.c(r1)
            if (r0 == 0) goto L_0x010e
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x00fc
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r1 = r11
            goto L_0x00fd
        L_0x00fc:
            r1 = r0
        L_0x00fd:
            java.lang.String r0 = r0.c
            if (r1 == 0) goto L_0x010c
            java.lang.String r1 = r1.e
            if (r1 == 0) goto L_0x010c
            boolean r2 = defpackage.h0e.c0(r1)
            if (r2 != 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            r1 = r11
            goto L_0x0110
        L_0x010e:
            r0 = r11
            goto L_0x010c
        L_0x0110:
            java.lang.Object r2 = r6.o
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0132
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0132
            int r0 = defpackage.g2a.c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            fge r3 = new fge
            java.util.List r2 = defpackage.cs.g0(r2)
            r3.<init>(r2, r0, r4)
            goto L_0x018e
        L_0x0132:
            java.lang.Object r2 = r6.X
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0154
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0154
            int r0 = defpackage.g2a.d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            fge r3 = new fge
            java.util.List r2 = defpackage.cs.g0(r2)
            r3.<init>(r2, r0, r4)
            goto L_0x018e
        L_0x0154:
            java.lang.Object r2 = r6.Y
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x017e
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x017e
            if (r0 == 0) goto L_0x0169
            lge r3 = new lge
            r3.<init>(r0)
            goto L_0x018e
        L_0x0169:
            int r0 = defpackage.g2a.b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            fge r3 = new fge
            java.util.List r2 = defpackage.cs.g0(r2)
            r3.<init>(r2, r0, r4)
            goto L_0x018e
        L_0x017e:
            java.lang.Object r0 = r6.Z
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x018c
            int r0 = defpackage.h2a.Y
            hge r3 = new hge
            r3.<init>(r0)
            goto L_0x018e
        L_0x018c:
            lge r3 = mge.a
        L_0x018e:
            r14 = r3
            goto L_0x022c
        L_0x0191:
            if (r10 == 0) goto L_0x022a
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x01a2
            int r8 = r8.size()
            if (r8 != r9) goto L_0x01a2
            int r8 = defpackage.g2a.c
            goto L_0x01b3
        L_0x01a2:
            java.lang.Object r8 = r6.X
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x01b1
            int r8 = r8.size()
            if (r8 != r9) goto L_0x01b1
            int r8 = defpackage.g2a.d
            goto L_0x01b3
        L_0x01b1:
            int r8 = defpackage.g2a.b
        L_0x01b3:
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            fge r15 = new fge
            java.util.List r10 = defpackage.cs.g0(r10)
            r15.<init>(r10, r8, r9)
            java.lang.Object r8 = r6.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r6.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r6 = r6.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.List[] r2 = new java.util.List[r2]
            r2[r3] = r8
            r2[r4] = r10
            r2[r1] = r6
            dyc r1 = defpackage.cs.K(r2)
            sg5 r1 = defpackage.myc.M(r1, r14)
            xi5 r1 = defpackage.myc.P(r1, r12)
            rg5 r2 = new rg5
            r2.<init>((defpackage.xi5) r1)
        L_0x01ea:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0227
            java.lang.Object r1 = r2.next()
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r3 = r0.getValue()
            u98 r3 = (u98) r3
            java.lang.String r1 = r1.toString()
            xh0 r3 = (xh0) r3
            eq3 r1 = r3.c(r1)
            if (r1 == 0) goto L_0x0223
            boolean r3 = r1.a()
            if (r3 != 0) goto L_0x0216
            boolean r3 = r1.b()
            if (r3 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            r1 = r11
        L_0x0216:
            if (r1 == 0) goto L_0x0223
            java.lang.String r1 = r1.e
            if (r1 == 0) goto L_0x0223
            boolean r3 = defpackage.h0e.c0(r1)
            if (r3 != 0) goto L_0x0223
            goto L_0x0224
        L_0x0223:
            r1 = r11
        L_0x0224:
            if (r1 == 0) goto L_0x01ea
            goto L_0x0228
        L_0x0227:
            r1 = r11
        L_0x0228:
            r14 = r15
            goto L_0x022c
        L_0x022a:
            r1 = r11
            r14 = r1
        L_0x022c:
            if (r1 == 0) goto L_0x0234
            java.lang.String r0 = defpackage.at7.y(r1)
            r15 = r0
            goto L_0x0235
        L_0x0234:
            r15 = r11
        L_0x0235:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r9)
            int r1 = r0.intValue()
            if (r1 <= r4) goto L_0x0243
            r16 = r0
            goto L_0x0245
        L_0x0243:
            r16 = r11
        L_0x0245:
            sra r0 = new sra
            r17 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            if (r0 != r5) goto L_0x0250
            return r5
        L_0x0250:
            r7.setValue(r0)
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ora.o(java.lang.Object):java.lang.Object");
    }
}
