package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: eda  reason: default package */
public final class eda extends SwitchCompat implements mhe {
    public final t97 l1 = ez3.O(3, new my9(23));
    public final t97 m1 = ez3.O(3, new my9(24));

    /* JADX WARNING: type inference failed for: r1v0, types: [eda, androidx.appcompat.widget.SwitchCompat, android.view.View] */
    public eda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setThumbDrawable(f(getThumbStateDrawable()));
        setTrackDrawable(f(getTrackThumbDrawable()));
        setSwitchMinWidth(a24.X(((float) 51) * dh4.c().getDisplayMetrics().density));
        setEnforceSwitchWidth(false);
        setSplitTrack(false);
        setShowText(false);
        setBackground((Drawable) null);
        onThemeChanged(km4.y0.r(this));
    }

    public static StateListDrawable f(f7e f7e) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842912}, f7e.a);
        stateListDrawable.addState(new int[]{16842910, -16842912}, f7e.b);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, f7e.d);
        stateListDrawable.addState(new int[]{-16842910, 16842912}, f7e.c);
        return stateListDrawable;
    }

    private final f7e getThumbStateDrawable() {
        return (f7e) this.l1.getValue();
    }

    private final f7e getTrackThumbDrawable() {
        return (f7e) this.m1.getValue();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [eda, androidx.appcompat.widget.SwitchCompat, android.view.View] */
    public final void onDraw(Canvas canvas) {
        float f = (float) 4;
        int X = a24.X(((float) (((int) ((getThumbPosition() + 0.2f) * f)) + 20)) * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) ((int) ((((float) 1) - getThumbPosition()) * ((float) 6)))) * dh4.c().getDisplayMetrics().density);
        int p = me4.p(f, dh4.c().getDisplayMetrics().density, getWidth() - X);
        int i = getThumbDrawable().getBounds().left + X2;
        int i2 = (i > p ? p : i) + X;
        int height = (getHeight() / 2) - (X / 2);
        int i3 = X + height;
        Drawable thumbDrawable = getThumbDrawable();
        if (i <= p) {
            p = i;
        }
        thumbDrawable.setBounds(p, height, i2, i3);
        eda.super.onDraw(canvas);
    }

    public final void onThemeChanged(pda pda) {
        GradientDrawable gradientDrawable = getThumbStateDrawable().a;
        pda.getIcon();
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        getThumbStateDrawable().b.setColor(ColorStateList.valueOf(pda.getIcon().i));
        GradientDrawable gradientDrawable2 = getTrackThumbDrawable().a;
        pda.b().a.getClass();
        gradientDrawable2.setColor(ColorStateList.valueOf(-16745729));
        GradientDrawable gradientDrawable3 = getTrackThumbDrawable().a;
        float f = (float) 2;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        pda.b().a.getClass();
        gradientDrawable3.setStroke(X, ColorStateList.valueOf(-16745729));
        getTrackThumbDrawable().b.setColor(ColorStateList.valueOf(0));
        getTrackThumbDrawable().b.setStroke(a24.X(f * dh4.c().getDisplayMetrics().density), ColorStateList.valueOf(pda.h().j));
        getTrackThumbDrawable().c.setColor(ColorStateList.valueOf(pda.c().a.r));
        getTrackThumbDrawable().d.setColor(ColorStateList.valueOf(pda.c().a.l));
    }
}
