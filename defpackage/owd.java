package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: owd  reason: default package */
public final class owd extends l5e implements i26 {
    public gvd X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ qwd w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owd(qwd qwd, Continuation continuation) {
        super(2, continuation);
        this.w0 = qwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        owd owd = new owd(this.w0, continuation);
        owd.Z = obj;
        return owd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r0 = pu3.a
            int r1 = r12.Y
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0026
            if (r1 == r2) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            gvd r0 = r12.X
            java.lang.Object r1 = r12.Z
            ou3 r1 = (ou3) r1
            wx3.H(r13)
            goto L_0x0077
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001e:
            java.lang.Object r1 = r12.Z
            ou3 r1 = (ou3) r1
            wx3.H(r13)
            goto L_0x0056
        L_0x0026:
            wx3.H(r13)
            java.lang.Object r13 = r12.Z
            ou3 r13 = (ou3) r13
            qwd r1 = r12.w0
            java.util.concurrent.atomic.AtomicReference r1 = r1.g
            java.lang.Object r1 = r1.get()
            mwd r1 = (defpackage.mwd) r1
            qwd r4 = r12.w0
            t97 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            r5 = r4
            kvd r5 = (defpackage.kvd) r5
            java.lang.String r6 = r1.b
            long r7 = r1.a
            r12.Z = r13
            r12.Y = r2
            r10 = 4
            r9 = r12
            java.lang.Object r1 = defpackage.kvd.d(r5, r6, r7, r9, r10)
            if (r1 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x0056:
            gvd r13 = (defpackage.gvd) r13
            qwd r2 = r12.w0
            t97 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            lud r2 = (defpackage.lud) r2
            java.util.List r4 = r13.a
            phd r2 = r2.c(r4)
            r12.Z = r1
            r12.X = r13
            r12.Y = r3
            java.lang.Object r2 = e07.d(r2, r12)
            if (r2 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r0 = r13
            r13 = r2
        L_0x0077:
            java.util.List r13 = (java.util.List) r13
            qwd r2 = r12.w0
            java.util.concurrent.atomic.AtomicReference r2 = r2.g
            iwd r4 = new iwd
            r5 = 1
            r4.<init>(r0, r5)
            r2.updateAndGet(r4)
            qwd r2 = r12.w0
            grd r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            nwd r2 = (defpackage.nwd) r2
            java.util.List r2 = r2.a
            if (r2 != 0) goto L_0x0096
            hw4 r2 = hw4.a
        L_0x0096:
            java.util.ArrayList r13 = o23.i0(r2, r13)
            qwd r12 = r12.w0
            grd r12 = r12.d
            nwd r2 = new nwd
            r4 = 0
            r2.<init>(r3, r4, r13)
            r13 = 0
            r12.m(r13, r2)
            java.lang.Class r12 = r1.getClass()
            java.lang.String r12 = r12.getName()
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x00b5
            goto L_0x00de
        L_0x00b5:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x00de
            tn7 r2 = defpackage.tn7.X
            java.util.List r3 = r0.a
            int r3 = r3.size()
            long r4 = r0.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Stickers sets search. LoadNext. finish, size:"
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r3 = "|marker:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.d(r2, r12, r0, r13)
        L_0x00de:
            jue r12 = jue.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owd.o(java.lang.Object):java.lang.Object");
    }
}
