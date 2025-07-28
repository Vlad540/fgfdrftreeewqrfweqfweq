package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: sud  reason: default package */
public final class sud extends chd {
    public final ShapeDrawable J0;
    public Drawable K0;
    public final int L0 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
    public final int M0 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    public final int N0 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
    public final int O0 = a24.X(((float) 14) * dh4.c().getDisplayMetrics().density);
    public ix1 P0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sud(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, gw2 r8) {
        /*
            r5 = this;
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 36
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = a24.X(r3)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = a24.X(r2)
            r1.<init>(r3, r2)
            r2 = 6
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            r0.setPadding(r2, r2, r2, r2)
            r0.setLayoutParams(r1)
            ln4 r1 = r0.getHierarchy()
            y66 r1 = (y66) r1
            jlc r2 = jlc.h
            r1.h(r2)
            r5.<init>(r0)
            r5.J0 = r7
            r7 = 8
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = a24.X(r7)
            r5.L0 = r7
            r7 = 12
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = a24.X(r7)
            r5.M0 = r7
            r7 = 16
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = a24.X(r7)
            r5.N0 = r7
            r7 = 14
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = a24.X(r7)
            r5.O0 = r7
            wua r7 = new wua
            r1 = 0
            r7.<init>((defpackage.sud) r5, (android.content.Context) r6, (kotlin.coroutines.Continuation) r1)
            urd.B(r7, r0)
            p7d r6 = new p7d
            r7 = 8
            r6.<init>(r5, r7, r8)
            a24.a0(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sud.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, gw2):void");
    }

    public final void A(pg7 pg7) {
        ix1 ix1 = (ix1) pg7;
        this.P0 = ix1;
        hud hud = ix1.b;
        String str = hud.c;
        View view = this.a;
        if (str == null || str.length() == 0) {
            Integer num = ix1.o;
            if (num != null) {
                ((OneMeDraweeView) view).setImageResource(num.intValue());
            }
        } else {
            ((OneMeDraweeView) view).setImageURI(str);
        }
        G(hud.Z);
        F(hud.Y);
    }

    public final void F(int i) {
        View view = this.a;
        if (i == 5) {
            if (this.K0 == null) {
                this.K0 = H();
            }
            ((OneMeDraweeView) view).getHierarchy().k(this.K0);
            return;
        }
        ((OneMeDraweeView) view).getHierarchy().k((Drawable) null);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.ImageView, one.me.sdk.uikit.common.views.OneMeDraweeView] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.widget.ImageView, one.me.sdk.uikit.common.views.OneMeDraweeView] */
    /* JADX WARNING: type inference failed for: r2v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v3, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void G(boolean z) {
        View view = this.a;
        if (z) {
            ((OneMeDraweeView) view).setBackground(this.J0);
        } else {
            ((OneMeDraweeView) view).setBackground((Drawable) null);
        }
        ix1 ix1 = this.P0;
        if ((ix1 != null ? ix1.o : null) != null) {
            ? r4 = (OneMeDraweeView) view;
            s59 s59 = km4.y0;
            r4.setImageTintList(ColorStateList.valueOf(z ? s59.r(view).getIcon().f : s59.r(view).getIcon().i));
            return;
        }
        ((OneMeDraweeView) view).setImageTintList((ColorStateList) null);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final LayerDrawable H() {
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        s59 s59 = km4.y0;
        View view = this.a;
        js.D(shapeDrawable, s59.r(view).b().a.g);
        Drawable b = gq3.b(((OneMeDraweeView) view).getContext(), w5a.a);
        js.D(b, s59.r(view).getIcon().h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
        int i = this.M0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.L0;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.O0;
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.N0;
        layerDrawable2.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }
}
