package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: b1a  reason: default package */
public final class b1a extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] x0;
    public final t97 a;
    public final t97 b;
    public final a1a c = new a1a(this, 0);
    public final a1a o = new a1a(this, 1);
    public final a1a w0 = new a1a(this, 2);

    static {
        Class<b1a> cls = b1a.class;
        x0 = new k77[]{new hc9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), c3d.g(m7c.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), new hc9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;")};
    }

    public b1a(Context context) {
        super(context, (AttributeSet) null);
        this.a = ez3.O(3, new cc3(context, 25));
        this.b = ez3.O(3, new cc3(context, 26));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        c(this, getAppearance());
        setClipToOutline(true);
        setOutlineProvider(new eu3((float) a24.X(((float) 16) * dh4.c().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    private final pda getCurrentTheme() {
        pda customTheme = getCustomTheme();
        return customTheme == null ? km4.y0.r(this) : customTheme;
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final void c(View view, x0a x0a) {
        RippleDrawable rippleDrawable;
        int ordinal = x0a.ordinal();
        s59 s59 = km4.y0;
        if (ordinal == 0) {
            s59.r(view);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(getCurrentTheme().c().a.f), new ColorDrawable(getCurrentTheme().b().f), new ColorDrawable(-65536));
        } else if (ordinal == 1) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(s59.r(view).c().a.c), new ColorDrawable(getCurrentTheme().c().a.c), new ColorDrawable(-65536));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setBackground(rippleDrawable);
    }

    public final x0a getAppearance() {
        k77 k77 = x0[2];
        return (x0a) this.w0.b;
    }

    public final pda getCustomTheme() {
        k77 k77 = x0[0];
        return (pda) this.c.b;
    }

    public final y0a getMode() {
        k77 k77 = x0[1];
        return (y0a) this.o.b;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(getMeasuredHeight(), a24.X(((float) 60) * dh4.c().getDisplayMetrics().density));
        if (getMeasuredWidth() < max) {
            setMeasuredDimension(max, max);
        } else {
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public final void onThemeChanged(pda pda) {
        getIconView().setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().f));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(getCurrentTheme().getIcon().f);
        }
        c(this, getAppearance());
        getTextView().setTextColor(getCurrentTheme().getText().e);
    }

    public final void setAppearance(x0a x0a) {
        this.w0.o1(this, x0[2], x0a);
    }

    public final void setCustomTheme(pda pda) {
        this.c.o1(this, x0[0], pda);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() != drawable) {
            if (drawable != null) {
                drawable.setTint(km4.y0.r(this).getIcon().f);
            }
            getIconView().setImageDrawable(drawable);
            b();
        }
    }

    public final void setMode(y0a y0a) {
        this.o.o1(this, x0[1], y0a);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() == y0a.b && !hhd.f(getTextView().getText(), charSequence)) {
            getTextView().setText(charSequence);
            if (getTextView().getParent() == null) {
                addView(getTextView());
            }
            b();
        }
    }

    public final void setIcon(int i) {
        setIcon(gq3.b(getContext(), i));
    }

    public final void setText(int i) {
        setText((CharSequence) getContext().getString(i));
    }
}
