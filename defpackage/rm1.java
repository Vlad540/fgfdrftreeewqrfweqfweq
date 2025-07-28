package defpackage;

/* renamed from: rm1  reason: default package */
public final class rm1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ sm1 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rm1(defpackage.sm1 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            qm1 r2 = defpackage.qm1.b
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x000f:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm1.<init>(sm1, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((qm1) obj) != ((qm1) obj2)) {
                    sm1.F(this.o);
                    return;
                }
                return;
            default:
                pda pda = (pda) obj2;
                if (!hhd.f((pda) obj, pda)) {
                    sm1 sm1 = this.o;
                    if (pda == null) {
                        pda = km4.y0.r(sm1);
                    }
                    sm1.onThemeChanged(pda);
                    return;
                }
                return;
        }
    }
}
