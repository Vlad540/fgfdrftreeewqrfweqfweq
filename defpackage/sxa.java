package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: sxa  reason: default package */
public final class sxa extends LayerDrawable implements mhe {
    public final Context a;
    public final int b;
    public final int c;

    public sxa(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int addLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = addLayer;
        int addLayer2 = addLayer(new RippleDrawable(ColorStateList.valueOf(-16777216), gq3.b(context, phc.L0), (Drawable) null));
        this.c = addLayer2;
        float f = (float) 44;
        setLayerSize(addLayer, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        setLayerGravity(addLayer, 17);
        float f2 = (float) 24;
        setLayerSize(addLayer2, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        setLayerGravity(addLayer2, 17);
        onThemeChanged(km4.y0.n(context).g());
    }

    public final void a(int i) {
        Context context = this.a;
        setDrawable(this.c, new RippleDrawable(ColorStateList.valueOf(-16777216), gq3.b(context, i), (Drawable) null));
        onThemeChanged(km4.y0.n(context).g());
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot((float) rect.centerX(), (float) rect.centerY());
    }

    public final void onThemeChanged(pda pda) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        s59 s59 = km4.y0;
        Context context = this.a;
        s59.n(context).g().a().o().a.getClass();
        paint.setColor(1543503872);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(s59.n(context).g().c().a.b));
        Drawable drawable = rippleDrawable.getDrawable(0);
        s59.n(context).g();
        um4.g(drawable, -1);
    }
}
