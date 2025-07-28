package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@hbf
public class TabLayout extends HorizontalScrollView {
    public static final int o1 = kvb.Widget_Design_TabLayout;
    public static final p0b p1 = new p0b(16);
    public final int A0;
    public final int B0;
    public final int C0 = -1;
    public ColorStateList D0;
    public ColorStateList E0;
    public ColorStateList F0;
    public Drawable G0;
    public int H0 = 0;
    public final PorterDuff.Mode I0;
    public final float J0;
    public final float K0;
    public final int L0;
    public int M0 = Integer.MAX_VALUE;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public int R0;
    public final int S0;
    public int T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public int X0 = -1;
    public int Y0;
    public boolean Z0;
    public int a = -1;
    public j06 a1;
    public final ArrayList b = new ArrayList();
    public final TimeInterpolator b1;
    public j9e c;
    public g9e c1;
    public final ArrayList d1 = new ArrayList();
    public jt5 e1;
    public ValueAnimator f1;
    public ViewPager g1;
    public tia h1;
    public cx3 i1;
    public k9e j1;
    public f9e k1;
    public boolean l1;
    public int m1;
    public final o0b n1 = new o0b(12);
    public final i9e o;
    public final int w0;
    public final int x0;
    public final int y0;
    public final int z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r3 = defpackage.wlb.tabStyle
            int r4 = o1
            android.content.Context r10 = defpackage.tw7.a(r10, r11, r3, r4)
            r9.<init>(r10, r11, r3)
            r10 = -1
            r9.a = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.b = r0
            r9.C0 = r10
            r6 = 0
            r9.H0 = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            r9.M0 = r0
            r9.X0 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.d1 = r0
            o0b r0 = new o0b
            r1 = 12
            r0.<init>(r1)
            r9.n1 = r0
            android.content.Context r7 = r9.getContext()
            r9.setHorizontalScrollBarEnabled(r6)
            i9e r8 = new i9e
            r8.<init>(r9, r7)
            r9.o = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r10)
            super.addView(r8, r6, r0)
            int[] r2 = defpackage.xvb.TabLayout
            int r0 = defpackage.xvb.TabLayout_tabTextAppearance
            int[] r5 = new int[]{r0}
            r0 = r7
            r1 = r11
            android.content.res.TypedArray r11 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.content.res.ColorStateList r0 = defpackage.js.n(r0)
            if (r0 == 0) goto L_0x0077
            lw7 r1 = new lw7
            r1.<init>()
            r1.l(r0)
            r1.j(r7)
            java.util.WeakHashMap r0 = defpackage.eaf.a
            float r0 = defpackage.t9f.i(r9)
            r1.k(r0)
            r9.setBackground(r1)
        L_0x0077:
            int r0 = defpackage.xvb.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r0 = defpackage.wx3.k(r7, r11, r0)
            r9.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            int r0 = defpackage.xvb.TabLayout_tabIndicatorColor
            int r0 = r11.getColor(r0, r6)
            r9.setSelectedTabIndicatorColor(r0)
            int r0 = defpackage.xvb.TabLayout_tabIndicatorHeight
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r8.b(r0)
            int r0 = defpackage.xvb.TabLayout_tabIndicatorGravity
            int r0 = r11.getInt(r0, r6)
            r9.setSelectedTabIndicatorGravity(r0)
            int r0 = defpackage.xvb.TabLayout_tabIndicatorAnimationMode
            int r0 = r11.getInt(r0, r6)
            r9.setTabIndicatorAnimationMode(r0)
            int r0 = defpackage.xvb.TabLayout_tabIndicatorFullWidth
            r1 = 1
            boolean r0 = r11.getBoolean(r0, r1)
            r9.setTabIndicatorFullWidth(r0)
            int r0 = defpackage.xvb.TabLayout_tabPadding
            int r0 = r11.getDimensionPixelSize(r0, r6)
            r9.z0 = r0
            r9.y0 = r0
            r9.x0 = r0
            r9.w0 = r0
            int r2 = defpackage.xvb.TabLayout_tabPaddingStart
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.w0 = r2
            int r2 = defpackage.xvb.TabLayout_tabPaddingTop
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.x0 = r2
            int r2 = defpackage.xvb.TabLayout_tabPaddingEnd
            int r2 = r11.getDimensionPixelSize(r2, r0)
            r9.y0 = r2
            int r2 = defpackage.xvb.TabLayout_tabPaddingBottom
            int r0 = r11.getDimensionPixelSize(r2, r0)
            r9.z0 = r0
            int r0 = defpackage.wlb.isMaterial3Theme
            boolean r0 = bm3.E(r0, r7, r6)
            if (r0 == 0) goto L_0x00e9
            int r0 = defpackage.wlb.textAppearanceTitleSmall
            r9.A0 = r0
            goto L_0x00ed
        L_0x00e9:
            int r0 = defpackage.wlb.textAppearanceButton
            r9.A0 = r0
        L_0x00ed:
            int r0 = defpackage.xvb.TabLayout_tabTextAppearance
            int r2 = defpackage.kvb.TextAppearance_Design_Tab
            int r0 = r11.getResourceId(r0, r2)
            r9.B0 = r0
            int[] r2 = defpackage.nwb.TextAppearance
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r0, r2)
            int r3 = defpackage.nwb.TextAppearance_android_textSize     // Catch:{ all -> 0x0216 }
            int r3 = r2.getDimensionPixelSize(r3, r6)     // Catch:{ all -> 0x0216 }
            float r3 = (float) r3     // Catch:{ all -> 0x0216 }
            r9.J0 = r3     // Catch:{ all -> 0x0216 }
            int r4 = defpackage.nwb.TextAppearance_android_textColor     // Catch:{ all -> 0x0216 }
            android.content.res.ColorStateList r4 = defpackage.wx3.i(r7, r2, r4)     // Catch:{ all -> 0x0216 }
            r9.D0 = r4     // Catch:{ all -> 0x0216 }
            r2.recycle()
            int r2 = defpackage.xvb.TabLayout_tabSelectedTextAppearance
            boolean r2 = r11.hasValue(r2)
            if (r2 == 0) goto L_0x0121
            int r2 = defpackage.xvb.TabLayout_tabSelectedTextAppearance
            int r0 = r11.getResourceId(r2, r0)
            r9.C0 = r0
        L_0x0121:
            int r0 = r9.C0
            if (r0 == r10) goto L_0x015f
            int[] r2 = defpackage.nwb.TextAppearance
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r0, r2)
            int r2 = defpackage.nwb.TextAppearance_android_textSize     // Catch:{ all -> 0x0155 }
            int r3 = (int) r3     // Catch:{ all -> 0x0155 }
            r0.getDimensionPixelSize(r2, r3)     // Catch:{ all -> 0x0155 }
            int r2 = defpackage.nwb.TextAppearance_android_textColor     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r7, r0, r2)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x0157
            android.content.res.ColorStateList r3 = r9.D0     // Catch:{ all -> 0x0155 }
            int r3 = r3.getDefaultColor()     // Catch:{ all -> 0x0155 }
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r4 = new int[]{r4}     // Catch:{ all -> 0x0155 }
            int r5 = r2.getDefaultColor()     // Catch:{ all -> 0x0155 }
            int r2 = r2.getColorForState(r4, r5)     // Catch:{ all -> 0x0155 }
            android.content.res.ColorStateList r2 = f(r3, r2)     // Catch:{ all -> 0x0155 }
            r9.D0 = r2     // Catch:{ all -> 0x0155 }
            goto L_0x0157
        L_0x0155:
            r9 = move-exception
            goto L_0x015b
        L_0x0157:
            r0.recycle()
            goto L_0x015f
        L_0x015b:
            r0.recycle()
            throw r9
        L_0x015f:
            int r0 = defpackage.xvb.TabLayout_tabTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x016f
            int r0 = defpackage.xvb.TabLayout_tabTextColor
            android.content.res.ColorStateList r0 = defpackage.wx3.i(r7, r11, r0)
            r9.D0 = r0
        L_0x016f:
            int r0 = defpackage.xvb.TabLayout_tabSelectedTextColor
            boolean r0 = r11.hasValue(r0)
            if (r0 == 0) goto L_0x0189
            int r0 = defpackage.xvb.TabLayout_tabSelectedTextColor
            int r0 = r11.getColor(r0, r6)
            android.content.res.ColorStateList r2 = r9.D0
            int r2 = r2.getDefaultColor()
            android.content.res.ColorStateList r0 = f(r2, r0)
            r9.D0 = r0
        L_0x0189:
            int r0 = defpackage.xvb.TabLayout_tabIconTint
            android.content.res.ColorStateList r0 = defpackage.wx3.i(r7, r11, r0)
            r9.E0 = r0
            int r0 = defpackage.xvb.TabLayout_tabIconTintMode
            int r0 = r11.getInt(r0, r10)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.gwf.F(r0, r2)
            r9.I0 = r0
            int r0 = defpackage.xvb.TabLayout_tabRippleColor
            android.content.res.ColorStateList r0 = defpackage.wx3.i(r7, r11, r0)
            r9.F0 = r0
            int r0 = defpackage.xvb.TabLayout_tabIndicatorAnimationDuration
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = r11.getInt(r0, r2)
            r9.S0 = r0
            int r0 = defpackage.wlb.motionEasingEmphasizedInterpolator
            p85 r2 = defpackage.og.b
            android.animation.TimeInterpolator r0 = ct0.I(r7, r0, r2)
            r9.b1 = r0
            int r0 = defpackage.xvb.TabLayout_tabMinWidth
            int r0 = r11.getDimensionPixelSize(r0, r10)
            r9.N0 = r0
            int r0 = defpackage.xvb.TabLayout_tabMaxWidth
            int r10 = r11.getDimensionPixelSize(r0, r10)
            r9.O0 = r10
            int r10 = defpackage.xvb.TabLayout_tabBackground
            int r10 = r11.getResourceId(r10, r6)
            r9.L0 = r10
            int r10 = defpackage.xvb.TabLayout_tabContentStart
            int r10 = r11.getDimensionPixelSize(r10, r6)
            r9.Q0 = r10
            int r10 = defpackage.xvb.TabLayout_tabMode
            int r10 = r11.getInt(r10, r1)
            r9.U0 = r10
            int r10 = defpackage.xvb.TabLayout_tabGravity
            int r10 = r11.getInt(r10, r6)
            r9.R0 = r10
            int r10 = defpackage.xvb.TabLayout_tabInlineLabel
            boolean r10 = r11.getBoolean(r10, r6)
            r9.V0 = r10
            int r10 = defpackage.xvb.TabLayout_tabUnboundedRipple
            boolean r10 = r11.getBoolean(r10, r6)
            r9.Z0 = r10
            r11.recycle()
            android.content.res.Resources r10 = r9.getResources()
            int r11 = defpackage.vmb.design_tab_text_size_2line
            int r11 = r10.getDimensionPixelSize(r11)
            float r11 = (float) r11
            r9.K0 = r11
            int r11 = defpackage.vmb.design_tab_scrollable_min_width
            int r10 = r10.getDimensionPixelSize(r11)
            r9.P0 = r10
            r9.d()
            return
        L_0x0216:
            r9 = move-exception
            r2.recycle()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            j9e j9e = (j9e) arrayList.get(i);
            if (j9e == null || j9e.a == null || TextUtils.isEmpty(j9e.b)) {
                i++;
            } else if (!this.V0) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.N0;
        if (i != -1) {
            return i;
        }
        int i2 = this.U0;
        if (i2 == 0 || i2 == 2) {
            return this.P0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        i9e i9e = this.o;
        int childCount = i9e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = i9e.getChildAt(i2);
                boolean z = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(i2 == i);
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                    if (childAt instanceof l9e) {
                        ((l9e) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(g9e g9e) {
        ArrayList arrayList = this.d1;
        if (!arrayList.contains(g9e)) {
            arrayList.add(g9e);
        }
    }

    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(j9e j9e, int i, boolean z) {
        if (j9e.f == this) {
            j9e.d = i;
            ArrayList arrayList = this.b;
            arrayList.add(i, j9e);
            int size = arrayList.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((j9e) arrayList.get(i3)).d == this.a) {
                    i2 = i3;
                }
                ((j9e) arrayList.get(i3)).d = i3;
            }
            this.a = i2;
            l9e l9e = j9e.g;
            l9e.setSelected(false);
            l9e.setActivated(false);
            int i4 = j9e.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.U0 == 1 && this.R0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.o.addView(l9e, i4, layoutParams);
            if (z) {
                TabLayout tabLayout = j9e.f;
                if (tabLayout != null) {
                    tabLayout.o(j9e, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(int i) {
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap weakHashMap = eaf.a;
                if (isLaidOut()) {
                    i9e i9e = this.o;
                    int childCount = i9e.getChildCount();
                    int i2 = 0;
                    while (i2 < childCount) {
                        if (i9e.getChildAt(i2).getWidth() > 0) {
                            i2++;
                        }
                    }
                    int scrollX = getScrollX();
                    int e = e(i, 0.0f);
                    if (scrollX != e) {
                        g();
                        this.f1.setIntValues(new int[]{scrollX, e});
                        this.f1.start();
                    }
                    ValueAnimator valueAnimator = i9e.a;
                    if (!(valueAnimator == null || !valueAnimator.isRunning() || i9e.b.a == i)) {
                        i9e.a.cancel();
                    }
                    i9e.d(i, this.S0, true);
                    return;
                }
            }
            q(i, 0.0f, true, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0 != 2) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.U0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r4.Q0
            int r3 = r4.w0
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            java.util.WeakHashMap r3 = defpackage.eaf.a
            i9e r3 = r4.o
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.U0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x003c
        L_0x0025:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0029:
            int r0 = r4.R0
            if (r0 == 0) goto L_0x0036
            if (r0 == r2) goto L_0x0032
            if (r0 == r1) goto L_0x0036
            goto L_0x003c
        L_0x0032:
            r3.setGravity(r2)
            goto L_0x003c
        L_0x0036:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L_0x003c:
            r4.s(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i, float f) {
        i9e i9e;
        View childAt;
        int i2 = this.U0;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = i9e.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < i9e.getChildCount() ? (i9e = this.o).getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        WeakHashMap weakHashMap = eaf.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void g() {
        if (this.f1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1 = valueAnimator;
            valueAnimator.setInterpolator(this.b1);
            this.f1.setDuration((long) this.S0);
            this.f1.addUpdateListener(new ti0(7, this));
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        j9e j9e = this.c;
        if (j9e != null) {
            return j9e.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.R0;
    }

    public ColorStateList getTabIconTint() {
        return this.E0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.Y0;
    }

    public int getTabIndicatorGravity() {
        return this.T0;
    }

    public int getTabMaxWidth() {
        return this.M0;
    }

    public int getTabMode() {
        return this.U0;
    }

    public ColorStateList getTabRippleColor() {
        return this.F0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.G0;
    }

    public ColorStateList getTabTextColors() {
        return this.D0;
    }

    public final j9e h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (j9e) this.b.get(i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [j9e, java.lang.Object] */
    public final j9e i() {
        j9e j9e = (j9e) p1.h();
        j9e j9e2 = j9e;
        if (j9e == null) {
            ? obj = new Object();
            obj.d = -1;
            obj.h = -1;
            j9e2 = obj;
        }
        j9e2.f = this;
        o0b o0b = this.n1;
        l9e l9e = o0b != null ? (l9e) o0b.h() : null;
        if (l9e == null) {
            l9e = new l9e(this, getContext());
        }
        l9e.setTab(j9e2);
        l9e.setFocusable(true);
        l9e.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(j9e2.c)) {
            l9e.setContentDescription(j9e2.b);
        } else {
            l9e.setContentDescription(j9e2.c);
        }
        j9e2.g = l9e;
        int i = j9e2.h;
        if (i != -1) {
            l9e.setId(i);
        }
        return j9e2;
    }

    public final void j() {
        int currentItem;
        k();
        tia tia = this.h1;
        if (tia != null) {
            int b2 = tia.b();
            for (int i = 0; i < b2; i++) {
                j9e i2 = i();
                this.h1.getClass();
                if (TextUtils.isEmpty(i2.c) && !TextUtils.isEmpty((CharSequence) null)) {
                    i2.g.setContentDescription((CharSequence) null);
                }
                i2.b = null;
                l9e l9e = i2.g;
                if (l9e != null) {
                    l9e.e();
                }
                b(i2, this.b.size(), false);
            }
            ViewPager viewPager = this.g1;
            if (viewPager != null && b2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                o(h(currentItem), true);
            }
        }
    }

    public final void k() {
        for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {
            n(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            j9e j9e = (j9e) it.next();
            it.remove();
            j9e.f = null;
            j9e.g = null;
            j9e.a = null;
            j9e.h = -1;
            j9e.b = null;
            j9e.c = null;
            j9e.d = -1;
            j9e.e = null;
            p1.g(j9e);
        }
        this.c = null;
    }

    public final void l(g9e g9e) {
        this.d1.remove(g9e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: j9e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r10) {
        /*
            r9 = this;
            j9e r0 = r9.c
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r0.d
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            r9.n(r10)
            java.util.ArrayList r2 = r9.b
            java.lang.Object r3 = r2.remove(r10)
            j9e r3 = (defpackage.j9e) r3
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L_0x002d
            r3.f = r5
            r3.g = r5
            r3.a = r5
            r3.h = r4
            r3.b = r5
            r3.c = r5
            r3.d = r4
            r3.e = r5
            p0b r6 = p1
            r6.g(r3)
        L_0x002d:
            int r3 = r2.size()
            r6 = r10
        L_0x0032:
            if (r6 >= r3) goto L_0x004c
            java.lang.Object r7 = r2.get(r6)
            j9e r7 = (defpackage.j9e) r7
            int r7 = r7.d
            int r8 = r9.a
            if (r7 != r8) goto L_0x0041
            r4 = r6
        L_0x0041:
            java.lang.Object r7 = r2.get(r6)
            j9e r7 = (defpackage.j9e) r7
            r7.d = r6
            int r6 = r6 + 1
            goto L_0x0032
        L_0x004c:
            r9.a = r4
            if (r0 != r10) goto L_0x0067
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0058
            goto L_0x0064
        L_0x0058:
            int r10 = r10 - r3
            int r10 = java.lang.Math.max(r1, r10)
            java.lang.Object r10 = r2.get(r10)
            r5 = r10
            j9e r5 = (defpackage.j9e) r5
        L_0x0064:
            r9.o(r5, r3)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m(int):void");
    }

    public final void n(int i) {
        i9e i9e = this.o;
        l9e l9e = (l9e) i9e.getChildAt(i);
        i9e.removeViewAt(i);
        if (l9e != null) {
            l9e.setTab((j9e) null);
            l9e.setSelected(false);
            this.n1.g(l9e);
        }
        requestLayout();
    }

    public final void o(j9e j9e, boolean z) {
        j9e j9e2 = this.c;
        ArrayList arrayList = this.d1;
        if (j9e2 != j9e) {
            int i = j9e != null ? j9e.d : -1;
            if (z) {
                if ((j9e2 == null || j9e2.d == -1) && i != -1) {
                    q(i, 0.0f, true, true, true);
                } else {
                    c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.c = j9e;
            if (!(j9e2 == null || j9e2.f == null)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((g9e) arrayList.get(size)).getClass();
                }
            }
            if (j9e != null) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((g9e) arrayList.get(size2)).a(j9e);
                }
            }
        } else if (j9e2 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((g9e) arrayList.get(size3)).getClass();
            }
            c(j9e.d);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof lw7) {
            ez3.Z(this, (lw7) background);
        }
        if (this.g1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                r((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l1) {
            setupWithViewPager((ViewPager) null);
            this.l1 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = (defpackage.l9e) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            i9e r1 = r7.o
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x0032
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof defpackage.l9e
            if (r2 == 0) goto L_0x002f
            l9e r1 = (defpackage.l9e) r1
            android.graphics.drawable.Drawable r2 = r1.A0
            if (r2 == 0) goto L_0x002f
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.A0
            r1.draw(r8)
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(1, getTabCount(), 1).b);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i, int i2) {
        int round = Math.round(gwf.m(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.O0;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - gwf.m(getContext(), 56));
            }
            this.M0 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.U0;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(tia tia, boolean z) {
        cx3 cx3;
        tia tia2 = this.h1;
        if (!(tia2 == null || (cx3 = this.i1) == null)) {
            tia2.a.unregisterObserver(cx3);
        }
        this.h1 = tia;
        if (z && tia != null) {
            if (this.i1 == null) {
                this.i1 = new cx3(2, this);
            }
            tia.a.registerObserver(this.i1);
        }
        j();
    }

    public final void q(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = ((float) i) + f;
        int round = Math.round(f2);
        if (round >= 0) {
            i9e i9e = this.o;
            if (round < i9e.getChildCount()) {
                if (z2) {
                    i9e.b.a = Math.round(f2);
                    ValueAnimator valueAnimator = i9e.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        i9e.a.cancel();
                    }
                    i9e.c(i9e.getChildAt(i), i9e.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.f1;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f1.cancel();
                }
                int e = e(i, f);
                int scrollX = getScrollX();
                boolean z4 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
                WeakHashMap weakHashMap = eaf.a;
                if (getLayoutDirection() == 1) {
                    z4 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
                }
                if (z4 || this.m1 == 1 || z3) {
                    if (i < 0) {
                        e = 0;
                    }
                    scrollTo(e, 0);
                }
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void r(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.g1;
        if (viewPager2 != null) {
            k9e k9e = this.j1;
            if (!(k9e == null || (arrayList2 = viewPager2.j1) == null)) {
                arrayList2.remove(k9e);
            }
            f9e f9e = this.k1;
            if (!(f9e == null || (arrayList = this.g1.l1) == null)) {
                arrayList.remove(f9e);
            }
        }
        jt5 jt5 = this.e1;
        if (jt5 != null) {
            l(jt5);
            this.e1 = null;
        }
        if (viewPager != null) {
            this.g1 = viewPager;
            if (this.j1 == null) {
                this.j1 = new k9e(this);
            }
            k9e k9e2 = this.j1;
            k9e2.c = 0;
            k9e2.b = 0;
            viewPager.b(k9e2);
            jt5 jt52 = new jt5(2, viewPager);
            this.e1 = jt52;
            a(jt52);
            tia adapter = viewPager.getAdapter();
            if (adapter != null) {
                p(adapter, true);
            }
            if (this.k1 == null) {
                this.k1 = new f9e(this);
            }
            f9e f9e2 = this.k1;
            f9e2.a = true;
            if (viewPager.l1 == null) {
                viewPager.l1 = new ArrayList();
            }
            viewPager.l1.add(f9e2);
            q(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.g1 = null;
            p((tia) null, false);
        }
        this.l1 = z;
    }

    public final void s(boolean z) {
        int i = 0;
        while (true) {
            i9e i9e = this.o;
            if (i < i9e.getChildCount()) {
                View childAt = i9e.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.U0 == 1 && this.R0 == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof lw7) {
            ((lw7) background).k(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            int i = 0;
            while (true) {
                i9e i9e = this.o;
                if (i < i9e.getChildCount()) {
                    View childAt = i9e.getChildAt(i);
                    if (childAt instanceof l9e) {
                        l9e l9e = (l9e) childAt;
                        l9e.setOrientation(l9e.C0.V0 ^ true ? 1 : 0);
                        TextView textView = l9e.y0;
                        if (textView == null && l9e.z0 == null) {
                            l9e.h(l9e.b, l9e.c, true);
                        } else {
                            l9e.h(textView, l9e.z0, false);
                        }
                    }
                    i++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(h9e h9e) {
        setOnTabSelectedListener((g9e) h9e);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.G0 = mutate;
        int i = this.H0;
        if (i != 0) {
            um4.g(mutate, i);
        } else {
            um4.h(mutate, (ColorStateList) null);
        }
        int i2 = this.X0;
        if (i2 == -1) {
            i2 = this.G0.getIntrinsicHeight();
        }
        this.o.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.H0 = i;
        Drawable drawable = this.G0;
        if (i != 0) {
            um4.g(drawable, i);
        } else {
            um4.h(drawable, (ColorStateList) null);
        }
        s(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            WeakHashMap weakHashMap = eaf.a;
            this.o.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.X0 = i;
        this.o.b(i);
    }

    public void setTabGravity(int i) {
        if (this.R0 != i) {
            this.R0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                l9e l9e = ((j9e) arrayList.get(i)).g;
                if (l9e != null) {
                    l9e.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(d8.r(getContext(), i));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [j06, java.lang.Object] */
    public void setTabIndicatorAnimationMode(int i) {
        this.Y0 = i;
        if (i == 0) {
            this.a1 = new Object();
        } else if (i == 1) {
            this.a1 = new vs4(0);
        } else if (i == 2) {
            this.a1 = new vs4(1);
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.W0 = z;
        int i = i9e.c;
        i9e i9e = this.o;
        i9e.a(i9e.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = eaf.a;
        i9e.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.U0) {
            this.U0 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            int i = 0;
            while (true) {
                i9e i9e = this.o;
                if (i < i9e.getChildCount()) {
                    View childAt = i9e.getChildAt(i);
                    if (childAt instanceof l9e) {
                        Context context = getContext();
                        int i2 = l9e.D0;
                        ((l9e) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(d8.r(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                l9e l9e = ((j9e) arrayList.get(i)).g;
                if (l9e != null) {
                    l9e.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(tia tia) {
        p(tia, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.Z0 != z) {
            this.Z0 = z;
            int i = 0;
            while (true) {
                i9e i9e = this.o;
                if (i < i9e.getChildCount()) {
                    View childAt = i9e.getChildAt(i);
                    if (childAt instanceof l9e) {
                        Context context = getContext();
                        int i2 = l9e.D0;
                        ((l9e) childAt).f(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        r(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m15generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(g9e g9e) {
        g9e g9e2 = this.c1;
        if (g9e2 != null) {
            l(g9e2);
        }
        this.c1 = g9e;
        if (g9e != null) {
            a(g9e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(am7.n(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
