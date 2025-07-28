package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: pxb  reason: default package */
public final class pxb extends FrameLayout implements mhe {
    public static final /* synthetic */ k77[] o;
    public final t97 a;
    public final eu3 b;
    public final yj c = new yj(this);

    static {
        hc9 hc9 = new hc9(pxb.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;");
        m7c.a.getClass();
        o = new k77[]{hc9};
    }

    public pxb(Context context) {
        super(context, (AttributeSet) null);
        this.a = ez3.O(3, new t2a(context, 19));
        eu3 eu3 = new eu3((float) a24.X(((float) 32) * dh4.c().getDisplayMetrics().density));
        this.b = eu3;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(eu3);
        setBackgroundColor(km4.y0.r(this).b().a.g);
        setClickable(true);
        addView(getTextView());
    }

    public static final void a(pxb pxb, oxb oxb) {
        float f;
        float f2;
        int i;
        TextView textView = pxb.getTextView();
        int ordinal = oxb.ordinal();
        if (ordinal == 0) {
            f = 32.0f;
        } else if (ordinal == 1) {
            f = 44.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextSize(f);
        int ordinal2 = oxb.ordinal();
        if (ordinal2 == 0) {
            f2 = dh4.c().getDisplayMetrics().density * 32.0f;
        } else if (ordinal2 == 1) {
            f2 = dh4.c().getDisplayMetrics().density * 50.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        pxb.b.a = f2;
        ViewGroup.LayoutParams layoutParams = pxb.getLayoutParams();
        if (layoutParams != null) {
            int ordinal3 = oxb.ordinal();
            if (ordinal3 == 0) {
                i = a24.X(((float) 64) * dh4.c().getDisplayMetrics().density);
            } else if (ordinal3 == 1) {
                i = a24.X(((float) 80) * dh4.c().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams.height = i;
            layoutParams.width = i;
            pxb.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final TextView getTextView() {
        return (TextView) this.a.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final oxb getSize() {
        k77 k77 = o[0];
        return (oxb) this.c.b;
    }

    public final void onThemeChanged(pda pda) {
        getTextView().setTextColor(pda.getText().e);
        setBackgroundColor(pda.b().a.g);
    }

    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setSize(oxb oxb) {
        this.c.o1(this, o[0], oxb);
    }

    public final void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
        b();
    }
}
