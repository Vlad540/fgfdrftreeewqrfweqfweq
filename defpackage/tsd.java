package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: tsd  reason: default package */
public final class tsd extends FrameLayout {
    public final lv1 a;
    public qud b;
    public ktd c;

    /* JADX WARNING: type inference failed for: r3v3, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public tsd(Context context) {
        super(context, (AttributeSet) null);
        lv1 lv1 = new lv1(context);
        this.a = lv1;
        setClipToPadding(false);
        addView((OneMeDraweeView) lv1.b, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void a(ktd ktd) {
        ktd ktd2 = this.c;
        boolean z = true;
        if (ktd2 != null && ktd2.w0 == ktd.w0 && ktd2.x0 == ktd.x0) {
            z = false;
        }
        this.c = ktd;
        qud qud = this.b;
        if (qud != null) {
            qud.b(ktd);
        }
        String str = ktd.o;
        ? r0 = (OneMeDraweeView) this.a.b;
        tr6 b2 = tr6.b(str);
        int i = OneMeDraweeView.F0;
        r0.o(b2, (tr6) null);
        r0.setVisibility(0);
        if (z) {
            requestLayout();
        }
    }

    public final qud getSizeConfigurator() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        qud qud = this.b;
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
        this.b = qud;
    }
}
