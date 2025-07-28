package defpackage;

/* renamed from: x94  reason: default package */
public final class x94 {
    public final String a;
    public int b;
    public long c;
    public final se8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ y94 g;

    public x94(y94 y94, String str, int i, se8 se8) {
        this.g = y94;
        this.a = str;
        this.b = i;
        this.c = se8 == null ? -1 : se8.d;
        if (se8 != null && se8.b()) {
            this.d = se8;
        }
    }

    public final boolean a(gd gdVar) {
        se8 se8 = gdVar.d;
        if (se8 == null) {
            return this.b != gdVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (se8.d > j) {
            return true;
        }
        se8 se82 = this.d;
        if (se82 == null) {
            return false;
        }
        vje vje = gdVar.b;
        int b2 = vje.b(se8.a);
        int b3 = vje.b(se82.a);
        if (se8.d < se82.d || b2 < b3) {
            return false;
        }
        if (b2 > b3) {
            return true;
        }
        boolean b4 = se8.b();
        int i = se82.b;
        if (b4) {
            int i2 = se8.b;
            if (i2 <= i) {
                return i2 == i && se8.c > se82.c;
            }
            return true;
        }
        int i3 = se8.e;
        return i3 == -1 || i3 > i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.p()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.vje r7, defpackage.vje r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0011
            int r7 = r8.p()
            if (r0 >= r7) goto L_0x0036
            goto L_0x0037
        L_0x0011:
            y94 r1 = r6.g
            tje r4 = r1.a
            r7.o(r0, r4)
            tje r0 = r1.a
            int r4 = r0.n
        L_0x001c:
            int r5 = r0.o
            if (r4 > r5) goto L_0x0036
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L_0x0033
            qje r7 = r1.b
            qje r7 = r8.g(r5, r7, r2)
            int r0 = r7.c
            goto L_0x0037
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0036:
            r0 = r3
        L_0x0037:
            r6.b = r0
            if (r0 != r3) goto L_0x003c
            return r2
        L_0x003c:
            se8 r6 = r6.d
            r7 = 1
            if (r6 != 0) goto L_0x0042
            return r7
        L_0x0042:
            java.lang.Object r6 = r6.a
            int r6 = r8.b(r6)
            if (r6 == r3) goto L_0x004b
            r2 = r7
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x94.b(vje, vje):boolean");
    }
}
