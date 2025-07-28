package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* renamed from: lk5  reason: default package */
public final class lk5 extends l5e implements i26 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ TimeUnit w0;
    public final /* synthetic */ long x0 = 0;
    public final /* synthetic */ long y0 = 100;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk5(TimeUnit timeUnit, Continuation continuation) {
        super(2, continuation);
        this.w0 = timeUnit;
    }

    public final Object invoke(Object obj, Object obj2) {
        n((rj5) obj, (Continuation) obj2).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lk5 lk5 = new lk5(this.w0, continuation);
        lk5.Z = obj;
        return lk5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.Y
            java.util.concurrent.TimeUnit r2 = r9.w0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x002d
            if (r1 == r4) goto L_0x0023
            if (r1 != r3) goto L_0x001b
            long r5 = r9.X
            java.lang.Object r1 = r9.Z
            rj5 r1 = (rj5) r1
            wx3.H(r10)
            goto L_0x0050
        L_0x001b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0023:
            long r5 = r9.X
            java.lang.Object r1 = r9.Z
            rj5 r1 = (rj5) r1
            wx3.H(r10)
            goto L_0x0066
        L_0x002d:
            java.lang.Object r1 = r9.Z
            rj5 r1 = (rj5) r1
            wx3.H(r10)
            goto L_0x004e
        L_0x0035:
            wx3.H(r10)
            java.lang.Object r10 = r9.Z
            r1 = r10
            rj5 r1 = (rj5) r1
            long r6 = r9.x0
            long r6 = r2.toMillis(r6)
            r9.Z = r1
            r9.Y = r5
            java.lang.Object r10 = defpackage.ek8.q(r6, r9)
            if (r10 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r5 = 0
        L_0x0050:
            r7 = 1
            long r7 = r7 + r5
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r9.Z = r1
            r9.X = r7
            r9.Y = r4
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L_0x0065
            return r0
        L_0x0065:
            r5 = r7
        L_0x0066:
            long r7 = r9.y0
            long r7 = r2.toMillis(r7)
            r9.Z = r1
            r9.X = r5
            r9.Y = r3
            java.lang.Object r10 = defpackage.ek8.q(r7, r9)
            if (r10 != r0) goto L_0x0050
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk5.o(java.lang.Object):java.lang.Object");
    }
}
