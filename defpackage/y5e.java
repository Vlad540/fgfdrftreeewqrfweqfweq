package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y5e  reason: default package */
public final class y5e extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h6e Z;
    public final /* synthetic */ wve w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5e(h6e h6e, wve wve, Continuation continuation) {
        super(2, continuation);
        this.Z = h6e;
        this.w0 = wve;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y5e y5e = new y5e(this.Z, this.w0, continuation);
        y5e.Y = obj;
        return y5e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r5 = r5.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r5 != 5) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r6 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (defpackage.sxe.b(r5) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r19 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r10 = new defpackage.ag5(r11, r4.b, r3.b, r3.c, r3.d, r3.e, r3.a.d(defpackage.ile.class), r18, r19, r3.f);
        r5 = new gl5(new djc(new wl5(ez3.y(new zi1(new q02(new defpackage.vf5(r10, (kotlin.coroutines.Continuation) null), bw4.a, -2, 1, 0), 28), new defpackage.vg0(13)), new defpackage.ox2(3, (kotlin.coroutines.Continuation) null, 1), (kotlin.coroutines.Continuation) null)), new defpackage.ox2(r10, (kotlin.coroutines.Continuation) null));
        r0.X = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d8, code lost:
        if (ez3.C(r5, r2, r0) != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pu3 r1 = pu3.a
            int r2 = r0.X
            r9 = 1
            if (r2 == 0) goto L_0x0018
            if (r2 != r9) goto L_0x0010
            wx3.H(r22)
            goto L_0x00db
        L_0x0010:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0018:
            wx3.H(r22)
            java.lang.Object r2 = r0.Y
            rj5 r2 = (rj5) r2
            h6e r3 = r0.Z
            t97 r3 = r3.g
            java.lang.Object r3 = r3.getValue()
            aqe r3 = (defpackage.aqe) r3
            wve r4 = r0.w0
            java.lang.String r11 = r4.d
            fwe r5 = r4.a
            int r6 = r5.c
            int r7 = hr1.t(r6)
            r8 = 3
            r10 = 5
            switch(r7) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0053;
                case 3: goto L_0x0053;
                case 4: goto L_0x0051;
                case 5: goto L_0x004d;
                case 6: goto L_0x0053;
                case 7: goto L_0x004a;
                case 8: goto L_0x0056;
                default: goto L_0x003a;
            }
        L_0x003a:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = defpackage.sxe.s(r6)
            java.lang.String r2 = "unknown http type for upload type="
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x004a:
            r18 = r10
            goto L_0x0058
        L_0x004d:
            r6 = 2
        L_0x004e:
            r18 = r6
            goto L_0x0058
        L_0x0051:
            r6 = 4
            goto L_0x004e
        L_0x0053:
            r18 = r9
            goto L_0x0058
        L_0x0056:
            r18 = r8
        L_0x0058:
            int r5 = r5.c
            if (r5 != r10) goto L_0x005e
            r6 = r9
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            r7 = 0
            if (r6 != 0) goto L_0x006c
            boolean r5 = defpackage.sxe.b(r5)
            if (r5 == 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r19 = r7
            goto L_0x0070
        L_0x006c:
            java.lang.String r5 = r4.c
            r19 = r5
        L_0x0070:
            w4 r5 = r3.a
            java.lang.Class<ile> r6 = defpackage.ile.class
            r7e r17 = r5.d(r6)
            ag5 r6 = new ag5
            zpe r5 = r3.f
            t97 r10 = r3.c
            r14 = r10
            r7e r14 = (r7e) r14
            java.lang.String r12 = r4.b
            pae r13 = r3.b
            t97 r15 = r3.d
            t97 r3 = r3.e
            r10 = r6
            r16 = r3
            r20 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            vf5 r4 = new vf5
            r4.<init>(r6, r7)
            q02 r10 = new q02
            bw4 r5 = bw4.a
            r11 = -2
            r12 = 0
            r3 = r10
            r13 = r6
            r6 = r11
            r11 = r7
            r7 = r9
            r14 = r8
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            zi1 r3 = new zi1
            r4 = 28
            r3.<init>(r10, r4)
            vg0 r4 = new vg0
            r5 = 13
            r4.<init>(r5)
            gj4 r3 = ez3.y(r3, r4)
            ox2 r4 = new ox2
            r5 = 1
            r4.<init>((int) r14, (kotlin.coroutines.Continuation) r11, (int) r5)
            wl5 r5 = new wl5
            r5.<init>(r3, r4, r11)
            djc r3 = new djc
            r3.<init>(r5)
            ox2 r4 = new ox2
            r4.<init>((defpackage.ag5) r13, (kotlin.coroutines.Continuation) r11)
            gl5 r5 = new gl5
            r5.<init>(r3, r4)
            r0.X = r9
            java.lang.Object r0 = ez3.C(r5, r2, r0)
            if (r0 != r1) goto L_0x00db
            return r1
        L_0x00db:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5e.o(java.lang.Object):java.lang.Object");
    }
}
