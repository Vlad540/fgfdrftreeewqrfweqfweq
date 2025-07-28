package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xb3  reason: default package */
public final class xb3 extends l5e implements i26 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ zb3 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xb3(zb3 zb3, Continuation continuation) {
        super(2, continuation);
        this.w0 = zb3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xb3 xb3 = new xb3(this.w0, continuation);
        xb3.Z = obj;
        return xb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        r12 = r14;
        r14 = r13;
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        udd.s(r13.getClass().getName(), "fail to update safe mode", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        r13 = r13.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r13 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
        defpackage.taf.o(r4.y0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0013, B:12:0x002c] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0013, B:18:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[ExcHandler: TamErrorException (r13v10 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:5:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            pu3 r0 = pu3.a
            int r1 = r13.Y
            r2 = 0
            r3 = 2
            zb3 r4 = r13.w0
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            java.lang.Object r13 = r13.Z
            ou3 r13 = (ou3) r13
            wx3.H(r14)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            goto L_0x00c2
        L_0x0018:
            r14 = move-exception
            goto L_0x00ce
        L_0x001b:
            r13 = move-exception
            goto L_0x00e0
        L_0x001e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0026:
            long r6 = r13.X
            java.lang.Object r1 = r13.Z
            ou3 r1 = (ou3) r1
            wx3.H(r14)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0031 }
            r14 = r1
            goto L_0x005d
        L_0x0031:
            r14 = move-exception
            r13 = r1
            goto L_0x00ce
        L_0x0035:
            wx3.H(r14)
            java.lang.Object r14 = r13.Z
            ou3 r14 = (ou3) r14
            int r1 = zp4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            eq4 r1 = eq4.b     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = mt0.Q(r6, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            t97 r1 = r4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            tve r1 = (defpackage.tve) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Z = r14     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.X = r6     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Y = r5     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.a(r5, r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            if (r1 != r0) goto L_0x005d
            return r0
        L_0x005d:
            t97 r1 = r4.c     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            f03 r1 = (defpackage.f03) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r8 = r4.b     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            i03 r1 = (defpackage.i03) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r10 = "app.pin_"
            r9.<init>(r10)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r10 = r1.s()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r9.append(r10)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r9 = r9.toString()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r1.l(r9, r8)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            t97 r1 = r4.c     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            f03 r1 = (defpackage.f03) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            i03 r1 = (defpackage.i03) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r8 = "app.onboarding.safe_mode"
            r1.i(r8, r5)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            int r1 = zp4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            eq4 r1 = eq4.b     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = mt0.Q(r8, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = zp4.g(r8, r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            eq4 r1 = eq4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = mt0.P(r5, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = zp4.g(r8, r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = zp4.e(r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c1
            r13.Z = r14     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Y = r3     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r13 = defpackage.ek8.r(r6, r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            if (r13 != r0) goto L_0x00c1
            return r0
        L_0x00bc:
            r13 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x00ce
        L_0x00c1:
            r13 = r14
        L_0x00c2:
            n1g.k(r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            l05 r14 = r4.z0     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            jue r0 = jue.a     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            defpackage.taf.o(r14, r0)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            r2 = r5
            goto L_0x00eb
        L_0x00ce:
            boolean r0 = r14 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x00eb
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r0 = "fail to update safe mode"
            udd.s(r13, r0, r14)
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r13 = r13.getLocalizedMessage()
            if (r13 == 0) goto L_0x00eb
            l05 r14 = r4.y0
            defpackage.taf.o(r14, r13)
        L_0x00eb:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb3.o(java.lang.Object):java.lang.Object");
    }
}
