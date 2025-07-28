package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: v7a  reason: default package */
public final class v7a extends FrameLayout implements mhe {
    public static final /* synthetic */ k77[] x0;
    public final u7a a = new u7a(this, 0);
    public final u7a b = new u7a(this, 1);
    public final aba c;
    public final ShapeDrawable o;
    public final RippleDrawable w0;

    static {
        Class<v7a> cls = v7a.class;
        x0 = new k77[]{new hc9(cls, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;"), c3d.g(m7c.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;")};
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [aba, android.view.View] */
    public v7a(Context context) {
        super(context, (AttributeSet) null);
        ? aba = new aba(context, (AttributeSet) null);
        aba.setId(qhc.i);
        this.c = aba;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.o = shapeDrawable;
        int i = km4.y0.r(this).c().a.c;
        this.w0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        addView(aba);
        b();
        c();
    }

    public final void a(float f, int i, String str) {
        Drawable n = am7.n(getContext(), i);
        if (n != null) {
            AppCompatImageView appCompatImageView = this.c;
            appCompatImageView.setImageDrawable(n);
            appCompatImageView.w0 = h2g.f(str);
            appCompatImageView.o = f;
            appCompatImageView.invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [aba, android.widget.ImageView] */
    public final void b() {
        int i;
        s59 s59 = km4.y0;
        s59.r(this);
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            i = s59.r(this).b().e;
        } else if (ordinal == 1) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.getPaint().setColor(i);
        s59.r(this);
        ColorStateList valueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.w0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [aba, android.view.View] */
    public final void c() {
        int i;
        int i2;
        int ordinal = getSize().ordinal();
        if (ordinal == 0) {
            i = 24;
        } else if (ordinal == 1) {
            i = 32;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int X = a24.X(((float) i) * dh4.c().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(X, X));
        int ordinal2 = getSize().ordinal();
        if (ordinal2 == 0) {
            i2 = 8;
        } else if (ordinal2 == 1) {
            i2 = 10;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int X2 = a24.X(((float) i2) * dh4.c().getDisplayMetrics().density);
        setPadding(X2, X2, X2, X2);
        setOutlineProvider(new eu3((float) X));
        requestLayout();
        invalidate();
    }

    public final s7a getMode() {
        k77 k77 = x0[1];
        return (s7a) this.b.b;
    }

    public final t7a getSize() {
        k77 k77 = x0[0];
        return (t7a) this.a.b;
    }

    public final void onThemeChanged(pda pda) {
        b();
    }

    public final void setMode(s7a s7a) {
        this.b.o1(this, x0[1], s7a);
    }

    public final void setSize(t7a t7a) {
        this.a.o1(this, x0[0], t7a);
    }
}
