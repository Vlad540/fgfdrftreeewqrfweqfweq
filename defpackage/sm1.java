package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sm1  reason: default package */
public final class sm1 extends ConstraintLayout implements mhe, ak1 {
    public static final /* synthetic */ k77[] p1;
    public final t97 K0 = ez3.O(3, new di1(17));
    public final t97 L0;
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public final GestureDetector P0;
    public final mz9 Q0;
    public final TextView R0;
    public final dgc S0;
    public s16 T0;
    public s16 U0;
    public final t97 V0;
    public final t97 W0;
    public final t97 X0;
    public final t97 Y0;
    public final ViewStub Z0;
    public final ViewStub a1;
    public final ViewStub b1;
    public final ViewStub c1;
    public final r7e d1;
    public final t97 e1;
    public pm1 f1;
    public Boolean g1;
    public Boolean h1;
    public Boolean i1;
    public CharSequence j1;
    public ize k1;
    public le1 l1;
    public hze m1;
    public final rm1 n1;
    public final rm1 o1;

    static {
        Class<sm1> cls = sm1.class;
        p1 = new k77[]{new hc9(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;"), c3d.g(m7c.a, cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.L0 = ez3.O(3, new om1(context2, this, 0));
        this.M0 = ez3.O(3, new b5(context2, 21));
        this.N0 = ez3.O(3, new b5(context2, 22));
        this.O0 = ez3.O(3, new b5(context2, 23));
        this.V0 = ez3.O(3, new om1(context2, this, 1));
        this.W0 = ez3.O(3, new om1(context2, this, 2));
        this.X0 = ez3.O(3, new om1(context2, this, 3));
        this.Y0 = ez3.O(3, new b5(context2, 24));
        this.d1 = new r7e(new mm1(this, 0));
        this.e1 = ez3.O(3, new mm1(this, 2));
        this.l1 = le1.c;
        this.n1 = new rm1(this, 0);
        this.o1 = new rm1(this, 1);
        setLayoutParams(new re3(-1, -1));
        setElevation(dh4.c().getDisplayMetrics().density * 2.0f);
        kjd.J(this, dh4.c().getDisplayMetrics().density * 20.0f);
        setBackgroundColor(getBackgroundColor());
        this.P0 = new GestureDetector(context2, new tz(4, this));
        mz9 mz9 = new mz9(context2);
        mz9.setId(o1a.w1);
        mz9.setAvatarShape(dz9.a);
        this.Q0 = mz9;
        TextView textView = new TextView(context2);
        textView.setId(o1a.u1);
        textView.setMaxLines(1);
        textView.setTextColor(-855638017);
        nge.d(nte.o, textView);
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        textView.setPadding(X, X, X, X);
        fja.d(textView);
        this.R0 = textView;
        dgc dgc = new dgc(context2, (AttributeSet) null);
        dgc.setId(o1a.h0);
        dgc.setMode(yfc.a);
        dgc.setVisibility(8);
        dgc.setImageSize(new zfc(getActionButtonSize(), getActionButtonSize()));
        this.S0 = dgc;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(o1a.q0);
        this.a1 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(o1a.o0);
        this.b1 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(o1a.s0);
        this.Z0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(o1a.f0);
        this.c1 = viewStub4;
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setId(o1a.m0);
        frameLayout.addView(textView, -2, -2);
        addView(mz9, getAvatarSize(), getAvatarSize());
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(frameLayout, -1, -2);
        addView(dgc);
        addView(viewStub3);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new mp0(2, this));
        } else {
            L(this.j1);
        }
        bf3 p = a06.p(this);
        int id = mz9.getId();
        p.d(id, 4, 0, 4);
        hr1.q((float) 5, dh4.c().getDisplayMetrics().density, new hw9(p, 4, id, 4));
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        int id2 = viewStub.getId();
        p.d(id2, 4, 0, 4);
        p.d(id2, 3, 0, 3);
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        int id3 = viewStub4.getId();
        p.d(id3, 4, 0, 4);
        p.d(id3, 3, 0, 3);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        int id4 = viewStub2.getId();
        p.d(id4, 4, 0, 4);
        p.d(id4, 3, 0, 3);
        p.d(id4, 6, 0, 6);
        p.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        p.d(id5, 6, 0, 6);
        float f = (float) 8;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id5, 4));
        p.d(id5, 4, 0, 4);
        new hw9(p, 4, id5, 4).e(getNameVerticalMargin());
        p.d(id5, 7, 0, 7);
        new hw9(p, 7, id5, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        int id6 = dgc.getId();
        p.d(id6, 3, 0, 3);
        new hw9(p, 3, id6, 4).e(getActionButtonPadding());
        p.d(id6, 7, 0, 7);
        new hw9(p, 7, id6, 4).e(getActionButtonPadding());
        int id7 = viewStub3.getId();
        p.d(id7, 3, 0, 3);
        new hw9(p, 3, id7, 4).e(getActionButtonPadding());
        p.d(id7, 6, 0, 6);
        new hw9(p, 6, id7, 4).e(getActionButtonPadding());
        p.a(this);
    }

    public static ImageView A(Context context, sm1 sm1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(o1a.s0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(sm1.getActionButtonSize(), sm1.getActionButtonSize()));
        imageView.setImageDrawable(sm1.getRaiseHandIcon());
        a24.Z(imageView, 300, new nm1(sm1, 3));
        return imageView;
    }

    public static View B(Context context, sm1 sm1) {
        View view = new View(context);
        view.setId(o1a.f0);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(sm1.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static ShapeDrawable C(sm1 sm1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(sm1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(-1559425779);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static final void F(sm1 sm1) {
        mz9 mz9 = sm1.Q0;
        ViewGroup.LayoutParams layoutParams = mz9.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = sm1.getAvatarSize();
            layoutParams.width = sm1.getAvatarSize();
            mz9.setLayoutParams(layoutParams);
            TextView textView = sm1.R0;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = sm1.getNameVerticalMargin();
                textView.setLayoutParams(marginLayoutParams);
                dgc dgc = sm1.S0;
                ViewGroup.LayoutParams layoutParams3 = dgc.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.topMargin = sm1.getActionButtonPadding();
                    marginLayoutParams2.setMarginEnd(sm1.getActionButtonPadding());
                    dgc.setLayoutParams(marginLayoutParams2);
                    if (ek8.K(sm1.Z0)) {
                        ImageView raiseHandView = sm1.getRaiseHandView();
                        ViewGroup.LayoutParams layoutParams4 = raiseHandView.getLayoutParams();
                        if (layoutParams4 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams3.height = sm1.getActionButtonSize();
                            marginLayoutParams3.width = sm1.getActionButtonSize();
                            raiseHandView.setLayoutParams(marginLayoutParams3);
                            sm1.getRaiseHandIcon().setBounds(0, 0, sm1.getActionButtonSize(), sm1.getActionButtonSize());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    dgc.setImageSize(new zfc(sm1.getActionButtonSize(), sm1.getActionButtonSize()));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final int getActionButtonPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int ordinal = getMode().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3) {
                return a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a24.X(((float) 26) * dh4.c().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            return a24.X(((float) 72) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1 || ordinal == 2) {
            return a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 3) {
            return a24.X(((float) 216) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 4) {
            return a24.X(((float) 216) * dh4.c().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().b().j;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final f11 getCameraPreviewView() {
        return (f11) this.Y0.getValue();
    }

    private final pda getCurrentTheme() {
        pda customTheme = getCustomTheme();
        return customTheme == null ? km4.y0.r(this) : customTheme;
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.e1.getValue();
    }

    private final View getLoadingView() {
        return (View) this.W0.getValue();
    }

    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.K0.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final Drawable getMoreIcon() {
        return (Drawable) this.O0.getValue();
    }

    private final int getNameVerticalMargin() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    }

    private final Drawable getPinnedIcon() {
        return (Drawable) this.M0.getValue();
    }

    private final hxb getRaiseHandIcon() {
        return (hxb) this.L0.getValue();
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.V0.getValue();
    }

    private final an1 getRender() {
        return (an1) this.X0.getValue();
    }

    private final Drawable getRotateIcon() {
        return (Drawable) this.N0.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.d1.getValue();
    }

    private final int getViewPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal == 2) {
                return a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return a24.X(((float) 0) * dh4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    }

    public static void w(sm1 sm1, boolean z) {
        kjd.U(sm1.getRender(), z);
        mz9 mz9 = sm1.Q0;
        int i = 0;
        boolean z2 = !z;
        if ((mz9.getVisibility() == 0) != z2) {
            if (!z2) {
                i = 8;
            }
            mz9.setVisibility(i);
        }
        ShapeDrawable backgroundItemView = sm1.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        sm1.R0.setBackground(backgroundItemView);
    }

    public static ShapeDrawable x(sm1 sm1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(sm1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(qda.c.a.k);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(dh4.c().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static hxb y(Context context, sm1 sm1) {
        hxb hxb = new hxb(context);
        hxb.setBounds(0, 0, sm1.getActionButtonSize(), sm1.getActionButtonSize());
        return hxb;
    }

    public final void G(boolean z) {
        ViewStub viewStub = this.c1;
        if ((ek8.K(viewStub) || z) && !hhd.f(this.h1, Boolean.valueOf(z))) {
            ek8.I(viewStub, getLoadingView(), (s16) null);
            this.h1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void I(boolean z) {
        if (!hhd.f(this.g1, Boolean.valueOf(z))) {
            this.g1 = Boolean.valueOf(z);
            ShapeDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            setForeground(talkingDrawable);
        }
    }

    public final void J(boolean z, boolean z2) {
        ek8.I(this.b1, getCameraPreviewView(), (s16) null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        getCameraPreviewView().a(z, z2);
    }

    public final void K(String str, CharSequence charSequence) {
        if (!hhd.f(this.j1, charSequence)) {
            this.j1 = charSequence;
            L(charSequence);
            this.R0.setContentDescription(str);
        }
    }

    public final void L(CharSequence charSequence) {
        int i = 8;
        int l = rf0.l((float) 8, dh4.c().getDisplayMetrics().density, 2, getMeasuredWidth());
        TextView textView = this.R0;
        CharSequence h = kjd.h(charSequence, textView, rf0.l((float) 6, dh4.c().getDisplayMetrics().density, 2, l) - (getViewPadding() * 2));
        textView.setText(h);
        if (!(h == null || h0e.c0(h))) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final pda getCustomTheme() {
        k77 k77 = p1[1];
        return (pda) this.o1.b;
    }

    public final qm1 getMode() {
        k77 k77 = p1[0];
        return (qm1) this.n1.b;
    }

    public final void onAttachedToWindow() {
        bk1 bk1;
        super.onAttachedToWindow();
        s16 s16 = this.T0;
        if (!(s16 == null || (bk1 = (bk1) s16.invoke()) == null)) {
            ((ck1) bk1).a.add(this);
        }
        if (ek8.K(this.Z0) && hhd.f(this.i1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    public final void onDetachedFromWindow() {
        bk1 bk1;
        super.onDetachedFromWindow();
        s16 s16 = this.T0;
        if (!(s16 == null || (bk1 = (bk1) s16.invoke()) == null)) {
            ((ck1) bk1).a.remove(this);
        }
        if (ek8.K(this.Z0)) {
            getRaiseHandIcon().stop();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        L(this.j1);
    }

    public final void onThemeChanged(pda pda) {
        setBackgroundColor(getBackgroundColor());
        TextView textView = this.R0;
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P0.onTouchEvent(motionEvent);
    }

    public final void p() {
        setOpponentVideo(this.m1);
    }

    public final void setAvatar(mc0 mc0) {
        ub0 ub0 = null;
        String str = mc0 != null ? mc0.b : null;
        mz9 mz9 = this.Q0;
        mz9.setAvatarUrl(str);
        if (mc0 != null) {
            ub0 = mc0.a;
        }
        mz9.g(ub0, true);
    }

    public final void setBackgroundCorners(float f) {
        kjd.J(this, f);
    }

    public final void setButtonAction(ize ize) {
        if (this.k1 != ize) {
            this.k1 = ize;
            int ordinal = ize.ordinal();
            yfc yfc = yfc.w0;
            dgc dgc = this.S0;
            if (ordinal == 0) {
                dgc.setVisibility(0);
                dgc.A(getMoreIcon(), -855638017);
                dgc.setMode(yfc);
                dgc.setContentDescription(dgc.getContext().getString(ftb.call_user_item_more));
                a24.Z(dgc, 300, new nm1(this, 0));
                dgc.setButtonPadding(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal == 1) {
                dgc.setVisibility(0);
                dgc.A(getRotateIcon(), -855638017);
                dgc.setMode(yfc.X);
                dgc.setContentDescription(dgc.getContext().getString(r1a.O1));
                a24.Z(dgc, 300, new nm1(this, 2));
                dgc.setButtonPadding(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal == 2) {
                dgc.setVisibility(0);
                dgc.A(getPinnedIcon(), -855638017);
                dgc.setMode(yfc);
                dgc.setContentDescription(dgc.getContext().getString(ftb.call_user_info_pinned));
                a24.Z(dgc, 300, new nm1(this, 1));
                dgc.setButtonPadding(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal == 3) {
                dgc.setVisibility(8);
                dgc.setContentDescription((CharSequence) null);
                dgc.setMode(yfc);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setCallSpeakerMediator(s16 s16) {
        this.T0 = s16;
    }

    public final void setCustomTheme(pda pda) {
        this.o1.o1(this, p1[1], pda);
    }

    public final void setMode(qm1 qm1) {
        this.n1.o1(this, p1[0], qm1);
    }

    public final void setOpponentVideo(hze hze) {
        bk1 bk1;
        hze hze2;
        ViewStub viewStub = this.a1;
        if (hze != null || ek8.K(viewStub)) {
            an1 render = getRender();
            boolean z = false;
            if (!ek8.K(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, indexOfChild, layoutParams);
                kjd.U(getRender(), false);
            }
            s16 s16 = this.T0;
            if (!(s16 == null || (bk1 = (bk1) s16.invoke()) == null || (hze2 = ((ck1) bk1).b) == null || !hze2.g || hze == null || hze2.a != hze.a)) {
                z = true;
            }
            an1 render2 = getRender();
            render2.x0 = hze;
            render2.y0 = z;
            getRender().d();
            this.m1 = hze;
        }
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.Z0;
        if (ek8.K(viewStub) || z) {
            this.i1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!ek8.K(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, indexOfChild, layoutParams);
                getRaiseHandIcon().setBounds(0, 0, getActionButtonSize(), getActionButtonSize());
            }
            mt0.k(getRaiseHandView(), z, 50, (u16) null, 4);
            hxb raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(s16 s16) {
        this.U0 = s16;
    }
}
