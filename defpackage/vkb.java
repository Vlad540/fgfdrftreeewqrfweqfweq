package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: vkb  reason: default package */
public final class vkb extends FrameLayout {
    public static final float L0 = (dh4.c().getDisplayMetrics().density * 24.0f);
    public final v7a A0;
    public final Chronometer B0;
    public final LinearLayout C0;
    public final v7a D0;
    public final dt1 E0;
    public final v7a F0;
    public final v7a G0;
    public final FrameLayout H0;
    public final t97 I0;
    public final t97 J0;
    public final t97 K0;
    public final FloatEvaluator a = new FloatEvaluator();
    public boolean b;
    public ValueAnimator c;
    public ykb o;
    public ExecutorService w0;
    public e3 x0;
    public final CameraxCameraApiView y0;
    public final AppCompatImageView z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vkb(android.content.Context r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            android.animation.FloatEvaluator r4 = new android.animation.FloatEvaluator
            r4.<init>()
            r0.a = r4
            ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView r4 = new ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView
            r5 = 14
            r4.<init>(r1, r2, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r4.setLayoutParams(r5)
            r0.y0 = r4
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r1, r2)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = -2
            r9 = 17
            r7.<init>(r8, r8, r9)
            r5.setLayoutParams(r7)
            s59 r7 = km4.y0
            r7.r(r5)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r6)
            r5.setImageTintList(r10)
            int r10 = defpackage.zhc.l
            r5.setImageResource(r10)
            r0.z0 = r5
            v7a r10 = new v7a
            r10.<init>(r1)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r12 = 8388659(0x800033, float:1.1755015E-38)
            r11.<init>(r8, r8, r12)
            r12 = 12
            float r12 = (float) r12
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r12
            int r13 = a24.X(r13)
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r12
            int r14 = a24.X(r14)
            r15 = 6
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r16.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r15
            int r9 = a24.X(r9)
            int r2 = r11.bottomMargin
            r11.setMargins(r13, r9, r14, r2)
            r10.setLayoutParams(r11)
            s7a r2 = defpackage.s7a.b
            r10.setMode(r2)
            int r9 = defpackage.zhc.u
            java.lang.String r11 = "M12 10.586L5.734 4.32c-0.39-0.39-1.024-0.39-1.414 0-0.39 0.39-0.39 1.023 0 1.414L10.586 12 4.32 18.266c-0.39 0.39-0.39 1.024 0 1.414 0.39 0.39 1.023 0.39 1.414 0L12 13.414l6.266 6.266c0.39 0.39 1.024 0.39 1.414 0 0.39-0.39 0.39-1.024 0-1.414L13.414 12l6.266-6.266c0.39-0.39 0.39-1.023 0-1.414-0.39-0.39-1.024-0.39-1.414 0L12 10.586z"
            float r13 = L0
            r10.a(r13, r9, r11)
            qkb r9 = new qkb
            r11 = 0
            r9.<init>(r0, r11)
            a24.a0(r10, r9)
            r0.A0 = r10
            android.widget.Chronometer r9 = new android.widget.Chronometer
            r9.<init>(r1)
            r7.r(r9)
            r9.setTextColor(r6)
            r0.B0 = r9
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r1)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r6 = 1
            r14.<init>(r8, r8, r6)
            r8 = 16
            float r6 = (float) r8
            android.content.res.Resources r17 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r17.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r6
            int r8 = a24.X(r8)
            int r3 = r14.leftMargin
            r18 = r5
            int r5 = r14.rightMargin
            r19 = r4
            int r4 = r14.bottomMargin
            r14.setMargins(r3, r8, r5, r4)
            r11.setLayoutParams(r14)
            r3 = 0
            r11.setOrientation(r3)
            r3 = 16
            r11.setVerticalGravity(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1094713344(0x41400000, float:12.0)
            float r4 = r4 * r5
            r3.setCornerRadius(r4)
            pda r4 = r7.r(r11)
            nd0 r4 = r4.b()
            int r4 = r4.e
            js.D(r3, r4)
            r11.setBackground(r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r6
            int r3 = a24.X(r3)
            r4 = 8
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = a24.X(r5)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = a24.X(r6)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r4
            int r8 = a24.X(r8)
            r11.setPadding(r3, r5, r6, r8)
            androidx.appcompat.widget.AppCompatImageView r3 = new androidx.appcompat.widget.AppCompatImageView
            r5 = 0
            r3.<init>(r1, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r12
            int r6 = a24.X(r6)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r12
            int r8 = a24.X(r8)
            r5.<init>(r6, r8)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = a24.X(r4)
            int r6 = r5.leftMargin
            int r8 = r5.topMargin
            int r14 = r5.bottomMargin
            r5.setMargins(r6, r8, r4, r14)
            r3.setLayoutParams(r5)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 1
            r4.setShape(r5)
            pda r5 = r7.r(r3)
            y3 r5 = r5.e()
            int r5 = r5.a
            js.D(r4, r5)
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1086324736(0x40c00000, float:6.0)
            float r5 = r5 * r6
            r4.setCornerRadius(r5)
            r3.setImageDrawable(r4)
            r11.addView(r3)
            r11.addView(r9)
            r0.C0 = r11
            v7a r3 = new v7a
            r3.<init>(r1)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = 8388661(0x800035, float:1.1755018E-38)
            r6 = -2
            r4.<init>(r6, r6, r5)
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r12
            int r5 = a24.X(r5)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r12 = r12 * r6
            int r6 = a24.X(r12)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r15 = r15 * r7
            int r7 = a24.X(r15)
            int r8 = r4.bottomMargin
            r4.setMargins(r5, r7, r6, r8)
            r3.setLayoutParams(r4)
            r3.setMode(r2)
            qkb r4 = new qkb
            r5 = 1
            r4.<init>(r0, r5)
            a24.a0(r3, r4)
            r0.D0 = r3
            dt1 r4 = new dt1
            r4.<init>(r1)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 72
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = a24.X(r6)
            r8 = 17
            r5.<init>(r7, r6, r8)
            r4.setLayoutParams(r5)
            qkb r5 = new qkb
            r6 = 2
            r5.<init>(r0, r6)
            a24.a0(r4, r5)
            r0.E0 = r4
            v7a r5 = new v7a
            r5.<init>(r1)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7, r8)
            r7 = 90
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r7
            int r8 = a24.X(r8)
            int r9 = r6.topMargin
            int r12 = r6.rightMargin
            int r14 = r6.bottomMargin
            r6.setMargins(r8, r9, r12, r14)
            r5.setLayoutParams(r6)
            r5.setMode(r2)
            int r6 = defpackage.zhc.b0
            java.lang.String r8 = "M16.472 8C15.374 6.772 13.777 6 12 6c-2.974 0-5.443 2.164-5.918 5.004C5.992 11.55 5.552 12 5 12s-1.006-0.45-0.938-0.998C4.552 7.055 7.92 4 12 4c2.39 0 4.534 1.047 6 2.708V5c0-0.552 0.448-1 1-1s1 0.448 1 1v4c0 0.552-0.448 1-1 1h-4c-0.552 0-1-0.448-1-1s0.448-1 1-1h1.472zM10 15c0-0.552-0.448-1-1-1H5c-0.552 0-1 0.448-1 1v4c0 0.552 0.448 1 1 1s1-0.448 1-1v-1.708C7.466 18.952 9.61 20 12 20c4.08 0 7.447-3.055 7.938-7.002C20.007 12.45 19.552 12 19 12c-0.552 0-0.991 0.451-1.082 0.996C17.443 15.836 14.975 18 12 18c-1.777 0-3.374-0.773-4.472-2H9c0.552 0 1-0.448 1-1z"
            r5.a(r13, r6, r8)
            qkb r6 = new qkb
            r8 = 3
            r6.<init>(r0, r8)
            a24.a0(r5, r6)
            r0.F0 = r5
            v7a r6 = new v7a
            r6.<init>(r1)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -2
            r12 = 17
            r8.<init>(r9, r9, r12)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = a24.X(r7)
            int r9 = r8.leftMargin
            int r12 = r8.topMargin
            int r13 = r8.bottomMargin
            r8.setMargins(r9, r12, r7, r13)
            r6.setLayoutParams(r8)
            r6.setMode(r2)
            qkb r2 = new qkb
            r7 = 4
            r2.<init>(r0, r7)
            a24.a0(r6, r2)
            r0.G0 = r6
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r1)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r9 = -1
            r12 = -2
            r7.<init>(r9, r12, r8)
            r8 = 64
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            int r9 = r7.leftMargin
            int r12 = r7.topMargin
            int r13 = r7.rightMargin
            r7.setMargins(r9, r12, r13, r8)
            r2.setLayoutParams(r7)
            r2.addView(r6)
            r2.addView(r4)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r1)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r4.setLayoutParams(r5)
            r5 = 0
            r4.setAlpha(r5)
            r4.addView(r10)
            r4.addView(r11)
            r4.addView(r3)
            r4.addView(r2)
            up0 r2 = new up0
            r3 = 3
            r5 = 0
            r2.<init>(r3, r3, r5)
            sy6 r5 = new sy6
            r5.<init>(r3, r2)
            r2 = 0
            defpackage.ek8.g(r4, r5, r2)
            r0.H0 = r4
            t2a r2 = new t2a
            r5 = 13
            r2.<init>(r1, r5)
            t97 r2 = ez3.O(r3, r2)
            r0.I0 = r2
            t2a r2 = new t2a
            r5 = 14
            r2.<init>(r1, r5)
            t97 r2 = ez3.O(r3, r2)
            r0.J0 = r2
            t2a r2 = new t2a
            r5 = 15
            r2.<init>(r1, r5)
            t97 r1 = ez3.O(r3, r2)
            r0.K0 = r1
            r1 = r19
            r0.addView(r1)
            r1 = r18
            r0.addView(r1)
            r0.addView(r4)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.<init>(android.content.Context):void");
    }

    public static final void a(vkb vkb, ns1 ns1) {
        Drawable drawable;
        String str;
        int ordinal = ns1.ordinal();
        if (ordinal == 0) {
            drawable = vkb.getFlashOffDrawable();
        } else if (ordinal == 1) {
            drawable = vkb.getFlashOnDrawable();
        } else if (ordinal == 2) {
            drawable = vkb.getFlashAutoDrawable();
        } else if (ordinal == 3) {
            drawable = vkb.getFlashOnDrawable();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int ordinal2 = ns1.ordinal();
        if (ordinal2 != 0) {
            str = "M14.16 3.854l-7.786 8.384 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 7.786-8.384-3.643-0.52c-1.23-0.176-1.987-1.439-1.563-2.607l1.74-4.781zm0.285-3.248c1.098-1.181 3.025-0.003 2.474 1.512l-2.6 7.152 4.576 0.653c1.181 0.17 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.51l2.601-7.153-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l10.214-11z";
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    str = "M14.919 2.118c0.55-1.515-1.376-2.693-2.474-1.512l-10.214 11c-0.812 0.875-0.307 2.302 0.874 2.47l4.577 0.654-2.6 7.152c-0.552 1.515 1.376 2.693 2.473 1.511l10.214-11c0.812-0.874 0.307-2.3-0.874-2.47L12.318 9.27l2.6-7.152zM4.374 12.238l7.785-8.384-1.739 4.781c-0.424 1.168 0.333 2.431 1.563 2.607l3.643 0.52-7.785 8.384 1.739-4.782c0.424-1.168-0.333-2.43-1.563-2.606l-3.643-0.52zm15.456 3.843c-0.53-1.428-2.546-1.438-3.09-0.015l-2.181 5.713c-0.177 0.464 0.055 0.984 0.52 1.162 0.464 0.177 0.984-0.056 1.162-0.52l0.395-1.036h3.239l0.38 1.028c0.174 0.466 0.691 0.704 1.158 0.53 0.466-0.172 0.703-0.69 0.53-1.156l-2.114-5.706zm-0.622 3.504L18.28 17.08l-0.956 2.504h1.884z";
                } else if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            str = "M10 5.792c0-0.301 0.133-0.571 0.344-0.755l4.101-4.43c1.098-1.182 3.025-0.004 2.474 1.51l-1.643 4.52h0.002l-0.33 0.9-0.561 1.543-0.003-0.003-0.07 0.192 0.306 0.044 4.275 0.61c1.181 0.17 1.686 1.596 0.874 2.47l-1 1.069c-0.182 0.188-0.437 0.305-0.72 0.305-0.552 0-1-0.448-1-1 0-0.302 0.134-0.573 0.346-0.756l0.23-0.249-0.649-0.092-0.008-0.008-1.668-0.23-2.855-2.866 0.972-2.68h0.003l0.74-2.032-2.372 2.553C11.605 6.641 11.32 6.792 11 6.792c-0.552 0-1-0.448-1-1z M7.101 8.516L3.293 4.707c-0.39-0.39-0.39-1.024 0-1.414 0.39-0.39 1.024-0.39 1.414 0l16 16c0.39 0.39 0.39 1.024 0 1.414-0.39 0.39-1.024 0.39-1.414 0l-3.756-3.756-5.982 6.443c-1.097 1.181-3.025 0.003-2.474-1.512l2.601-7.152-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l2.87-3.091zm7.02 7.02L8.518 9.93l-2.143 2.307 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 4.282-4.61z";
        }
        AppCompatImageView appCompatImageView = vkb.D0.c;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.w0 = h2g.f(str);
        appCompatImageView.o = L0;
        appCompatImageView.invalidate();
        vkb.getCameraApi().setFlash(ns1.name());
    }

    public static final void b(vkb vkb, float f, float f2, float f3, float f4, float f5) {
        AppCompatImageView appCompatImageView = vkb.z0;
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        FloatEvaluator floatEvaluator = vkb.a;
        appCompatImageView.setAlpha(floatEvaluator.evaluate(f5, valueOf, valueOf2).floatValue());
        vkb.H0.setAlpha(floatEvaluator.evaluate(f5, Float.valueOf(f3), Float.valueOf(f4)).floatValue());
    }

    private final Drawable getFlashAutoDrawable() {
        return (Drawable) this.I0.getValue();
    }

    private final Drawable getFlashOffDrawable() {
        return (Drawable) this.K0.getValue();
    }

    private final Drawable getFlashOnDrawable() {
        return (Drawable) this.J0.getValue();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b) {
            return false;
        }
        if (keyEvent.getKeyCode() != 25 && keyEvent.getKeyCode() != 24) {
            return false;
        }
        int action = keyEvent.getAction();
        return action == 0 || action == 1;
    }

    public final os1 getCameraApi() {
        return this.y0;
    }
}
