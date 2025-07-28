package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements s24, hh9, ih9 {
    public static final int[] U0 = {ylb.actionBarSize, 16842841};
    public static final nsf V0;
    public static final Rect W0 = new Rect();
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final Rect E0 = new Rect();
    public final Rect F0 = new Rect();
    public final Rect G0 = new Rect();
    public final Rect H0 = new Rect();
    public nsf I0;
    public nsf J0;
    public nsf K0;
    public nsf L0;
    public n6 M0;
    public OverScroller N0;
    public ViewPropertyAnimator O0;
    public final l6 P0;
    public final m6 Q0;
    public final m6 R0;
    public final ms S0;
    public final p6 T0;
    public int a;
    public int b = 0;
    public ContentFrameLayout c;
    public ActionBarContainer o;
    public t24 w0;
    public Drawable x0;
    public boolean y0;
    public boolean z0;

    static {
        esf dsf = Build.VERSION.SDK_INT >= 30 ? new dsf() : new csf();
        dsf.f(qy6.b(0, 1, 0, 1));
        V0 = dsf.b();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        nsf nsf = nsf.b;
        this.I0 = nsf;
        this.J0 = nsf;
        this.K0 = nsf;
        this.L0 = nsf;
        this.P0 = new l6(0, (Object) this);
        this.Q0 = new m6(this, 0);
        this.R0 = new m6(this, 1);
        c(context);
        this.S0 = new ms(6);
        p6 p6Var = new p6(context, 0);
        p6Var.setWillNotDraw(true);
        this.T0 = p6Var;
        addView(p6Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        int i;
        o6 o6Var = (o6) view.getLayoutParams();
        int i2 = o6Var.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            o6Var.leftMargin = i3;
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = o6Var.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            o6Var.topMargin = i5;
            z2 = true;
        }
        int i6 = o6Var.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            o6Var.rightMargin = i7;
            z2 = true;
        }
        if (!z || o6Var.bottomMargin == (i = rect.bottom)) {
            return z2;
        }
        o6Var.bottomMargin = i;
        return true;
    }

    public final void b() {
        removeCallbacks(this.Q0);
        removeCallbacks(this.R0);
        ViewPropertyAnimator viewPropertyAnimator = this.O0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(U0);
        boolean z = false;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.x0 = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.N0 = new OverScroller(context);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o6;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            this.w0.getClass();
        } else if (i == 5) {
            this.w0.getClass();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.x0 != null) {
            if (this.o.getVisibility() == 0) {
                i = (int) (this.o.getTranslationY() + ((float) this.o.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.x0.setBounds(0, i, getWidth(), this.x0.getIntrinsicHeight() + i);
            this.x0.draw(canvas);
        }
    }

    public final void e() {
        t24 t24;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(pob.action_bar_activity_content);
            this.o = (ActionBarContainer) findViewById(pob.action_bar_container);
            View findViewById = findViewById(pob.action_bar);
            if (findViewById instanceof t24) {
                t24 = (t24) findViewById;
            } else if (findViewById instanceof Toolbar) {
                t24 = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.w0 = t24;
        }
    }

    public final void f(Menu menu, gm8 gm8) {
        e();
        cme cme = (cme) this.w0;
        i7 i7Var = cme.m;
        Toolbar toolbar = cme.a;
        if (i7Var == null) {
            cme.m = new i7(toolbar.getContext());
        }
        i7 i7Var2 = cme.m;
        i7Var2.X = gm8;
        pl8 pl8 = (pl8) menu;
        if (pl8 != null || toolbar.a != null) {
            toolbar.f();
            pl8 pl82 = toolbar.a.a;
            if (pl82 != pl8) {
                if (pl82 != null) {
                    pl82.r(toolbar.d1);
                    pl82.r(toolbar.e1);
                }
                if (toolbar.e1 == null) {
                    toolbar.e1 = new rle(toolbar);
                }
                i7Var2.F0 = true;
                if (pl8 != null) {
                    pl8.b(i7Var2, toolbar.B0);
                    pl8.b(toolbar.e1, toolbar.B0);
                } else {
                    i7Var2.k(toolbar.B0, (pl8) null);
                    toolbar.e1.k(toolbar.B0, (pl8) null);
                    i7Var2.i();
                    toolbar.e1.i();
                }
                toolbar.a.setPopupTheme(toolbar.C0);
                toolbar.a.setPresenter(i7Var2);
                toolbar.d1 = i7Var2;
                toolbar.x();
            }
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        ms msVar = this.S0;
        return msVar.c | msVar.b;
    }

    public CharSequence getTitle() {
        e();
        return ((cme) this.w0).a.getTitle();
    }

    public final void i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j(view, i, i2, i3, i4, i5);
    }

    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final boolean k(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void n(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        nsf f = nsf.f(this, windowInsets);
        boolean a2 = a(this.o, new Rect(f.b(), f.d(), f.c(), f.a()), false);
        WeakHashMap weakHashMap = eaf.a;
        Rect rect = this.E0;
        t9f.b(this, f, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        lsf lsf = f.a;
        nsf l = lsf.l(i, i2, i3, i4);
        this.I0 = l;
        boolean z = true;
        if (!this.J0.equals(l)) {
            this.J0 = this.I0;
            a2 = true;
        }
        Rect rect2 = this.F0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = a2;
        }
        if (z) {
            requestLayout();
        }
        return lsf.a().a.c().a.b().e();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = eaf.a;
        r9f.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                o6 o6Var = (o6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = o6Var.leftMargin + paddingLeft;
                int i7 = o6Var.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r11.e()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o6 r0 = (defpackage.o6) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.o
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.o
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = defpackage.eaf.a
            int r4 = r11.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r11.a
            boolean r7 = r11.z0
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r11.o
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r11.a
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r11.o
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            android.graphics.Rect r7 = r11.E0
            android.graphics.Rect r8 = r11.G0
            r8.set(r7)
            nsf r7 = r11.I0
            r11.K0 = r7
            boolean r7 = r11.y0
            if (r7 != 0) goto L_0x00ab
            if (r4 != 0) goto L_0x00ab
            p6 r4 = r11.T0
            nsf r7 = V0
            android.graphics.Rect r9 = r11.H0
            defpackage.t9f.b(r4, r7, r9)
            android.graphics.Rect r4 = W0
            boolean r4 = r9.equals(r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x00ab
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            nsf r4 = r11.K0
            lsf r4 = r4.a
            nsf r2 = r4.l(r2, r6, r2, r2)
            r11.K0 = r2
            goto L_0x00e4
        L_0x00ab:
            nsf r2 = r11.K0
            int r2 = r2.b()
            nsf r4 = r11.K0
            int r4 = r4.d()
            int r4 = r4 + r6
            nsf r6 = r11.K0
            int r6 = r6.c()
            nsf r7 = r11.K0
            int r7 = r7.a()
            qy6 r2 = defpackage.qy6.b(r2, r4, r6, r7)
            nsf r4 = r11.K0
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d6
            dsf r6 = new dsf
            r6.<init>(r4)
            goto L_0x00db
        L_0x00d6:
            csf r6 = new csf
            r6.<init>(r4)
        L_0x00db:
            r6.f(r2)
            nsf r2 = r6.b()
            r11.K0 = r2
        L_0x00e4:
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            a(r2, r8, r5)
            nsf r2 = r11.L0
            nsf r4 = r11.K0
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00fc
            nsf r2 = r11.K0
            r11.L0 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            defpackage.eaf.b(r4, r2)
        L_0x00fc:
            androidx.appcompat.widget.ContentFrameLayout r6 = r11.c
            r8 = 0
            r10 = 0
            r5 = r11
            r7 = r12
            r9 = r13
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            o6 r2 = (defpackage.o6) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.c
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.c
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r1 = r2 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A0 || !z) {
            return false;
        }
        this.N0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.N0.getFinalY() > this.o.getHeight()) {
            b();
            this.R0.run();
        } else {
            b();
            this.Q0.run();
        }
        this.B0 = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.C0 + i2;
        this.C0 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = (defpackage.trf) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            ms r1 = r0.S0
            r1.b = r3
            int r1 = r0.getActionBarHideOffset()
            r0.C0 = r1
            r0.b()
            n6 r0 = r0.M0
            if (r0 == 0) goto L_0x001d
            trf r0 = (defpackage.trf) r0
            acf r1 = r0.x
            if (r1 == 0) goto L_0x001d
            r1.a()
            r1 = 0
            r0.x = r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.o.getVisibility() != 0) {
            return false;
        }
        return this.A0;
    }

    public final void onStopNestedScroll(View view) {
        if (this.A0 && !this.B0) {
            if (this.C0 <= this.o.getHeight()) {
                b();
                postDelayed(this.Q0, 600);
                return;
            }
            b();
            postDelayed(this.R0, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.D0 ^ i;
        this.D0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        n6 n6Var = this.M0;
        if (n6Var != null) {
            ((trf) n6Var).t = !z2;
            if (z || !z2) {
                trf trf = (trf) n6Var;
                if (trf.u) {
                    trf.u = false;
                    trf.j0(true);
                }
            } else {
                trf trf2 = (trf) n6Var;
                if (!trf2.u) {
                    trf2.u = true;
                    trf2.j0(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.M0 != null) {
            WeakHashMap weakHashMap = eaf.a;
            r9f.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        n6 n6Var = this.M0;
        if (n6Var != null) {
            ((trf) n6Var).s = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.o.setTranslationY((float) (-Math.max(0, Math.min(i, this.o.getHeight()))));
    }

    public void setActionBarVisibilityCallback(n6 n6Var) {
        this.M0 = n6Var;
        if (getWindowToken() != null) {
            ((trf) this.M0).s = this.b;
            int i = this.D0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = eaf.a;
                r9f.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.z0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0) {
            this.A0 = z;
            if (!z) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        e();
        cme cme = (cme) this.w0;
        cme.d = i != 0 ? am7.n(cme.a.getContext(), i) : null;
        cme.c();
    }

    public void setLogo(int i) {
        e();
        cme cme = (cme) this.w0;
        cme.e = i != 0 ? am7.n(cme.a.getContext(), i) : null;
        cme.c();
    }

    public void setOverlayMode(boolean z) {
        this.y0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        e();
        ((cme) this.w0).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        e();
        cme cme = (cme) this.w0;
        if (!cme.g) {
            cme.h = charSequence;
            if ((cme.b & 8) != 0) {
                Toolbar toolbar = cme.a;
                toolbar.setTitle(charSequence);
                if (cme.g) {
                    eaf.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        cme cme = (cme) this.w0;
        cme.d = drawable;
        cme.c();
    }
}
