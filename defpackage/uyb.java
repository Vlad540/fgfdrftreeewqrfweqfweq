package defpackage;

/* renamed from: uyb  reason: default package */
public final class uyb extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vyb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uyb(ryb ryb, vyb vyb) {
        super(9, (Object) ryb);
        this.c = 1;
        this.o = vyb;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    vyb vyb = this.o;
                    if (booleanValue || !booleanValue2) {
                        vyb.invalidate();
                        return;
                    } else {
                        vyb.a(true);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (!hhd.f(obj, obj2)) {
                    ryb ryb = (ryb) obj;
                    this.o.A0.setText(((ryb) obj2).a);
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    this.o.B0.g(intValue, true);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uyb(defpackage.vyb r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.<init>(vyb, int):void");
    }
}
