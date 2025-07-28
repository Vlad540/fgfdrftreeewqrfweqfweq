package ru.ok.messages.video.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.ArrayList;

public class FloatingVideoView extends FrameLayout {
    public static final /* synthetic */ int I0 = 0;
    public int A0;
    public float B0;
    public float C0;
    public AnimatorSet D0;
    public nj5 E0;
    public final WindowManager.LayoutParams F0;
    public final tg G0;
    public VelocityTracker H0;
    public final int a;
    public final int b;
    public final int c;
    public int o;
    public int w0;
    public final int x0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public final WindowManager y0 = ek8.F(getContext());
    public int z0;

    public FloatingVideoView(Context context) {
        super(context);
        getContext();
        zg4 b2 = zg4.b();
        this.G0 = vl.b().c();
        this.a = dh4.b((int) 140.0f);
        int i = b2.h;
        this.b = i;
        this.c = i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 0, 0, 2038, 16779016, -3);
        this.F0 = layoutParams;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    public final void a() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet == null || !animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = this.D0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.D0.removeAllListeners();
                this.D0 = null;
            }
            ArrayList arrayList = new ArrayList();
            WindowManager.LayoutParams layoutParams = this.F0;
            int i = (layoutParams.width / 2) + layoutParams.x;
            int i2 = this.o;
            arrayList.add(ObjectAnimator.ofInt(this, "x", new int[]{this.F0.x, i < i2 / 2 ? getLeftMargin() : (i2 - getRightMargin()) - this.F0.width}));
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.D0 = animatorSet3;
                animatorSet3.setInterpolator(this.G0.a.n());
                this.D0.setDuration(120);
                this.D0.playTogether(arrayList);
                this.D0.addListener(new mf(3, this));
                this.D0.start();
                return;
            }
            i03 i03 = vl.o.a().a;
            WindowManager.LayoutParams layoutParams2 = this.F0;
            int i3 = layoutParams2.x;
            int i4 = layoutParams2.y;
            i03.j(i3, "app.video.pip.pos.x");
            i03.j(i4, "app.video.pip.pos.y");
            return;
        }
        udd.q("ru.ok.messages.video.widgets.FloatingVideoView", "Frontier animation is already started");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r6 = r1.y;
        r2 = r1.height;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.getLeftMargin()
            int r1 = r5.getRightMargin()
            android.view.WindowManager$LayoutParams r2 = r5.F0
            int r3 = r2.x
            if (r3 >= r0) goto L_0x0011
            r2.x = r0
            goto L_0x001c
        L_0x0011:
            int r0 = r2.width
            int r3 = r3 + r0
            int r4 = r5.o
            int r4 = r4 - r1
            if (r3 <= r4) goto L_0x001c
            int r4 = r4 - r0
            r2.x = r4
        L_0x001c:
            int r0 = r5.getTopMargin()
            android.view.WindowManager$LayoutParams r1 = r5.F0
            int r2 = r1.y
            if (r2 >= r0) goto L_0x0028
            r1.y = r0
        L_0x0028:
            if (r6 == 0) goto L_0x0037
            int r6 = r1.y
            int r2 = r1.height
            int r6 = r6 + r2
            int r5 = r5.w0
            int r5 = r5 - r0
            if (r6 <= r5) goto L_0x0037
            int r5 = r5 - r2
            r1.y = r5
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.b(boolean):void");
    }

    public final void c(int i, int i2) {
        int i3;
        int min = (int) (((double) Math.min(this.o, this.w0)) * 0.62d);
        if (i <= 0) {
            i = this.a;
        }
        if (i2 <= 0) {
            i2 = this.a;
        }
        if (i > i2) {
            i3 = (i2 * min) / i;
        } else {
            int i4 = (i * min) / i2;
            i3 = min;
            min = i4;
        }
        int i5 = this.a;
        if (min < i5) {
            i3 = (i3 * i5) / min;
            min = i5;
        }
        WindowManager.LayoutParams layoutParams = this.F0;
        layoutParams.width = min;
        layoutParams.height = i3;
        post(new oc4(20, this));
    }

    public int getLeftMargin() {
        return this.b;
    }

    public int getRightMargin() {
        return this.b;
    }

    public int getTopMargin() {
        return vl.b().f().j() + this.c;
    }

    public int getWindowHeight() {
        return this.F0.height;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return this.F0;
    }

    public int getWindowWidth() {
        return this.F0.width;
    }

    public int getXPos() {
        return this.F0.x;
    }

    public int getYPos() {
        return this.F0.y;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.D0.removeAllListeners();
            this.D0 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, u2, jd9] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Action "
            r0.<init>(r1)
            int r1 = r15.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ru.ok.messages.video.widgets.FloatingVideoView"
            udd.q(r1, r0)
            int r0 = r15.getAction()
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 5
            if (r0 == r1) goto L_0x0036
            int r0 = r15.getActionMasked()
            r1 = 6
            if (r0 != r1) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14.B0 = r15
            r14.C0 = r15
            goto L_0x0127
        L_0x0036:
            int r0 = r14.z0
            if (r0 <= 0) goto L_0x0111
            float r0 = r14.C0
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0111
            float r1 = r14.B0
            double r3 = (double) r1
            double r0 = (double) r0
            float r5 = r15.getRawX()
            double r5 = (double) r5
            float r15 = r15.getRawY()
            double r7 = (double) r15
            double r3 = r3 - r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r0 = r0 - r7
            double r0 = java.lang.Math.pow(r0, r5)
            double r0 = r0 + r3
            double r0 = java.lang.Math.sqrt(r0)
            int r15 = (int) r0
            int r0 = r14.x0
            if (r15 <= r0) goto L_0x0127
            nj5 r15 = r14.E0
            r0 = 1
            if (r15 == 0) goto L_0x0110
            android.content.Context r14 = r14.getContext()
            jwa r15 = (defpackage.jwa) r15
            jd9 r1 = r15.I0
            if (r1 == 0) goto L_0x0076
            goto L_0x0110
        L_0x0076:
            android.view.WindowManager r1 = defpackage.ek8.F(r14)
            int[] r3 = r15.a(r14)
            android.view.Display r4 = r1.getDefaultDisplay()
            int r4 = r4.getRotation()
            if (r4 == r0) goto L_0x008e
            r5 = 3
            if (r4 != r5) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r4 = r2
            goto L_0x008f
        L_0x008e:
            r4 = r0
        L_0x008f:
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r5 = r3[r2]
            tf4 r6 = r15.c
            if (r4 == 0) goto L_0x009c
            int r7 = r6.j()
            goto L_0x009d
        L_0x009c:
            r7 = r2
        L_0x009d:
            int r5 = r5 + r7
            int r7 = r5 + 1
            r3 = r3[r0]
            int r5 = r6.j()
            int r5 = r5 + r3
            if (r4 != 0) goto L_0x00c4
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.view.Display r8 = r1.getDefaultDisplay()
            r8.getMetrics(r3)
            int r8 = r3.heightPixels
            android.view.Display r9 = r1.getDefaultDisplay()
            r9.getRealMetrics(r3)
            int r3 = r3.heightPixels
            if (r3 <= r8) goto L_0x00c4
            int r3 = r3 - r8
            goto L_0x00c5
        L_0x00c4:
            r3 = r2
        L_0x00c5:
            int r3 = r3 + r5
            if (r4 != 0) goto L_0x00cc
            int r2 = r6.j()
        L_0x00cc:
            r9 = r2
            r11 = 67384(0x10738, float:9.4425E-41)
            r12 = -3
            r8 = 0
            r10 = 2038(0x7f6, float:2.856E-42)
            r5 = r13
            r6 = r7
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            qe9 r2 = new qe9
            tg r3 = r15.X
            r2.<init>(r14, r3)
            jd9 r14 = new jd9
            xz r3 = new xz
            r4 = 22
            r3.<init>((java.lang.Object) r15, (java.lang.Object) r1, (java.lang.Object) r2, (int) r4)
            r4 = 0
            r14.<init>((int) r4, (java.lang.Object) r2)
            r14.c = r3
            r2.t(r14)
            r15.I0 = r14
            java.lang.Object r14 = r2.c
            android.view.View r14 = (android.view.View) r14
            r1.addView(r14, r13)
            jd9 r14 = r15.I0
            java.lang.Object r14 = r14.b
            ge9 r14 = (defpackage.ge9) r14
            qe9 r14 = (defpackage.qe9) r14
            android.widget.TextView r15 = r14.X
            tg r1 = r14.o
            r1.j(r15)
            android.view.View r14 = r14.Y
            r1.l(r14)
        L_0x0110:
            return r0
        L_0x0111:
            android.view.WindowManager$LayoutParams r0 = r14.F0
            int r1 = r0.x
            r14.z0 = r1
            int r0 = r0.y
            r14.A0 = r0
            float r0 = r15.getRawX()
            r14.B0 = r0
            float r15 = r15.getRawY()
            r14.C0 = r15
        L_0x0127:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jd9 jd9;
        xm8 xm8;
        o10 o10;
        if (this.H0 == null) {
            this.H0 = VelocityTracker.obtain();
        }
        this.H0.addMovement(motionEvent);
        this.H0.computeCurrentVelocity(1);
        float abs = Math.abs(this.H0.getYVelocity());
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            this.F0.x = this.z0 + ((int) (motionEvent.getRawX() - this.B0));
            this.F0.y = this.A0 + ((int) (motionEvent.getRawY() - this.C0));
            b(false);
            this.y0.updateViewLayout(this, this.F0);
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams = this.F0;
                if (layoutParams.y + layoutParams.height > this.w0) {
                    nj5 nj5 = this.E0;
                    if (nj5 != null) {
                        ((jwa) nj5).c(true);
                    }
                }
            }
            nj5 nj52 = this.E0;
            if (nj52 != null) {
                ((jwa) nj52).c(false);
            }
        } else {
            this.B0 = -1.0f;
            this.C0 = -1.0f;
            VelocityTracker velocityTracker = this.H0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.H0 = null;
            }
            if (abs <= 4.0f) {
                WindowManager.LayoutParams layoutParams2 = this.F0;
                if (layoutParams2.y + layoutParams2.height > this.w0) {
                    nj5 nj53 = this.E0;
                    if (nj53 != null) {
                        jwa jwa = (jwa) nj53;
                        oa7 oa7 = jwa.b;
                        if (oa7.get() != null) {
                            ((bd) oa7.get()).e(SystemClock.elapsedRealtime() - jwa.N0, "ACTION_PIP_DURATION", (String) null);
                        }
                        fd9 fd9 = jwa.F0;
                        if (!(fd9 == null || (xm8 = jwa.K0) == null || (o10 = jwa.J0) == null)) {
                            long k = fd9.k();
                            long c2 = jwa.F0.c();
                            boolean c0 = jwa.F0.c0();
                            to8 to8 = jwa.Y;
                            to8.getClass();
                            to8.t(xm8.a, o10.q, new so8(k, c2, c0));
                        }
                        jwa.e(true);
                    }
                    return true;
                }
            }
            nj5 nj54 = this.E0;
            if (!(nj54 == null || (jd9 = ((jwa) nj54).I0) == null)) {
                qe9 qe9 = (qe9) ((ge9) jd9.b);
                TextView textView = qe9.X;
                tg tgVar = qe9.o;
                tgVar.g(textView);
                tgVar.o(qe9.Y).F(new pe9(0, qe9));
            }
            a();
        }
        return true;
    }

    public void setListener(nj5 nj5) {
        this.E0 = nj5;
    }

    @Keep
    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.F0;
        layoutParams.x = i;
        this.y0.updateViewLayout(this, layoutParams);
    }

    @Keep
    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.F0;
        layoutParams.y = i;
        this.y0.updateViewLayout(this, layoutParams);
    }
}
