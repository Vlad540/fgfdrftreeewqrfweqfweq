package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: zi2  reason: default package */
public final class zi2 extends l5e implements i26 {
    public rj5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ fj2 w0;
    public final /* synthetic */ Set x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zi2(fj2 fj2, Set set, Continuation continuation) {
        super(2, continuation);
        this.w0 = fj2;
        this.x0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zi2 zi2 = new zi2(this.w0, this.x0, continuation);
        zi2.Z = obj;
        return zi2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: rj5} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0020, B:13:0x002c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[ExcHandler: CancellationException (r7v4 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:9:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = pu3.a
            int r1 = r7.Y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            wx3.H(r8)
            goto L_0x0074
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001c:
            java.lang.Object r1 = r7.Z
            rj5 r1 = (rj5) r1
            wx3.H(r8)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            goto L_0x0074
        L_0x0024:
            r7 = move-exception
            goto L_0x0077
        L_0x0026:
            rj5 r1 = r7.X
            java.lang.Object r4 = r7.Z
            rj5 r4 = (rj5) r4
            wx3.H(r8)     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r1 = r4
            goto L_0x0065
        L_0x0032:
            wx3.H(r8)
            java.lang.Object r8 = r7.Z
            r1 = r8
            rj5 r1 = (rj5) r1
            fj2 r8 = r7.w0
            java.util.Set r6 = r7.x0
            t97 r8 = r8.c     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            eb5 r8 = (defpackage.eb5) r8     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.util.List r6 = o23.s0(r6)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.Z = r1     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.X = r1     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.Y = r4     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.lang.Object r8 = r8.b(r6, r7)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            if (r8 != r0) goto L_0x0057
            return r0
        L_0x0057:
            r4 = r1
        L_0x0058:
            r7.Z = r4     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            r7.X = r5     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            r7.Y = r3     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            java.lang.Object r7 = r1.a(r8, r7)     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            if (r7 != r0) goto L_0x0074
            return r0
        L_0x0065:
            hw4 r8 = hw4.a
            r7.Z = r5
            r7.X = r5
            r7.Y = r2
            java.lang.Object r7 = r1.a(r8, r7)
            if (r7 != r0) goto L_0x0074
            return r0
        L_0x0074:
            jue r7 = jue.a
            return r7
        L_0x0077:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi2.o(java.lang.Object):java.lang.Object");
    }
}
