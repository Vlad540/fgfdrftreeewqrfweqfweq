package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;

public class MaterialToolbar extends Toolbar {
    public static final int r1 = kvb.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] s1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer m1;
    public boolean n1;
    public boolean o1;
    public ImageView.ScaleType p1;
    public Boolean q1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.wlb.toolbarStyle
            int r4 = r1
            android.content.Context r8 = defpackage.tw7.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.xvb.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.xvb.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r0)
            r1 = -1
            if (r0 == 0) goto L_0x002c
            int r0 = defpackage.xvb.MaterialToolbar_navigationIconTint
            int r0 = r9.getColor(r0, r1)
            r7.setNavigationIconTint(r0)
        L_0x002c:
            int r0 = defpackage.xvb.MaterialToolbar_titleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.n1 = r0
            int r0 = defpackage.xvb.MaterialToolbar_subtitleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.o1 = r0
            int r0 = defpackage.xvb.MaterialToolbar_logoScaleType
            int r0 = r9.getInt(r0, r1)
            if (r0 < 0) goto L_0x004d
            android.widget.ImageView$ScaleType[] r1 = s1
            int r2 = r1.length
            if (r0 >= r2) goto L_0x004d
            r0 = r1[r0]
            r7.p1 = r0
        L_0x004d:
            int r0 = defpackage.xvb.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x0061
            int r0 = defpackage.xvb.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.getBoolean(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.q1 = r0
        L_0x0061:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 != 0) goto L_0x006f
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            goto L_0x0073
        L_0x006f:
            android.content.res.ColorStateList r9 = defpackage.js.n(r9)
        L_0x0073:
            if (r9 == 0) goto L_0x008c
            lw7 r0 = new lw7
            r0.<init>()
            r0.l(r9)
            r0.j(r8)
            java.util.WeakHashMap r8 = defpackage.eaf.a
            float r8 = defpackage.t9f.i(r7)
            r0.k(r8)
            r7.setBackground(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.p1;
    }

    public Integer getNavigationIconTint() {
        return this.m1;
    }

    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof pl8;
        if (z) {
            ((pl8) menu).w();
        }
        super.m(i);
        if (z) {
            ((pl8) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof lw7) {
            ez3.Z(this, (lw7) background);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.n1 || this.o1) {
            ArrayList t = xy6.t(this, getTitle());
            boolean isEmpty = t.isEmpty();
            gu6 gu6 = xy6.e;
            TextView textView = isEmpty ? null : (TextView) Collections.min(t, gu6);
            ArrayList t2 = xy6.t(this, getSubtitle());
            TextView textView2 = t2.isEmpty() ? null : (TextView) Collections.max(t2, gu6);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.n1 && textView != null) {
                    y(textView, pair);
                }
                if (this.o1 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.q1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.p1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
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

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.q1;
        if (bool == null || bool.booleanValue() != z) {
            this.q1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.p1 != scaleType) {
            this.p1 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.m1 == null)) {
            drawable = drawable.mutate();
            um4.g(drawable, this.m1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.m1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.o1 != z) {
            this.o1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.n1 != z) {
            this.n1 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
