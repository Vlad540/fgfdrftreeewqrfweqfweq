package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m9d  reason: default package */
public final class m9d extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t9d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.Z = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m9d m9d = new m9d(this.Z, continuation);
        m9d.Y = obj;
        return m9d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r4 = r6;
        r6 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        udd.s(r5.getClass().getName(), "fail to disable SAFE_MODE", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r5 = r5.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        defpackage.taf.o(r2.P0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000f, B:11:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[ExcHandler: TamErrorException (r5v8 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:4:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.X
            t9d r2 = r5.Z
            r3 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            java.lang.Object r5 = r5.Y
            ou3 r5 = (ou3) r5
            wx3.H(r6)     // Catch:{ TamErrorException -> 0x0015, all -> 0x0013 }
            goto L_0x005b
        L_0x0013:
            r6 = move-exception
            goto L_0x003e
        L_0x0015:
            r5 = move-exception
            goto L_0x0050
        L_0x0017:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001f:
            wx3.H(r6)
            java.lang.Object r6 = r5.Y
            ou3 r6 = (ou3) r6
            t97 r1 = r2.z0     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            tve r1 = (defpackage.tve) r1     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            r5.Y = r6     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            r5.X = r3     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            r3 = 0
            java.lang.Object r5 = r1.a(r3, r5)     // Catch:{ TamErrorException -> 0x0015, all -> 0x003a }
            if (r5 != r0) goto L_0x005b
            return r0
        L_0x003a:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x003e:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x005b
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "fail to disable SAFE_MODE"
            udd.s(r5, r0, r6)
            goto L_0x005b
        L_0x0050:
            java.lang.String r5 = r5.getLocalizedMessage()
            if (r5 == 0) goto L_0x005b
            l05 r6 = r2.P0
            defpackage.taf.o(r6, r5)
        L_0x005b:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9d.o(java.lang.Object):java.lang.Object");
    }
}
