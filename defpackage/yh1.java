package defpackage;

/* renamed from: yh1  reason: default package */
public final class yh1 {
    public static final yh1 g = new yh1(false, false, false, (le1) null, false, (qja) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final le1 d;
    public final boolean e;
    public final qja f;

    public yh1(boolean z, boolean z2, boolean z3, le1 le1, boolean z4, qja qja) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = le1;
        this.e = z4;
        this.f = qja;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.yh1) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.yh1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yh1 r5 = (defpackage.yh1) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            le1 r1 = r4.d
            le1 r3 = r5.d
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x0033
            return r2
        L_0x0033:
            qja r4 = r4.f
            qja r5 = r5.f
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x003e
            return r2
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int f2 = th2.f(th2.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        le1 le1 = this.d;
        int f3 = th2.f((f2 + (le1 == null ? 0 : le1.hashCode())) * 31, 31, this.e);
        qja qja = this.f;
        if (qja != null) {
            i = qja.hashCode();
        }
        return f3 + i;
    }

    public final String toString() {
        return "CallScreenRecordState(isMe=" + this.a + ", meIsAdmin=" + this.b + ", isRecordStateEnabled=" + this.c + ", recordScreenOpponentId=" + this.d + ", isAdminDisableScreenRecord=" + this.e + ", opponentInfo=" + this.f + ")";
    }
}
