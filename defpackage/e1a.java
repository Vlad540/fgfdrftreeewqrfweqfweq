package defpackage;

/* renamed from: e1a  reason: default package */
public final class e1a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ f1a o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e1a(defpackage.f1a r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x0018;
                case 2: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            y0a r2 = defpackage.y0a.b
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>((int) r2, (java.lang.Object) r1)
            return
        L_0x0018:
            x0a r2 = defpackage.x0a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1a.<init>(f1a, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    y0a y0a = (y0a) obj2;
                    y0a y0a2 = (y0a) obj;
                    this.o.invalidate();
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    x0a x0a = (x0a) obj2;
                    x0a x0a2 = (x0a) obj;
                    this.o.invalidate();
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    pda pda = (pda) obj2;
                    pda pda2 = (pda) obj;
                    this.o.invalidate();
                    return;
                }
                return;
        }
    }
}
