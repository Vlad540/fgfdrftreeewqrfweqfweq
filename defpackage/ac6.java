package defpackage;

import android.content.res.TypedArray;
import android.view.ViewGroup;

/* renamed from: ac6  reason: default package */
public final class ac6 extends ViewGroup.MarginLayoutParams {
    public static final int c = (-2147483647 - Integer.MIN_VALUE);
    public static final int d = lwb.GridLayout_Layout_android_layout_margin;
    public static final int e = lwb.GridLayout_Layout_android_layout_marginLeft;
    public static final int f = lwb.GridLayout_Layout_android_layout_marginTop;
    public static final int g = lwb.GridLayout_Layout_android_layout_marginRight;
    public static final int h = lwb.GridLayout_Layout_android_layout_marginBottom;
    public static final int i = lwb.GridLayout_Layout_layout_column;
    public static final int j = lwb.GridLayout_Layout_layout_columnSpan;
    public static final int k = lwb.GridLayout_Layout_layout_columnWeight;
    public static final int l = lwb.GridLayout_Layout_layout_row;
    public static final int m = lwb.GridLayout_Layout_layout_rowSpan;
    public static final int n = lwb.GridLayout_Layout_layout_rowWeight;
    public static final int o = lwb.GridLayout_Layout_layout_gravity;
    public cc6 a;
    public cc6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac6() {
        super(-2, -2);
        cc6 cc6 = cc6.e;
        this.a = cc6;
        this.b = cc6;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = cc6;
        this.b = cc6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac6.class != obj.getClass()) {
            return false;
        }
        ac6 ac6 = (ac6) obj;
        return this.b.equals(ac6.b) && this.a.equals(ac6.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
        this.width = typedArray.getLayoutDimension(i2, -2);
        this.height = typedArray.getLayoutDimension(i3, -2);
    }
}
