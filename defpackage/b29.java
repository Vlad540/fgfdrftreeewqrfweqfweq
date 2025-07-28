package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: b29  reason: default package */
public final class b29 {
    public final nec a;
    public final t97 b;
    public final t97 c;

    public b29(nec nec, r7e r7e, t97 t97) {
        this.a = nec;
        this.b = r7e;
        this.c = t97;
    }

    public final Object a(long j, Continuation continuation) {
        nec nec = this.a;
        return xs7.U(nec.c().b(), new iec(nec, j, (Continuation) null), continuation);
    }

    public final Object b(Collection collection, Continuation continuation) {
        nec nec = this.a;
        return xs7.U(nec.c().b(), new jec(nec, collection, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r18, long r20, long r22, boolean r24, int r25, defpackage.md4 r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r17
            r1 = r27
            boolean r2 = r1 instanceof defpackage.a29
            if (r2 == 0) goto L_0x0017
            r2 = r1
            a29 r2 = (defpackage.a29) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            a29 r2 = new a29
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.X
            pu3 r3 = pu3.a
            int r4 = r2.Z
            r5 = 1
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            boolean r0 = r2.o
            wx3.H(r1)
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            wx3.H(r1)
            r1 = r24
            r2.o = r1
            r2.Z = r5
            nec r6 = r0.a
            pae r0 = r6.c()
            n3a r0 = (n3a) r0
            ju3 r0 = r0.b()
            lec r15 = new lec
            r16 = 0
            r4 = r15
            r5 = r26
            r7 = r18
            r9 = r20
            r11 = r22
            r13 = r25
            r14 = r24
            r1 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r9, r11, r13, r14, r15)
            java.lang.Object r1 = xs7.U(r0, r1, r2)
            if (r1 != r3) goto L_0x0068
            return r3
        L_0x0068:
            r0 = r24
        L_0x006a:
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            if (r0 == 0) goto L_0x0072
            o23.k0(r2)
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b29.c(long, long, long, boolean, int, md4, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
