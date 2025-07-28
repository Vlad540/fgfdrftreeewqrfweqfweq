package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ey9  reason: default package */
public final class ey9 extends FrameLayout implements mhe {
    public static final /* synthetic */ k77[] c;
    public final yj a = new yj(this);
    public final TextView b;

    static {
        k77 hc9 = new hc9(ey9.class, "appearance", "getAppearance()Lone/me/pinbars/unknowncontact/OneMeActionButton$Appearance;");
        m7c.a.getClass();
        c = new k77[]{hc9};
    }

    public ey9(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nte.B.b(textView, yq4.b);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        float f = (float) 40;
        setMinimumHeight(a24.X(dh4.c().getDisplayMetrics().density * f));
        setMinimumWidth(a24.X(f * dh4.c().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 12.0f));
        float f2 = (float) 16;
        float f3 = (float) 10;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(km4.y0.r(this));
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = km4.y0.r(this).c().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    public final dy9 getAppearance() {
        k77 k77 = c[0];
        return (dy9) this.a.b;
    }

    public final void onThemeChanged(pda pda) {
        int i;
        int ordinal = getAppearance().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = isEnabled() ? pda.getText().b : pda.c().c.f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (isEnabled()) {
            pda.getText();
            i = -16745729;
        } else {
            i = pda.c().c.j;
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(dy9 dy9) {
        this.a.o1(this, c[0], dy9);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(km4.y0.r(this));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
