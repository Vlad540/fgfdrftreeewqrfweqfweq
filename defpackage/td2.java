package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.views.widgets.SquareFrameLayout;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: td2  reason: default package */
public final class td2 extends SquareFrameLayout implements mhe {
    public final ColorDrawable a;
    public final OneMeDraweeView b;
    public final t97 c;

    public td2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ColorDrawable colorDrawable = new ColorDrawable(km4.y0.r(this).b().h);
        this.a = colorDrawable;
        on4 oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        z66 z66 = new z66(oneMeDraweeView.getResources());
        z66.d = colorDrawable;
        oneMeDraweeView.setHierarchy(z66.a());
        this.b = oneMeDraweeView;
        this.c = ez3.O(3, new x2(context, 20, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(oneMeDraweeView);
    }

    public final void onThemeChanged(pda pda) {
        this.a.setColor(pda.b().h);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v3, types: [ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.widget.TextView, ru.ok.messages.views.widgets.VideoInfoTextView, android.view.View] */
    public final void setItem(qh8 qh8) {
        tr6 tr6;
        wce wce;
        Uri uri;
        if (!qh8.y0 && (uri = qh8.o) != null) {
            ur6 d = ur6.d(uri);
            d.i = true;
            tr6 = d.a();
        } else {
            tr6 = null;
        }
        Uri uri2 = qh8.x0;
        tr6 a2 = uri2 != null ? ur6.d(uri2).a() : null;
        ? r4 = this.b;
        r4.setBackground((Drawable) null);
        r4.o(tr6, a2);
        int t = hr1.t(qh8.X);
        t97 t97 = this.c;
        if (t != 0) {
            if (t == 1) {
                ? r7 = (VideoInfoTextView) t97.getValue();
                Long l = qh8.Y;
                long longValue = l != null ? l.longValue() : 0;
                Context context = r7.getContext();
                int i = zhc.s0;
                if (r7.isInEditMode()) {
                    wce = db4.e0;
                } else {
                    Context context2 = r7.getContext();
                    r7e r7e = wce.a0;
                    wce = fja.E(context2);
                }
                gp0.D(js.q(i, wce.t, context), (Drawable) null, (Drawable) null, (Drawable) null, r7);
                String[] strArr = dhe.b;
                r7.setText(d8.a(longValue));
                r7.setVisibility(0);
                r7.setVisibility(0);
            } else if (t == 2) {
                AppCompatTextView appCompatTextView = (VideoInfoTextView) t97.getValue();
                appCompatTextView.setText(appCompatTextView.getContext().getString(cic.l1));
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                appCompatTextView.setVisibility(0);
                appCompatTextView.setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (t97.a()) {
            ((VideoInfoTextView) t97.getValue()).setVisibility(8);
        }
    }
}
