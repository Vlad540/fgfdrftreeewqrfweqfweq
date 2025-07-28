package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: i82  reason: default package */
public final class i82 extends l5e implements i26 {
    public List X;
    public tc9 Y;
    public b92 Z;
    public int w0;
    public final /* synthetic */ b92 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i82(b92 b92, Continuation continuation) {
        super(2, continuation);
        this.x0 = b92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i82(this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            b92 r5 = r0.x0
            if (r2 == 0) goto L_0x0028
            if (r2 == r4) goto L_0x0022
            if (r2 != r3) goto L_0x001a
            b92 r1 = r0.Z
            tc9 r2 = r0.Y
            java.util.List r0 = r0.X
            wx3.H(r26)
            goto L_0x0050
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            wx3.H(r26)
            r2 = r26
            goto L_0x003a
        L_0x0028:
            wx3.H(r26)
            java.lang.String r2 = defpackage.b92.O0
            udc r2 = r5.e()
            r0.w0 = r4
            java.lang.Object r2 = r2.d(r0)
            if (r2 != r1) goto L_0x003a
            return r1
        L_0x003a:
            java.util.List r2 = (java.util.List) r2
            tc9 r4 = r5.G0
            r0.X = r2
            r0.Y = r4
            r0.Z = r5
            r0.w0 = r3
            java.lang.Object r0 = r4.d(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r2
            r2 = r4
            r1 = r5
        L_0x0050:
            r3 = 0
            r7e r1 = r1.K0     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x007a }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x007a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x007a }
            r4.<init>()     // Catch:{ all -> 0x007a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007a }
        L_0x0062:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x009c
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x007a }
            r7 = r6
            hdc r7 = (defpackage.hdc) r7     // Catch:{ all -> 0x007a }
            boolean r8 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x007d
            boolean r8 = r0.isEmpty()     // Catch:{ all -> 0x007a }
            if (r8 == 0) goto L_0x007d
            goto L_0x0098
        L_0x007a:
            r0 = move-exception
            goto L_0x011f
        L_0x007d:
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x007a }
        L_0x0081:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x0098
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x007a }
            hdc r9 = (defpackage.hdc) r9     // Catch:{ all -> 0x007a }
            java.util.Set r9 = r9.e     // Catch:{ all -> 0x007a }
            java.util.Set r10 = r7.e     // Catch:{ all -> 0x007a }
            boolean r9 = hhd.f(r9, r10)     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x0081
            goto L_0x0062
        L_0x0098:
            r4.add(r6)     // Catch:{ all -> 0x007a }
            goto L_0x0062
        L_0x009c:
            r2.e(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = q23.H(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x00ae:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r1.next()
            hdc r2 = (defpackage.hdc) r2
            udc r3 = r5.e()
            java.lang.String r4 = r2.a
            java.util.ArrayList r15 = r3.e(r4)
            ep5 r3 = new ep5
            t97 r4 = r5.o
            java.lang.Object r4 = r4.getValue()
            v6a r4 = (v6a) r4
            java.lang.String r6 = r2.b
            java.util.List r7 = r2.h
            java.lang.CharSequence r8 = v6a.b(r4, r6, r7)
            hw4 r11 = hw4.a
            bs r4 = new bs
            r4.<init>(r15)
            qw4 r19 = qw4.a
            if (r7 != 0) goto L_0x00e4
            r20 = r11
            goto L_0x00e6
        L_0x00e4:
            r20 = r7
        L_0x00e6:
            java.util.Map r6 = r2.j
            if (r6 != 0) goto L_0x00ec
            iw4 r6 = iw4.a
        L_0x00ec:
            r22 = r6
            java.util.List r6 = r2.k
            if (r6 != 0) goto L_0x00f5
            r23 = r11
            goto L_0x00f7
        L_0x00f5:
            r23 = r6
        L_0x00f7:
            java.util.Set r6 = r2.l
            if (r6 != 0) goto L_0x00fe
            r24 = r19
            goto L_0x0100
        L_0x00fe:
            r24 = r6
        L_0x0100:
            boolean r6 = r2.g
            r16 = r6
            java.lang.Long r6 = r2.i
            r21 = r6
            java.lang.String r7 = r2.a
            java.lang.String r9 = r2.c
            int r10 = r2.d
            java.util.Set r12 = r2.e
            r13 = 0
            r14 = 0
            r6 = r3
            r17 = r4
            r18 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r3)
            goto L_0x00ae
        L_0x011e:
            return r0
        L_0x011f:
            r2.e(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i82.o(java.lang.Object):java.lang.Object");
    }
}
