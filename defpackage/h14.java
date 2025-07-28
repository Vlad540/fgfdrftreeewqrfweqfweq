package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h14  reason: default package */
public final class h14 extends l5e implements i26 {
    public int X;
    public int Y;
    public final /* synthetic */ m14 Z;
    public final /* synthetic */ u16 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h14(m14 m14, u16 u16, Continuation continuation) {
        super(2, continuation);
        this.Z = m14;
        this.w0 = u16;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h14(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0066=Splitter:B:22:0x0066, B:27:0x008b=Splitter:B:27:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.Y
            m14 r2 = r8.Z
            r3 = 1
            java.lang.String r4 = "finish "
            if (r1 == 0) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            int r8 = r8.X
            wx3.H(r9)     // Catch:{ CancellationException -> 0x0015, all -> 0x0013 }
            goto L_0x004a
        L_0x0013:
            r9 = move-exception
            goto L_0x0066
        L_0x0015:
            r9 = move-exception
            goto L_0x008b
        L_0x0018:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0020:
            wx3.H(r9)
            java.util.concurrent.atomic.AtomicInteger r9 = r2.i
            int r9 = r9.incrementAndGet()
            java.lang.String r1 = defpackage.m14.k
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "start "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            udd.q(r1, r5)
            u16 r1 = r8.w0     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            r8.X = r9     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            r8.Y = r3     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            java.lang.Object r8 = r1.invoke(r8)     // Catch:{ CancellationException -> 0x0061, all -> 0x005c }
            if (r8 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r8 = r9
        L_0x004a:
            java.lang.String r9 = defpackage.m14.k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
        L_0x0051:
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            udd.q(r9, r8)
            goto L_0x0088
        L_0x005c:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0066
        L_0x0061:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x008b
        L_0x0066:
            k77[] r0 = defpackage.m14.j     // Catch:{ all -> 0x008c }
            r2.getClass()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "DebounceNotificationDispatcher"
            java.lang.String r1 = "failure"
            udd.s(r0, r1, r9)     // Catch:{ all -> 0x008c }
            t97 r0 = r2.b     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008c }
            g15 r0 = (defpackage.g15) r0     // Catch:{ all -> 0x008c }
            r4a r0 = (r4a) r0     // Catch:{ all -> 0x008c }
            r1 = 0
            r0.c(r9, r1)     // Catch:{ all -> 0x008c }
            java.lang.String r9 = defpackage.m14.k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            goto L_0x0051
        L_0x0088:
            jue r8 = jue.a
            return r8
        L_0x008b:
            throw r9     // Catch:{ all -> 0x008c }
        L_0x008c:
            r9 = move-exception
            java.lang.String r0 = defpackage.m14.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            udd.q(r0, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h14.o(java.lang.Object):java.lang.Object");
    }
}
