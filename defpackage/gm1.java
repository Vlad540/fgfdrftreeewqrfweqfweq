package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* renamed from: gm1  reason: default package */
public final class gm1 extends ConstraintLayout implements bi1, zh1, ms3 {
    public static final /* synthetic */ k77[] w1;
    public final mz9 K0;
    public final t97 L0;
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final ViewStub Y0;
    public final ViewStub Z0;
    public final ViewStub a1;
    public final ViewStub b1;
    public final GestureDetector c1;
    public Boolean d1;
    public Boolean e1;
    public Boolean f1;
    public CharSequence g1;
    public CharSequence h1;
    public CharSequence i1;
    public em1 j1;
    public s16 k1;
    public ns3 l1;
    public le1 m1 = le1.c;
    public AnimatorSet n1;
    public final t97 o1;
    public final t97 p1;
    public final t97 q1;
    public final t97 r1;
    public final t97 s1;
    public final t97 t1;
    public final fm1 u1;
    public final fm1 v1;

    static {
        Class<gm1> cls = gm1.class;
        w1 = new k77[]{new hc9(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;"), c3d.g(m7c.a, cls, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.L0 = ez3.O(3, new b5(context2, 17));
        this.M0 = ez3.O(3, new b5(context2, 19));
        this.N0 = ez3.O(3, new am1(context2, this, 2));
        this.O0 = ez3.O(3, new b5(context2, 20));
        this.P0 = ez3.O(3, new b5(context2, 13));
        this.Q0 = ez3.O(3, new b5(context2, 14));
        this.R0 = ez3.O(3, new am1(context2, this, 0));
        this.S0 = ez3.O(3, new am1(context2, this, 1));
        this.T0 = ez3.O(3, new b5(context2, 15));
        this.o1 = ez3.O(3, new b5(context2, 16));
        this.p1 = ez3.O(3, new di1(13));
        this.q1 = ez3.O(3, new di1(14));
        this.r1 = ez3.O(3, new di1(15));
        this.s1 = ez3.O(3, new di1(16));
        this.t1 = ez3.O(3, new b5(context2, 18));
        this.u1 = new fm1(this, 0);
        this.v1 = new fm1(this, 1);
        setLayoutParams(new re3(-1, -1));
        mz9 mz9 = new mz9(context2);
        mz9.setId(o1a.t1);
        mz9.setAvatarShape(dz9.a);
        this.K0 = mz9;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(o1a.u1);
        this.W0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(o1a.v1);
        this.V0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(o1a.B1);
        this.X0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(o1a.x1);
        this.Y0 = viewStub4;
        ViewStub viewStub5 = new ViewStub(context2);
        viewStub5.setId(o1a.y1);
        this.Z0 = viewStub5;
        ViewStub viewStub6 = new ViewStub(context2);
        viewStub6.setId(o1a.A1);
        this.a1 = viewStub6;
        ViewStub viewStub7 = new ViewStub(context2);
        viewStub7.setId(o1a.z1);
        this.b1 = viewStub7;
        ViewStub viewStub8 = new ViewStub(context2);
        viewStub8.setId(o1a.s0);
        this.U0 = viewStub8;
        this.c1 = new GestureDetector(context2, new tz(3, this));
        float f = (float) 200;
        addView(mz9, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(viewStub3, -1, -1);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(viewStub5);
        addView(viewStub6);
        addView(viewStub7);
        addView(viewStub8);
        bf3 p = a06.p(this);
        int id = viewStub.getId();
        p.d(id, 3, 0, 3);
        hr1.q((float) 82, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
        p.d(id, 6, 0, 6);
        float f2 = (float) 24;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id, 4));
        p.d(id, 7, 0, 7);
        new hw9(p, 7, id, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id, 4, viewStub2.getId(), 3);
        p.g(id).d.W = 2;
        int id2 = viewStub2.getId();
        p.d(id2, 3, viewStub.getId(), 4);
        float f3 = (float) 12;
        new hw9(p, 3, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        p.d(id2, 6, viewStub.getId(), 6);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id2, 7, viewStub.getId(), 7);
        new hw9(p, 7, id2, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.d(id2, 4, mz9.getId(), 3);
        new hw9(p, 4, id2, 4).e(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
        int id3 = mz9.getId();
        p.d(id3, 3, 0, 3);
        p.d(id3, 4, 0, 4);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        p.g(id3).d.x = 0.45f;
        int id4 = viewStub6.getId();
        p.d(id4, 3, mz9.getId(), 4);
        hr1.q((float) 32, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 6, 0, 6);
        p.d(id4, 7, 0, 7);
        int id5 = viewStub3.getId();
        p.d(id5, 4, 0, 4);
        p.d(id5, 3, 0, 3);
        p.d(id5, 6, 0, 6);
        p.d(id5, 7, 0, 7);
        int id6 = viewStub4.getId();
        p.d(id6, 6, 0, 6);
        p.d(id6, 7, viewStub5.getId(), 6);
        p.d(id6, 4, 0, 4);
        new hw9(p, 4, id6, 4).e(a24.X(((float) 86) * dh4.c().getDisplayMetrics().density));
        p.g(id6).d.V = 2;
        int id7 = viewStub5.getId();
        p.d(id7, 7, 0, 7);
        p.d(id7, 6, viewStub4.getId(), 7);
        new hw9(p, 6, id7, 4).e(a24.X(((float) 92) * dh4.c().getDisplayMetrics().density));
        p.d(id7, 4, viewStub4.getId(), 4);
        int id8 = viewStub7.getId();
        p.d(id8, 3, 0, 3);
        p.d(id8, 4, 0, 4);
        p.d(id8, 7, mz9.getId(), 7);
        p.g(id8).d.x = 0.56f;
        int id9 = viewStub8.getId();
        p.d(id9, 3, 0, 3);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id9, 4));
        p.d(id9, 6, 0, 6);
        new hw9(p, 6, id9, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public static ImageView C(Context context, gm1 gm1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(o1a.s0);
        float f = (float) 40;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        imageView.setImageDrawable(gm1.getRaiseHandIcon());
        a24.Z(imageView, 300, new d5(13, gm1));
        return imageView;
    }

    public static ImageView F(Context context, gm1 gm1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(o1a.z1);
        int X = a24.X(((float) 18) * dh4.c().getDisplayMetrics().density);
        imageView.setPadding(X, X, X, X);
        float f = (float) 72;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        imageView.setVisibility(8);
        imageView.setBackground(gm1.getLockedDrawable());
        imageView.setImageResource(n1a.T);
        imageView.setImageTintList(ColorStateList.valueOf(-855638017));
        return imageView;
    }

    public static void G(gm1 gm1, CharSequence charSequence) {
        gm1.getSpeakerLabelView().setLabel(charSequence);
    }

    public static void I(gm1 gm1, CharSequence charSequence) {
        gm1.getStatusTextView().setText(charSequence);
    }

    public static void J(gm1 gm1, boolean z) {
        kjd.U(gm1.getRenderVideoView(), z);
        boolean z2 = !z;
        if (mt0.s(gm1.K0) != z2) {
            mt0.k(gm1.K0, z2, 0, new g91((Object) gm1, z2, 1), 2);
        }
        gm1.S(z2 ? 255 : 0, false);
    }

    /* access modifiers changed from: private */
    public final jdd getAnimatedBackground() {
        return (jdd) this.t1.getValue();
    }

    private final int getBackgroundCenterY() {
        mz9 mz9 = this.K0;
        return (mz9.getMeasuredHeight() / 2) + mz9.getTop();
    }

    private final ImageView getBlockedLabelView() {
        return (ImageView) this.R0.getValue();
    }

    private final ShapeDrawable getDisableDrawable() {
        return (ShapeDrawable) this.q1.getValue();
    }

    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.s1.getValue();
    }

    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.p1.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.rs3) r1).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ls3 getMarginTop() {
        /*
            r1 = this;
            ls3 r0 = defpackage.ls3.d
            ns3 r1 = r1.l1
            if (r1 == 0) goto L_0x000e
            rs3 r1 = (defpackage.rs3) r1
            ls3 r1 = r1.j
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm1.getMarginTop():ls3");
    }

    private final TextView getNameTextView() {
        return (TextView) this.L0.getValue();
    }

    /* access modifiers changed from: private */
    public final dgc getNegativeButtonView() {
        return (dgc) this.Q0.getValue();
    }

    /* access modifiers changed from: private */
    public final dgc getPositiveButtonView() {
        return (dgc) this.P0.getValue();
    }

    private final hxb getRaiseHandIcon() {
        return (hxb) this.o1.getValue();
    }

    private final int getRaiseHandTopPadding() {
        return a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.S0.getValue();
    }

    private final an1 getRenderVideoView() {
        return (an1) this.N0.getValue();
    }

    private final ync getScreenInfo() {
        return (ync) this.T0.getValue();
    }

    private final zj1 getSpeakerLabelView() {
        return (zj1) this.O0.getValue();
    }

    private final TextView getStatusTextView() {
        return (TextView) this.M0.getValue();
    }

    private final InsetDrawable getTalkingDrawable() {
        return (InsetDrawable) this.r1.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setNegativeAction$lambda$68$lambda$67(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void setPositiveAction$lambda$70$lambda$69(s16 s16) {
        s16.invoke();
    }

    public static an1 w(Context context, gm1 gm1) {
        an1 an1 = new an1(context);
        an1.setId(o1a.B1);
        an1.setForeground(gm1.getForegroundDrawable());
        an1.setLayoutParams(new re3(-1, -1));
        an1.setFullScreen(true);
        kjd.U(an1, false);
        an1.setListener(new rgc(18, gm1));
        an1.setVideoLayoutUpdatesControllerProvider(new nl1(1, gm1));
        return an1;
    }

    public static void x(bg bgVar, gm1 gm1) {
        float f = bgVar.a;
        int max = Math.max((int) (((float) gm1.getHeight()) * f), a24.X(((float) 100) * dh4.c().getDisplayMetrics().density));
        int i = ek8.K(gm1.X0) ? gm1.getRenderVideoView().C0 : false ? 0 : (int) (((float) 255) * f);
        int backgroundCenterY = (int) (((float) gm1.getBackgroundCenterY()) * f);
        jdd background = gm1.getBackground();
        if (background != null) {
            background.a(backgroundCenterY);
            background.setBounds(0, 0, gm1.getWidth(), max);
            gm1.S(i, true);
        }
    }

    public static void y(gm1 gm1, CharSequence charSequence) {
        gm1.getNameTextView().setText(charSequence);
    }

    public final void D(ls3 ls3) {
        if (ek8.K(this.U0)) {
            kjd.T(getRaiseHandView(), ls3.b() + getRaiseHandTopPadding());
        }
    }

    public final List H(ks3 ks3, ks3 ks32) {
        lg7 c = hwf.c();
        if (ek8.K(this.U0)) {
            c.add(ct0.r(getRaiseHandView(), (Math.abs(ks3.d) - ((float) ks3.f)) * ((float) ks3.c)));
        }
        return hwf.a(c);
    }

    public final void N(boolean z) {
        if (!hhd.f(this.e1, Boolean.valueOf(z))) {
            ShapeDrawable shapeDrawable = null;
            ek8.I(this.b1, getBlockedLabelView(), (s16) null);
            this.e1 = Boolean.valueOf(z);
            getBlockedLabelView().setVisibility(z ? 0 : 8);
            ShapeDrawable disableDrawable = getDisableDrawable();
            if (z) {
                shapeDrawable = disableDrawable;
            }
            this.K0.setForeground(shapeDrawable);
        }
    }

    public final void O(boolean z) {
        if (!hhd.f(this.d1, Boolean.valueOf(z))) {
            this.d1 = Boolean.valueOf(z);
            InsetDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            this.K0.setForeground(talkingDrawable);
        }
    }

    public final void P(String str, CharSequence charSequence) {
        ViewStub viewStub = this.a1;
        if (((charSequence != null && !h0e.c0(charSequence)) || ek8.K(viewStub)) && !hhd.f(this.i1, charSequence)) {
            ek8.I(viewStub, getSpeakerLabelView(), (s16) null);
            this.i1 = charSequence;
            if (charSequence != null && !h0e.c0(charSequence)) {
                getSpeakerLabelView().setLabel(charSequence);
            }
            mt0.k(getSpeakerLabelView(), !(charSequence == null || h0e.c0(charSequence)), 0, new zl1(this, charSequence, 2), 2);
            getSpeakerLabelView().setContentDescription(str);
        }
    }

    public final void Q(int i, int i2, s16 s16) {
        ViewStub viewStub = this.Y0;
        ek8.K(viewStub);
        ek8.I(viewStub, getNegativeButtonView(), (s16) null);
        dgc negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            negativeButtonView.y(i, -855638017);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new bm1(1, s16));
        }
    }

    public final void R(boolean z, int i, int i2, s16 s16) {
        ViewStub viewStub = this.Z0;
        if (ek8.K(viewStub) || z) {
            ek8.I(viewStub, getPositiveButtonView(), (s16) null);
            dgc positiveButtonView = getPositiveButtonView();
            positiveButtonView.setVisibility(z ? 0 : 8);
            if (positiveButtonView.getVisibility() == 0) {
                positiveButtonView.y(i, -855638017);
                positiveButtonView.setAccessibility(Integer.valueOf(i2));
                positiveButtonView.setListener(new bm1(0, s16));
            }
        }
    }

    public final void S(int i, boolean z) {
        Drawable background;
        int i2 = o1a.l;
        Object tag = getTag(i2);
        if ((tag == null && ((background = getBackground()) == null || background.getAlpha() != i)) || !hhd.f(tag, Integer.valueOf(i))) {
            AnimatorSet animatorSet = this.n1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            long j = z ? 0 : 200;
            Drawable background2 = getBackground();
            int alpha = background2 != null ? background2.getAlpha() : 0;
            hg hgVar = new hg("alpha", alpha);
            setTag(i2, Integer.valueOf(i));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(j);
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{alpha, i});
            ofInt.addUpdateListener(new pg(this, hgVar, 0));
            animatorSet2.addListener(new qg(i, 0, this));
            animatorSet2.play(ofInt);
            animatorSet2.start();
            this.n1 = animatorSet2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r3 != null ? r3.a : false) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(defpackage.hze r8) {
        /*
            r7 = this;
            android.view.ViewStub r0 = r7.X0
            r1 = 0
            if (r8 == 0) goto L_0x0022
            boolean r2 = r8.b
            r3 = 0
            boolean r4 = r8.g
            if (r2 == 0) goto L_0x000f
            if (r4 == 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            if (r4 == 0) goto L_0x0014
            t8f r3 = r8.h
            goto L_0x001a
        L_0x0014:
            boolean r2 = r8.c
            if (r2 == 0) goto L_0x001a
            t8f r3 = r8.d
        L_0x001a:
            if (r3 == 0) goto L_0x001f
            boolean r2 = r3.a
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            if (r2 != 0) goto L_0x0029
        L_0x0022:
            boolean r2 = ek8.K(r0)
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            an1 r2 = r7.getRenderVideoView()
            boolean r3 = ek8.K(r0)
            if (r3 != 0) goto L_0x0065
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeViewInLayout(r0)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.height
            r5.height = r6
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.width
            r5.width = r6
            int r0 = r0.getId()
            r2.setId(r0)
            r3.addView(r2, r4, r5)
            an1 r0 = r7.getRenderVideoView()
            defpackage.kjd.U(r0, r1)
        L_0x0065:
            an1 r0 = r7.getRenderVideoView()
            int r2 = defpackage.an1.D0
            r0.x0 = r8
            r0.y0 = r1
            an1 r7 = r7.getRenderVideoView()
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm1.T(hze):void");
    }

    public final void a(boolean z) {
        if (z) {
            if (ek8.K(this.V0)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(0.0f);
                statusTextView.setAlpha(1.0f);
            }
            if (ek8.K(this.W0)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(0.0f);
                nameTextView.setAlpha(1.0f);
            }
            mz9 mz9 = this.K0;
            mz9.setTranslationY(0.0f);
            mz9.setAlpha(1.0f);
            int i = ek8.K(this.X0) ? getRenderVideoView().C0 : false ? 0 : 255;
            int measuredHeight = getMeasuredHeight();
            int backgroundCenterY = getBackgroundCenterY();
            jdd background = getBackground();
            if (background != null) {
                background.a(backgroundCenterY);
                background.setBounds(0, 0, getWidth(), measuredHeight);
                S(i, true);
            }
        }
    }

    public final void f(lg7 lg7, boolean z, long j) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        if (ek8.K(this.a1)) {
            zj1 speakerLabelView = getSpeakerLabelView();
            if (mt0.w(speakerLabelView, z)) {
                lg7.add(mt0.c(speakerLabelView, z, f2, f, j));
            }
        }
        if (ek8.K(this.W0)) {
            TextView nameTextView = getNameTextView();
            if (mt0.w(nameTextView, z)) {
                lg7.add(mt0.c(nameTextView, z, f2, f, j));
            }
        }
        if (ek8.K(this.V0)) {
            TextView statusTextView = getStatusTextView();
            if (mt0.w(statusTextView, z)) {
                lg7.add(mt0.c(statusTextView, z, f2, f, j));
            }
        }
    }

    public final dm1 getBackgroundState() {
        k77 k77 = w1[1];
        return (dm1) this.v1.b;
    }

    public final cm1 getMode() {
        k77 k77 = w1[0];
        return (cm1) this.u1.b;
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void h(lg7 lg7, boolean z, long j) {
        if (ek8.K(this.V0)) {
            mt0.a(lg7, getStatusTextView(), z);
        }
        if (ek8.K(this.W0)) {
            mt0.a(lg7, getNameTextView(), z);
        }
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        bg bgVar = new bg("background", f2);
        if (!(ek8.K(this.X0) ? getRenderVideoView().C0 : false)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{f2, f});
            ofFloat.addUpdateListener(new yl(bgVar, 1, this));
            lg7.add(ofFloat);
            mt0.a(lg7, this.K0, z);
        }
    }

    public final void o(boolean z) {
        if (z) {
            if (ek8.K(this.a1)) {
                getSpeakerLabelView().setAlpha(1.0f);
            }
            if (ek8.K(this.W0)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (ek8.K(this.V0)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jdd background = getBackground();
        if (background != null) {
            background.onThemeChanged(qda.a);
        }
        jdd background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        if (ek8.K(this.U0) && hhd.f(this.f1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jdd background = getBackground();
        if (background != null) {
            background.stop();
        }
        if (ek8.K(this.U0)) {
            getRaiseHandIcon().stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jdd background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a(getBackgroundCenterY());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getScreenInfo().g) {
            getAnimatedBackground().o = Math.min(i, i2) / 4;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c1.onTouchEvent(motionEvent);
    }

    public final void setBackgroundState(dm1 dm1) {
        this.v1.o1(this, w1[1], dm1);
    }

    public final void setControlsMediator(ns3 ns3) {
        this.l1 = ns3;
    }

    public final void setListener(em1 em1) {
        this.j1 = em1;
    }

    public final void setMode(cm1 cm1) {
        this.u1.o1(this, w1[0], cm1);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.W0;
        if ((ek8.K(viewStub) || charSequence != null) && !hhd.f(this.g1, charSequence)) {
            ek8.I(viewStub, getNameTextView(), (s16) null);
            this.g1 = charSequence;
            if (charSequence != null && !h0e.c0(charSequence)) {
                getNameTextView().setText(charSequence);
            }
            mt0.k(getNameTextView(), !(charSequence == null || h0e.c0(charSequence)), 0, new zl1(this, charSequence, 1), 2);
        }
    }

    public final void setParticipantId(le1 le1) {
        this.m1 = le1;
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.U0;
        if (ek8.K(viewStub) || z) {
            this.f1 = Boolean.valueOf(z);
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
                kjd.T(getRaiseHandView(), getMarginTop().b() + getRaiseHandTopPadding());
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

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.V0;
        if ((ek8.K(viewStub) || charSequence != null) && !hhd.f(this.h1, charSequence)) {
            ek8.I(viewStub, getStatusTextView(), (s16) null);
            this.h1 = charSequence;
            if (charSequence != null && !h0e.c0(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            mt0.k(getStatusTextView(), !(charSequence == null || h0e.c0(charSequence)), 0, new zl1(this, charSequence, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(s16 s16) {
        this.k1 = s16;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        jdd background = getBackground();
        return background != null && background.b(drawable);
    }

    public jdd getBackground() {
        jdd background = super.getBackground();
        if (background instanceof jdd) {
            return background;
        }
        return null;
    }
}
