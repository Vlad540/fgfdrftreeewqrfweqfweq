package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f01  reason: default package */
public final class f01 extends ConstraintLayout {
    public static final /* synthetic */ int Y0 = 0;
    public final t97 K0 = ez3.O(3, new m(29));
    public final t97 L0;
    public final t97 M0;
    public final dgc N0;
    public final dgc O0;
    public final dgc P0;
    public final dgc Q0;
    public e01 R0;
    public hy7 S0;
    public hy7 T0;
    public hy7 U0;
    public jme V0;
    public jme W0;
    public l31 X0;

    public f01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int X = a24.X(((float) 48) * dh4.c().getDisplayMetrics().density);
        this.L0 = ez3.O(3, new c01(this, 0));
        this.M0 = ez3.O(3, new b5(context, 6));
        dgc dgc = new dgc(context, (AttributeSet) null);
        dgc.setId(uob.call_dinamic);
        dgc.setLayoutParams(new re3(X, X));
        dgc.setListener(new d01(this, 0));
        dgc.setImageSize(new zfc(X, X));
        dgc.setButtonPadding(a24.W(((double) dh4.c().getDisplayMetrics().density) * 3.5d));
        this.N0 = dgc;
        dgc dgc2 = new dgc(context, (AttributeSet) null);
        dgc2.setId(uob.call_microphone);
        dgc2.setLayoutParams(new re3(-2, -2));
        dgc2.setListener(new d01(this, 1));
        dgc2.setImageSize(new zfc(X, X));
        dgc2.setButtonPadding(a24.W(((double) dh4.c().getDisplayMetrics().density) * 3.5d));
        this.O0 = dgc2;
        dgc dgc3 = new dgc(context, (AttributeSet) null);
        dgc3.setId(uob.call_video);
        dgc3.setLayoutParams(new re3(-2, -2));
        dgc3.y(phc.R0, -855638017);
        dgc3.setListener(new d01(this, 2));
        dgc3.setImageSize(new zfc(X, X));
        dgc3.setButtonPadding(a24.W(((double) dh4.c().getDisplayMetrics().density) * 3.5d));
        this.P0 = dgc3;
        dgc dgc4 = new dgc(context, (AttributeSet) null);
        dgc4.setId(o1a.r0);
        dgc4.setLayoutParams(new re3(-2, -2));
        dgc4.y(n1a.J, -855638017);
        dgc4.setListener(new d01(this, 3));
        dgc4.setImageSize(new zfc(X, X));
        dgc4.setButtonPadding(a24.W(((double) dh4.c().getDisplayMetrics().density) * 3.5d));
        this.Q0 = dgc4;
        dgc dgc5 = new dgc(context, (AttributeSet) null);
        dgc5.setId(uob.call_cancel);
        dgc5.setLayoutParams(new re3(-2, -2));
        dgc5.y(n1a.b0, -855638017);
        dgc5.setAccessibility(Integer.valueOf(ftb.call_cancel_accessibility));
        dgc5.setListener(new d01(this, 4));
        dgc5.setMode(yfc.c);
        dgc5.setImageSize(new zfc(X, X));
        dgc5.setButtonPadding(a24.W(((double) dh4.c().getDisplayMetrics().density) * 3.5d));
        setLayoutParams(new re3(0, -2));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        setPadding(X2, X2, X2, X2);
        addView(dgc);
        addView(dgc2);
        addView(dgc3);
        addView(dgc4);
        addView(dgc5);
        bf3 p = a06.p(this);
        int id = dgc.getId();
        p.d(id, 4, dgc3.getId(), 4);
        p.d(id, 7, dgc2.getId(), 6);
        float f = (float) 6;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id, 4));
        p.d(id, 6, 0, 6);
        p.d(id, 3, dgc3.getId(), 3);
        p.g(id).d.V = 1;
        int id2 = dgc2.getId();
        p.d(id2, 4, dgc3.getId(), 4);
        p.d(id2, 7, dgc3.getId(), 6);
        new hw9(p, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id2, 6, dgc.getId(), 7);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id2, 3, dgc3.getId(), 3);
        int id3 = dgc3.getId();
        p.d(id3, 4, 0, 4);
        p.d(id3, 3, 0, 3);
        p.d(id3, 7, dgc4.getId(), 6);
        new hw9(p, 7, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id3, 6, dgc2.getId(), 7);
        new hw9(p, 6, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id4 = dgc4.getId();
        p.d(id4, 4, dgc3.getId(), 4);
        p.d(id4, 7, dgc5.getId(), 6);
        new hw9(p, 7, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id4, 6, dgc3.getId(), 7);
        new hw9(p, 6, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id4, 3, dgc3.getId(), 3);
        int id5 = dgc5.getId();
        p.d(id5, 4, dgc3.getId(), 4);
        p.d(id5, 7, 0, 7);
        p.d(id5, 6, dgc4.getId(), 7);
        new hw9(p, 6, id5, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.d(id5, 3, dgc3.getId(), 3);
        p.a(this);
    }

    private final float[] getBgRadius() {
        return (float[]) this.K0.getValue();
    }

    private final View getContainer() {
        return (View) this.L0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return me4.c((float) 6, dh4.c().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    private final w39 getMicrophoneOnDrawable() {
        return (w39) this.M0.getValue();
    }

    public static void w(f01 f01) {
        lv1 lv1;
        if (f01.X0 != null && (lv1 = f01.R0) != null) {
            lv1.w(f01.getContainer());
        }
    }

    public static void y(dgc dgc, Drawable drawable, Drawable drawable2, hy7 hy7, mge mge, mge mge2) {
        dgc.setVisibility(hy7 != hy7.o ? 0 : 8);
        int ordinal = hy7.ordinal();
        if (ordinal != 0) {
            yfc yfc = yfc.w0;
            if (ordinal == 1) {
                dgc.A(drawable, -1);
                dgc.setMode(yfc);
                dgc.setAccessibility(mge);
            } else if (ordinal == 2) {
                dgc.A(drawable2, -15987442);
                dgc.setMode(yfc.Y);
                dgc.setAccessibility(mge);
            } else if (ordinal == 3) {
            } else {
                if (ordinal == 4) {
                    dgc.A(drawable2, -3259817);
                    dgc.setMode(yfc);
                    dgc.setAccessibility(mge2);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            dgc.A(drawable2, -15987442);
            dgc.setMode(yfc.o);
            dgc.setAccessibility(mge2);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.M0.a() && this.S0 == hy7.b) {
            getMicrophoneOnDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        if (this.M0.a()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(l31 l31) {
        if (!hhd.f(this.X0, l31)) {
            this.X0 = l31;
            int a = l31.a();
            mge contentDescription = l31.getContentDescription();
            Drawable b = gq3.b(getContext(), a);
            y(this.N0, b, b, l31 instanceof i31 ? hy7.a : hy7.b, contentDescription, contentDescription);
        }
    }

    public final void setClickListener(e01 e01) {
        this.R0 = e01;
    }

    public final void setMicrophoneEnabled(hy7 hy7) {
        if (this.S0 != hy7) {
            this.S0 = hy7;
            y(this.O0, getMicrophoneOnDrawable(), gq3.b(getContext(), n1a.X), hy7, new hge(ftb.call_microphone_enabled_accessibility), new hge(ftb.call_microphone_disabled_accessibility));
            if (hy7 == hy7.b) {
                getMicrophoneOnDrawable().start();
            } else {
                getMicrophoneOnDrawable().stop();
            }
        }
    }

    public final void setRaiseHand(hy7 hy7) {
        hy7 hy72;
        jme jme;
        hy7 hy73 = this.T0;
        if (hy73 != hy7) {
            if (!(hy73 == null || hy73 != (hy72 = hy7.b) || hy7 == hy72 || (jme = this.W0) == null)) {
                jme.a();
            }
            this.T0 = hy7;
            int i = n1a.J;
            Drawable b = gq3.b(getContext(), i);
            Drawable b2 = gq3.b(getContext(), i);
            hge hge = new hge(ftb.call_raise_hand_enabled_accessibility);
            hge hge2 = new hge(ftb.call_raise_hand_disabled_accessibility);
            int i2 = hy7 != hy7.o ? 0 : 8;
            dgc dgc = this.Q0;
            dgc.setVisibility(i2);
            int ordinal = hy7.ordinal();
            yfc yfc = yfc.w0;
            if (ordinal == 0) {
                dgc.A(b2, -1);
                dgc.setMode(yfc);
                dgc.setAccessibility((mge) hge2);
            } else if (ordinal == 1) {
                dgc.A(b, -1);
                dgc.setMode(yfc.Z);
                dgc.setAccessibility((mge) hge);
            } else if (ordinal == 2) {
                dgc.A(b2, -15987442);
                dgc.setMode(yfc.Y);
                dgc.setAccessibility((mge) hge);
            } else if (ordinal == 3) {
            } else {
                if (ordinal == 4) {
                    dgc.A(b2, -3259817);
                    dgc.setMode(yfc);
                    dgc.setAccessibility((mge) hge2);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setVideoEnabled(hy7 hy7) {
        if (this.U0 != hy7) {
            this.U0 = hy7;
            y(this.P0, gq3.b(getContext(), n1a.C0), gq3.b(getContext(), n1a.A0), hy7, new hge(ftb.call_video_enabled_accessibility), new hge(ftb.call_video_disabled_accessibility));
        }
    }

    public final void setVolumeMicrophone(float f) {
        w39 microphoneOnDrawable = getMicrophoneOnDrawable();
        microphoneOnDrawable.getClass();
        float i = gwf.i(f, 0.0f, 1.0f);
        if (microphoneOnDrawable.x0 != i) {
            microphoneOnDrawable.x0 = i;
            bg bgVar = microphoneOnDrawable.Y;
            float[] fArr = {bgVar.a, i};
            ObjectAnimator objectAnimator = microphoneOnDrawable.Z;
            objectAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(bgVar, fArr)});
            objectAnimator.start();
            microphoneOnDrawable.invalidateSelf();
        }
    }

    public final jme x(jme jme, View view, hge hge, s16 s16, Integer num) {
        jme jme2 = jme;
        int[] iArr = new int[2];
        View view2 = view;
        view.getLocationOnScreen(iArr);
        Point point = new Point(me4.p((float) 12, dh4.c().getDisplayMetrics().density, Integer.valueOf(iArr[0]).intValue() - (view.getWidth() / 2)), getContextHeight());
        if (jme2 == null || !jme.isShowing()) {
            if (jme2 != null) {
                jme.dismiss();
            }
            jme jme3 = new jme(getContext(), view, new m(27), new a01(0), 0, 0, 96);
            jme3.d(hge);
            jme3.c(num);
            jme3.e(point, 8388691, 3000);
            jme3.setOnDismissListener(new b01(0, s16));
            return jme3;
        }
        jme.e(point, 8388691, 3000);
        return jme2;
    }
}
