package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kk  reason: default package */
public final class kk extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ duf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kk(duf duf, Continuation continuation) {
        super(2, continuation);
        this.Z = duf;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((kk) n((rj5) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kk kkVar = new kk(this.Z, continuation);
        kkVar.Y = obj;
        return kkVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[EDGE_INSN: B:22:0x0057->B:15:0x0057 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC] */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r9.X
            r2 = 3
            r3 = 2
            r4 = 1
            duf r5 = r9.Z
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001a:
            java.lang.Object r1 = r9.Y
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r10)
            goto L_0x0072
        L_0x0022:
            java.lang.Object r1 = r9.Y
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r10)
            goto L_0x0032
        L_0x002a:
            defpackage.wx3.H(r10)
            java.lang.Object r10 = r9.Y
            rj5 r10 = (defpackage.rj5) r10
            r1 = r10
        L_0x0032:
            java.lang.Object r10 = r5.c
            s16 r10 = (defpackage.s16) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0057
            int r10 = defpackage.zp4.o
            r10 = 10
            eq4 r6 = defpackage.eq4.SECONDS
            long r6 = defpackage.mt0.P(r10, r6)
            r9.Y = r1
            r9.X = r4
            java.lang.Object r10 = ek8.r(r6, r9)
            if (r10 != r0) goto L_0x0032
            return r0
        L_0x0057:
            java.lang.Object r10 = r5.a
            fk r10 = (defpackage.fk) r10
            long r6 = r10.a
            jk r10 = new jk
            r8 = 0
            r10.<init>(r5, r8)
            r9.Y = r1
            r9.X = r3
            long r6 = ek8.b0(r6)
            java.lang.Object r10 = defpackage.ez3.m0(r6, r10, r9)
            if (r10 != r0) goto L_0x0072
            return r0
        L_0x0072:
            if (r10 != 0) goto L_0x0032
            gk r10 = new gk
            java.lang.Object r6 = r5.a
            fk r6 = (defpackage.fk) r6
            long r6 = r6.a
            java.lang.String r6 = defpackage.zp4.j(r6)
            java.lang.String r7 = "Application Not Responding for at least "
            java.lang.String r6 = r7.concat(r6)
            r10.<init>(r6)
            r9.Y = r1
            r9.X = r2
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L_0x0032
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.o(java.lang.Object):java.lang.Object");
    }
}
