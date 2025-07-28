package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.List;

public class ChipGroup extends um5 {
    public static final int C0 = kvb.Widget_MaterialComponents_ChipGroup;
    public final int A0;
    public final ix2 B0;
    public int w0;
    public int x0;
    public hx2 y0;
    public final lga z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r3 = defpackage.wlb.chipGroupStyle
            int r4 = C0
            android.content.Context r9 = defpackage.tw7.a(r9, r10, r3, r4)
            r8.<init>(r9, r10, r3)
            r6 = 0
            r8.c = r6
            android.content.res.Resources$Theme r9 = r9.getTheme()
            int[] r0 = defpackage.xvb.FlowLayout
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0, r6, r6)
            int r0 = defpackage.xvb.FlowLayout_lineSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.a = r0
            int r0 = defpackage.xvb.FlowLayout_itemSpacing
            int r0 = r9.getDimensionPixelSize(r0, r6)
            r8.b = r0
            r9.recycle()
            lga r9 = new lga
            r9.<init>()
            r8.z0 = r9
            ix2 r7 = new ix2
            r7.<init>(r8)
            r8.B0 = r7
            android.content.Context r0 = r8.getContext()
            int[] r2 = defpackage.xvb.ChipGroup
            int[] r5 = new int[r6]
            r1 = r10
            android.content.res.TypedArray r10 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.xvb.ChipGroup_chipSpacing
            int r0 = r10.getDimensionPixelOffset(r0, r6)
            int r1 = defpackage.xvb.ChipGroup_chipSpacingHorizontal
            int r1 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingHorizontal(r1)
            int r1 = defpackage.xvb.ChipGroup_chipSpacingVertical
            int r0 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingVertical(r0)
            int r0 = defpackage.xvb.ChipGroup_singleLine
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleLine((boolean) r0)
            int r0 = defpackage.xvb.ChipGroup_singleSelection
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSingleSelection((boolean) r0)
            int r0 = defpackage.xvb.ChipGroup_selectionRequired
            boolean r0 = r10.getBoolean(r0, r6)
            r8.setSelectionRequired(r0)
            int r0 = defpackage.xvb.ChipGroup_checkedChip
            r1 = -1
            int r0 = r10.getResourceId(r0, r1)
            r8.A0 = r0
            r10.recycle()
            mod r10 = new mod
            r0 = 9
            r10.<init>(r0, r8)
            r9.X = r10
            super.setOnHierarchyChangeListener(r7)
            java.util.WeakHashMap r9 = defpackage.eaf.a
            r9 = 1
            r8.setImportantForAccessibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof fx2);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.z0.l();
    }

    public List<Integer> getCheckedChipIds() {
        return this.z0.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.w0;
    }

    public int getChipSpacingVertical() {
        return this.x0;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A0;
        if (i != -1) {
            lga lga = this.z0;
            iw7 iw7 = (iw7) ((HashMap) lga.c).get(Integer.valueOf(i));
            if (iw7 != null && lga.f(iw7)) {
                lga.m();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(getRowCount(), this.c ? getVisibleChipCount() : -1, this.z0.a ? 1 : 2).b);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(gx2 gx2) {
        if (gx2 == null) {
            setOnCheckedStateChangeListener((hx2) null);
        } else {
            setOnCheckedStateChangeListener(new b2b((Object) this, 11, (Object) gx2));
        }
    }

    public void setOnCheckedStateChangeListener(hx2 hx2) {
        this.y0 = hx2;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.B0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.z0.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        lga lga = this.z0;
        if (lga.a != z) {
            lga.a = z;
            lga.g();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
