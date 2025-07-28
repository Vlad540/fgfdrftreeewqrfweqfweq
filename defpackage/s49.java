package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s49  reason: default package */
public final class s49 extends m18 {
    public final int e = 12;
    public final t97 f;
    public final r7e g;

    public s49(t97 t97, t97 t972, t97 t973, t97 t974) {
        super(t972, t973);
        this.f = t974;
        this.g = new r7e(new xq(22, t97));
    }

    public final gr8 a() {
        List n0 = o23.n0((Iterable) ((AtomicReference) this.c).get(), this.e);
        lw6 lw6 = new lw6();
        int size = n0.size();
        kw6[] kw6Arr = new kw6[size];
        for (int i = 0; i < size; i++) {
            r49 r49 = (r49) n0.get(i);
            ArrayList b = ((qhb) this.f.getValue()).b(r49.b);
            mw6[] mw6Arr = b != null ? (mw6[]) b.toArray(new mw6[0]) : null;
            kw6 kw6 = new kw6();
            kw6.a = r49.a;
            kw6.b = r49.b.toString();
            kw6.c = r49.c.a;
            kw6.d = z3d.p(r49.d);
            if (!(mw6Arr == null || mw6Arr.length == 0)) {
                kw6.e = mw6Arr;
            }
            kw6Arr[i] = kw6;
        }
        lw6.a = kw6Arr;
        return lw6;
    }

    public final dy b() {
        return (dy) this.g.getValue();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean e(byte[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "loadData finish "
            long r1 = java.lang.System.nanoTime()
            java.lang.String r3 = r12.c()
            fn6 r4 = defpackage.udd.e
            r5 = 0
            if (r4 != 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x001d
            tn7 r6 = tn7.Y
            java.lang.String r7 = "loadData start"
            r4.d(r6, r3, r7, r5)
        L_0x001d:
            lw6 r3 = new lw6     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3.<init>()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            gr8 r13 = defpackage.gr8.mergeFrom(r3, r13)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            lw6 r13 = (defpackage.lw6) r13     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            kw6[] r3 = r13.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            int r3 = r3.length     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r4.<init>(r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            kw6[] r13 = r13.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3 = 0
        L_0x0033:
            int r6 = r13.length     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            if (r3 >= r6) goto L_0x0078
            int r6 = r3 + 1
            r3 = r13[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d }
            r49 r7 = new r49     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r8 = r3.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r9 = r3.b     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            mw6[] r10 = r3.e     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            t97 r11 = r12.f     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.Object r11 = r11.getValue()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            qhb r11 = (defpackage.qhb) r11     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.CharSequence r9 = r11.a(r9, r10)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            int r10 = r3.c     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            if (r10 != 0) goto L_0x0057
            dv3 r10 = dv3.b     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            goto L_0x005d
        L_0x0057:
            dv3 r11 = new dv3     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r11.<init>(r10)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r10 = r11
        L_0x005d:
            gt5 r3 = r3.d     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.EnumSet r3 = defpackage.z3d.r(r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r7.<init>(r8, r9, r10, r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r4.add(r7)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3 = r6
            goto L_0x0033
        L_0x006b:
            r13 = move-exception
            goto L_0x00d7
        L_0x006d:
            r13 = move-exception
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r13 = r13.getMessage()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3.<init>(r13)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            throw r3     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
        L_0x0078:
            java.lang.Object r13 = r12.c     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r13.set(r4)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r12 = r12.c()
            fn6 r13 = defpackage.udd.e
            if (r13 != 0) goto L_0x0088
            goto L_0x00a8
        L_0x0088:
            boolean r3 = r13.c()
            if (r3 == 0) goto L_0x00a8
            tn7 r3 = tn7.Y
            int r4 = defpackage.zp4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            eq4 r1 = defpackage.eq4.NANOSECONDS
            long r1 = defpackage.mt0.Q(r6, r1)
            java.lang.String r1 = defpackage.zp4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r13.d(r3, r12, r0, r5)
        L_0x00a8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L_0x00ab:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d8 }
            java.lang.String r12 = r12.c()
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00d6
            tn7 r4 = tn7.Y
            int r6 = defpackage.zp4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            eq4 r1 = defpackage.eq4.NANOSECONDS
            long r1 = defpackage.mt0.Q(r6, r1)
            java.lang.String r1 = defpackage.zp4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r3.d(r4, r12, r0, r5)
        L_0x00d6:
            return r13
        L_0x00d7:
            throw r13     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r13 = move-exception
            java.lang.String r12 = r12.c()
            fn6 r3 = defpackage.udd.e
            if (r3 == 0) goto L_0x0101
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0101
            tn7 r4 = tn7.Y
            int r6 = defpackage.zp4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            eq4 r1 = defpackage.eq4.NANOSECONDS
            long r1 = defpackage.mt0.Q(r6, r1)
            java.lang.String r1 = defpackage.zp4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r3.d(r4, r12, r0, r5)
        L_0x0101:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s49.e(byte[]):java.lang.Boolean");
    }
}
