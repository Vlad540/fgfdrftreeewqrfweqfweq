package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j32  reason: default package */
public final class j32 extends View implements mhe {
    public final t97 a;
    public final t97 b = ez3.O(3, new h32(this, 1));

    public j32(Context context) {
        super(context, (AttributeSet) null);
        t97 O = ez3.O(3, new h32(this, 0));
        this.a = O;
        float f = (float) 64;
        setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        setClipToOutline(true);
        setOutlineProvider(new i32(this, 0));
        setForeground((Drawable) O.getValue());
    }

    private final LayerDrawable getSelectedIndicatorIcon() {
        return (LayerDrawable) this.b.getValue();
    }

    public final void onThemeChanged(pda pda) {
        t97 t97 = this.a;
        if (t97.a()) {
            ((GradientDrawable) t97.getValue()).setStroke(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density), pda.h().j);
        }
        Paint paint = ((ShapeDrawable) getSelectedIndicatorIcon().getDrawable(0)).getPaint();
        pda.b();
        paint.setColor(-1728053248);
        js.D(getSelectedIndicatorIcon().getDrawable(1), -1);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }

    public void setSelected(boolean z) {
        setForeground(z ? getSelectedIndicatorIcon() : (Drawable) this.a.getValue());
        super.setSelected(z);
    }
}
