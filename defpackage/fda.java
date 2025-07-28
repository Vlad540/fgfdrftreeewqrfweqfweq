package defpackage;

/* renamed from: fda  reason: default package */
public final class fda extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ gda o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fda(sz9 sz9, gda gda) {
        super(9, sz9);
        this.o = gda;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f((sz9) obj, (sz9) obj2)) {
                    gda.a(this.o);
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    gda.a(this.o);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fda(defpackage.gda r2) {
        /*
            r1 = this;
            r0 = 1
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.o = r2
            r2 = 9
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fda.<init>(gda):void");
    }
}
