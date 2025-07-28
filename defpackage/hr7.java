package defpackage;

import android.view.View;

/* renamed from: hr7  reason: default package */
public final class hr7 extends chd {
    public final /* synthetic */ int J0;
    public final int K0;
    public ktd L0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hr7(android.content.Context r1, defpackage.htd r2, int r3, int r4) {
        /*
            r0 = this;
            r0.J0 = r4
            switch(r4) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0041;
                default: goto L_0x0005;
            }
        L_0x0005:
            gr7 r4 = new gr7
            r4.<init>(r1)
            r0.<init>(r4)
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
            r3 = 350(0x15e, float:4.9E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r0.K0 = r1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            xv5 r1 = new xv5
            r3 = 8
            r1.<init>(r0, r3, r2)
            a24.a0(r4, r1)
            eb1 r1 = new eb1
            r3 = 3
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        L_0x0041:
            cqf r4 = new cqf
            r4.<init>(r1)
            r0.<init>(r4)
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
            r3 = 350(0x15e, float:4.9E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r0.K0 = r1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            p7d r1 = new p7d
            r3 = 15
            r1.<init>(r0, r3, r2)
            a24.a0(r4, r1)
            eb1 r1 = new eb1
            r3 = 9
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        L_0x007e:
            tsd r4 = new tsd
            r4.<init>(r1)
            r0.<init>(r4)
            r0.K0 = r3
            if (r3 != 0) goto L_0x008c
            r1 = -2
            goto L_0x009c
        L_0x008c:
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
        L_0x009c:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            p7d r1 = new p7d
            r3 = 6
            r1.<init>(r0, r3, r2)
            a24.a0(r4, r1)
            eb1 r1 = new eb1
            r3 = 7
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr7.<init>(android.content.Context, htd, int, int):void");
    }

    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                if (pg7 instanceof ktd) {
                    ktd ktd = (ktd) pg7;
                    this.L0 = ktd;
                    View view = this.a;
                    ((gr7) view).a(ktd, this.K0);
                    ((gr7) view).setAlpha(ktd.A0 ? 0.3f : 1.0f);
                    return;
                }
                return;
            case 1:
                if (pg7 instanceof ktd) {
                    ktd ktd2 = (ktd) pg7;
                    this.L0 = ktd2;
                    int i = this.K0;
                    View view2 = this.a;
                    if (i == 0) {
                        ((tsd) view2).setSizeConfigurator(new qud(view2));
                    }
                    ((tsd) view2).a(ktd2);
                    ((tsd) view2).setAlpha(ktd2.A0 ? 0.3f : 1.0f);
                    return;
                }
                return;
            default:
                if (pg7 instanceof ktd) {
                    ktd ktd3 = (ktd) pg7;
                    this.L0 = ktd3;
                    View view3 = this.a;
                    ((cqf) view3).a(ktd3, this.K0);
                    ((cqf) view3).setAlpha(ktd3.A0 ? 0.3f : 1.0f);
                    return;
                }
                return;
        }
    }

    public final void B(pg7 pg7, Object obj) {
        switch (this.J0) {
            case 0:
                if (!(obj instanceof jtd)) {
                    A(pg7);
                    return;
                } else {
                    ((gr7) this.a).setAlpha(((jtd) obj).a ? 0.3f : 1.0f);
                    return;
                }
            case 1:
                if (!(obj instanceof jtd)) {
                    A(pg7);
                    return;
                } else {
                    ((tsd) this.a).setAlpha(((jtd) obj).a ? 0.3f : 1.0f);
                    return;
                }
            default:
                if (!(obj instanceof jtd)) {
                    A(pg7);
                    return;
                }
                ((cqf) this.a).setAlpha(((jtd) obj).a ? 0.3f : 1.0f);
                return;
        }
    }
}
