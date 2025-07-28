package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: hl1  reason: default package */
public final class hl1 extends ConstraintLayout {
    public static final /* synthetic */ int Z0 = 0;
    public gl1 K0;
    public Boolean L0;
    public final t97 M0 = ez3.O(3, new di1(10));
    public jme N0;
    public AnimatorSet O0;
    public final Handler P0 = new Handler(Looper.getMainLooper());
    public final b Q0 = new b(22, this);
    public gme R0;
    public final TextView S0;
    public final TextView T0;
    public final dgc U0;
    public final dgc V0;
    public final ViewStub W0;
    public final t97 X0;
    public Boolean Y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        dgc dgc = new dgc(context2, (AttributeSet) null);
        dgc.setId(uob.call_collapsing);
        dgc.y(cnb.ic_down_chevron_24, -855638017);
        dgc.setAccessibility(Integer.valueOf(ftb.call_collapsing_accessibility));
        yfc yfc = yfc.a;
        dgc.setMode(yfc);
        dgc.setListener(new fl1(this, 0));
        float f = (float) 40;
        dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc.setLayoutParams(new re3(-2, -2));
        float f2 = (float) 3;
        dgc.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        TextView textView = new TextView(context2);
        textView.setId(uob.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        nge.d(nte.i, textView);
        textView.setTextColor(-855638017);
        textView.setVisibility(8);
        this.S0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(uob.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        nge.d(nte.o, textView2);
        textView2.setTextColor(-1107296257);
        textView2.setVisibility(8);
        this.T0 = textView2;
        dgc dgc2 = new dgc(context2, (AttributeSet) null);
        dgc2.setId(o1a.h0);
        dgc2.setMode(yfc);
        dgc2.y(n1a.n0, -855638017);
        dgc2.setAccessibility(Integer.valueOf(r1a.j0));
        dgc2.setListener(new j9(this, 9, dgc2));
        dgc2.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f2));
        dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc2.setLayoutParams(new re3(-2, -2));
        this.U0 = dgc2;
        dgc dgc3 = new dgc(context2, (AttributeSet) null);
        dgc3.setId(o1a.n1);
        dgc3.y(n1a.x, -855638017);
        dgc3.setAccessibility(Integer.valueOf(r1a.G1));
        dgc3.setMode(yfc);
        dgc3.setButtonPadding(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        dgc3.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        dgc3.setLayoutParams(new re3(-2, -2));
        dgc3.setListener(new fl1(this, 1));
        this.V0 = dgc3;
        this.X0 = ez3.O(3, new x2((Object) context2, 15, (Object) this));
        setLayoutParams(new re3(-1, -2));
        int X = a24.X(f * dh4.c().getDisplayMetrics().density);
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(o1a.g0);
        this.W0 = viewStub;
        addView(dgc, X, X);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(dgc2, X, X);
        addView(viewStub, X, X);
        addView(dgc3, X, X);
        bf3 p = a06.p(this);
        int id = dgc.getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        int id2 = textView.getId();
        p.d(id2, 6, dgc.getId(), 7);
        float f3 = (float) 12;
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        p.d(id2, 3, dgc.getId(), 3);
        p.d(id2, 4, textView2.getId(), 3);
        p.d(id2, 7, dgc3.getId(), 6);
        new hw9(p, 7, id2, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.g(id2).d.l0 = true;
        p.g(id2).d.W = 2;
        int id3 = textView2.getId();
        p.d(id3, 6, textView.getId(), 6);
        p.d(id3, 3, textView.getId(), 4);
        p.d(id3, 7, textView.getId(), 7);
        p.d(id3, 4, dgc.getId(), 4);
        p.g(id3).d.l0 = true;
        int id4 = dgc3.getId();
        p.d(id4, 7, dgc2.getId(), 6);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id4, 4));
        p.d(id4, 3, 0, 3);
        p.d(id4, 4, 0, 4);
        int id5 = dgc2.getId();
        p.d(id5, 7, viewStub.getId(), 6);
        p.d(id5, 3, 0, 3);
        p.d(id5, 4, 0, 4);
        int id6 = viewStub.getId();
        p.d(id6, 7, 0, 7);
        p.d(id6, 3, 0, 3);
        p.d(id6, 4, 0, 4);
        p.a(this);
    }

    private final View getRecordButton() {
        return (View) this.X0.getValue();
    }

    private final j5c getRecordDrawable() {
        return (j5c) this.M0.getValue();
    }

    public static View w(Context context, hl1 hl1) {
        View view = new View(context);
        view.setId(o1a.g0);
        view.setVisibility(8);
        float f = (float) 40;
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        a24.Z(view, 300, new d5(hl1, view));
        view.setBackground(hl1.getRecordDrawable());
        return view;
    }

    public static void x(hl1 hl1, boolean z) {
        hl1.O0 = null;
        hl1.getRecordButton().setVisibility(z ? 0 : 8);
        b bVar = hl1.Q0;
        Handler handler = hl1.P0;
        dgc dgc = hl1.U0;
        if (z) {
            ViewGroup.LayoutParams layoutParams = dgc.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                dgc.setLayoutParams(marginLayoutParams);
                hl1.getRecordDrawable().start();
                handler.post(bVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams2 = dgc.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.rightMargin = 0;
            dgc.setLayoutParams(marginLayoutParams2);
            hl1.getRecordDrawable().stop();
            handler.removeCallbacks(bVar);
            jme jme = hl1.N0;
            if (jme != null) {
                jme.a();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void A(gme gme) {
        this.R0 = null;
        if (gme == null) {
            jme jme = this.N0;
            if (jme != null) {
                jme.dismiss();
                return;
            }
            return;
        }
        jme jme2 = this.N0;
        if (jme2 == null || !jme2.isShowing()) {
            int[] iArr = new int[2];
            getRecordButton().getLocationOnScreen(iArr);
            Point point = new Point(me4.p((float) 18, dh4.c().getDisplayMetrics().density, (jjd.o(getContext()) - iArr[0]) - (getRecordButton().getWidth() / 2)), getRecordButton().getHeight() + iArr[1]);
            jme jme3 = this.N0;
            if (jme3 != null) {
                jme3.dismiss();
            }
            jme jme4 = new jme(getContext(), getRecordButton(), new m(27), new di1(11), (s16) null, 1, 3);
            jme4.d(gme.a);
            TextView textView = jme4.x0;
            textView.setText(gme.b.a(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
            c6 c6Var = new c6(29, this);
            ImageView imageView = jme4.y0;
            imageView.setVisibility(0);
            a24.Z(imageView, 300, new p7d(c6Var, 11, jme4));
            TextView textView2 = jme4.w0;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
                textView2.setLayoutParams(marginLayoutParams);
                jme4.showAtLocation(jme4.a, 8388661, point.x - (jme4.getWidth() / 2), point.y);
                View contentView = jme4.getContentView();
                if (contentView != null) {
                    jme.b(jme4, contentView, true, (hme) null, 6);
                }
                jme4.setOnDismissListener(new b01(2, this));
                this.N0 = jme4;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ek8.K(this.W0) && getRecordButton().getVisibility() == 0) {
            getRecordDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ek8.K(this.W0)) {
            getRecordDrawable().stop();
        }
    }

    public final void setAddUserState(boolean z) {
        mt0.k(this.V0, z, 0, (u16) null, 6);
    }

    public final void setClickListener(gl1 gl1) {
        this.K0 = gl1;
    }

    public final void setMoreButtonVisible(boolean z) {
        mt0.k(this.U0, z, 0, (u16) null, 6);
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.T0;
        if (!hhd.f(textView.getText(), charSequence)) {
            textView.setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.S0;
        if (!hhd.f(textView.getText(), charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r11v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(boolean r11, defpackage.gme r12) {
        /*
            r10 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            android.view.ViewStub r3 = r10.W0
            boolean r4 = ek8.K(r3)
            if (r4 != 0) goto L_0x000c
            goto L_0x0048
        L_0x000c:
            android.animation.AnimatorSet r4 = r10.O0
            if (r4 == 0) goto L_0x0018
            boolean r4 = r4.isRunning()
            if (r4 != r2) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            android.view.View r5 = r10.getRecordButton()
            boolean r5 = defpackage.mt0.s(r5)
            if (r5 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            if (r12 == 0) goto L_0x002a
            r10.R0 = r12
            goto L_0x0048
        L_0x002a:
            android.view.View r4 = r10.getRecordButton()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x003a
            if (r12 == 0) goto L_0x003a
            r10.A(r12)
            goto L_0x0048
        L_0x003a:
            android.os.Handler r4 = r10.P0
            b r5 = r10.Q0
            r4.removeCallbacks(r5)
            jme r4 = r10.N0
            if (r4 == 0) goto L_0x0048
            r4.a()
        L_0x0048:
            if (r11 != 0) goto L_0x0051
            boolean r4 = ek8.K(r3)
            if (r4 != 0) goto L_0x0051
            return
        L_0x0051:
            java.lang.Boolean r4 = r10.Y0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 == 0) goto L_0x005e
            return
        L_0x005e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r10.Y0 = r4
            android.view.View r4 = r10.getRecordButton()
            r5 = 0
            ek8.I(r3, r4, r5)
            r10.R0 = r12
            android.animation.AnimatorSet r12 = r10.O0
            if (r12 == 0) goto L_0x0075
            r12.cancel()
        L_0x0075:
            android.view.View r12 = r10.getRecordButton()
            u61 r3 = new u61
            r3.<init>(r10, r11, r2)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            int r6 = defpackage.o1a.m
            if (r11 == 0) goto L_0x008a
            java.lang.String r7 = "fade_in"
            goto L_0x008c
        L_0x008a:
            java.lang.String r7 = "fade_out"
        L_0x008c:
            dgc r8 = r10.U0
            if (r11 == 0) goto L_0x00ca
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x009b
            r5 = r11
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x009b:
            if (r5 == 0) goto L_0x00a0
            int r11 = r5.rightMargin
            goto L_0x00a1
        L_0x00a0:
            r11 = r0
        L_0x00a1:
            int r5 = r12.getWidth()
            int[] r11 = new int[]{r11, r5}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            zf r5 = new zf
            r5.<init>(r8, r2)
            r11.addUpdateListener(r5)
            android.util.Property r5 = android.view.View.ALPHA
            float[] r8 = new float[r1]
            r8 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r8)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r0] = r11
            r1[r2] = r5
            r4.playSequentially(r1)
            goto L_0x0104
        L_0x00ca:
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x00d5
            r5 = r11
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x00d5:
            if (r5 == 0) goto L_0x00da
            int r11 = r5.rightMargin
            goto L_0x00db
        L_0x00da:
            r11 = r0
        L_0x00db:
            int r5 = r12.getWidth()
            int r5 = -r5
            int[] r11 = new int[]{r11, r5}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            zf r5 = new zf
            r5.<init>(r8, r1)
            r11.addUpdateListener(r5)
            android.util.Property r5 = android.view.View.ALPHA
            float[] r8 = new float[r1]
            r8 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r8)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r0] = r11
            r1[r2] = r5
            r4.playTogether(r1)
        L_0x0104:
            r0 = 150(0x96, double:7.4E-322)
            r4.setDuration(r0)
            android.view.animation.LinearInterpolator r11 = new android.view.animation.LinearInterpolator
            r11.<init>()
            r4.setInterpolator(r11)
            sg r11 = new sg
            r11.<init>((android.view.View) r12, (int) r6, (java.lang.String) r7, (defpackage.u61) r3)
            r4.addListener(r11)
            r4.start()
            r10.O0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl1.y(boolean, gme):void");
    }
}
