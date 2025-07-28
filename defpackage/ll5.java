package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ll5  reason: default package */
public final class ll5 extends l5e implements m26 {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ll5(long j, i26 i26, Continuation continuation) {
        super(4, continuation);
        this.w0 = j;
        this.x0 = i26;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        rj5 rj5 = (rj5) obj;
        long longValue = ((Number) obj3).longValue();
        ll5 ll5 = new ll5(this.w0, this.x0, (Continuation) obj4);
        ll5.Y = (Throwable) obj2;
        ll5.Z = longValue;
        return ll5.o(jue.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            defpackage.wx3.H(r8)
            goto L_0x002d
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0015:
            defpackage.wx3.H(r8)
            java.lang.Throwable r8 = r7.Y
            long r3 = r7.Z
            long r5 = r7.w0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0036
            r7.X = r2
            i26 r1 = r7.x0
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll5.o(java.lang.Object):java.lang.Object");
    }
}
