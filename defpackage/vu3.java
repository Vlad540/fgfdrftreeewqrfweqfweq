package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: vu3  reason: default package */
public final class vu3 extends l5e implements i26 {
    public os0 X;
    public int Y;
    public final /* synthetic */ aec Z;
    public final /* synthetic */ wu3 w0;
    public final /* synthetic */ i02 x0;
    public final /* synthetic */ Callable y0;
    public final /* synthetic */ i02 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vu3(aec aec, wu3 wu3, us0 us0, Callable callable, us0 us02, Continuation continuation) {
        super(2, continuation);
        this.Z = aec;
        this.w0 = wu3;
        this.x0 = us0;
        this.y0 = callable;
        this.z0 = us02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vu3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vu3(this.Z, this.w0, (us0) this.x0, this.y0, (us0) this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r8.Y
            r2 = 2
            r3 = 1
            wu3 r4 = r8.w0
            aec r5 = r8.Z
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            os0 r1 = r8.X
            defpackage.wx3.H(r9)     // Catch:{ all -> 0x0017 }
        L_0x0015:
            r9 = r1
            goto L_0x0035
        L_0x0017:
            r8 = move-exception
            goto L_0x0069
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0021:
            os0 r1 = r8.X
            defpackage.wx3.H(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x0043
        L_0x0027:
            defpackage.wx3.H(r9)
            q07 r9 = r5.e
            r9.a(r4)
            i02 r9 = r8.x0     // Catch:{ all -> 0x0017 }
            os0 r9 = r9.iterator()     // Catch:{ all -> 0x0017 }
        L_0x0035:
            r8.X = r9     // Catch:{ all -> 0x0017 }
            r8.Y = r3     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r9.b(r8)     // Catch:{ all -> 0x0017 }
            if (r1 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0043:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0017 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0017 }
            if (r9 == 0) goto L_0x0061
            r1.c()     // Catch:{ all -> 0x0017 }
            java.util.concurrent.Callable r9 = r8.y0     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = r9.call()     // Catch:{ all -> 0x0017 }
            i02 r6 = r8.z0     // Catch:{ all -> 0x0017 }
            r8.X = r1     // Catch:{ all -> 0x0017 }
            r8.Y = r2     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = r6.o(r9, r8)     // Catch:{ all -> 0x0017 }
            if (r9 != r0) goto L_0x0015
            return r0
        L_0x0061:
            q07 r8 = r5.e
            r8.c(r4)
            jue r8 = defpackage.jue.a
            return r8
        L_0x0069:
            q07 r9 = r5.e
            r9.c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu3.o(java.lang.Object):java.lang.Object");
    }
}
