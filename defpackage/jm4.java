package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jm4  reason: default package */
public final class jm4 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ km4 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ CharSequence w0;
    public final /* synthetic */ Long x0;
    public final /* synthetic */ Long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm4(km4 km4, long j, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = km4;
        this.Z = j;
        this.w0 = charSequence;
        this.x0 = l;
        this.y0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jm4) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jm4(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            jue r3 = defpackage.jue.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 4
            if (r2 == 0) goto L_0x0032
            if (r2 == r6) goto L_0x002d
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r7) goto L_0x001b
            defpackage.wx3.H(r36)
            goto L_0x023e
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            defpackage.wx3.H(r36)
            goto L_0x0220
        L_0x0028:
            defpackage.wx3.H(r36)
            goto L_0x01fe
        L_0x002d:
            defpackage.wx3.H(r36)
            goto L_0x024e
        L_0x0032:
            defpackage.wx3.H(r36)
            km4 r2 = r0.Y
            java.lang.Object r8 = r2.Y
            t97 r8 = (defpackage.t97) r8
            java.lang.Object r8 = r8.getValue()
            xzc r8 = (xzc) r8
            vqc r8 = (vqc) r8
            boolean r8 = r8.s()
            java.lang.CharSequence r9 = r0.w0
            java.lang.String r10 = defpackage.r1g.v(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "start save and upload chatId:"
            r11.<init>(r12)
            long r12 = r0.Z
            r11.append(r12)
            java.lang.String r14 = ", text:"
            r11.append(r14)
            r11.append(r10)
            java.lang.String r10 = ", editId:"
            r11.append(r10)
            java.lang.Long r10 = r0.x0
            r11.append(r10)
            java.lang.String r14 = ", replyId:"
            r11.append(r14)
            java.lang.Long r14 = r0.y0
            r11.append(r14)
            java.lang.String r15 = ", syncEn:"
            r11.append(r15)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            java.lang.Object r15 = r2.a
            java.lang.String r15 = (java.lang.String) r15
            defpackage.udd.p(r15, r11, new java.lang.Object[0])
            java.lang.Object r11 = r2.o
            t97 r11 = (defpackage.t97) r11
            java.lang.Object r16 = r11.getValue()
            bv2 r16 = (bv2) r16
            r7 = r16
            aw2 r7 = (aw2) r7
            t0c r7 = r7.m(r12)
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            i22 r7 = (i22) r7
            if (r7 != 0) goto L_0x00a5
            return r3
        L_0x00a5:
            r16 = 0
            if (r9 == 0) goto L_0x00ae
            java.lang.CharSequence r9 = defpackage.h0e.B0(r9)
            goto L_0x00b0
        L_0x00ae:
            r9 = r16
        L_0x00b0:
            if (r9 == 0) goto L_0x00df
            int r17 = r9.length()
            if (r17 != 0) goto L_0x00b9
            goto L_0x00df
        L_0x00b9:
            boolean r4 = r9 instanceof android.text.Spannable
            if (r4 != 0) goto L_0x00d3
            h97 r4 = new h97
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r9 = defpackage.h0e.B0(r9)
            java.lang.String r9 = r9.toString()
            hw4 r5 = defpackage.hw4.a
            r4.<init>(r9, r5)
            r21 = r4
            goto L_0x0103
        L_0x00d3:
            android.text.Spannable r9 = (android.text.Spannable) r9
            android.text.Spannable r4 = ge.a(r9)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x00e2
        L_0x00df:
            r21 = r16
            goto L_0x0103
        L_0x00e2:
            java.lang.Object r5 = r2.w0
            t97 r5 = (defpackage.t97) r5
            java.lang.Object r5 = r5.getValue()
            m86 r5 = (m86) r5
            java.util.List r5 = r5.a(r7, r4)
            java.lang.String r4 = r4.toString()
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x00fc
            r5 = r16
        L_0x00fc:
            h97 r9 = new h97
            r9.<init>(r4, r5)
            r21 = r9
        L_0x0103:
            o62 r4 = r7.b
            j4a r5 = r4.f0
            boolean r9 = r5 instanceof j4a
            if (r9 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r5 = r16
        L_0x010e:
            java.lang.Long r9 = new java.lang.Long
            r36 = r7
            long r6 = r4.a
            r9.<init>(r6)
            long r6 = r9.longValue()
            r27 = 0
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r9 = r16
        L_0x0124:
            if (r9 == 0) goto L_0x012d
            long r6 = r9.longValue()
        L_0x012a:
            r19 = r6
            goto L_0x0130
        L_0x012d:
            long r6 = r4.l
            goto L_0x012a
        L_0x0130:
            if (r14 != 0) goto L_0x0133
            goto L_0x013e
        L_0x0133:
            long r6 = r14.longValue()
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 != 0) goto L_0x013e
            r22 = r16
            goto L_0x0140
        L_0x013e:
            r22 = r14
        L_0x0140:
            if (r10 != 0) goto L_0x0143
            goto L_0x014e
        L_0x0143:
            long r6 = r10.longValue()
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 != 0) goto L_0x014e
            r23 = r16
            goto L_0x0150
        L_0x014e:
            r23 = r10
        L_0x0150:
            j4a r6 = new j4a
            r24 = 0
            r26 = 112(0x70, float:1.57E-43)
            r25 = 0
            r18 = r6
            r18.<init>(r19, r21, r22, r23, r24, r25, r26)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0169
            java.lang.String r0 = "Old draft equals new draft"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            return r3
        L_0x0169:
            boolean r5 = r6.d()
            java.lang.Object r7 = r2.b
            oz2 r7 = (defpackage.oz2) r7
            if (r5 != 0) goto L_0x023f
            java.lang.Long r5 = r6.c
            h97 r9 = r6.b
            if (r5 == 0) goto L_0x017f
            boolean r5 = swb.B(r9)
            if (r5 != 0) goto L_0x023f
        L_0x017f:
            java.lang.Long r5 = r6.d
            if (r5 == 0) goto L_0x018b
            boolean r5 = swb.B(r9)
            if (r5 == 0) goto L_0x018b
            goto L_0x023f
        L_0x018b:
            java.lang.String r5 = "Old draft NOT equals new draft and new draft is not empty. Start saving"
            defpackage.udd.p(r15, r5, new java.lang.Object[0])
            java.lang.Object r5 = r2.X
            t97 r5 = (defpackage.t97) r5
            java.lang.Object r16 = r5.getValue()
            f03 r16 = (f03) r16
            r18 = r2
            r2 = r16
            i03 r2 = (i03) r2
            r16 = r14
            java.lang.String r14 = "app.draftsChanged"
            r19 = r1
            r1 = 1
            r2.i(r14, r1)
            if (r8 != 0) goto L_0x01bb
            java.lang.Object r1 = r5.getValue()
            f03 r1 = (f03) r1
            lqc r1 = (lqc) r1
            long r1 = r1.m()
        L_0x01b8:
            r32 = r1
            goto L_0x01be
        L_0x01bb:
            long r1 = r4.g0
            goto L_0x01b8
        L_0x01be:
            java.lang.Object r1 = r11.getValue()
            bv2 r1 = (bv2) r1
            aw2 r1 = (aw2) r1
            t52 r29 = r1.l()
            r1 = r36
            long r1 = r1.a
            r30 = r1
            r34 = r6
            r29.k(r30, r32, r34)
            if (r8 != 0) goto L_0x01dd
            java.lang.String r0 = "Drafts sync NOT enabled"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            return r3
        L_0x01dd:
            if (r10 == 0) goto L_0x01ff
            long r1 = r10.longValue()
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 == 0) goto L_0x01ff
            java.lang.String r1 = "we don't sync edit"
            defpackage.udd.p(r15, r1, new java.lang.Object[0])
            boolean r1 = swb.B(r9)
            if (r1 == 0) goto L_0x01fe
            r1 = 2
            r0.X = r1
            java.lang.Object r0 = r7.i(r12, r0)
            r1 = r19
            if (r0 != r1) goto L_0x01fe
            return r1
        L_0x01fe:
            return r3
        L_0x01ff:
            r1 = r19
            boolean r2 = swb.B(r9)
            if (r2 == 0) goto L_0x0221
            if (r16 == 0) goto L_0x0221
            long r4 = r16.longValue()
            int r2 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0221
            java.lang.String r2 = "we don't sync empty text for replied message"
            defpackage.udd.p(r15, r2, new java.lang.Object[0])
            r2 = 3
            r0.X = r2
            java.lang.Object r0 = r7.i(r12, r0)
            if (r0 != r1) goto L_0x0220
            return r1
        L_0x0220:
            return r3
        L_0x0221:
            boolean r2 = swb.B(r9)
            if (r2 == 0) goto L_0x022d
            java.lang.String r0 = "Drafts sync enabled. Draft has no text and no attaches. Do NOT send to server"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            return r3
        L_0x022d:
            java.lang.String r2 = "Drafts sync enabled. Send to server"
            defpackage.udd.p(r15, r2, new java.lang.Object[0])
            r2 = 4
            r0.X = r2
            r2 = r18
            java.lang.Object r0 = defpackage.km4.a(r2, r12, r6, r0)
            if (r0 != r1) goto L_0x023e
            return r1
        L_0x023e:
            return r3
        L_0x023f:
            java.lang.String r2 = "new draft is empty"
            defpackage.udd.p(r15, r2, new java.lang.Object[0])
            r2 = 1
            r0.X = r2
            java.lang.Object r0 = r7.i(r12, r0)
            if (r0 != r1) goto L_0x024e
            return r1
        L_0x024e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm4.o(java.lang.Object):java.lang.Object");
    }
}
