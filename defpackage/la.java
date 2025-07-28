package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;

/* renamed from: la  reason: default package */
public final class la extends chd {
    public final LayerDrawable J0;
    public final LayerDrawable K0;

    public la(Context context) {
        super(new kh3(context, (AttributeSet) null));
        Drawable b = gq3.b(context, n1a.t);
        b.setTintList(ColorStateList.valueOf(-13908412));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(439076420);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
        float f = (float) 8;
        layerDrawable.setLayerInset(1, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        this.J0 = layerDrawable;
        Drawable b2 = gq3.b(context, n1a.i0);
        b2.setTintList(ColorStateList.valueOf(-3259817));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.getPaint().setColor(701383255);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, b2});
        layerDrawable2.setLayerInset(1, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        this.K0 = layerDrawable2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [la, b7c] */
    /* renamed from: F */
    public final void A(aze aze) {
        kh3 kh3 = (kh3) this.a;
        kh3.setCustomTheme(qda.a);
        kh3.setCallButtonMode(ih3.b);
        kh3.setName(aze.a.a(kh3.getContext()));
        kh3.setMessage((CharSequence) null);
        ub0 ub0 = aze.b;
        kh3.O(ub0.a, ub0.b, aze.c);
    }
}
