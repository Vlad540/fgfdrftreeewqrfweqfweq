package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: et5  reason: default package */
public final class et5 extends l5e implements i26 {
    public Set X;
    public int Y;
    public final /* synthetic */ ft5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et5(ft5 ft5, Continuation continuation) {
        super(2, continuation);
        this.Z = ft5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((et5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new et5(this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            jue r3 = defpackage.jue.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            ft5 r8 = r0.Z
            if (r2 == 0) goto L_0x003c
            if (r2 == r7) goto L_0x0035
            if (r2 == r6) goto L_0x002e
            if (r2 == r5) goto L_0x0025
            if (r2 != r4) goto L_0x001d
            defpackage.wx3.H(r19)
            goto L_0x0152
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            java.util.Set r2 = r0.X
            defpackage.wx3.H(r19)
            r5 = r19
            goto L_0x010a
        L_0x002e:
            java.util.Set r2 = r0.X
            defpackage.wx3.H(r19)
            goto L_0x00ed
        L_0x0035:
            java.util.Set r2 = r0.X
            defpackage.wx3.H(r19)
            goto L_0x00c2
        L_0x003c:
            defpackage.wx3.H(r19)
            java.util.concurrent.atomic.AtomicReference r2 = r8.A0
            java.lang.Object r2 = r2.get()
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x004a
            return r3
        L_0x004a:
            grd r9 = r8.B0
            java.lang.Object r9 = r9.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0060:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0076
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = r9.contains(r11)
            if (r13 != 0) goto L_0x0060
            r12.add(r11)
            goto L_0x0060
        L_0x0076:
            java.util.Iterator r9 = r9.iterator()
        L_0x007a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0090
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r2.contains(r10)
            if (r11 != 0) goto L_0x007a
            r15.add(r10)
            goto L_0x007a
        L_0x0090:
            boolean r2 = r12.isEmpty()
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x00be
            r0.X = r15
            r0.Y = r7
            v72 r2 = r8.o
            b92 r2 = (b92) r2
            r2.getClass()
            d82 r9 = new d82
            r16 = 0
            long r13 = r8.b
            r10 = r9
            r11 = r2
            r17 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r15)
            hu3 r2 = r2.Y
            java.lang.Object r2 = defpackage.xs7.U(r2, r9, r0)
            if (r2 != r1) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r2 = r3
        L_0x00bb:
            if (r2 != r1) goto L_0x00c0
            return r1
        L_0x00be:
            r17 = r15
        L_0x00c0:
            r2 = r17
        L_0x00c2:
            boolean r9 = r2.isEmpty()
            r9 = r9 ^ r7
            if (r9 == 0) goto L_0x00ed
            v72 r9 = r8.o
            r0.X = r2
            r0.Y = r6
            r6 = r9
            b92 r6 = (b92) r6
            r6.getClass()
            z72 r15 = new z72
            r14 = 0
            long r12 = r8.b
            r9 = r15
            r10 = r2
            r11 = r6
            r9.<init>(r10, r11, r12, r14)
            hu3 r6 = r6.Y
            java.lang.Object r6 = defpackage.xs7.U(r6, r15, r0)
            if (r6 != r1) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r6 = r3
        L_0x00ea:
            if (r6 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            int r6 = r2.size()
            if (r6 <= 0) goto L_0x0152
            t97 r6 = r8.Z
            java.lang.Object r6 = r6.getValue()
            bv2 r6 = (bv2) r6
            r0.X = r2
            r0.Y = r5
            aw2 r6 = (aw2) r6
            long r9 = r8.b
            java.lang.Object r5 = r6.k(r9, r0)
            if (r5 != r1) goto L_0x010a
            return r1
        L_0x010a:
            i22 r5 = (i22) r5
            r6 = 0
            if (r5 == 0) goto L_0x0116
            boolean r5 = r5.G()
            if (r5 != r7) goto L_0x0116
            goto L_0x0117
        L_0x0116:
            r7 = r6
        L_0x0117:
            android.content.Context r5 = r8.c
            android.content.res.Resources r5 = r5.getResources()
            if (r7 == 0) goto L_0x0122
            int r6 = defpackage.e5a.a
            goto L_0x0124
        L_0x0122:
            int r6 = defpackage.e5a.b
        L_0x0124:
            int r7 = r2.size()
            int r2 = r2.size()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            java.lang.String r2 = r5.getQuantityString(r6, r7, r2)
            pae r5 = r8.X
            n3a r5 = (defpackage.n3a) r5
            zr7 r5 = r5.c()
            dt5 r6 = new dt5
            r7 = 0
            r6.<init>(r8, r2, r7)
            r0.X = r7
            r0.Y = r4
            java.lang.Object r0 = defpackage.xs7.U(r5, r6, r0)
            if (r0 != r1) goto L_0x0152
            return r1
        L_0x0152:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et5.o(java.lang.Object):java.lang.Object");
    }
}
