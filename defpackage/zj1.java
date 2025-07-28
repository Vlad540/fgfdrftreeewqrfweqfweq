package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: zj1  reason: default package */
public final class zj1 extends ConstraintLayout implements ms3, zh1, ak1 {
    public final t97 K0 = ez3.O(3, new di1(7));
    public final t97 L0;
    public final t97 M0;
    public final AppCompatTextView N0;
    public final AppCompatImageView O0;
    public final AppCompatImageView P0;
    public yj1 Q0;
    public Boolean R0;
    public Boolean S0;
    public Boolean T0;
    public CharSequence U0;
    public le1 V0;
    public ize W0;
    public ns3 X0;
    public bk1 Y0;
    public dwa Z0;

    public zj1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L0 = ez3.O(3, new b5(context, 10));
        this.M0 = ez3.O(3, new c6(28, this));
        this.V0 = le1.c;
        setLayoutParams(new re3(-1, -2));
        float f = (float) 32;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(uob.call_video_rotation);
        appCompatImageView.setBackground(getBackgroundView());
        appCompatImageView.setImageResource(cnb.ic_rotation_view_16);
        float f2 = (float) 5;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(X, X, X, X);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-855638017));
        this.O0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(uob.call_pin);
        appCompatImageView2.setImageResource(cnb.ic_pin_13);
        appCompatImageView2.setBackground(getBackgroundView());
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(-855638017));
        int X2 = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        appCompatImageView2.setPadding(X2, X2, X2, X2);
        appCompatImageView2.setVisibility(8);
        a24.Z(appCompatImageView2, 300, new xj1(this, 0));
        this.P0 = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(uob.call_user_full_name);
        appCompatTextView.setMaxLines(1);
        nge.d(nte.o, appCompatTextView);
        appCompatTextView.setTextColor(-855638017);
        appCompatTextView.setBackground(getBackgroundView());
        appCompatTextView.setGravity(17);
        float f3 = (float) 8;
        float f4 = (float) 7;
        appCompatTextView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density));
        appCompatTextView.setVisibility(8);
        fja.d(appCompatTextView);
        this.N0 = appCompatTextView;
        float f5 = (float) 26;
        addView(appCompatImageView2, a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(dh4.c().getDisplayMetrics().density * f5));
        addView(appCompatImageView, a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density));
        addView(appCompatTextView, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new mp0(1, this));
        } else {
            A(this.U0);
        }
        bf3 p = a06.p(this);
        int id = appCompatImageView2.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        p.d(id, 7, appCompatTextView.getId(), 6);
        p.d(id, 6, 0, 6);
        p.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 4, 0, 4);
        p.d(id2, 6, appCompatImageView2.getId(), 7);
        float f6 = (float) 4;
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f6));
        p.d(id2, 7, appCompatImageView.getId(), 6);
        new hw9(p, 7, id2, 4).e(a24.X(f6 * dh4.c().getDisplayMetrics().density));
        p.g(id2).d.l0 = true;
        int id3 = appCompatImageView.getId();
        p.d(id3, 3, 0, 3);
        p.d(id3, 4, 0, 4);
        p.d(id3, 6, appCompatTextView.getId(), 7);
        p.d(id3, 7, 0, 7);
        p.a(this);
    }

    private final float[] getBG_RADIUS() {
        return (float[]) this.K0.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final ync getCallScreen() {
        return (ync) this.L0.getValue();
    }

    private final int getTargetWidth() {
        return ((Number) this.M0.getValue()).intValue();
    }

    public static int w(zj1 zj1) {
        return rf0.l((float) 8, dh4.c().getDisplayMetrics().density, 2, rf0.l((float) 32, dh4.c().getDisplayMetrics().density, 2, rf0.l((float) 4, dh4.c().getDisplayMetrics().density, 2, rf0.l((float) 26, dh4.c().getDisplayMetrics().density, 2, zj1.getCallScreen().b))));
    }

    public final void A(CharSequence charSequence) {
        int targetWidth = getTargetWidth();
        AppCompatTextView appCompatTextView = this.N0;
        appCompatTextView.post(new g5(appCompatTextView, kjd.h(charSequence, appCompatTextView, targetWidth), this, 10));
    }

    public final List H(ks3 ks3, ks3 ks32) {
        lg7 c = hwf.c();
        c.add(ct0.r(this, (Math.abs(ks3.d) - ((float) ks3.f)) * ((float) ks3.c)));
        if (hhd.f(this.T0, Boolean.TRUE)) {
            c.add(ct0.n(this, ks32.a));
        }
        return hwf.a(c);
    }

    public final void f(lg7 lg7, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (mt0.w(this, z)) {
            lg7.add(mt0.c(this, z, f, f2, j));
        }
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void o(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bk1 bk1 = this.Y0;
        if (bk1 != null) {
            ((ck1) bk1).a.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bk1 bk1 = this.Y0;
        if (bk1 != null) {
            ((ck1) bk1).a.remove(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A(this.U0);
    }

    public final void p() {
        y();
    }

    public final void setActive(boolean z) {
        if (!hhd.f(this.T0, Boolean.valueOf(z))) {
            this.T0 = Boolean.valueOf(z);
            y();
        }
    }

    public final void setCallSpeakerMediator(bk1 bk1) {
        this.Y0 = bk1;
    }

    public final void setControlsMediator(ns3 ns3) {
        this.X0 = ns3;
    }

    public final void setLabel(CharSequence charSequence) {
        if (!hhd.f(this.U0, charSequence)) {
            this.U0 = charSequence;
            A(charSequence);
        }
    }

    public final void setListener(yj1 yj1) {
        this.Q0 = yj1;
    }

    public final void setParticipantId(le1 le1) {
        this.V0 = le1;
    }

    public final void setPipBoundariesController(dwa dwa) {
        this.Z0 = dwa;
    }

    public final void x() {
        Boolean bool = this.S0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence charSequence = this.U0;
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        AppCompatTextView appCompatTextView = this.N0;
        if (booleanValue) {
            charSequence = getContext().getString(ftb.call_user_talking_accessibility);
        }
        appCompatTextView.setContentDescription(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((defpackage.rs3) r0).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r7 = this;
            ns3 r0 = r7.X0
            if (r0 == 0) goto L_0x0011
            rs3 r0 = (defpackage.rs3) r0
            ls3 r0 = r0.j
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0011
            r0 = 0
        L_0x000f:
            r2 = r0
            goto L_0x001a
        L_0x0011:
            java.lang.Boolean r0 = r7.T0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.hhd.f(r0, r1)
            goto L_0x000f
        L_0x001a:
            l r5 = new l
            r0 = 17
            r5.<init>(r0, r7)
            r6 = 2
            r3 = 0
            r1 = r7
            defpackage.mt0.k(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj1.y():void");
    }
}
