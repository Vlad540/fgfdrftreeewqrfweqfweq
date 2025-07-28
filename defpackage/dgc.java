package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: dgc  reason: default package */
public final class dgc extends ConstraintLayout {
    public static final /* synthetic */ k77[] W0;
    public final t97 K0;
    public final t97 L0;
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public agc P0;
    public final t97 Q0 = ez3.O(3, new k6b(29));
    public final t97 R0 = ez3.O(3, new u5b(15, this));
    public final t97 S0 = ez3.O(3, new vfc(0));
    public final cgc T0 = new cgc(this, 0);
    public final cgc U0 = new cgc(this, 1);
    public final cgc V0;

    static {
        Class<dgc> cls = dgc.class;
        W0 = new k77[]{new hc9(cls, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;"), c3d.g(m7c.a, cls, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;"), new hc9(cls, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;")};
    }

    public dgc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = ez3.O(3, new t2a(context, 21));
        this.L0 = ez3.O(3, new t2a(context, 22));
        this.M0 = ez3.O(3, new t2a(context, 23));
        this.N0 = ez3.O(3, new t2a(context, 24));
        this.O0 = ez3.O(3, new t2a(context, 25));
        float f = (float) 52;
        this.V0 = new cgc(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)), this);
        addView(getIconView(), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(getStubCounterView());
        addView(getStubTitleView());
        a24.Z(this, 300, new wfc(0, (Object) this));
        C();
        bf3 p = a06.p(this);
        int id = getIconView().getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, getStubCounterView().getId(), 6);
        p.d(id, 4, getStubTitleView().getId(), 3);
        int id2 = getStubCounterView().getId();
        p.d(id2, 3, getIconView().getId(), 3);
        p.d(id2, 6, getIconView().getId(), 7);
        p.d(id2, 4, getIconView().getId(), 4);
        p.d(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        p.d(id3, 3, getIconView().getId(), 4);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        p.a(this);
    }

    private final int getContrastColor() {
        return -868664768;
    }

    private final TextView getCounterView() {
        return (TextView) this.N0.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = bgc.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float[] getICON_BG_RADIUS() {
        return (float[]) this.Q0.getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.M0.getValue();
    }

    private final int getInactiveColor() {
        qda.f.b.getClass();
        return -1552977290;
    }

    private final int getNegativeColor() {
        return qda.c.a.e;
    }

    private final int getNeutralColor() {
        return qda.c.a.g;
    }

    private final int getPositiveColor() {
        return qda.c.a.k;
    }

    private final int getSelectedColor() {
        return qda.f.a.b;
    }

    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.S0.getValue();
    }

    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.R0.getValue();
    }

    private final ViewStub getStubCounterView() {
        return (ViewStub) this.K0.getValue();
    }

    private final ViewStub getStubTitleView() {
        return (ViewStub) this.L0.getValue();
    }

    private final int getThemedColor() {
        qda.c.a.getClass();
        return -16745729;
    }

    private final TextView getTitleView() {
        return (TextView) this.O0.getValue();
    }

    public static ShapeDrawable w(dgc dgc) {
        return new ShapeDrawable(new RoundRectShape(dgc.getICON_BG_RADIUS(), (RectF) null, (float[]) null));
    }

    public final void A(Drawable drawable, int i) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void C() {
        Integer num;
        RippleDrawable rippleDrawable;
        switch (getMode().ordinal()) {
            case 0:
                num = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                num = Integer.valueOf(getPositiveColor());
                break;
            case 2:
                num = Integer.valueOf(getNegativeColor());
                break;
            case 3:
                num = Integer.valueOf(getSelectedColor());
                break;
            case 4:
                num = Integer.valueOf(getContrastColor());
                break;
            case 5:
                num = Integer.valueOf(getInactiveColor());
                break;
            case 6:
                num = Integer.valueOf(getThemedColor());
                break;
            case 7:
                num = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView iconView = getIconView();
        if (num != null) {
            int i = qda.f.a.b;
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(num.intValue());
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), currentShape, (Drawable) null);
        } else {
            int i2 = km4.y0.r(this).c().a.f;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, currentShape2);
        }
        iconView.setBackground(rippleDrawable);
    }

    public final zfc getImageSize() {
        k77 k77 = W0[2];
        return (zfc) this.V0.b;
    }

    public final yfc getMode() {
        k77 k77 = W0[0];
        return (yfc) this.T0.b;
    }

    public final xfc getShape() {
        k77 k77 = W0[1];
        return (xfc) this.U0.b;
    }

    public final void setAccessibility(mge mge) {
        getIconView().setContentDescription(mge != null ? mge.a(getContext()) : null);
    }

    public final void setButtonPadding(int i) {
        me4.o((float) i, dh4.c().getDisplayMetrics().density, getIconView());
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(zfc zfc) {
        this.V0.o1(this, W0[2], zfc);
    }

    public final void setListener(agc agc) {
        this.P0 = agc;
    }

    public final void setMode(yfc yfc) {
        this.T0.o1(this, W0[0], yfc);
    }

    public final void setShape(xfc xfc) {
        this.U0.o1(this, W0[1], xfc);
    }

    public final void setText(String str) {
        if (ek8.K(getStubCounterView()) || (str != null && !h0e.c0(str))) {
            ek8.I(getStubCounterView(), getCounterView(), (s16) null);
            getCounterView().setText(str);
            TextView counterView = getCounterView();
            int i = 0;
            if (!(!(str == null || h0e.c0(str)))) {
                i = 8;
            }
            counterView.setVisibility(i);
        }
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(mge mge) {
        if (ek8.K(getStubTitleView()) || mge != null) {
            CharSequence charSequence = null;
            ek8.I(getStubTitleView(), getTitleView(), (s16) null);
            TextView titleView = getTitleView();
            if (mge != null) {
                charSequence = mge.a(getContext());
            }
            titleView.setText(charSequence);
            getTitleView().setVisibility(mge != null ? 0 : 8);
        }
    }

    public final void y(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void setAccessibility(Integer num) {
        String str;
        ImageView iconView = getIconView();
        if (num != null) {
            str = getContext().getString(num.intValue());
        } else {
            str = null;
        }
        iconView.setContentDescription(str);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
