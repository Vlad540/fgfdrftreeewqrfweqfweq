package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ev4  reason: default package */
public final class ev4 extends chd {
    public final ShapeDrawable J0;
    public final OneMeDraweeView K0;
    public final ebc L0;
    public final int M0;
    public hx1 N0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ev4(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, defpackage.gw2 r8) {
        /*
            r5 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 36
            float r1 = (float) r1
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.a24.X(r2)
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.a24.X(r1)
            r0.<init>(r2, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r6)
            r1.setLayoutParams(r0)
            r0 = 6
            float r0 = (float) r0
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.a24.X(r0)
            r1.setPadding(r0, r0, r0, r0)
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = 17
            r2.<init>(r3, r3, r4)
            r0.setLayoutParams(r2)
            ln4 r2 = r0.getHierarchy()
            y66 r2 = (defpackage.y66) r2
            jlc r3 = defpackage.jlc.h
            r2.h(r3)
            r1.addView(r0)
            r5.<init>(r1)
            r5.J0 = r7
            r7 = 0
            android.view.View r7 = r1.getChildAt(r7)
            boolean r0 = r7 instanceof one.me.sdk.uikit.common.views.OneMeDraweeView
            r2 = 0
            if (r0 == 0) goto L_0x0072
            one.me.sdk.uikit.common.views.OneMeDraweeView r7 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r7
            goto L_0x0073
        L_0x0072:
            r7 = r2
        L_0x0073:
            r5.K0 = r7
            cc3 r7 = new cc3
            r0 = 3
            r7.<init>(r6, r0)
            ebc r7 = bm3.C(r7)
            r5.L0 = r7
            r7 = 24
            float r7 = (float) r7
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r7 = r7 * r0
            int r7 = defpackage.a24.X(r7)
            r5.M0 = r7
            z9 r7 = new z9
            r0 = 11
            r7.<init>(r5, r6, r2, r0)
            defpackage.urd.B(r7, r1)
            ub r6 = new ub
            r7 = 27
            r6.<init>(r5, r8, r7)
            defpackage.a24.Z(r1, 300, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev4.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, gw2):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [ev4, java.lang.Object, b7c] */
    public final void A(pg7 pg7) {
        hx1 hx1 = (hx1) pg7;
        this.N0 = hx1;
        String str = hx1.X;
        int i = 8;
        ebc ebc = this.L0;
        OneMeDraweeView oneMeDraweeView = this.K0;
        if (str != null) {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                tr6 b = tr6.b(str);
                int i2 = OneMeDraweeView.F0;
                oneMeDraweeView.o(b, (tr6) null);
            }
            String str2 = hx1.Y;
            if (str2 != null) {
                br7 br7 = (br7) ebc.getValue();
                ek8.e(br7, (ViewGroup) this.a);
                br7.setVisibility(0);
                int i3 = this.M0;
                boolean f = br7.f(i3, i3, str2);
                if (oneMeDraweeView != null) {
                    if (f) {
                        i = 0;
                    }
                    oneMeDraweeView.setVisibility(i);
                }
                br7.setOnFirstFrameListener(new r34(10, (Object) this));
            } else if (ebc.a()) {
                br7 br72 = (br7) ebc.getValue();
                br72.c();
                br72.setVisibility(8);
            }
        } else {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setImageResource(hx1.w0);
            }
            if (ebc.a()) {
                br7 br73 = (br7) ebc.getValue();
                br73.c();
                br73.setVisibility(8);
            }
        }
        F(hx1.c);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ev4, b7c] */
    public final void F(boolean z) {
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.J0 : null);
        OneMeDraweeView oneMeDraweeView = this.K0;
        if (oneMeDraweeView != null) {
            s59 s59 = km4.y0;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? s59.r(view).getIcon().f : s59.r(view).getIcon().i));
        }
    }
}
