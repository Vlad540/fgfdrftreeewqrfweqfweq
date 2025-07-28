package defpackage;

/* renamed from: wy  reason: default package */
public final class wy {
    public static final wy f = new wy(false, false, false, (rz) null, (vw6) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final rz d;
    public final vw6 e;

    public wy(boolean z, boolean z2, boolean z3, rz rzVar, vw6 vw6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = rzVar;
        this.e = vw6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wy) r5;
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
            boolean r1 = r5 instanceof defpackage.wy
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wy r5 = (defpackage.wy) r5
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
            rz r1 = r4.d
            rz r3 = r5.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            vw6 r4 = r4.e
            vw6 r5 = r5.e
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int f2 = th2.f(th2.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        rz rzVar = this.d;
        int hashCode = (f2 + (rzVar == null ? 0 : rzVar.hashCode())) * 31;
        vw6 vw6 = this.e;
        if (vw6 != null) {
            i = vw6.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AttachInfo(hasPhoto=" + this.a + ", hasInlineKeyboard=" + this.b + ", hasReplyKeyboard=" + this.c + ", attachModel=" + this.d + ", inlineKeyboard=" + this.e + ")";
    }
}
