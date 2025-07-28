package defpackage;

/* renamed from: gca  reason: default package */
public final class gca extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hca o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gca(defpackage.hca r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            wba r2 = defpackage.wba.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            cca r2 = defpackage.cca.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.<init>(hca, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                zba zba = (zba) obj2;
                if (!hhd.f((zba) obj, zba)) {
                    hca hca = this.o;
                    hca.setLeft(zba);
                    hca.y();
                    return;
                }
                return;
            default:
                eca eca = (eca) obj2;
                if (!hhd.f((eca) obj, eca)) {
                    hca hca2 = this.o;
                    hca2.setRight(eca);
                    hca2.y();
                    return;
                }
                return;
        }
    }
}
