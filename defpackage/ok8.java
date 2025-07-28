package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ok8  reason: default package */
public final class ok8 extends l5e implements i26 {
    public Object X;
    public int Y;
    public final /* synthetic */ pk8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok8(pk8 pk8, Continuation continuation) {
        super(2, continuation);
        this.Z = pk8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ok8) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ok8(this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r8.Y
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            pk8 r6 = r8.Z
            if (r1 == 0) goto L_0x0038
            if (r1 == r5) goto L_0x0034
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r8 = r8.X
            java.util.Collection r8 = (java.util.Collection) r8
            defpackage.wx3.H(r9)
            goto L_0x0076
        L_0x001c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0024:
            java.lang.Object r1 = r8.X
            java.util.Collection r1 = (java.util.Collection) r1
            defpackage.wx3.H(r9)
            goto L_0x0066
        L_0x002c:
            java.lang.Object r1 = r8.X
            dyc r1 = (defpackage.dyc) r1
            defpackage.wx3.H(r9)
            goto L_0x0052
        L_0x0034:
            defpackage.wx3.H(r9)
            goto L_0x0044
        L_0x0038:
            defpackage.wx3.H(r9)
            r8.Y = r5
            java.lang.Object r9 = defpackage.pk8.a(r6, r8)
            if (r9 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r1 = r9
            dyc r1 = (defpackage.dyc) r1
            r8.X = r1
            r8.Y = r4
            java.io.Serializable r9 = defpackage.pk8.b(r6, r8)
            if (r9 != r0) goto L_0x0052
            return r0
        L_0x0052:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r1 = defpackage.myc.U(r1)
            r8.X = r9
            r8.Y = r3
            java.lang.Object r1 = defpackage.lp.c(r1, r8)
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0066:
            java.util.Collection r9 = (java.util.Collection) r9
            r8.X = r9
            r8.Y = r2
            java.lang.Object r8 = defpackage.lp.c(r1, r8)
            if (r8 != r0) goto L_0x0073
            return r0
        L_0x0073:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0076:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = defpackage.o23.i0(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            t97 r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            kn3 r8 = (kn3) r8
            xz6 r0 = new xz6
            r1 = 15
            r0.<init>(r1)
            r8.c(r9, r0)
            zb9 r8 = new zb9
            int r0 = r9.size()
            r8.<init>((int) r0)
            nu r0 = new nu
            r1 = 2
            r0.<init>(r8, r1)
            eq5 r8 = new eq5
            r1 = 1
            r8.<init>(r1, r0)
            r9.removeIf(r8)
            r8 = 0
            grd r0 = r6.j
            r0.m(r8, r9)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.g
            r9 = 0
            r8.set(r9)
            jue r8 = defpackage.jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok8.o(java.lang.Object):java.lang.Object");
    }
}
