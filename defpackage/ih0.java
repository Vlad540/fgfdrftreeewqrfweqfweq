package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: ih0  reason: default package */
public abstract class ih0 extends LinearLayout implements mhe {
    public ih0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        int X = a24.X(((float) 14) * dh4.c().getDisplayMetrics().density);
        setPadding(X, X, X, X);
        s59 s59 = km4.y0;
        ax6 ax6 = new ax6(dh4.c().getDisplayMetrics().density * 2.0f, dh4.c().getDisplayMetrics().density * 24.0f, s59.r(this).a().o().d.a);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, s59.r(this).a().o().a.l);
        ax6.h.o1(ax6, ax6.j[0], gradientDrawable);
        setBackground(ax6);
    }

    public void onThemeChanged(pda pda) {
        Drawable background = getBackground();
        ax6 ax6 = background instanceof ax6 ? (ax6) background : null;
        if (ax6 != null) {
            s59 s59 = km4.y0;
            int i = s59.r(this).a().o().d.a;
            k77[] k77Arr = ax6.j;
            ax6.i.o1(ax6, k77Arr[1], Integer.valueOf(i));
            ax6.h.o1(ax6, k77Arr[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, s59.r(this).a().o().a.l));
        }
    }
}
