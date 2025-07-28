package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: gzb  reason: default package */
public final class gzb extends chd implements mhe {
    public final hzb J0;
    public final GradientDrawable K0;
    public final RippleDrawable L0;
    public final RippleDrawable M0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gzb(android.content.Context r7, defpackage.hzb r8) {
        /*
            r6 = this;
            int r0 = r8.a()
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = a24.X(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r7)
            n6c r7 = new n6c
            r7.<init>(r0, r0)
            r1.setLayoutParams(r7)
            r7 = 0
            r1.setClipToOutline(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r7)
            ck r7 = new ck
            r0 = 7
            r7.<init>(r0, r1)
            r1.addOnAttachStateChangeListener(r7)
            r6.<init>(r1)
            r6.J0 = r8
            s59 r7 = km4.y0
            pda r8 = r7.r(r1)
            nd0 r8 = r8.b()
            md0 r8 = r8.a
            int r8 = r8.h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 0
            android.graphics.drawable.GradientDrawable r8 = defpackage.swb.H(r8, r0, r0)
            r6.K0 = r8
            pda r2 = r7.r(r1)
            cfe r2 = r2.getText()
            int r2 = r2.e
            r3 = 1050253722(0x3e99999a, float:0.3)
            int r2 = n1g.c0(r2, r3)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r4 = defpackage.swb.H(r4, r0, r0)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r5.<init>(r2, r8, r4)
            r6.L0 = r5
            pda r7 = r7.r(r1)
            cfe r7 = r7.getText()
            int r7 = r7.e
            int r7 = n1g.c0(r7, r3)
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r8.<init>(r7, r0, r0)
            r6.M0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzb.<init>(android.content.Context, hzb):void");
    }

    /* renamed from: F */
    public final void A(fzb fzb) {
        int i;
        boolean z = fzb.o;
        if (z) {
            hzb hzb = this.J0;
            i = a24.X(((float) ((hzb.a() - (pfa.w(hzb.a) >= 360 ? 22 : 20)) / 2)) * dh4.c().getDisplayMetrics().density);
        } else {
            i = 0;
        }
        View view = this.a;
        view.setPadding(i, i, i, i);
        view.setBackground(z ? this.L0 : this.M0);
        ((ImageView) view).setImageDrawable(fzb.c);
    }

    public final void onThemeChanged(pda pda) {
        this.L0.setColor(ColorStateList.valueOf(n1g.c0(pda.getText().e, 0.3f)));
        this.K0.setColor(pda.b().a.h);
        this.M0.setColor(ColorStateList.valueOf(n1g.c0(pda.getText().e, 0.3f)));
    }
}
