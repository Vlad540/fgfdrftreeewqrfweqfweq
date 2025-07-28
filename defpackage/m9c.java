package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m9c  reason: default package */
public final class m9c extends l5e implements i26 {
    public qc9 X;
    public i26 Y;
    public int Z;
    public final /* synthetic */ qc9 w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m9c(qc9 qc9, i26 i26, Continuation continuation) {
        super(2, continuation);
        this.w0 = qc9;
        this.x0 = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m9c) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m9c(this.w0, this.x0, continuation);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [qc9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.Z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            qc9 r6 = r6.X
            defpackage.wx3.H(r7)     // Catch:{ all -> 0x0013 }
            goto L_0x004f
        L_0x0013:
            r7 = move-exception
            goto L_0x005b
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001d:
            i26 r1 = r6.Y
            qc9 r3 = r6.X
            defpackage.wx3.H(r7)
            r7 = r3
            goto L_0x003c
        L_0x0026:
            defpackage.wx3.H(r7)
            qc9 r7 = r6.w0
            r6.X = r7
            i26 r1 = r6.x0
            r6.Y = r1
            r6.Z = r3
            tc9 r7 = (defpackage.tc9) r7
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L_0x003c
            return r0
        L_0x003c:
            l9c r3 = new l9c     // Catch:{ all -> 0x0057 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0057 }
            r6.X = r7     // Catch:{ all -> 0x0057 }
            r6.Y = r4     // Catch:{ all -> 0x0057 }
            r6.Z = r2     // Catch:{ all -> 0x0057 }
            java.lang.Object r6 = defpackage.n1g.f(r3, r6)     // Catch:{ all -> 0x0057 }
            if (r6 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r6 = r7
        L_0x004f:
            tc9 r6 = (defpackage.tc9) r6
            r6.e(r4)
            jue r6 = defpackage.jue.a
            return r6
        L_0x0057:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x005b:
            tc9 r6 = (defpackage.tc9) r6
            r6.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9c.o(java.lang.Object):java.lang.Object");
    }
}
