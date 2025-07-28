package defpackage;

import android.view.View;

/* renamed from: dc  reason: default package */
public final class dc extends ifb {
    public final /* synthetic */ int J0;
    public final Object K0;

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View, n7d] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dc(android.content.Context r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r0.J0 = r2
            switch(r2) {
                case 1: goto L_0x0061;
                case 2: goto L_0x0040;
                default: goto L_0x000b;
            }
        L_0x000b:
            n7d r2 = new n7d
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 64
            long r4 = (long) r1
            int r1 = defpackage.l8a.B
            hge r7 = new hge
            r7.<init>(r1)
            w6d r11 = defpackage.w6d.a
            int r1 = defpackage.phc.f2
            o7d r15 = new o7d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r14 = 0
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 1816(0x718, float:2.545E-42)
            r3 = r15
            r17 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r17
            r0.K0 = r1
            r2.setModelItem(r1)
            return
        L_0x0040:
            n7d r2 = new n7d
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r0.K0 = r2
            r0 = 56
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = a24.X(r0)
            r2.setMinHeight(r0)
            return
        L_0x0061:
            n7d r2 = new n7d
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 128(0x80, float:1.794E-43)
            long r4 = (long) r1
            int r1 = defpackage.l8a.I
            hge r7 = new hge
            r7.<init>(r1)
            w6d r11 = defpackage.w6d.a
            int r1 = defpackage.phc.f2
            o7d r15 = new o7d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r14 = 0
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 1816(0x718, float:2.545E-42)
            r3 = r15
            r18 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r18
            r0.K0 = r1
            r2.setModelItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.<init>(android.content.Context, int):void");
    }

    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                ((n7d) this.a).setModelItem(o7d.k((o7d) this.K0, (mge) null, new x6d(new lge(String.valueOf(((ybb) pg7).a)), (Integer) null), 1983));
                return;
            case 1:
                ((n7d) this.a).setModelItem(o7d.k((o7d) this.K0, (mge) null, new x6d(new lge(String.valueOf(((kcb) pg7).a)), (Integer) null), 1983));
                return;
            default:
                hr1.r(pg7);
                throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View, n7d] */
    public final void H(View.OnClickListener onClickListener) {
        switch (this.J0) {
            case 0:
                a24.a0(this.a, onClickListener);
                return;
            case 1:
                a24.a0(this.a, onClickListener);
                return;
            default:
                a24.a0((n7d) this.K0, onClickListener);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, n7d] */
    public void I(View.OnLongClickListener onLongClickListener) {
        switch (this.J0) {
            case 2:
                ((n7d) this.K0).setOnLongClickListener(onLongClickListener);
                return;
            default:
                return;
        }
    }
}
