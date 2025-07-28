package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: w10  reason: default package */
public final class w10 {
    public static final /* synthetic */ int d = 0;
    public final nj4 a;
    public final tt0 b;
    public final nj4 c;

    public w10(nj4 nj4, tt0 tt0, nj4 nj42) {
        this.a = nj4;
        this.b = tt0;
        this.c = nj42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(jj7 r8) {
        /*
            r0 = 1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x000c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r8.next()
            o10 r1 = (defpackage.o10) r1
            j10 r2 = r1.a
            j10 r3 = defpackage.j10.c
            if (r2 != r3) goto L_0x002b
            a10 r2 = r1.b
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r2.Z
            boolean r2 = r1g.p(r2)
            if (r2 == 0) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            j10 r2 = defpackage.j10.o
            r3 = 0
            j10 r5 = r1.a
            if (r5 != r2) goto L_0x003e
            n10 r2 = r1.d
            if (r2 == 0) goto L_0x003e
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            j10 r2 = defpackage.j10.X
            if (r5 != r2) goto L_0x004d
            l00 r2 = r1.e
            if (r2 == 0) goto L_0x004d
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004d
            goto L_0x0071
        L_0x004d:
            j10 r2 = defpackage.j10.y0
            if (r5 != r2) goto L_0x005c
            v00 r2 = r1.j
            if (r2 == 0) goto L_0x005c
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            goto L_0x0071
        L_0x005c:
            j10 r2 = defpackage.j10.Y
            if (r5 != r2) goto L_0x006b
            i10 r2 = r1.f
            if (r2 == 0) goto L_0x006b
            long r5 = r2.a
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            c10 r2 = defpackage.c10.b
            c10 r1 = r1.w
            if (r1 != r2) goto L_0x000c
        L_0x0071:
            r8 = 0
            return r8
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w10.a(jj7):boolean");
    }

    public final void b(vo8 vo8) {
        if (vo8.m()) {
            for (o10 o10 : (List) vo8.D0.a) {
                d(vo8.b, o10.q, c10.b);
            }
        }
    }

    public final void c() {
        s59 s59 = bp8.b;
        Iterator it = ((to8) this.a.get()).s().iterator();
        while (it.hasNext()) {
            vo8 vo8 = (vo8) it.next();
            if (vo8.m()) {
                for (o10 o10 : (List) vo8.D0.a) {
                    d(vo8.b, o10.q, c10.a);
                }
            }
        }
    }

    public final void d(long j, String str, c10 c10) {
        ((to8) this.a.get()).v(j, str, new rgc(7, c10));
    }
}
