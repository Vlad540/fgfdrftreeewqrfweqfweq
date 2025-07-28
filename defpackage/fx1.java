package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: fx1  reason: default package */
public final class fx1 extends chd {
    public final s16 J0;
    public final FrameLayout K0;
    public final AppCompatTextView L0;
    public final r7e M0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fx1(android.content.Context r6, defpackage.s16 r7) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r1 = 30
            float r1 = (float) r1
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.a24.X(r1)
            r0.setMinimumHeight(r1)
            r5.<init>(r0)
            r5.J0 = r7
            r5.K0 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            r1 = 0
            r7.<init>(r6, r1)
            int r2 = defpackage.x5a.m
            r7.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r3)
            r3 = 8388627(0x800013, float:1.175497E-38)
            r2.gravity = r3
            r7.setLayoutParams(r2)
            nge r2 = nte.n
            nge.d(r2, r7)
            pf0 r2 = new pf0
            r3 = 3
            r4 = 2
            r2.<init>((int) r3, (kotlin.coroutines.Continuation) r1, (int) r4)
            defpackage.urd.B(r2, r7)
            r5.L0 = r7
            b5 r1 = new b5
            r2 = 26
            r1.<init>(r6, r2)
            r7e r6 = new r7e
            r6.<init>(r1)
            r5.M0 = r6
            r0.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx1.<init>(android.content.Context, s16):void");
    }

    public final void A(pg7 pg7) {
        if (pg7 instanceof jx1) {
            AppCompatTextView appCompatTextView = this.L0;
            jx1 jx1 = (jx1) pg7;
            appCompatTextView.setText(jx1.getName().a(appCompatTextView.getContext()));
            boolean r = jx1.r();
            r7e r7e = this.M0;
            if (r) {
                jjd.f(this.K0, (View) r7e.getValue(), -1);
                ((View) r7e.getValue()).setVisibility(0);
                a24.Z((View) r7e.getValue(), 300, new d5(15, this));
            } else if (r7e.a()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) r7e.getValue();
                appCompatImageView.setVisibility(8);
                appCompatImageView.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
