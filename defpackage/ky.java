package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ky  reason: default package */
public final class ky extends l5e implements i26 {
    public final /* synthetic */ ny X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ky(ny nyVar, xm8 xm8, Long l, int i, Continuation continuation) {
        super(2, continuation);
        this.X = nyVar;
        this.Y = xm8;
        this.Z = l;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ky(this.X, this.Y, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            wx3.H(r22)
            ny r1 = r0.X
            r1.getClass()
            xm8 r2 = r0.Y
            vo8 r3 = r2.a
            int r3 = r3.b()
            t97 r4 = r1.h
            int r5 = r0.w0
            java.lang.String r6 = ""
            vo8 r7 = r2.a
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = r7.w0
            if (r3 == 0) goto L_0x003a
            int r8 = r3.length()
            if (r8 != 0) goto L_0x0027
            goto L_0x003a
        L_0x0027:
            java.lang.Object r0 = r4.getValue()
            w6a r0 = (w6a) r0
            java.util.List r1 = r7.V0
            java.lang.CharSequence r0 = r0.j(r3, r1, r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x0232
        L_0x0037:
            r6 = r0
            goto L_0x0232
        L_0x003a:
            r3 = 1
            java.lang.Long r0 = r0.Z
            r8 = 0
            if (r0 == 0) goto L_0x00d3
            long r9 = r0.longValue()
            jj7 r0 = r7.D0
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00d3
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00cf
            java.lang.Object r11 = r0.next()
            r12 = r11
            o10 r12 = (defpackage.o10) r12
            j10 r13 = r12.a
            if (r13 != 0) goto L_0x0065
            r13 = -1
            goto L_0x006d
        L_0x0065:
            int[] r14 = defpackage.jy.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r14[r13]
        L_0x006d:
            if (r13 == r3) goto L_0x00c4
            r14 = 2
            if (r13 == r14) goto L_0x00b9
            r14 = 3
            if (r13 == r14) goto L_0x00ae
            r14 = 4
            if (r13 == r14) goto L_0x00a3
            r14 = 5
            if (r13 != r14) goto L_0x0086
            l00 r12 = r12.e
            if (r12 == 0) goto L_0x0052
            long r12 = r12.a
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0052
            goto L_0x00d0
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attach with given id = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " not found"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            v00 r12 = r12.j
            if (r12 == 0) goto L_0x0052
            long r12 = r12.a
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0052
            goto L_0x00d0
        L_0x00ae:
            f10 r12 = r12.g
            if (r12 == 0) goto L_0x0052
            long r12 = r12.a
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0052
            goto L_0x00d0
        L_0x00b9:
            n10 r12 = r12.d
            if (r12 == 0) goto L_0x0052
            long r12 = r12.a
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0052
            goto L_0x00d0
        L_0x00c4:
            a10 r12 = r12.b
            if (r12 == 0) goto L_0x0052
            long r12 = r12.w0
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0052
            goto L_0x00d0
        L_0x00cf:
            r11 = r8
        L_0x00d0:
            o10 r11 = (defpackage.o10) r11
            goto L_0x00d4
        L_0x00d3:
            r11 = r8
        L_0x00d4:
            java.lang.String r0 = "audio.transcription.enabled"
            t97 r9 = r1.b
            r10 = 0
            if (r11 == 0) goto L_0x0159
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x00ef
            android.content.Context r0 = r1.a()
            a10 r1 = r11.b
            boolean r1 = r1.X
            java.lang.String r6 = defpackage.dhe.r(r0, r1, r10)
            goto L_0x0232
        L_0x00ef:
            boolean r2 = r11.g()
            if (r2 == 0) goto L_0x011f
            android.content.Context r0 = r1.a()
            java.lang.String[] r1 = defpackage.dhe.b
            f10 r1 = r11.g
            java.lang.String r2 = r1.e
            boolean r3 = r1g.q(r2)
            if (r3 == 0) goto L_0x0108
        L_0x0105:
            r6 = r2
            goto L_0x0232
        L_0x0108:
            java.lang.String r1 = r1.c
            boolean r2 = r1g.q(r1)
            if (r2 != 0) goto L_0x0113
        L_0x0110:
            r6 = r1
            goto L_0x0232
        L_0x0113:
            int r1 = defpackage.avb.tt_link
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = p0e.I(r0)
            goto L_0x0037
        L_0x011f:
            boolean r2 = r11.c()
            if (r2 == 0) goto L_0x012b
            v00 r0 = r11.j
            java.lang.String r6 = r0.c
            goto L_0x0232
        L_0x012b:
            boolean r2 = r11.i()
            if (r2 == 0) goto L_0x013b
            android.content.Context r0 = r1.a()
            java.lang.String r6 = defpackage.dhe.t(r0, r10)
            goto L_0x0232
        L_0x013b:
            boolean r2 = r11.a()
            if (r2 == 0) goto L_0x0232
            android.content.Context r1 = r1.a()
            java.lang.Object r2 = r9.getValue()
            ip r2 = (defpackage.ip) r2
            qpc r2 = (defpackage.qpc) r2
            x97 r2 = r2.g
            boolean r0 = r2.getBoolean(r0, r3)
            java.lang.String r6 = defpackage.dhe.g(r1, r10, r0)
            goto L_0x0232
        L_0x0159:
            java.lang.String r11 = r7.w0
            if (r11 == 0) goto L_0x019d
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0164
            goto L_0x019d
        L_0x0164:
            boolean r11 = r7.B()
            if (r11 != 0) goto L_0x019d
            boolean r11 = r7.A()
            java.lang.String r12 = r7.w0
            if (r11 != 0) goto L_0x0174
            r8 = r10
            goto L_0x018b
        L_0x0174:
            if (r12 == 0) goto L_0x018a
            int r11 = r12.length()
            if (r11 != 0) goto L_0x017d
            goto L_0x018a
        L_0x017d:
            f10 r11 = r7.i()
            if (r11 == 0) goto L_0x0185
            java.lang.String r8 = r11.b
        L_0x0185:
            boolean r8 = r12.equals(r8)
            goto L_0x018b
        L_0x018a:
            r8 = r3
        L_0x018b:
            if (r8 != 0) goto L_0x019d
            java.lang.Object r0 = r4.getValue()
            w6a r0 = (w6a) r0
            java.util.List r1 = r7.V0
            java.lang.CharSequence r0 = r0.j(r12, r1, r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x0232
        L_0x019d:
            boolean r5 = r7.A()
            if (r5 == 0) goto L_0x01db
            android.content.Context r0 = r1.a()
            f10 r1 = r7.i()
            if (r1 == 0) goto L_0x01cf
            java.lang.String[] r2 = defpackage.dhe.b
            java.lang.String r2 = r1.e
            boolean r3 = r1g.q(r2)
            if (r3 == 0) goto L_0x01b9
            goto L_0x0105
        L_0x01b9:
            java.lang.String r1 = r1.c
            boolean r2 = r1g.q(r1)
            if (r2 != 0) goto L_0x01c3
            goto L_0x0110
        L_0x01c3:
            int r1 = defpackage.avb.tt_link
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = p0e.I(r0)
            goto L_0x0037
        L_0x01cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01db:
            boolean r5 = r7.u()
            if (r5 == 0) goto L_0x01f6
            android.content.Context r0 = r1.a()
            q00 r2 = r7.e()
            t97 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            zf3 r1 = (defpackage.zf3) r1
            java.lang.String r6 = defpackage.dhe.j(r0, r2, r1, r10, r10)
            goto L_0x0232
        L_0x01f6:
            t97 r5 = r1.a
            java.lang.Object r5 = r5.getValue()
            r10 = r5
            dhe r10 = (defpackage.dhe) r10
            android.content.Context r11 = r1.a()
            java.lang.Object r4 = r4.getValue()
            r12 = r4
            w6a r12 = (w6a) r12
            java.lang.Object r4 = r9.getValue()
            ip r4 = (defpackage.ip) r4
            qpc r4 = (defpackage.qpc) r4
            x97 r4 = r4.g
            boolean r17 = r4.getBoolean(r0, r3)
            t97 r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            f03 r0 = (defpackage.f03) r0
            lqc r0 = (defpackage.lqc) r0
            long r18 = r0.s()
            r15 = 0
            r16 = 0
            vo8 r13 = r2.a
            r14 = 0
            r20 = 0
            java.lang.String r6 = r10.f(r11, r12, r13, r14, r15, r16, r17, r18, r20)
        L_0x0232:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky.o(java.lang.Object):java.lang.Object");
    }
}
