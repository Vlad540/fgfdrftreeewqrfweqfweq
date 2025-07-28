package defpackage;

import android.content.res.ColorStateList;

/* renamed from: s3a  reason: default package */
public final class s3a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ t3a o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s3a(defpackage.t3a r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x0023;
                case 3: goto L_0x0019;
                case 4: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            yq4 r2 = yq4.b
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x0019:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x0023:
            o3a r2 = defpackage.o3a.a
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3a.<init>(t3a, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    t3a t3a = this.o;
                    if (!t3a.G0) {
                        t3a.a(t3a.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    t3a t3a2 = this.o;
                    if (!t3a2.G0) {
                        t3a2.a(t3a2.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (!hhd.f(obj, obj2)) {
                    s59 s59 = km4.y0;
                    t3a t3a3 = this.o;
                    t3a3.f(s59.r(t3a3));
                    return;
                }
                return;
            case 3:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    t3a t3a4 = this.o;
                    if (booleanValue) {
                        t3a4.F0.setStroke(a24.W(((double) dh4.c().getDisplayMetrics().density) * 1.5d), km4.y0.r(t3a4).h().f);
                        return;
                    } else {
                        t3a4.F0.setStroke(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), (ColorStateList) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    t3a t3a5 = this.o;
                    t3a5.setBackground(booleanValue2 ? t3a5.F0 : null);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3a(Object obj, t3a t3a) {
        super(9, obj);
        this.c = 1;
        this.o = t3a;
    }
}
