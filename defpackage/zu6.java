package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zu6  reason: default package */
public final class zu6 extends l5e implements i26 {
    public final /* synthetic */ n46 X;
    public final /* synthetic */ bv6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu6(n46 n46, bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.X = n46;
        this.Y = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zu6(this.X, this.Y, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        urd.l(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            wx3.H(r12)
            k46 r12 = defpackage.k46.a
            n46 r0 = r11.X
            boolean r12 = hhd.f(r0, r12)
            if (r12 == 0) goto L_0x0014
            java.lang.Integer r11 = new java.lang.Integer
            r12 = -1
            r11.<init>(r12)
            return r11
        L_0x0014:
            java.util.List r12 = r0.d()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
            r2 = r1
        L_0x001e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r12.next()
            h46 r3 = (defpackage.h46) r3
            bv6 r4 = r11.Y
            android.content.ContentResolver r5 = r4.o
            android.net.Uri r6 = r3.i()
            java.lang.String r4 = r3.f()
            java.lang.String[] r7 = new java.lang.String[]{r4}
            java.lang.String r8 = r0.e(r3)
            java.lang.String[] r9 = r0.a(r3)
            r10 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x0059
            int r4 = r3.getCount()     // Catch:{ all -> 0x0052 }
            r5 = 0
            urd.l(r3, r5)
            goto L_0x005a
        L_0x0052:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r12 = move-exception
            urd.l(r3, r11)
            throw r12
        L_0x0059:
            r4 = r1
        L_0x005a:
            int r2 = r2 + r4
            goto L_0x001e
        L_0x005c:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu6.o(java.lang.Object):java.lang.Object");
    }
}
