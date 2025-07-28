package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: gr7  reason: default package */
public final class gr7 extends FrameLayout {
    public final lv1 a;
    public final br7 b;
    public boolean c;
    public boolean o;
    public qud w0;

    /* JADX WARNING: type inference failed for: r2v0, types: [br7, android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: type inference failed for: r4v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public gr7(Context context) {
        super(context, (AttributeSet) null);
        lv1 lv1 = new lv1(context);
        this.a = lv1;
        ? rLottieImageView = new RLottieImageView(context, (AttributeSet) null);
        rLottieImageView.setId(gaa.b);
        rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = rLottieImageView;
        addView((OneMeDraweeView) lv1.b);
        addView(rLottieImageView);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [br7, android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: type inference failed for: r7v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v5, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void a(ktd ktd, int i) {
        qud qud = this.w0;
        if (qud != null) {
            qud.b(ktd);
        }
        String str = ktd.X;
        lv1 lv1 = this.a;
        boolean z = true;
        ? r4 = this.b;
        if (str == null || str.length() == 0) {
            r4.c();
            r4.setVisibility(8);
            ((OneMeDraweeView) lv1.b).setVisibility(0);
        } else {
            r4.setAutoRepeat(true);
            r4.setOnFirstFrameListener(new hy5(13, this));
            r4.setFailureListener(new j67(5));
            r4.setVisibility(0);
            this.c = true;
            boolean f = r4.f(i, i, str);
            this.c = false;
            if (!f || this.o) {
                z = false;
            }
            this.o = false;
        }
        if (z) {
            ? r7 = (OneMeDraweeView) lv1.b;
            tr6 b2 = tr6.b(ktd.o);
            int i2 = OneMeDraweeView.F0;
            r7.o(b2, (tr6) null);
            r7.setVisibility(0);
        }
    }

    public final void b(er7 er7) {
        if (er7.a == null) {
            er7.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = er7.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final qud getSizeConfigurator() {
        return this.w0;
    }

    public final void onMeasure(int i, int i2) {
        qud qud = this.w0;
        ms a2 = qud != null ? qud.a(i, i2) : null;
        if (a2 != null) {
            i = a2.b;
        }
        if (a2 != null) {
            i2 = a2.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(qud qud) {
        this.w0 = qud;
    }
}
