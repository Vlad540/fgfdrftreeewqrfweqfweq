package defpackage;

/* renamed from: m7d  reason: default package */
public final class m7d extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ n7d o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m7d(s6d s6d, n7d n7d) {
        super(9, (Object) s6d);
        this.o = n7d;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, n7d] */
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                e7d e7d = (e7d) obj2;
                if (!hhd.f((e7d) obj, e7d)) {
                    ? r1 = this.o;
                    n7d.C(r1, e7d);
                    r1.onThemeChanged(km4.y0.r(r1));
                    return;
                }
                return;
            default:
                if (((j7d) obj) != ((j7d) obj2)) {
                    n7d n7d = this.o;
                    n7d.onThemeChanged(n7d.getCurrentTheme());
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m7d(defpackage.n7d r2) {
        /*
            r1 = this;
            r0 = 1
            r1.c = r0
            j7d r0 = defpackage.j7d.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7d.<init>(n7d):void");
    }
}
