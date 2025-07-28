package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: z8a  reason: default package */
public final class z8a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a9a o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z8a(defpackage.a9a r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r8a r2 = defpackage.r8a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            x8a r2 = defpackage.x8a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8a.<init>(a9a, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    t8a t8a = (t8a) obj;
                    s59 s59 = km4.y0;
                    ni0 ni0 = this.o;
                    ni0.setIndicatorColor(new int[]{a9a.d((t8a) obj2, s59.r(ni0))});
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    y8a y8a = (y8a) obj2;
                    y8a y8a2 = (y8a) obj;
                    boolean f = hhd.f(y8a, u8a.a);
                    ni0 ni02 = this.o;
                    if (f) {
                        ni02.setIndicatorSize(a24.X(((float) 40) * dh4.c().getDisplayMetrics().density));
                        ni02.setTrackThickness(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                    } else if (hhd.f(y8a, v8a.a)) {
                        ni02.setIndicatorSize(a24.X(((float) 24) * dh4.c().getDisplayMetrics().density));
                        ni02.setTrackThickness(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
                    } else if (hhd.f(y8a, w8a.a)) {
                        ni02.setIndicatorSize(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
                        ni02.setTrackThickness(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density));
                    } else if (!hhd.f(y8a, x8a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ni02.requestLayout();
                    ni02.invalidate();
                    return;
                }
                return;
        }
    }
}
