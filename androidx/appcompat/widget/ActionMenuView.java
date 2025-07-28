package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

public class ActionMenuView extends bd7 implements ol8, jm8 {
    public int A0;
    public final int B0;
    public final int C0;
    public l7 D0;
    public pl8 a;
    public Context b;
    public int c = 0;
    public boolean o;
    public i7 w0;
    public gm8 x0;
    public nl8 y0;
    public boolean z0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.B0 = (int) (56.0f * f);
        this.C0 = (int) (f * 4.0f);
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k7] */
    public static k7 c() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.k7 e(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof defpackage.k7
            if (r0 == 0) goto L_0x0012
            k7 r0 = new k7
            k7 r1 = (defpackage.k7) r1
            r0.<init>(r1)
            boolean r1 = r1.a
            r0.a = r1
            goto L_0x0017
        L_0x0012:
            k7 r0 = new k7
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            k7 r1 = c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.e(android.view.ViewGroup$LayoutParams):k7");
    }

    public final boolean a(ul8 ul8) {
        return this.a.q(ul8, (hm8) null, 0);
    }

    public final void b(pl8 pl8) {
        this.a = pl8;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k7;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof j7)) {
            z = ((j7) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof j7)) ? z : z | ((j7) childAt2).e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: gm8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: gm8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: gm8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.Menu getMenu() {
        /*
            r4 = this;
            pl8 r0 = r4.a
            if (r0 != 0) goto L_0x003e
            android.content.Context r0 = r4.getContext()
            pl8 r1 = new pl8
            r1.<init>(r0)
            r4.a = r1
            mod r2 = new mod
            r3 = 1
            r2.<init>(r3, r4)
            r1.X = r2
            i7 r1 = new i7
            r1.<init>(r0)
            r4.w0 = r1
            r0 = 1
            r1.A0 = r0
            r1.B0 = r0
            gm8 r0 = r4.x0
            if (r0 == 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            oa2 r0 = new oa2
            r0.<init>()
        L_0x002d:
            r1.X = r0
            pl8 r0 = r4.a
            android.content.Context r2 = r4.b
            r0.b(r1, r2)
            i7 r0 = r4.w0
            r0.w0 = r4
            pl8 r0 = r0.c
            r4.a = r0
        L_0x003e:
            pl8 r4 = r4.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.getMenu():android.view.Menu");
    }

    public Drawable getOverflowIcon() {
        getMenu();
        i7 i7Var = this.w0;
        h7 h7Var = i7Var.x0;
        if (h7Var != null) {
            return h7Var.getDrawable();
        }
        if (i7Var.z0) {
            return i7Var.y0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i7 i7Var = this.w0;
        if (i7Var != null) {
            i7Var.i();
            if (this.w0.j()) {
                this.w0.g();
                this.w0.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i7 i7Var = this.w0;
        if (i7Var != null) {
            i7Var.g();
            f7 f7Var = i7Var.I0;
            if (f7Var != null && f7Var.b()) {
                f7Var.j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.z0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                k7 k7Var = (k7) childAt.getLayoutParams();
                if (k7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        i5 = getPaddingLeft() + k7Var.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - k7Var.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + k7Var.leftMargin) + k7Var.rightMargin;
                    f(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                k7 k7Var2 = (k7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !k7Var2.a) {
                    int i17 = width - k7Var2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + k7Var2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            k7 k7Var3 = (k7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !k7Var3.a) {
                int i20 = paddingLeft + k7Var3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + k7Var3.rightMargin + max + i20;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        pl8 pl8;
        boolean z3 = this.z0;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.z0 = z4;
        if (z3 != z4) {
            this.A0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.z0 || (pl8 = this.a) == null || size == this.A0)) {
            this.A0 = size;
            pl8.p(true);
        }
        int childCount = getChildCount();
        if (!this.z0 || childCount <= 0) {
            int i13 = i2;
            for (int i14 = 0; i14 < childCount; i14++) {
                k7 k7Var = (k7) getChildAt(i14).getLayoutParams();
                k7Var.rightMargin = 0;
                k7Var.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.B0;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z5 = false;
        int i23 = 0;
        int i24 = 0;
        long j = 0;
        while (true) {
            i3 = this.C0;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i25 = size3;
            if (childAt.getVisibility() == 8) {
                i10 = i15;
                i11 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i26 = i20 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                k7 k7Var2 = (k7) childAt.getLayoutParams();
                k7Var2.f = false;
                k7Var2.c = 0;
                k7Var2.b = 0;
                k7Var2.d = false;
                k7Var2.leftMargin = 0;
                k7Var2.rightMargin = 0;
                k7Var2.e = z6 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i27 = k7Var2.a ? 1 : i17;
                int i28 = i26;
                k7 k7Var3 = (k7) childAt.getLayoutParams();
                i10 = i15;
                i11 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i27 <= 0 || (z7 && i27 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i12++;
                    }
                    if (z7 && i12 < 2) {
                        i12 = 2;
                    }
                }
                k7Var3.d = !k7Var3.a && z7;
                k7Var3.b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (k7Var2.d) {
                    i23++;
                }
                if (k7Var2.a) {
                    z5 = true;
                }
                i17 -= i12;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= (long) (1 << i22);
                }
                i20 = i28;
            }
            i22++;
            size3 = i25;
            paddingBottom = i11;
            i15 = i10;
        }
        int i29 = i15;
        int i30 = size3;
        int i31 = i24;
        boolean z8 = z5 && i20 == 2;
        boolean z9 = false;
        while (true) {
            if (i23 <= 0 || i17 <= 0) {
                i4 = mode;
                i5 = i31;
                z = z9;
            } else {
                int i32 = Integer.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j2 = 0;
                while (i34 < childCount2) {
                    int i35 = i31;
                    k7 k7Var4 = (k7) getChildAt(i34).getLayoutParams();
                    boolean z10 = z9;
                    if (k7Var4.d) {
                        int i36 = k7Var4.b;
                        if (i36 < i32) {
                            j2 = 1 << i34;
                            i32 = i36;
                            i33 = 1;
                        } else if (i36 == i32) {
                            i33++;
                            j2 |= 1 << i34;
                        }
                    }
                    i34++;
                    z9 = z10;
                    i31 = i35;
                }
                i5 = i31;
                z = z9;
                j |= j2;
                if (i33 > i17) {
                    i4 = mode;
                    break;
                }
                int i37 = i32 + 1;
                int i38 = 0;
                while (i38 < childCount2) {
                    View childAt2 = getChildAt(i38);
                    k7 k7Var5 = (k7) childAt2.getLayoutParams();
                    int i39 = mode;
                    int i40 = childMeasureSpec;
                    int i41 = childCount2;
                    long j3 = (long) (1 << i38);
                    if ((j2 & j3) != 0) {
                        if (!z8 || !k7Var5.e) {
                            z2 = true;
                        } else {
                            z2 = true;
                            if (i17 == 1) {
                                childAt2.setPadding(i3 + i19, 0, i3, 0);
                            }
                        }
                        k7Var5.b += z2 ? 1 : 0;
                        k7Var5.f = z2;
                        i17--;
                    } else if (k7Var5.b == i37) {
                        j |= j3;
                    }
                    i38++;
                    childMeasureSpec = i40;
                    mode = i39;
                    childCount2 = i41;
                }
                i31 = i5;
                z9 = true;
            }
        }
        i4 = mode;
        i5 = i31;
        z = z9;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z11 = !z5 && i20 == 1;
        if (i17 <= 0 || j == 0 || (i17 >= i20 - 1 && !z11 && i21 <= 1)) {
            i6 = i43;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((k7) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j & ((long) (1 << i44))) != 0 && !((k7) getChildAt(i44).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) (((float) (i17 * i19)) / bitCount) : 0;
            i6 = i43;
            for (int i46 = 0; i46 < i6; i46++) {
                if ((j & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    k7 k7Var6 = (k7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        k7Var6.c = i45;
                        k7Var6.f = true;
                        if (i46 == 0 && !k7Var6.e) {
                            k7Var6.leftMargin = (-i45) / 2;
                        }
                        z = true;
                    } else if (k7Var6.a) {
                        k7Var6.c = i45;
                        k7Var6.f = true;
                        k7Var6.rightMargin = (-i45) / 2;
                        z = true;
                    } else {
                        if (i46 != 0) {
                            k7Var6.leftMargin = i45 / 2;
                        }
                        if (i46 != i6 - 1) {
                            k7Var6.rightMargin = i45 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            int i47 = 0;
            while (i47 < i6) {
                View childAt4 = getChildAt(i47);
                k7 k7Var7 = (k7) childAt4.getLayoutParams();
                if (!k7Var7.f) {
                    i9 = i42;
                } else {
                    i9 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((k7Var7.b * i19) + k7Var7.c, 1073741824), i9);
                }
                i47++;
                i42 = i9;
            }
        }
        if (i4 != 1073741824) {
            i8 = i29;
            i7 = i5;
        } else {
            i7 = i30;
            i8 = i29;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.w0.F0 = z;
    }

    public void setOnMenuItemClickListener(l7 l7Var) {
        this.D0 = l7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        i7 i7Var = this.w0;
        h7 h7Var = i7Var.x0;
        if (h7Var != null) {
            h7Var.setImageDrawable(drawable);
            return;
        }
        i7Var.z0 = true;
        i7Var.y0 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.o = z;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.b = getContext();
            } else {
                this.b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(i7 i7Var) {
        this.w0 = i7Var;
        i7Var.w0 = this;
        this.a = i7Var.c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ad7, android.widget.LinearLayout$LayoutParams] */
    public final ad7 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final ViewGroup.LayoutParams m9generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
