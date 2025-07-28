package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n19  reason: default package */
public final class n19 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t97 Z;
    public final /* synthetic */ tf3 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n19(t97 t97, tf3 tf3, Continuation continuation) {
        super(2, continuation);
        this.Z = t97;
        this.w0 = tf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n19 n19 = new n19(this.Z, this.w0, continuation);
        n19.Y = obj;
        return n19;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r4 = r6;
        r6 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:11:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ExcHandler: CancellationException (r5v6 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.X
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r5 = r5.Y
            ou3 r5 = (ou3) r5
            wx3.H(r6)     // Catch:{ CancellationException -> 0x0013, all -> 0x0011 }
            goto L_0x004d
        L_0x0011:
            r6 = move-exception
            goto L_0x003f
        L_0x0013:
            r5 = move-exception
            goto L_0x004e
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001d:
            wx3.H(r6)
            java.lang.Object r6 = r5.Y
            ou3 r6 = (ou3) r6
            t97 r1 = r5.Z
            tf3 r3 = r5.w0
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            h7a r1 = (h7a) r1     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            r5.Y = r6     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            r5.X = r2     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            java.lang.Object r6 = r1.c(r3, r5)     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            if (r6 != r0) goto L_0x004d
            return r0
        L_0x0039:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x003f
        L_0x003d:
            r5 = move-exception
            goto L_0x0039
        L_0x003f:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "fail to fetch self avatar"
            udd.s(r5, r0, r6)
            r6 = 0
        L_0x004d:
            return r6
        L_0x004e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n19.o(java.lang.Object):java.lang.Object");
    }
}
