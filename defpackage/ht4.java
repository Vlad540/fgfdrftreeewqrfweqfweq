package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import one.me.rlottie.RLottieDrawable;

/* renamed from: ht4  reason: default package */
public final class ht4 extends chd implements bu4 {
    public static final /* synthetic */ int L0 = 0;
    public ku4 J0;
    public final gi K0 = new gi(1, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ht4(android.content.Context r3, defpackage.u5g r4) {
        /*
            r2 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r3)
            r2.<init>(r0)
            gi r3 = new gi
            r1 = 1
            r3.<init>(r1, r2)
            r2.K0 = r3
            r3 = 32
            float r3 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r3 = r3 * r1
            int r3 = defpackage.a24.X(r3)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r3, r3)
            r0.setLayoutParams(r1)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            me4.o(r3, r1, r0)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r3)
            ub r3 = new ub
            r1 = 26
            r3.<init>(r2, r1, r4)
            r0.setOnClickListener(r3)
            pf0 r3 = new pf0
            r4 = 0
            r1 = 5
            r3.<init>((java.lang.Object) r2, (kotlin.coroutines.Continuation) r4, (int) r1)
            defpackage.urd.B(r3, r0)
            ck r3 = new ck
            r4 = 4
            r3.<init>(r4, r2)
            r0.addOnAttachStateChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht4.<init>(android.content.Context, u5g):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ht4, b7c] */
    public final void A(pg7 pg7) {
        if (pg7 instanceof ku4) {
            ku4 ku4 = (ku4) pg7;
            this.J0 = ku4;
            if (ku4.Y == 0) {
                F(true);
            }
            View view = this.a;
            ((ImageView) view).setImageDrawable(ku4.X);
            zj drawable = ((ImageView) view).getDrawable();
            zj zjVar = drawable instanceof zj ? drawable : null;
            if (zjVar != null) {
                RLottieDrawable b = zjVar.b();
                RLottieDrawable rLottieDrawable = zjVar.B0;
                if (b == rLottieDrawable && rLottieDrawable != null) {
                    rLottieDrawable.addParentView(this.K0);
                }
                zjVar.start();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ht4, b7c] */
    public final void F(boolean z) {
        zj drawable = ((ImageView) this.a).getDrawable();
        zj zjVar = drawable instanceof zj ? drawable : null;
        if (zjVar != null) {
            RLottieDrawable rLottieDrawable = zjVar.B0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(this.K0);
            }
            RLottieDrawable rLottieDrawable2 = zjVar.B0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                zjVar.stop();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ht4, b7c] */
    public final void b() {
        Drawable drawable;
        ku4 ku4 = this.J0;
        if (ku4 != null && (drawable = ku4.X) != null) {
            ((ImageView) this.a).invalidateDrawable(drawable);
        }
    }
}
