package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z37  reason: default package */
public final class z37 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s30 Z;
    public final /* synthetic */ u16 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z37(s30 s30, sq2 sq2, Continuation continuation) {
        super(2, continuation);
        this.Z = s30;
        this.w0 = sq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((x37) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z37 z37 = new z37(this.Z, this.w0, continuation);
        z37.Y = obj;
        return z37;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.X
            r2 = 2
            r3 = 1
            s30 r4 = r9.Z
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            wx3.H(r10)
            goto L_0x00a0
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001b:
            java.lang.Object r1 = r9.Y
            java.lang.String r1 = (java.lang.String) r1
            wx3.H(r10)
            goto L_0x0058
        L_0x0023:
            wx3.H(r10)
            java.lang.Object r10 = r9.Y
            x37 r10 = (defpackage.x37) r10
            java.lang.String r1 = r10.a
            java.lang.Object r5 = r4.b
            i26 r5 = (i26) r5
            java.lang.Object r6 = r4.c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Peek from queue job="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r5.invoke(r6, r7)
            g37 r10 = r10.b
            boolean r5 = r10.isCancelled()
            if (r5 != 0) goto L_0x0072
            r9.Y = r1
            r9.X = r3
            java.lang.Object r10 = r10.join(r9)
            if (r10 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.Object r10 = r4.b
            i26 r10 = (i26) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Executed job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
            goto L_0x008b
        L_0x0072:
            java.lang.Object r10 = r4.b
            i26 r10 = (i26) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cancelled job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
        L_0x008b:
            java.lang.Object r10 = r4.X
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            r10.remove(r1)
            r10 = 0
            r9.Y = r10
            r9.X = r2
            u16 r10 = r9.w0
            java.lang.Object r9 = r10.invoke(r9)
            if (r9 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z37.o(java.lang.Object):java.lang.Object");
    }
}
