package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l7f  reason: default package */
public final class l7f extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k7f Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l7f(k7f k7f, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = k7f;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        n((rj5) obj, (Continuation) obj2).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l7f l7f = new l7f(this.Z, this.w0, continuation);
        l7f.Y = obj;
        return l7f;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = pu3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r6.Y
            rj5 r1 = (rj5) r1
            wx3.H(r7)
            goto L_0x002c
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001c:
            java.lang.Object r1 = r6.Y
            rj5 r1 = (rj5) r1
            wx3.H(r7)
            goto L_0x004e
        L_0x0024:
            wx3.H(r7)
            java.lang.Object r7 = r6.Y
            rj5 r7 = (rj5) r7
            r1 = r7
        L_0x002c:
            k7f r7 = r6.Z
            boolean r4 = r7.a()
            if (r4 == 0) goto L_0x004e
            long r4 = r7.F0()
            eq4 r7 = eq4.c
            long r4 = mt0.Q(r4, r7)
            zp4 r7 = new zp4
            r7.<init>(r4)
            r6.Y = r1
            r6.X = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r6.Y = r1
            r6.X = r2
            long r4 = r6.w0
            java.lang.Object r7 = defpackage.ek8.r(r4, r6)
            if (r7 != r0) goto L_0x002c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7f.o(java.lang.Object):java.lang.Object");
    }
}
