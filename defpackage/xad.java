package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xad  reason: default package */
public final class xad extends l5e implements i26 {
    public grd X;
    public int Y;
    public final /* synthetic */ zad Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xad(zad zad, Continuation continuation) {
        super(2, continuation);
        this.Z = zad;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xad(this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        if (h0e.c0(r0) == false) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0237 A[EDGE_INSN: B:134:0x0237->B:119:0x0237 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            pu3 r4 = pu3.a
            int r5 = r14.Y
            if (r5 == 0) goto L_0x001b
            if (r5 != r3) goto L_0x0013
            grd r14 = r14.X
            wx3.H(r15)
            goto L_0x0264
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x001b:
            wx3.H(r15)
            zad r15 = r14.Z
            grd r5 = r15.g
            r14.X = r5
            r14.Y = r3
            ijb r14 = r15.b
            r14.getClass()
            r6 = 0
            b9 r15 = r15.a
            if (r15 != 0) goto L_0x003f
            wad r14 = new wad
            int r15 = defpackage.cic.Q2
            hge r0 = new hge
            r0.<init>(r15)
            r14.<init>(r0, r6, r6, r6)
            r15 = r14
            goto L_0x0260
        L_0x003f:
            java.lang.Object r7 = r15.c
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x004e
            boolean r7 = h0e.c0(r7)
            if (r7 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r7 = r2
            goto L_0x004f
        L_0x004e:
            r7 = r3
        L_0x004f:
            r7 = r7 ^ r3
            java.lang.Object r8 = r15.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x005b
            int r8 = r8.size()
            goto L_0x005c
        L_0x005b:
            r8 = r2
        L_0x005c:
            java.lang.Object r9 = r15.X
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0067
            int r9 = r9.size()
            goto L_0x0068
        L_0x0067:
            r9 = r2
        L_0x0068:
            int r8 = r8 + r9
            java.lang.Object r9 = r15.Y
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0074
            int r9 = r9.size()
            goto L_0x0075
        L_0x0074:
            r9 = r2
        L_0x0075:
            int r8 = r8 + r9
            java.lang.Object r9 = r15.Z
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0085
            boolean r9 = h0e.c0(r9)
            if (r9 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r9 = r2
            goto L_0x0086
        L_0x0085:
            r9 = r3
        L_0x0086:
            r9 = r9 ^ r3
            int r8 = r8 + r9
            if (r8 <= 0) goto L_0x008c
            r9 = r3
            goto L_0x008d
        L_0x008c:
            r9 = r2
        L_0x008d:
            int r10 = defpackage.cic.Q2
            hge r11 = new hge
            r11.<init>(r10)
            if (r7 == 0) goto L_0x00b6
            if (r9 != 0) goto L_0x00b6
            ibd r14 = new ibd
            java.lang.Object r15 = r15.c
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x00aa
            lge r0 = new lge
            r0.<init>(r15)
            r14.<init>(r0, r6)
            goto L_0x0242
        L_0x00aa:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x00b6:
            x51 r10 = x51.x0
            x51 r12 = x51.z0
            t97 r14 = r14.a
            if (r9 == 0) goto L_0x01a1
            if (r8 != r3) goto L_0x01a1
            if (r7 != 0) goto L_0x01a1
            java.lang.Object r7 = r15.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r9 = r15.X
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r13 = r15.Y
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r13
            dyc r0 = cs.K(r1)
            sg5 r0 = myc.M(r0, r12)
            xi5 r0 = myc.P(r0, r10)
            java.lang.Object r0 = myc.O(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x011d
            java.lang.Object r14 = r14.getValue()
            u98 r14 = (defpackage.u98) r14
            java.lang.String r0 = r0.toString()
            xh0 r14 = (defpackage.xh0) r14
            eq3 r14 = r14.c(r0)
            if (r14 == 0) goto L_0x011d
            boolean r0 = r14.a()
            if (r0 != 0) goto L_0x010b
            boolean r0 = r14.b()
            if (r0 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r0 = r6
            goto L_0x010c
        L_0x010b:
            r0 = r14
        L_0x010c:
            java.lang.String r14 = r14.c
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = r0.e
            if (r0 == 0) goto L_0x011b
            boolean r1 = h0e.c0(r0)
            if (r1 != 0) goto L_0x011b
            goto L_0x011f
        L_0x011b:
            r0 = r6
            goto L_0x011f
        L_0x011d:
            r14 = r6
            goto L_0x011b
        L_0x011f:
            java.lang.Object r1 = r15.o
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0140
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x0140
            int r14 = g2a.c
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            fge r1 = new fge
            java.util.List r15 = cs.g0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019a
        L_0x0140:
            java.lang.Object r1 = r15.X
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0161
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x0161
            int r14 = g2a.d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            fge r1 = new fge
            java.util.List r15 = cs.g0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019a
        L_0x0161:
            java.lang.Object r1 = r15.Y
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x018a
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != r3) goto L_0x018a
            if (r14 == 0) goto L_0x0176
            lge r1 = new lge
            r1.<init>(r14)
            goto L_0x019a
        L_0x0176:
            int r14 = g2a.b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            fge r1 = new fge
            java.util.List r15 = cs.g0(r15)
            r1.<init>(r15, r14, r3)
            goto L_0x019a
        L_0x018a:
            java.lang.Object r14 = r15.Z
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x0198
            int r14 = h2a.Y
            hge r1 = new hge
            r1.<init>(r14)
            goto L_0x019a
        L_0x0198:
            lge r1 = defpackage.mge.a
        L_0x019a:
            ibd r14 = new ibd
            r14.<init>(r1, r0)
            goto L_0x0242
        L_0x01a1:
            if (r9 == 0) goto L_0x023d
            java.lang.Object r7 = r15.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x01b2
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01b2
            int r7 = g2a.c
            goto L_0x01c3
        L_0x01b2:
            java.lang.Object r7 = r15.X
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x01c1
            int r7 = r7.size()
            if (r7 != r8) goto L_0x01c1
            int r7 = g2a.d
            goto L_0x01c3
        L_0x01c1:
            int r7 = g2a.b
        L_0x01c3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            fge r13 = new fge
            java.util.List r9 = cs.g0(r9)
            r13.<init>(r9, r7, r8)
            java.lang.Object r7 = r15.o
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r9 = r15.X
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r15 = r15.Y
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r7
            r1[r3] = r9
            r1[r0] = r15
            dyc r15 = cs.K(r1)
            sg5 r15 = myc.M(r15, r12)
            xi5 r15 = myc.P(r15, r10)
            rg5 r0 = new rg5
            r0.<init>(r15)
        L_0x01f9:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0236
            java.lang.Object r15 = r0.next()
            android.net.Uri r15 = (android.net.Uri) r15
            java.lang.Object r1 = r14.getValue()
            u98 r1 = (defpackage.u98) r1
            java.lang.String r15 = r15.toString()
            xh0 r1 = (defpackage.xh0) r1
            eq3 r15 = r1.c(r15)
            if (r15 == 0) goto L_0x0232
            boolean r1 = r15.a()
            if (r1 != 0) goto L_0x0225
            boolean r1 = r15.b()
            if (r1 == 0) goto L_0x0224
            goto L_0x0225
        L_0x0224:
            r15 = r6
        L_0x0225:
            if (r15 == 0) goto L_0x0232
            java.lang.String r15 = r15.e
            if (r15 == 0) goto L_0x0232
            boolean r1 = h0e.c0(r15)
            if (r1 != 0) goto L_0x0232
            goto L_0x0233
        L_0x0232:
            r15 = r6
        L_0x0233:
            if (r15 == 0) goto L_0x01f9
            goto L_0x0237
        L_0x0236:
            r15 = r6
        L_0x0237:
            ibd r14 = new ibd
            r14.<init>(r13, r15)
            goto L_0x0242
        L_0x023d:
            ibd r14 = new ibd
            r14.<init>(r6, r6)
        L_0x0242:
            java.lang.String r15 = r14.b
            if (r15 == 0) goto L_0x024b
            java.lang.String r15 = at7.y(r15)
            goto L_0x024c
        L_0x024b:
            r15 = r6
        L_0x024c:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            int r1 = r0.intValue()
            if (r1 <= r3) goto L_0x0258
            r6 = r0
        L_0x0258:
            wad r0 = new wad
            mge r14 = r14.a
            r0.<init>(r11, r14, r15, r6)
            r15 = r0
        L_0x0260:
            if (r15 != r4) goto L_0x0263
            return r4
        L_0x0263:
            r14 = r5
        L_0x0264:
            r14.setValue(r15)
            jue r14 = jue.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xad.o(java.lang.Object):java.lang.Object");
    }
}
