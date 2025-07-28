package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ia8  reason: default package */
public final class ia8 extends View {
    public static fa8 I0;
    public static final SparseArray J0 = new SparseArray(2);
    public static final int[] K0 = {16842912};
    public static final int[] L0 = {16842911};
    public int A0;
    public int B0;
    public int C0;
    public final ColorStateList D0;
    public final int E0;
    public final int F0;
    public boolean G0;
    public boolean H0;
    public final yb8 a;
    public final ga8 b;
    public qb8 c;
    public ua8 o;
    public boolean w0;
    public int x0;
    public ha8 y0;
    public Drawable z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ia8(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 0
            int r6 = defpackage.tlb.mediaRouteButtonStyle
            int r1 = defpackage.fc8.a
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r2 = defpackage.fc8.f(r10)
            r1.<init>(r10, r2)
            int r10 = defpackage.tlb.mediaRouteTheme
            int r10 = defpackage.fc8.h(r1, r10)
            if (r10 == 0) goto L_0x001c
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r1, r10)
            r1 = r2
        L_0x001c:
            r4 = 0
            r9.<init>(r1, r4, r6)
            qb8 r10 = defpackage.qb8.c
            r9.c = r10
            ua8 r10 = defpackage.ua8.a
            r9.o = r10
            r9.x0 = r0
            android.content.Context r10 = r9.getContext()
            int[] r1 = defpackage.mwb.MediaRouteButton
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r4, r1, r6, r0)
            int[] r3 = defpackage.mwb.MediaRouteButton
            java.util.WeakHashMap r1 = defpackage.eaf.a
            r7 = 0
            r1 = r9
            r2 = r10
            r5 = r8
            defpackage.z9f.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r9.isInEditMode()
            if (r1 == 0) goto L_0x0058
            r1 = 0
            r9.a = r1
            r9.b = r1
            int r1 = defpackage.mwb.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r0 = r8.getResourceId(r1, r0)
            android.graphics.drawable.Drawable r10 = defpackage.am7.n(r10, r0)
            r9.z0 = r10
            goto L_0x00ff
        L_0x0058:
            yb8 r1 = defpackage.yb8.d(r10)
            r9.a = r1
            ga8 r1 = new ga8
            r1.<init>(r9, r0)
            r9.b = r1
            defpackage.yb8.b()
            ub8 r1 = defpackage.yb8.c()
            xb8 r1 = r1.f()
            boolean r2 = r1.d()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x007b
            int r1 = r1.h
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            r9.C0 = r1
            r9.B0 = r1
            fa8 r1 = I0
            if (r1 != 0) goto L_0x008f
            fa8 r1 = new fa8
            android.content.Context r10 = r10.getApplicationContext()
            r1.<init>(r10)
            I0 = r1
        L_0x008f:
            int r10 = defpackage.mwb.MediaRouteButton_mediaRouteButtonTint
            android.content.res.ColorStateList r10 = r8.getColorStateList(r10)
            r9.D0 = r10
            int r10 = defpackage.mwb.MediaRouteButton_android_minWidth
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.E0 = r10
            int r10 = defpackage.mwb.MediaRouteButton_android_minHeight
            int r10 = r8.getDimensionPixelSize(r10, r0)
            r9.F0 = r10
            int r10 = defpackage.mwb.MediaRouteButton_externalRouteEnabledDrawableStatic
            int r10 = r8.getResourceId(r10, r0)
            int r1 = defpackage.mwb.MediaRouteButton_externalRouteEnabledDrawable
            int r1 = r8.getResourceId(r1, r0)
            r9.A0 = r1
            r8.recycle()
            int r1 = r9.A0
            android.util.SparseArray r2 = J0
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r2.get(r1)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00cd
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r9.setRemoteIndicatorDrawable(r1)
        L_0x00cd:
            android.graphics.drawable.Drawable r1 = r9.z0
            if (r1 != 0) goto L_0x00f9
            if (r10 == 0) goto L_0x00f6
            java.lang.Object r1 = r2.get(r10)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x00e3
            android.graphics.drawable.Drawable r10 = r1.newDrawable()
            r9.setRemoteIndicatorDrawableInternal(r10)
            goto L_0x00f9
        L_0x00e3:
            ha8 r1 = new ha8
            android.content.Context r2 = r9.getContext()
            r1.<init>(r9, r10, r2)
            r9.y0 = r1
            java.util.concurrent.Executor r10 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.executeOnExecutor(r10, r0)
            goto L_0x00f9
        L_0x00f6:
            r9.a()
        L_0x00f9:
            r9.e()
            r9.setClickable(r3)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia8.<init>(android.content.Context):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private c getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof b) {
            return ((b) activity).P();
        }
        return null;
    }

    public final void a() {
        if (this.A0 > 0) {
            ha8 ha8 = this.y0;
            if (ha8 != null) {
                ha8.cancel(false);
            }
            ha8 ha82 = new ha8(this, this.A0, getContext());
            this.y0 = ha82;
            this.A0 = 0;
            ha82.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        yb8.b();
        xb8 f = yb8.c().f();
        boolean z = true;
        boolean z2 = !f.d();
        int i = z2 ? f.h : 0;
        if (this.C0 != i) {
            this.C0 = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.w0) {
            if (!this.G0 && !z2 && !yb8.e(this.c)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public final void c() {
        int i = this.x0;
        if (i == 0 && !this.G0 && !I0.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.z0;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final boolean d() {
        if (!this.w0) {
            return false;
        }
        yb8 yb8 = this.a;
        yb8.getClass();
        yb8.b();
        yb8.c();
        c fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            yb8.getClass();
            yb8.b();
            if (yb8.c().f().d()) {
                if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    return false;
                }
                this.o.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                qb8 qb8 = this.c;
                if (qb8 != null) {
                    mediaRouteChooserDialogFragment.m1();
                    if (!mediaRouteChooserDialogFragment.H1.equals(qb8)) {
                        mediaRouteChooserDialogFragment.H1 = qb8;
                        Bundle bundle = mediaRouteChooserDialogFragment.Z;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("selector", qb8.a);
                        mediaRouteChooserDialogFragment.Y0(bundle);
                        fn fnVar = mediaRouteChooserDialogFragment.G1;
                        if (fnVar != null) {
                            if (mediaRouteChooserDialogFragment.F1) {
                                ((ab8) fnVar).h(qb8);
                            } else {
                                ((ka8) fnVar).h(qb8);
                            }
                        }
                    }
                    hd0 hd0 = new hd0(fragmentManager);
                    hd0.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    hd0.d(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            } else {
                this.o.getClass();
                MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                qb8 qb82 = this.c;
                if (qb82 != null) {
                    if (mediaRouteControllerDialogFragment.H1 == null) {
                        Bundle bundle2 = mediaRouteControllerDialogFragment.Z;
                        if (bundle2 != null) {
                            Bundle bundle3 = bundle2.getBundle("selector");
                            qb8 qb83 = null;
                            if (bundle3 != null) {
                                qb83 = new qb8((List) null, bundle3);
                            } else {
                                qb8 qb84 = qb8.c;
                            }
                            mediaRouteControllerDialogFragment.H1 = qb83;
                        }
                        if (mediaRouteControllerDialogFragment.H1 == null) {
                            mediaRouteControllerDialogFragment.H1 = qb8.c;
                        }
                    }
                    if (!mediaRouteControllerDialogFragment.H1.equals(qb82)) {
                        mediaRouteControllerDialogFragment.H1 = qb82;
                        Bundle bundle4 = mediaRouteControllerDialogFragment.Z;
                        if (bundle4 == null) {
                            bundle4 = new Bundle();
                        }
                        bundle4.putBundle("selector", qb82.a);
                        mediaRouteControllerDialogFragment.Y0(bundle4);
                        fn fnVar2 = mediaRouteControllerDialogFragment.G1;
                        if (fnVar2 != null && mediaRouteControllerDialogFragment.F1) {
                            ((jb8) fnVar2).j(qb82);
                        }
                    }
                    hd0 hd02 = new hd0(fragmentManager);
                    hd02.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                    hd02.d(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.z0 != null) {
            this.z0.setState(getDrawableState());
            if (this.z0.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.z0.getCurrent();
                int i = this.C0;
                if (i == 1 || this.B0 != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.B0 = this.C0;
    }

    public final void e() {
        int i = this.C0;
        String string = getContext().getString(i != 1 ? i != 2 ? nub.mr_cast_button_disconnected : nub.mr_cast_button_connected : nub.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.H0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        dme.a(this, string);
    }

    public ua8 getDialogFactory() {
        return this.o;
    }

    public qb8 getRouteSelector() {
        return this.c;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.z0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.w0 = true;
            if (!this.c.c()) {
                this.a.a(this.c, this.b, 0);
            }
            b();
            fa8 fa8 = I0;
            ArrayList arrayList = fa8.c;
            if (arrayList.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                fa8.a.registerReceiver(fa8, intentFilter);
            }
            arrayList.add(this);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a == null) {
            return onCreateDrawableState;
        }
        int i2 = this.C0;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, L0);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, K0);
        }
        return onCreateDrawableState;
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.w0 = false;
            if (!this.c.c()) {
                this.a.f(this.b);
            }
            fa8 fa8 = I0;
            ArrayList arrayList = fa8.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                fa8.a.unregisterReceiver(fa8);
            }
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.z0 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.z0.getIntrinsicWidth();
            int intrinsicHeight = this.z0.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.z0.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.z0.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.z0;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.E0, i3);
        Drawable drawable2 = this.z0;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.F0, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.w0) {
            this.a.getClass();
            yb8.b();
            yb8.c();
            c fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                yb8.b();
                if (yb8.c().f().d()) {
                    if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                        this.o.getClass();
                        MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                        qb8 qb8 = this.c;
                        if (qb8 != null) {
                            mediaRouteChooserDialogFragment.m1();
                            if (!mediaRouteChooserDialogFragment.H1.equals(qb8)) {
                                mediaRouteChooserDialogFragment.H1 = qb8;
                                Bundle bundle = mediaRouteChooserDialogFragment.Z;
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putBundle("selector", qb8.a);
                                mediaRouteChooserDialogFragment.Y0(bundle);
                                fn fnVar = mediaRouteChooserDialogFragment.G1;
                                if (fnVar != null) {
                                    if (mediaRouteChooserDialogFragment.F1) {
                                        ((ab8) fnVar).h(qb8);
                                    } else {
                                        ((ka8) fnVar).h(qb8);
                                    }
                                }
                            }
                            hd0 hd0 = new hd0(fragmentManager);
                            hd0.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                            hd0.d(true);
                            return true;
                        }
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
                    this.o.getClass();
                    MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
                    qb8 qb82 = this.c;
                    if (qb82 != null) {
                        if (mediaRouteControllerDialogFragment.H1 == null) {
                            Bundle bundle2 = mediaRouteControllerDialogFragment.Z;
                            if (bundle2 != null) {
                                Bundle bundle3 = bundle2.getBundle("selector");
                                qb8 qb83 = null;
                                if (bundle3 != null) {
                                    qb83 = new qb8((List) null, bundle3);
                                } else {
                                    qb8 qb84 = qb8.c;
                                }
                                mediaRouteControllerDialogFragment.H1 = qb83;
                            }
                            if (mediaRouteControllerDialogFragment.H1 == null) {
                                mediaRouteControllerDialogFragment.H1 = qb8.c;
                            }
                        }
                        if (!mediaRouteControllerDialogFragment.H1.equals(qb82)) {
                            mediaRouteControllerDialogFragment.H1 = qb82;
                            Bundle bundle4 = mediaRouteControllerDialogFragment.Z;
                            if (bundle4 == null) {
                                bundle4 = new Bundle();
                            }
                            bundle4.putBundle("selector", qb82.a);
                            mediaRouteControllerDialogFragment.Y0(bundle4);
                            fn fnVar2 = mediaRouteControllerDialogFragment.G1;
                            if (fnVar2 != null && mediaRouteControllerDialogFragment.F1) {
                                ((jb8) fnVar2).j(qb82);
                            }
                        }
                        hd0 hd02 = new hd0(fragmentManager);
                        hd02.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                        hd02.d(true);
                        return true;
                    }
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else {
                throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
            }
        }
        if (!performClick) {
            return false;
        }
        return true;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.G0) {
            this.G0 = z;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.H0) {
            this.H0 = z;
            e();
        }
    }

    public void setDialogFactory(ua8 ua8) {
        if (ua8 != null) {
            this.o = ua8;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.A0 = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        ha8 ha8 = this.y0;
        if (ha8 != null) {
            ha8.cancel(false);
        }
        Drawable drawable2 = this.z0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.z0);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.D0;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                um4.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.z0 = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(qb8 qb8) {
        if (qb8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.c.equals(qb8)) {
            if (this.w0) {
                boolean c2 = this.c.c();
                ga8 ga8 = this.b;
                yb8 yb8 = this.a;
                if (!c2) {
                    yb8.f(ga8);
                }
                if (!qb8.c()) {
                    yb8.a(qb8, ga8, 0);
                }
            }
            this.c = qb8;
            b();
        }
    }

    public void setVisibility(int i) {
        this.x0 = i;
        c();
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.z0;
    }
}
