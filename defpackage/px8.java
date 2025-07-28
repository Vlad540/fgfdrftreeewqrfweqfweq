package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: px8  reason: default package */
public final class px8 extends l5e implements i26 {
    public mc9 X;
    public zz8 Y;
    public Object Z;
    public int w0;
    public final /* synthetic */ zz8 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.x0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new px8(this.x0, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[RETURN] */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.w0
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r1 = r5.Z
            zz8 r3 = r5.Y
            mc9 r4 = r5.X
            wx3.H(r6)
            goto L_0x003c
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001b:
            wx3.H(r6)
            zz8 r6 = r5.x0
            grd r1 = r6.G1
            r3 = r6
            r4 = r1
        L_0x0024:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            ktd r6 = (defpackage.ktd) r6
            acc r6 = r3.x0
            r5.X = r4
            r5.Y = r3
            r5.Z = r1
            r5.w0 = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L_0x003c
            return r0
        L_0x003c:
            ktd r6 = (defpackage.ktd) r6
            boolean r6 = r4.b(r1, r6)
            if (r6 == 0) goto L_0x0024
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px8.o(java.lang.Object):java.lang.Object");
    }
}
