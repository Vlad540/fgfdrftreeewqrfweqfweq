package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Toolbar extends ViewGroup implements rl8 {
    public View A0;
    public Context B0;
    public int C0;
    public int D0;
    public int E0;
    public final int F0;
    public final int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public ohc L0;
    public int M0;
    public int N0;
    public final int O0;
    public CharSequence P0;
    public CharSequence Q0;
    public ColorStateList R0;
    public ColorStateList S0;
    public boolean T0;
    public boolean U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final int[] X0;
    public final jg8 Y0;
    public ArrayList Z0;
    public ActionMenuView a;
    public tle a1;
    public AppCompatTextView b;
    public final c9 b1;
    public AppCompatTextView c;
    public cme c1;
    public i7 d1;
    public rle e1;
    public gm8 f1;
    public nl8 g1;
    public boolean h1;
    public OnBackInvokedCallback i1;
    public OnBackInvokedDispatcher j1;
    public boolean k1;
    public final lde l1;
    public AppCompatImageButton o;
    public AppCompatImageView w0;
    public Drawable x0;
    public final CharSequence y0;
    public AppCompatImageButton z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ylb.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new a4e(getContext());
    }

    public static sle h() {
        return new sle(-2);
    }

    public static sle i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof sle;
        if (z) {
            sle sle = (sle) layoutParams;
            sle sle2 = new sle(sle);
            sle2.b = 0;
            sle2.b = sle.b;
            return sle2;
        } else if (z) {
            sle sle3 = new sle((sle) layoutParams);
            sle3.b = 0;
            return sle3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            sle sle4 = new sle((ViewGroup.LayoutParams) marginLayoutParams);
            sle4.b = 0;
            sle4.leftMargin = marginLayoutParams.leftMargin;
            sle4.topMargin = marginLayoutParams.topMargin;
            sle4.rightMargin = marginLayoutParams.rightMargin;
            sle4.bottomMargin = marginLayoutParams.bottomMargin;
            return sle4;
        } else {
            sle sle5 = new sle(layoutParams);
            sle5.b = 0;
            return sle5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                sle sle = (sle) childAt.getLayoutParams();
                if (sle.b == 0 && v(childAt)) {
                    int i3 = sle.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            sle sle2 = (sle) childAt2.getLayoutParams();
            if (sle2.b == 0 && v(childAt2)) {
                int i5 = sle2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        sle h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (sle) layoutParams;
        h.b = 1;
        if (!z || this.A0 == null) {
            addView(view, h);
            return;
        }
        view.setLayoutParams(h);
        this.W0.add(view);
    }

    public final void c() {
        if (this.z0 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, ylb.toolbarNavigationButtonStyle);
            this.z0 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.x0);
            this.z0.setContentDescription(this.y0);
            sle h = h();
            h.a = (this.F0 & 112) | 8388611;
            h.b = 2;
            this.z0.setLayoutParams(h);
            this.z0.setOnClickListener(new jsc(13, this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof sle);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ohc] */
    public final void d() {
        if (this.L0 == null) {
            ? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f = 0;
            obj.g = false;
            obj.h = false;
            this.L0 = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            pl8 pl8 = (pl8) actionMenuView.getMenu();
            if (this.e1 == null) {
                this.e1 = new rle(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            pl8.b(this.e1, this.B0);
            x();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.C0);
            this.a.setOnMenuItemClickListener(this.b1);
            ActionMenuView actionMenuView2 = this.a;
            gm8 gm8 = this.f1;
            ple ple = new ple(this);
            actionMenuView2.x0 = gm8;
            actionMenuView2.y0 = ple;
            sle h = h();
            h.a = (this.F0 & 112) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.o == null) {
            this.o = new AppCompatImageButton(getContext(), (AttributeSet) null, ylb.toolbarNavigationButtonStyle);
            sle h = h();
            h.a = (this.F0 & 112) | 8388611;
            this.o.setLayoutParams(h);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.z0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.z0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ohc ohc = this.L0;
        if (ohc != null) {
            return ohc.g ? ohc.a : ohc.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.N0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ohc ohc = this.L0;
        if (ohc != null) {
            return ohc.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ohc ohc = this.L0;
        if (ohc != null) {
            return ohc.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ohc ohc = this.L0;
        if (ohc != null) {
            return ohc.g ? ohc.b : ohc.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.M0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r2 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r2.a
            if (r0 == 0) goto L_0x001e
            pl8 r0 = r0.a
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x001e
            int r0 = r2.getContentInsetEnd()
            int r2 = r2.N0
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            goto L_0x0022
        L_0x001e:
            int r2 = r2.getContentInsetEnd()
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.M0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.w0;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.w0;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.o;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public i7 getOuterActionMenuPresenter() {
        return this.d1;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.B0;
    }

    public int getPopupTheme() {
        return this.C0;
    }

    public CharSequence getSubtitle() {
        return this.Q0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.P0;
    }

    public int getTitleMarginBottom() {
        return this.K0;
    }

    public int getTitleMarginEnd() {
        return this.I0;
    }

    public int getTitleMarginStart() {
        return this.H0;
    }

    public int getTitleMarginTop() {
        return this.J0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public t24 getWrapper() {
        if (this.c1 == null) {
            this.c1 = new cme(this, true);
        }
        return this.c1;
    }

    public final int j(View view, int i) {
        sle sle = (sle) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = sle.a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.O0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - sle.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = sle.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = sle.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.Y0.b).iterator();
        while (it2.hasNext()) {
            ((mx5) it2.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.Z0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.W0.contains(view);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.l1);
        x();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.U0 = false;
        }
        if (!this.U0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.U0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.U0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0298 A[LOOP:0: B:102:0x0296->B:103:0x0298, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b5 A[LOOP:1: B:105:0x02b3->B:106:0x02b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d3 A[LOOP:2: B:108:0x02d1->B:109:0x02d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321 A[LOOP:3: B:116:0x031f->B:117:0x0321, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.X0
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = defpackage.eaf.a
            int r12 = r18.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r2
        L_0x003d:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.o
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0050
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.o
            int r13 = r0.r(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.o
            int r13 = r0.q(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.z0
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x006b
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.z0
            int r14 = r0.r(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.z0
            int r13 = r0.q(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r13 = r0.q(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.a
            int r14 = r0.r(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.A0
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00c5
            if (r1 == 0) goto L_0x00bf
            android.view.View r13 = r0.A0
            int r10 = r0.r(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.A0
            int r3 = r0.q(r13, r3, r12, r11)
        L_0x00c5:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.w0
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00d6
            androidx.appcompat.widget.AppCompatImageView r13 = r0.w0
            int r10 = r0.r(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.w0
            int r3 = r0.q(r13, r3, r12, r11)
        L_0x00dc:
            androidx.appcompat.widget.AppCompatTextView r13 = r0.b
            boolean r13 = r0.v(r13)
            androidx.appcompat.widget.AppCompatTextView r14 = r0.c
            boolean r14 = r0.v(r14)
            if (r13 == 0) goto L_0x0101
            androidx.appcompat.widget.AppCompatTextView r15 = r0.b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            sle r15 = (defpackage.sle) r15
            int r2 = r15.topMargin
            r22 = r7
            androidx.appcompat.widget.AppCompatTextView r7 = r0.b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            int r2 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0104
        L_0x0101:
            r22 = r7
            r2 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011e
            androidx.appcompat.widget.AppCompatTextView r7 = r0.c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            sle r7 = (defpackage.sle) r7
            int r15 = r7.topMargin
            r16 = r4
            androidx.appcompat.widget.AppCompatTextView r4 = r0.c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r2 = r2 + r4
            goto L_0x0120
        L_0x011e:
            r16 = r4
        L_0x0120:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r17 = r6
            r21 = r12
            goto L_0x028a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            androidx.appcompat.widget.AppCompatTextView r4 = r0.b
            goto L_0x0132
        L_0x0130:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            androidx.appcompat.widget.AppCompatTextView r7 = r0.c
            goto L_0x0139
        L_0x0137:
            androidx.appcompat.widget.AppCompatTextView r7 = r0.b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            sle r4 = (defpackage.sle) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            sle r7 = (defpackage.sle) r7
            if (r13 == 0) goto L_0x014f
            androidx.appcompat.widget.AppCompatTextView r15 = r0.b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            androidx.appcompat.widget.AppCompatTextView r15 = r0.c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.O0
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a2
            r12 = 80
            if (r6 == r12) goto L_0x0196
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r3
            int r3 = r0.J0
            int r12 = r12 + r3
            if (r6 >= r12) goto L_0x017f
            r6 = r12
            goto L_0x0194
        L_0x017f:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.K0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0194
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0194:
            int r8 = r8 + r6
            goto L_0x01af
        L_0x0196:
            r23 = r3
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.K0
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01af
        L_0x01a2:
            r23 = r3
            int r2 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.J0
            int r8 = r2 + r3
        L_0x01af:
            if (r1 == 0) goto L_0x0221
            if (r15 == 0) goto L_0x01b7
            int r1 = r0.H0
        L_0x01b5:
            r2 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01b5
        L_0x01b9:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ef
            androidx.appcompat.widget.AppCompatTextView r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            sle r1 = (defpackage.sle) r1
            androidx.appcompat.widget.AppCompatTextView r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            androidx.appcompat.widget.AppCompatTextView r3 = r0.b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            androidx.appcompat.widget.AppCompatTextView r4 = r0.b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.I0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f0
        L_0x01ef:
            r2 = r10
        L_0x01f0:
            if (r14 == 0) goto L_0x0216
            androidx.appcompat.widget.AppCompatTextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            sle r1 = (defpackage.sle) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            androidx.appcompat.widget.AppCompatTextView r4 = r0.c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.I0
            int r1 = r10 - r1
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021e:
            r3 = r23
            goto L_0x028a
        L_0x0221:
            if (r15 == 0) goto L_0x0227
            int r1 = r0.H0
        L_0x0225:
            r2 = 0
            goto L_0x0229
        L_0x0227:
            r1 = 0
            goto L_0x0225
        L_0x0229:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r23
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025e
            androidx.appcompat.widget.AppCompatTextView r1 = r0.b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            sle r1 = (defpackage.sle) r1
            androidx.appcompat.widget.AppCompatTextView r2 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            androidx.appcompat.widget.AppCompatTextView r4 = r0.b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.b
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.I0
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r2 = r3
        L_0x025f:
            if (r14 == 0) goto L_0x0283
            androidx.appcompat.widget.AppCompatTextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            sle r1 = (defpackage.sle) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            androidx.appcompat.widget.AppCompatTextView r4 = r0.c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.c
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.I0
            int r1 = r1 + r4
            goto L_0x0284
        L_0x0283:
            r1 = r3
        L_0x0284:
            if (r15 == 0) goto L_0x028a
            int r3 = java.lang.Math.max(r2, r1)
        L_0x028a:
            java.util.ArrayList r1 = r0.V0
            r2 = 3
            r0.a(r1, r2)
            int r2 = r1.size()
            r4 = r3
            r3 = 0
        L_0x0296:
            if (r3 >= r2) goto L_0x02a7
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.q(r5, r4, r12, r11)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0296
        L_0x02a7:
            r12 = r21
            r5 = 1
            r2 = 5
            r0.a(r1, r2)
            int r2 = r1.size()
            r3 = 0
        L_0x02b3:
            if (r3 >= r2) goto L_0x02c1
            java.lang.Object r6 = r1.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r10 = r0.r(r6, r10, r12, r11)
            int r3 = r3 + r5
            goto L_0x02b3
        L_0x02c1:
            r0.a(r1, r5)
            r2 = 0
            r3 = r11[r2]
            r2 = r11[r5]
            int r5 = r1.size()
            r6 = r2
            r7 = r3
            r2 = 0
            r3 = 0
        L_0x02d1:
            if (r2 >= r5) goto L_0x0304
            java.lang.Object r8 = r1.get(r2)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            sle r9 = (defpackage.sle) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r6, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r3 = r3 + r8
            r8 = 1
            int r2 = r2 + r8
            r6 = r7
            r7 = r13
            goto L_0x02d1
        L_0x0304:
            r6 = 0
            int r2 = r16 - r17
            int r2 = r2 - r22
            int r2 = r2 / 2
            int r2 = r2 + r17
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r3 = r3 + r2
            if (r2 >= r4) goto L_0x0314
            goto L_0x031b
        L_0x0314:
            if (r3 <= r10) goto L_0x031a
            int r3 = r3 - r10
            int r4 = r2 - r3
            goto L_0x031b
        L_0x031a:
            r4 = r2
        L_0x031b:
            int r2 = r1.size()
        L_0x031f:
            if (r6 >= r2) goto L_0x032e
            java.lang.Object r3 = r1.get(r6)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.q(r3, r4, r12, r11)
            r3 = 1
            int r6 = r6 + r3
            goto L_0x031f
        L_0x032e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (v(this.o)) {
            t(this.o, i, 0, i2, this.G0);
            i5 = k(this.o) + this.o.getMeasuredWidth();
            i4 = Math.max(0, l(this.o) + this.o.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.o.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (v(this.z0)) {
            t(this.z0, i, 0, i2, this.G0);
            i5 = k(this.z0) + this.z0.getMeasuredWidth();
            i4 = Math.max(i4, l(this.z0) + this.z0.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.z0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.X0;
        iArr[c3] = max2;
        if (v(this.a)) {
            t(this.a, i, max, i2, this.G0);
            i6 = k(this.a) + this.a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.a) + this.a.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (v(this.A0)) {
            max3 += s(this.A0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.A0) + this.A0.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.A0.getMeasuredState());
        }
        if (v(this.w0)) {
            max3 += s(this.w0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.w0) + this.w0.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.w0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((sle) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                max3 += s(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.J0 + this.K0;
        int i13 = this.H0 + this.I0;
        if (v(this.b)) {
            s(this.b, i, max3 + i13, i2, i12, iArr);
            int k = k(this.b) + this.b.getMeasuredWidth();
            i7 = l(this.b) + this.b.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.b.getMeasuredState());
            i8 = k;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (v(this.c)) {
            i8 = Math.max(i8, s(this.c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 += l(this.c) + this.c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.c.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.h1) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof ule)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ule ule = (ule) parcelable;
        super.onRestoreInstanceState(ule.a);
        ActionMenuView actionMenuView = this.a;
        pl8 pl8 = actionMenuView != null ? actionMenuView.a : null;
        int i = ule.c;
        if (!(i == 0 || this.e1 == null || pl8 == null || (findItem = pl8.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (ule.o) {
            lde lde = this.l1;
            removeCallbacks(lde);
            post(lde);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        ohc ohc = this.L0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != ohc.g) {
            ohc.g = z;
            if (!ohc.h) {
                ohc.a = ohc.e;
                ohc.b = ohc.f;
            } else if (z) {
                int i2 = ohc.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = ohc.e;
                }
                ohc.a = i2;
                int i3 = ohc.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = ohc.f;
                }
                ohc.b = i3;
            } else {
                int i4 = ohc.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = ohc.e;
                }
                ohc.a = i4;
                int i5 = ohc.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = ohc.f;
                }
                ohc.b = i5;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, z, ule] */
    public final Parcelable onSaveInstanceState() {
        ul8 ul8;
        ? zVar = new z(super.onSaveInstanceState());
        rle rle = this.e1;
        if (!(rle == null || (ul8 = rle.b) == null)) {
            zVar.c = ul8.a;
        }
        zVar.o = p();
        return zVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T0 = false;
        }
        if (!this.T0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.T0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.T0 = false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r0 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0010
            i7 r0 = r0.w0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.p():boolean");
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        sle sle = (sle) view.getLayoutParams();
        int i3 = sle.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + sle.rightMargin + max;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        sle sle = (sle) view.getLayoutParams();
        int i3 = sle.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + sle.leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            x();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(am7.n(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.h1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.N0) {
            this.N0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.M0) {
            this.M0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(am7.n(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(am7.n(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.o.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(tle tle) {
        this.a1 = tle;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.C0 != i) {
            this.C0 = i;
            if (i == 0) {
                this.B0 = getContext();
            } else {
                this.B0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.K0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.I0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.H0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.J0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void u(int i, int i2) {
        d();
        this.L0.a(i, i2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() {
        /*
            r0 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0010
            i7 r0 = r0.w0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.w():boolean");
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = qle.a(this);
            rle rle = this.e1;
            boolean z = (rle == null || rle.b == null || a2 == null || !isAttachedToWindow() || !this.k1) ? false : true;
            if (z && this.j1 == null) {
                if (this.i1 == null) {
                    this.i1 = qle.b(new ole(this, 0));
                }
                qle.c(a2, this.i1);
                this.j1 = a2;
            } else if (!z && (onBackInvokedDispatcher = this.j1) != null) {
                qle.d(onBackInvokedDispatcher, this.i1);
                this.j1 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O0 = 8388627;
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new int[2];
        this.Y0 = new jg8(new ole(this, 1));
        this.Z0 = new ArrayList();
        this.b1 = new c9(24, this);
        this.l1 = new lde(3, (Object) this);
        ydc D = ydc.D(getContext(), attributeSet, nwb.Toolbar, i, 0);
        int[] iArr = nwb.Toolbar;
        WeakHashMap weakHashMap = eaf.a;
        z9f.d(this, context, iArr, attributeSet, (TypedArray) D.c, i, 0);
        int i2 = nwb.Toolbar_titleTextAppearance;
        TypedArray typedArray = (TypedArray) D.c;
        this.D0 = typedArray.getResourceId(i2, 0);
        this.E0 = typedArray.getResourceId(nwb.Toolbar_subtitleTextAppearance, 0);
        this.O0 = typedArray.getInteger(nwb.Toolbar_android_gravity, 8388627);
        this.F0 = typedArray.getInteger(nwb.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(nwb.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.K0 = dimensionPixelOffset;
        this.J0 = dimensionPixelOffset;
        this.I0 = dimensionPixelOffset;
        this.H0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.H0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.I0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.J0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(nwb.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.K0 = dimensionPixelOffset5;
        }
        this.G0 = typedArray.getDimensionPixelSize(nwb.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(nwb.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(nwb.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(nwb.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(nwb.Toolbar_contentInsetRight, 0);
        d();
        ohc ohc = this.L0;
        ohc.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            ohc.e = dimensionPixelSize;
            ohc.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            ohc.f = dimensionPixelSize2;
            ohc.b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            ohc.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.M0 = typedArray.getDimensionPixelOffset(nwb.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.N0 = typedArray.getDimensionPixelOffset(nwb.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.x0 = D.y(nwb.Toolbar_collapseIcon);
        this.y0 = typedArray.getText(nwb.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(nwb.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(nwb.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.B0 = getContext();
        setPopupTheme(typedArray.getResourceId(nwb.Toolbar_popupTheme, 0));
        Drawable y = D.y(nwb.Toolbar_navigationIcon);
        if (y != null) {
            setNavigationIcon(y);
        }
        CharSequence text3 = typedArray.getText(nwb.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable y2 = D.y(nwb.Toolbar_logo);
        if (y2 != null) {
            setLogo(y2);
        }
        CharSequence text4 = typedArray.getText(nwb.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(nwb.Toolbar_titleTextColor)) {
            setTitleTextColor(D.w(nwb.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(nwb.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(D.w(nwb.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(nwb.Toolbar_menu)) {
            m(typedArray.getResourceId(nwb.Toolbar_menu, 0));
        }
        D.E();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, sle] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nwb.ActionBarLayout);
        marginLayoutParams.a = obtainStyledAttributes.getInt(nwb.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.z0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.z0.setImageDrawable(drawable);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.z0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setImageDrawable(this.x0);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.w0 == null) {
                this.w0 = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!o(this.w0)) {
                b(this.w0, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.w0;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.w0);
                this.W0.remove(this.w0);
            }
        }
        AppCompatImageView appCompatImageView2 = this.w0;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.w0 == null) {
            this.w0 = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        AppCompatImageView appCompatImageView = this.w0;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            dme.a(this.o, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.o)) {
                b(this.o, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.o;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.o);
                this.W0.remove(this.o);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.o;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.E0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.S0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!o(this.c)) {
                b(this.c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.c;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.c);
                this.W0.remove(this.c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.Q0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.S0 = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.D0;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.R0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!o(this.b)) {
                b(this.b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.b;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.b);
                this.W0.remove(this.b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.P0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.R0 = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
