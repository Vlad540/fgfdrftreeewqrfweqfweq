package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: n23  reason: default package */
public final class n23 extends FrameLayout {
    public static final int X0 = kvb.Widget_Design_CollapsingToolbar;
    public int A0;
    public final Rect B0 = new Rect();
    public final j23 C0;
    public final zs4 D0;
    public boolean E0;
    public boolean F0;
    public Drawable G0;
    public Drawable H0;
    public int I0;
    public boolean J0;
    public ValueAnimator K0;
    public long L0;
    public final TimeInterpolator M0;
    public final TimeInterpolator N0;
    public int O0 = -1;
    public l23 P0;
    public int Q0;
    public int R0;
    public nsf S0;
    public int T0 = 0;
    public boolean U0;
    public int V0 = 0;
    public boolean W0;
    public boolean a = true;
    public final int b;
    public ViewGroup c;
    public View o;
    public View w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n23(android.content.Context r15) {
        /*
            r14 = this;
            int r6 = defpackage.wlb.collapsingToolbarLayoutStyle
            r7 = 0
            int r8 = X0
            android.content.Context r15 = defpackage.tw7.a(r15, r7, r6, r8)
            r14.<init>(r15, r7, r6)
            r15 = 1
            r14.a = r15
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.B0 = r0
            r9 = -1
            r14.O0 = r9
            r10 = 0
            r14.T0 = r10
            r14.V0 = r10
            android.content.Context r11 = r14.getContext()
            j23 r12 = new j23
            r12.<init>(r14)
            r14.C0 = r12
            android.view.animation.DecelerateInterpolator r0 = defpackage.og.e
            r12.W = r0
            r12.i(r10)
            r12.J = r10
            zs4 r0 = new zs4
            r0.<init>(r11)
            r14.D0 = r0
            int[] r13 = defpackage.xvb.CollapsingToolbarLayout
            int[] r5 = new int[r10]
            defpackage.she.a(r11, r7, r6, r8)
            r0 = r11
            r1 = r7
            r2 = r13
            r3 = r6
            r4 = r8
            defpackage.she.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r7, r13, r6, r8)
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleGravity
            r2 = 8388691(0x800053, float:1.175506E-38)
            int r1 = r0.getInt(r1, r2)
            int r2 = r12.j
            if (r2 == r1) goto L_0x005e
            r12.j = r1
            r12.i(r10)
        L_0x005e:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_collapsedTitleGravity
            r2 = 8388627(0x800013, float:1.175497E-38)
            int r1 = r0.getInt(r1, r2)
            r12.l(r1)
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMargin
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r14.A0 = r1
            r14.z0 = r1
            r14.y0 = r1
            r14.x0 = r1
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x0088
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginStart
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r14.x0 = r1
        L_0x0088:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x0098
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginEnd
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r14.z0 = r1
        L_0x0098:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x00a8
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginTop
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r14.y0 = r1
        L_0x00a8:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x00b8
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleMarginBottom
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r14.A0 = r1
        L_0x00b8:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_titleEnabled
            boolean r1 = r0.getBoolean(r1, r15)
            r14.E0 = r1
            int r1 = defpackage.xvb.CollapsingToolbarLayout_title
            java.lang.CharSequence r1 = r0.getText(r1)
            r14.setTitle(r1)
            int r1 = defpackage.kvb.TextAppearance_Design_CollapsingToolbar_Expanded
            r12.n(r1)
            int r1 = defpackage.qvb.TextAppearance_AppCompat_Widget_ActionBar_Title
            r12.k(r1)
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x00e4
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleTextAppearance
            int r1 = r0.getResourceId(r1, r10)
            r12.n(r1)
        L_0x00e4:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x00f5
            int r1 = defpackage.xvb.CollapsingToolbarLayout_collapsedTitleTextAppearance
            int r1 = r0.getResourceId(r1, r10)
            r12.k(r1)
        L_0x00f5:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_titleTextEllipsize
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x0118
            int r1 = defpackage.xvb.CollapsingToolbarLayout_titleTextEllipsize
            int r1 = r0.getInt(r1, r9)
            if (r1 == 0) goto L_0x0113
            if (r1 == r15) goto L_0x0110
            r2 = 3
            if (r1 == r2) goto L_0x010d
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            goto L_0x0115
        L_0x010d:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x0115
        L_0x0110:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0115
        L_0x0113:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
        L_0x0115:
            r14.setTitleEllipsize(r1)
        L_0x0118:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x012f
            int r1 = defpackage.xvb.CollapsingToolbarLayout_expandedTitleTextColor
            android.content.res.ColorStateList r1 = defpackage.wx3.i(r11, r0, r1)
            android.content.res.ColorStateList r2 = r12.n
            if (r2 == r1) goto L_0x012f
            r12.n = r1
            r12.i(r10)
        L_0x012f:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x0146
            int r1 = defpackage.xvb.CollapsingToolbarLayout_collapsedTitleTextColor
            android.content.res.ColorStateList r1 = defpackage.wx3.i(r11, r0, r1)
            android.content.res.ColorStateList r2 = r12.o
            if (r2 == r1) goto L_0x0146
            r12.o = r1
            r12.i(r10)
        L_0x0146:
            int r1 = defpackage.xvb.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r14.O0 = r1
            int r1 = defpackage.xvb.CollapsingToolbarLayout_maxLines
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x016f
            int r1 = defpackage.xvb.CollapsingToolbarLayout_maxLines
            int r15 = r0.getInt(r1, r15)
            int r1 = r12.n0
            if (r15 == r1) goto L_0x016f
            r12.n0 = r15
            android.graphics.Bitmap r15 = r12.K
            if (r15 == 0) goto L_0x016c
            r15.recycle()
            r15 = 0
            r12.K = r15
        L_0x016c:
            r12.i(r10)
        L_0x016f:
            int r15 = defpackage.xvb.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r15 = r0.hasValue(r15)
            if (r15 == 0) goto L_0x0186
            int r15 = defpackage.xvb.CollapsingToolbarLayout_titlePositionInterpolator
            int r15 = r0.getResourceId(r15, r10)
            android.view.animation.Interpolator r15 = android.view.animation.AnimationUtils.loadInterpolator(r11, r15)
            r12.V = r15
            r12.i(r10)
        L_0x0186:
            int r15 = defpackage.xvb.CollapsingToolbarLayout_scrimAnimationDuration
            r1 = 600(0x258, float:8.41E-43)
            int r15 = r0.getInt(r15, r1)
            long r1 = (long) r15
            r14.L0 = r1
            int r15 = defpackage.wlb.motionEasingStandardInterpolator
            o85 r1 = defpackage.og.c
            android.animation.TimeInterpolator r15 = ct0.I(r11, r15, r1)
            r14.M0 = r15
            int r15 = defpackage.wlb.motionEasingStandardInterpolator
            o85 r1 = defpackage.og.d
            android.animation.TimeInterpolator r15 = ct0.I(r11, r15, r1)
            r14.N0 = r15
            int r15 = defpackage.xvb.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r15 = r0.getDrawable(r15)
            r14.setContentScrim(r15)
            int r15 = defpackage.xvb.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r15 = r0.getDrawable(r15)
            r14.setStatusBarScrim(r15)
            int r15 = defpackage.xvb.CollapsingToolbarLayout_titleCollapseMode
            int r15 = r0.getInt(r15, r10)
            r14.setTitleCollapseMode(r15)
            int r15 = defpackage.xvb.CollapsingToolbarLayout_toolbarId
            int r15 = r0.getResourceId(r15, r9)
            r14.b = r15
            int r15 = defpackage.xvb.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r15 = r0.getBoolean(r15, r10)
            r14.U0 = r15
            int r15 = defpackage.xvb.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r15 = r0.getBoolean(r15, r10)
            r14.W0 = r15
            r0.recycle()
            r14.setWillNotDraw(r10)
            e3 r15 = new e3
            r15.<init>(r14)
            java.util.WeakHashMap r0 = defpackage.eaf.a
            defpackage.t9f.u(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n23.<init>(android.content.Context):void");
    }

    public static gbf b(View view) {
        gbf gbf = (gbf) view.getTag(lob.view_offset_helper);
        if (gbf != null) {
            return gbf;
        }
        gbf gbf2 = new gbf(view);
        view.setTag(lob.view_offset_helper, gbf2);
        return gbf2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue D = bm3.D(context, wlb.colorSurfaceContainer);
        ColorStateList colorStateList = null;
        if (D != null) {
            int i = D.resourceId;
            if (i != 0) {
                colorStateList = d8.r(context, i);
            } else {
                int i2 = D.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(vmb.design_appbar_elevation);
        zs4 zs4 = this.D0;
        return zs4.a(zs4.d, dimension);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.c = r0
            r6.o = r0
            r1 = -1
            int r2 = r6.b
            if (r2 == r1) goto L_0x002f
            android.view.View r1 = r6.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.c = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.o = r1
        L_0x002f:
            android.view.ViewGroup r1 = r6.c
            r2 = 0
            if (r1 != 0) goto L_0x0050
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0039:
            if (r3 >= r1) goto L_0x004e
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 != 0) goto L_0x004b
            boolean r5 = r4 instanceof android.widget.Toolbar
            if (r5 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x004b:
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x004e:
            r6.c = r0
        L_0x0050:
            r6.c()
            r6.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n23.a():void");
    }

    public final void c() {
        View view;
        if (!this.E0 && (view = this.w0) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.w0);
            }
        }
        if (this.E0 && this.c != null) {
            if (this.w0 == null) {
                this.w0 = new View(getContext());
            }
            if (this.w0.getParent() == null) {
                this.c.addView(this.w0, -1, -1);
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k23;
    }

    public final void d() {
        if (this.G0 != null || this.H0 != null) {
            setScrimsShown(getHeight() + this.Q0 < getScrimVisibleHeightTrigger());
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.G0) != null && this.I0 > 0) {
            drawable.mutate().setAlpha(this.I0);
            this.G0.draw(canvas);
        }
        if (this.E0 && this.F0) {
            ViewGroup viewGroup = this.c;
            j23 j23 = this.C0;
            if (viewGroup == null || this.G0 == null || this.I0 <= 0 || this.R0 != 1 || j23.b >= j23.e) {
                j23.d(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.G0.getBounds(), Region.Op.DIFFERENCE);
                j23.d(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.H0 != null && this.I0 > 0) {
            nsf nsf = this.S0;
            int d = nsf != null ? nsf.d() : 0;
            if (d > 0) {
                this.H0.setBounds(0, -this.Q0, getWidth(), d - this.Q0);
                this.H0.mutate().setAlpha(this.I0);
                this.H0.draw(canvas);
            }
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.G0;
        if (drawable == null || this.I0 <= 0 || ((view2 = this.o) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.R0 == 1 && view != null && this.E0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.G0.mutate().setAlpha(this.I0);
            this.G0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H0;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.G0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        j23 j23 = this.C0;
        if (j23 != null) {
            j23.R = drawableState;
            ColorStateList colorStateList2 = j23.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = j23.n) != null && colorStateList.isStateful())) {
                j23.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        int i7;
        if (this.E0 && (view = this.w0) != null) {
            WeakHashMap weakHashMap = eaf.a;
            int i8 = 0;
            boolean z2 = view.isAttachedToWindow() && this.w0.getVisibility() == 0;
            this.F0 = z2;
            if (z2 || z) {
                boolean z3 = getLayoutDirection() == 1;
                View view2 = this.o;
                if (view2 == null) {
                    view2 = this.c;
                }
                int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((k23) view2.getLayoutParams()).bottomMargin;
                View view3 = this.w0;
                ThreadLocal threadLocal = ue4.a;
                int width = view3.getWidth();
                int height2 = view3.getHeight();
                Rect rect = this.B0;
                rect.set(0, 0, width, height2);
                ue4.b(this, view3, rect);
                ViewGroup viewGroup = this.c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i8 = toolbar.getTitleMarginStart();
                    i6 = toolbar.getTitleMarginEnd();
                    i5 = toolbar.getTitleMarginTop();
                    i7 = toolbar.getTitleMarginBottom();
                } else if (viewGroup instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i8 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i5 = toolbar2.getTitleMarginTop();
                    i7 = toolbar2.getTitleMarginBottom();
                } else {
                    i7 = 0;
                    i6 = 0;
                    i5 = 0;
                }
                int i9 = rect.left + (z3 ? i6 : i8);
                int i10 = rect.top + height + i5;
                int i11 = rect.right;
                if (!z3) {
                    i8 = i6;
                }
                int i12 = i11 - i8;
                int i13 = (rect.bottom + height) - i7;
                j23 j23 = this.C0;
                Rect rect2 = j23.h;
                if (!(rect2.left == i9 && rect2.top == i10 && rect2.right == i12 && rect2.bottom == i13)) {
                    rect2.set(i9, i10, i12, i13);
                    j23.S = true;
                }
                int i14 = z3 ? this.z0 : this.x0;
                int i15 = rect.top + this.y0;
                int i16 = (i3 - i) - (z3 ? this.x0 : this.z0);
                int i17 = (i4 - i2) - this.A0;
                Rect rect3 = j23.g;
                if (!(rect3.left == i14 && rect3.top == i15 && rect3.right == i16 && rect3.bottom == i17)) {
                    rect3.set(i14, i15, i16, i17);
                    j23.S = true;
                }
                j23.i(z);
            }
        }
    }

    public final void f() {
        if (this.c != null && this.E0 && TextUtils.isEmpty(this.C0.G)) {
            ViewGroup viewGroup = this.c;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k23(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.C0.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.C0.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.C0.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.G0;
    }

    public int getExpandedTitleGravity() {
        return this.C0.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.z0;
    }

    public int getExpandedTitleMarginStart() {
        return this.x0;
    }

    public int getExpandedTitleMarginTop() {
        return this.y0;
    }

    public float getExpandedTitleTextSize() {
        return this.C0.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.C0.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.C0.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.C0.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.C0.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.C0.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.C0.n0;
    }

    public int getScrimAlpha() {
        return this.I0;
    }

    public long getScrimAnimationDuration() {
        return this.L0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.O0;
        if (i >= 0) {
            return i + this.T0 + this.V0;
        }
        nsf nsf = this.S0;
        int d = nsf != null ? nsf.d() : 0;
        WeakHashMap weakHashMap = eaf.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.H0;
    }

    public CharSequence getTitle() {
        if (this.E0) {
            return this.C0.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.R0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.C0.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.C0.F;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof fm) {
            fm fmVar = (fm) parent;
            if (this.R0 == 1) {
                fmVar.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = eaf.a;
            setFitsSystemWindows(fmVar.getFitsSystemWindows());
            if (this.P0 == null) {
                this.P0 = new l23(this);
            }
            fmVar.a(this.P0);
            r9f.c(this);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C0.h(configuration);
    }

    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        l23 l23 = this.P0;
        if (!(l23 == null || !(parent instanceof fm) || (arrayList = ((fm) parent).z0) == null)) {
            arrayList.remove(l23);
        }
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nsf nsf = this.S0;
        if (nsf != null) {
            int d = nsf.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = eaf.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            gbf b2 = b(getChildAt(i6));
            View view = b2.a;
            b2.b = view.getTop();
            b2.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        nsf nsf = this.S0;
        int d = nsf != null ? nsf.d() : 0;
        if ((mode == 0 || this.U0) && d > 0) {
            this.T0 = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        if (this.W0) {
            j23 j23 = this.C0;
            if (j23.n0 > 1) {
                f();
                e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i5 = j23.p;
                if (i5 > 1) {
                    TextPaint textPaint = j23.U;
                    textPaint.setTextSize(j23.l);
                    textPaint.setTypeface(j23.z);
                    textPaint.setLetterSpacing(j23.g0);
                    this.V0 = (i5 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.V0, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.o;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i3 = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(i3);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i4 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i4 = view.getMeasuredHeight();
            }
            setMinimumHeight(i4);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.G0;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.R0 == 1 && viewGroup != null && this.E0) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.C0.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.C0.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        j23 j23 = this.C0;
        if (j23.o != colorStateList) {
            j23.o = colorStateList;
            j23.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        j23 j23 = this.C0;
        if (j23.m != f) {
            j23.m = f;
            j23.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        j23 j23 = this.C0;
        if (j23.m(typeface)) {
            j23.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.G0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.G0 = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.R0 == 1 && viewGroup != null && this.E0) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.G0.setCallback(this);
                this.G0.setAlpha(this.I0);
            }
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(gq3.b(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        j23 j23 = this.C0;
        if (j23.j != i) {
            j23.j = i;
            j23.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.z0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.x0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.y0 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.C0.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        j23 j23 = this.C0;
        if (j23.n != colorStateList) {
            j23.n = colorStateList;
            j23.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        j23 j23 = this.C0;
        if (j23.l != f) {
            j23.l = f;
            j23.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        j23 j23 = this.C0;
        if (j23.o(typeface)) {
            j23.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.W0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.U0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.C0.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.C0.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.C0.p0 = f;
    }

    public void setMaxLines(int i) {
        j23 j23 = this.C0;
        if (i != j23.n0) {
            j23.n0 = i;
            Bitmap bitmap = j23.K;
            if (bitmap != null) {
                bitmap.recycle();
                j23.K = null;
            }
            j23.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.C0.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.I0) {
            if (!(this.G0 == null || (viewGroup = this.c) == null)) {
                WeakHashMap weakHashMap = eaf.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.I0 = i;
            WeakHashMap weakHashMap2 = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.L0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = eaf.a;
        int i = 0;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.J0 != z) {
            if (z2) {
                if (z) {
                    i = 255;
                }
                a();
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.K0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.I0 ? this.M0 : this.N0);
                    this.K0.addUpdateListener(new ti0(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.K0.cancel();
                }
                this.K0.setDuration(this.L0);
                this.K0.setIntValues(new int[]{this.I0, i});
                this.K0.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.J0 = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(m23 m23) {
        j23 j23 = this.C0;
        if (m23 != null) {
            j23.i(true);
        } else {
            j23.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.H0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H0.setState(getDrawableState());
                }
                Drawable drawable4 = this.H0;
                WeakHashMap weakHashMap = eaf.a;
                vm4.b(drawable4, getLayoutDirection());
                this.H0.setVisible(getVisibility() == 0, false);
                this.H0.setCallback(this);
                this.H0.setAlpha(this.I0);
            }
            WeakHashMap weakHashMap2 = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(gq3.b(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        j23 j23 = this.C0;
        if (charSequence == null || !TextUtils.equals(j23.G, charSequence)) {
            j23.G = charSequence;
            j23.H = null;
            Bitmap bitmap = j23.K;
            if (bitmap != null) {
                bitmap.recycle();
                j23.K = null;
            }
            j23.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.R0 = i;
        boolean z = i == 1;
        this.C0.c = z;
        ViewParent parent = getParent();
        if (parent instanceof fm) {
            fm fmVar = (fm) parent;
            if (this.R0 == 1) {
                fmVar.setLiftOnScroll(false);
            }
        }
        if (z && this.G0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        j23 j23 = this.C0;
        j23.F = truncateAt;
        j23.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.E0) {
            this.E0 = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        j23 j23 = this.C0;
        j23.V = timeInterpolator;
        j23.i(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.H0;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.H0.setVisible(z, false);
        }
        Drawable drawable2 = this.G0;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.G0.setVisible(z, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G0 || drawable == this.H0;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams m40generateDefaultLayoutParams() {
        return new k23(-1, -1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.FrameLayout$LayoutParams, k23] */
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.CollapsingToolbarLayout_Layout);
        layoutParams.a = obtainStyledAttributes.getInt(xvb.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        layoutParams.b = obtainStyledAttributes.getFloat(xvb.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams, k23] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.a = 0;
        layoutParams2.b = 0.5f;
        return layoutParams2;
    }
}
