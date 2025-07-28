package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: rv3  reason: default package */
public final class rv3 extends chd {
    public static final int L0 = View.generateViewId();
    public static final int M0 = View.generateViewId();
    public final ImageView J0;
    public final TextView K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rv3(android.view.ViewGroup r10) {
        /*
            r9 = this;
            android.content.Context r10 = r10.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 0
            r0.setOrientation(r1)
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r3 = 56
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = a24.X(r3)
            r4 = -1
            r2.<init>(r4, r3)
            r0.setLayoutParams(r2)
            r2 = 18
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = a24.X(r3)
            r4 = 12
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = a24.X(r5)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = a24.X(r6)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = a24.X(r4)
            r0.setPadding(r3, r5, r6, r4)
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r10)
            int r4 = L0
            r3.setId(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = a24.X(r6)
            r5.<init>(r7, r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = a24.X(r2)
            r5.setMarginEnd(r2)
            r3.setLayoutParams(r5)
            r2 = 16
            r0.setGravity(r2)
            r0.addView(r3)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            int r10 = M0
            r2.setId(r10)
            nge r5 = defpackage.nte.i
            r5.b(r2, defpackage.yq4.b)
            r5 = 1
            r2.setSingleLine(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r1, r6, r7)
            r1 = 19
            r5.gravity = r1
            r2.setLayoutParams(r5)
            r0.addView(r2)
            od1 r1 = new od1
            r5 = 0
            r6 = 2
            r1.<init>(r3, r2, r5, r6)
            urd.B(r1, r0)
            r9.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r9.J0 = r1
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.K0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv3.<init>(android.view.ViewGroup):void");
    }

    public final void D() {
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: F */
    public final void A(qv3 qv3) {
        this.J0.setImageResource(qv3.b);
        TextView textView = this.K0;
        textView.setText(qv3.c.a(textView.getContext()));
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }
}
