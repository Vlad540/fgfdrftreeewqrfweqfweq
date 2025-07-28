package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qtd  reason: default package */
public final class qtd extends l5e implements i26 {
    public osd X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ttd w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qtd(ttd ttd, long j, Continuation continuation) {
        super(2, continuation);
        this.w0 = ttd;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qtd qtd = new qtd(this.w0, this.x0, continuation);
        qtd.Z = obj;
        return qtd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.Y
            r2 = 1
            r3 = 2
            long r4 = r11.x0
            ttd r6 = r11.w0
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            osd r0 = r11.X
            java.lang.Object r11 = r11.Z
            ou3 r11 = (ou3) r11
            wx3.H(r12)
            goto L_0x0073
        L_0x001a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0022:
            java.lang.Object r1 = r11.Z
            ou3 r1 = (ou3) r1
            wx3.H(r12)
            goto L_0x0045
        L_0x002a:
            wx3.H(r12)
            java.lang.Object r12 = r11.Z
            r1 = r12
            ou3 r1 = (ou3) r1
            t97 r12 = r6.o
            java.lang.Object r12 = r12.getValue()
            kvd r12 = (defpackage.kvd) r12
            r11.Z = r1
            r11.Y = r2
            java.io.Serializable r12 = r12.a(r4, r11)
            if (r12 != r0) goto L_0x0045
            return r0
        L_0x0045:
            osd r12 = (defpackage.osd) r12
            t97 r7 = r6.Y
            java.lang.Object r7 = r7.getValue()
            fa5 r7 = (defpackage.fa5) r7
            r7.getClass()
            f00 r8 = new f00
            r9 = 20
            r8.<init>(r4, r9)
            jk0 r7 = r7.j
            r7.getClass()
            au9 r9 = new au9
            r10 = 1
            r9.<init>(r7, r8, r10)
            r11.Z = r1
            r11.X = r12
            r11.Y = r3
            java.lang.Object r11 = e07.e(r9, r11)
            if (r11 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r0 = r12
            r12 = r11
        L_0x0073:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            grd r12 = r6.B0
            if (r0 == 0) goto L_0x0087
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            ktd r11 = r6.r(r0, r11, r1)
            goto L_0x0089
        L_0x0087:
            ktd r11 = defpackage.ktd.D0
        L_0x0089:
            r12.setValue(r11)
            grd r11 = r6.F0
            java.lang.Object r12 = r11.getValue()
            hud r12 = (defpackage.hud) r12
            jue r0 = jue.a
            if (r12 != 0) goto L_0x00a1
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r4)
            r6.q(r11)
            return r0
        L_0x00a1:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r3 = r12.X
            r6 = 10
            int r6 = q23.H(r3, r6)
            r1.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x00b2:
            boolean r6 = r3.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00d8
            java.lang.Object r6 = r3.next()
            ktd r6 = (defpackage.ktd) r6
            long r8 = r6.a
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 6143(0x17ff, float:8.608E-42)
            if (r8 != 0) goto L_0x00cc
            ktd r6 = defpackage.ktd.k(r6, r7, r2, r9)
            goto L_0x00d4
        L_0x00cc:
            boolean r8 = r6.A0
            if (r8 == 0) goto L_0x00d4
            ktd r6 = defpackage.ktd.k(r6, r7, r7, r9)
        L_0x00d4:
            r1.add(r6)
            goto L_0x00b2
        L_0x00d8:
            r2 = 239(0xef, float:3.35E-43)
            hud r12 = defpackage.hud.k(r12, r1, r7, r7, r2)
            r1 = 0
            r11.m(r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtd.o(java.lang.Object):java.lang.Object");
    }
}
