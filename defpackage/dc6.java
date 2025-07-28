package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* renamed from: dc6  reason: default package */
public abstract class dc6 extends ViewGroup {
    public static final LogPrinter A0 = new LogPrinter(3, dc6.class.getName());
    public static final rb6 B0 = new Object();
    public static final int C0 = lwb.GridLayout_orientation;
    public static final int D0 = lwb.GridLayout_rowCount;
    public static final int E0 = lwb.GridLayout_columnCount;
    public static final int F0 = lwb.GridLayout_useDefaultMargins;
    public static final int G0 = lwb.GridLayout_alignmentMode;
    public static final int H0 = lwb.GridLayout_rowOrderPreserved;
    public static final int I0 = lwb.GridLayout_columnOrderPreserved;
    public static final sb6 J0 = new sb6(0);
    public static final sb6 K0;
    public static final sb6 L0;
    public static final sb6 M0;
    public static final sb6 N0;
    public static final tb6 O0;
    public static final tb6 P0;
    public static final sb6 Q0 = new sb6(3);
    public static final sb6 R0 = new sb6(4);
    public static final sb6 S0 = new sb6(5);
    public final xb6 a;
    public final xb6 b;
    public int c = 0;
    public boolean o = false;
    public int w0 = 1;
    public final int x0;
    public int y0 = 0;
    public Printer z0 = A0;

    /* JADX WARNING: type inference failed for: r0v1, types: [rb6, java.lang.Object] */
    static {
        sb6 sb6 = new sb6(1);
        sb6 sb62 = new sb6(2);
        K0 = sb6;
        L0 = sb62;
        M0 = sb6;
        N0 = sb62;
        O0 = new tb6(sb6, sb62);
        P0 = new tb6(sb62, sb6);
    }

    public dc6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ContextMenuGridLayout contextMenuGridLayout = (ContextMenuGridLayout) this;
        this.a = new xb6(contextMenuGridLayout, true);
        this.b = new xb6(contextMenuGridLayout, false);
        this.x0 = context.getResources().getDimensionPixelOffset(smb.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lwb.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(D0, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(E0, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(C0, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(F0, false));
            setAlignmentMode(obtainStyledAttributes.getInt(G0, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(H0, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(I0, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static n1g d(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? J0 : N0 : M0 : S0 : z ? P0 : L0 : z ? O0 : K0 : Q0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(hr1.g(str, ". "));
    }

    public static void k(ac6 ac6, int i, int i2, int i3, int i4) {
        zb6 zb6 = new zb6(i, i2 + i);
        cc6 cc6 = ac6.a;
        ac6.a = new cc6(cc6.a, zb6, cc6.c, cc6.d);
        zb6 zb62 = new zb6(i3, i4 + i3);
        cc6 cc62 = ac6.b;
        ac6.b = new cc6(cc62.a, zb62, cc62.c, cc62.d);
    }

    public static cc6 l(int i, int i2, n1g n1g, float f) {
        return new cc6(i != Integer.MIN_VALUE, new zb6(i, i2 + i), n1g, f);
    }

    public final void a(ac6 ac6, boolean z) {
        String str = z ? "column" : "row";
        zb6 zb6 = (z ? ac6.b : ac6.a).b;
        int i = zb6.a;
        if (i == Integer.MIN_VALUE || i >= 0) {
            int i2 = (z ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                return;
            }
            if (zb6.b > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            } else if (zb6.a() > i2) {
                g(str + " span mustn't exceed the " + str + " count");
                throw null;
            }
        } else {
            g(str.concat(" indices must be positive"));
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((ac6) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    public final void c() {
        int i = this.y0;
        if (i == 0) {
            boolean z = this.c == 0;
            int i2 = (z ? this.a : this.b).b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            int[] iArr = new int[i2];
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                ac6 ac6 = (ac6) getChildAt(i5).getLayoutParams();
                cc6 cc6 = z ? ac6.a : ac6.b;
                zb6 zb6 = cc6.b;
                int a2 = zb6.a();
                boolean z2 = cc6.a;
                if (z2) {
                    i3 = zb6.a;
                }
                cc6 cc62 = z ? ac6.b : ac6.a;
                zb6 zb62 = cc62.b;
                int a3 = zb62.a();
                boolean z3 = cc62.a;
                int i6 = zb62.a;
                if (i2 != 0) {
                    a3 = Math.min(a3, i2 - (z3 ? Math.min(i6, i2) : 0));
                }
                if (z3) {
                    i4 = i6;
                }
                if (i2 != 0) {
                    if (!z2 || !z3) {
                        while (true) {
                            int i7 = i4 + a3;
                            if (i7 <= i2) {
                                int i8 = i4;
                                while (i8 < i7) {
                                    if (iArr[i8] <= i3) {
                                        i8++;
                                    }
                                }
                                break;
                            }
                            if (z3) {
                                i3++;
                            } else if (i7 <= i2) {
                                i4++;
                            } else {
                                i3++;
                                i4 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + a3, i2), i3 + a2);
                }
                if (z) {
                    k(ac6, i3, a2, i4, a3);
                } else {
                    k(ac6, i4, a3, i3, a2);
                }
                i4 += a3;
            }
            this.y0 = b();
        } else if (i != b()) {
            this.z0.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            h();
            c();
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ac6)) {
            return false;
        }
        ac6 ac6 = (ac6) layoutParams;
        a(ac6, true);
        a(ac6, false);
        return true;
    }

    public final int e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.w0 == 1) {
            return f(view, z, z2);
        }
        xb6 xb6 = z ? this.a : this.b;
        if (z2) {
            if (xb6.j == null) {
                xb6.j = new int[(xb6.f() + 1)];
            }
            if (!xb6.k) {
                xb6.c(true);
                xb6.k = true;
            }
            iArr = xb6.j;
        } else {
            if (xb6.l == null) {
                xb6.l = new int[(xb6.f() + 1)];
            }
            if (!xb6.m) {
                xb6.c(false);
                xb6.m = true;
            }
            iArr = xb6.l;
        }
        ac6 ac6 = (ac6) view.getLayoutParams();
        zb6 zb6 = (z ? ac6.b : ac6.a).b;
        return iArr[z2 ? zb6.a : zb6.b];
    }

    public final int f(View view, boolean z, boolean z2) {
        ac6 ac6 = (ac6) view.getLayoutParams();
        int i = z ? z2 ? ac6.leftMargin : ac6.rightMargin : z2 ? ac6.topMargin : ac6.bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int i2 = 0;
        if (this.o) {
            cc6 cc6 = z ? ac6.b : ac6.a;
            xb6 xb6 = z ? this.a : this.b;
            zb6 zb6 = cc6.b;
            if (z) {
                WeakHashMap weakHashMap = eaf.a;
                if (getLayoutDirection() == 1) {
                    z2 = !z2;
                }
            }
            if (z2) {
                int i3 = zb6.a;
            } else {
                int i4 = zb6.b;
                xb6.f();
            }
            if (!(view.getClass() == vld.class || view.getClass() == Space.class)) {
                i2 = this.x0 / 2;
            }
        }
        return i2;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ac6();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v0, types: [ac6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        cc6 cc6 = cc6.e;
        marginLayoutParams.a = cc6;
        marginLayoutParams.b = cc6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lwb.GridLayout_Layout);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ac6.d, Integer.MIN_VALUE);
            marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(ac6.e, dimensionPixelSize);
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(ac6.f, dimensionPixelSize);
            marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(ac6.g, dimensionPixelSize);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(ac6.h, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lwb.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes2.getInt(ac6.o, 0);
                int i2 = obtainStyledAttributes2.getInt(ac6.i, Integer.MIN_VALUE);
                int i3 = ac6.j;
                int i4 = ac6.c;
                marginLayoutParams.b = l(i2, obtainStyledAttributes2.getInt(i3, i4), d(i, true), obtainStyledAttributes2.getFloat(ac6.k, 0.0f));
                marginLayoutParams.a = l(obtainStyledAttributes2.getInt(ac6.l, Integer.MIN_VALUE), obtainStyledAttributes2.getInt(ac6.m, i4), d(i, false), obtainStyledAttributes2.getFloat(ac6.n, 0.0f));
                return marginLayoutParams;
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getAlignmentMode() {
        return this.w0;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.z0;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.o;
    }

    public final void h() {
        this.y0 = 0;
        xb6 xb6 = this.a;
        if (xb6 != null) {
            xb6.l();
        }
        xb6 xb62 = this.b;
        if (xb62 != null) {
            xb62.l();
        }
        if (xb6 != null && xb62 != null) {
            xb6.m();
            xb62.m();
        }
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public final void j(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ac6 ac6 = (ac6) childAt.getLayoutParams();
                if (z) {
                    i(childAt, i, i2, ac6.width, ac6.height);
                } else {
                    boolean z2 = this.c == 0;
                    cc6 cc6 = z2 ? ac6.b : ac6.a;
                    if (cc6.a(z2) == S0) {
                        int[] h = (z2 ? this.a : this.b).h();
                        zb6 zb6 = cc6.b;
                        int e = (h[zb6.b] - h[zb6.a]) - (e(childAt, z2, false) + e(childAt, z2, true));
                        if (z2) {
                            i(childAt, i, i2, e, ac6.height);
                        } else {
                            i(childAt, i, i2, ac6.width, e);
                        }
                    }
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xb6 xb6;
        xb6 xb62;
        int i5;
        boolean z2;
        int i6;
        View view;
        dc6 dc6 = this;
        c();
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i8 = (i7 - paddingLeft) - paddingRight;
        xb6 xb63 = dc6.a;
        xb63.v.a = i8;
        xb63.w.a = -i8;
        boolean z3 = false;
        xb63.q = false;
        xb63.h();
        int i9 = ((i4 - i2) - paddingTop) - paddingBottom;
        xb6 xb64 = dc6.b;
        xb64.v.a = i9;
        xb64.w.a = -i9;
        xb64.q = false;
        xb64.h();
        int[] h = xb63.h();
        int[] h2 = xb64.h();
        int i10 = 0;
        for (int childCount = getChildCount(); i10 < childCount; childCount = i6) {
            View childAt = dc6.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i5 = i10;
                i6 = childCount;
                xb6 = xb63;
                z2 = z3;
                xb62 = xb64;
            } else {
                ac6 ac6 = (ac6) childAt.getLayoutParams();
                cc6 cc6 = ac6.b;
                cc6 cc62 = ac6.a;
                zb6 zb6 = cc6.b;
                zb6 zb62 = cc62.b;
                int i11 = h[zb6.a];
                int i12 = childCount;
                int i13 = h2[zb62.a];
                int i14 = h[zb6.b] - i11;
                int i15 = h2[zb62.b] - i13;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                n1g a2 = cc6.a(true);
                n1g a3 = cc62.a(false);
                w4g g = xb63.g();
                xb6 = xb63;
                yb6 yb6 = (yb6) ((Object[]) g.o)[((int[]) g.b)[i10]];
                w4g g2 = xb64.g();
                xb62 = xb64;
                yb6 yb62 = (yb6) ((Object[]) g2.o)[((int[]) g2.b)[i10]];
                int r = a2.r(childAt, i14 - yb6.d(true));
                int r2 = a3.r(childAt, i15 - yb62.d(true));
                int e = dc6.e(childAt, true, true);
                int e2 = dc6.e(childAt, false, true);
                int e3 = dc6.e(childAt, true, false);
                int i16 = e + e3;
                int e4 = e2 + dc6.e(childAt, false, false);
                n1g n1g = a3;
                yb6 yb63 = yb6;
                n1g n1g2 = a2;
                int i17 = measuredHeight;
                n1g n1g3 = n1g2;
                View view2 = childAt;
                i5 = i10;
                z2 = false;
                i6 = i12;
                int i18 = measuredWidth;
                int a4 = yb63.a(this, childAt, n1g3, measuredWidth + i16, true);
                int i19 = i17;
                n1g n1g4 = n1g;
                int a5 = yb62.a(this, view2, n1g4, i19 + e4, false);
                int u = n1g3.u(i18, i14 - i16);
                int u2 = n1g4.u(i19, i15 - e4);
                int i20 = i11 + r + a4;
                WeakHashMap weakHashMap = eaf.a;
                int i21 = getLayoutDirection() == 1 ? (((i7 - u) - paddingRight) - e3) - i20 : paddingLeft + e + i20;
                int i22 = paddingTop + i13 + r2 + a5 + e2;
                if (u == view2.getMeasuredWidth() && u2 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(u, 1073741824), View.MeasureSpec.makeMeasureSpec(u2, 1073741824));
                }
                view.layout(i21, i22, u + i21, u2 + i22);
            }
            i10 = i5 + 1;
            dc6 = this;
            xb63 = xb6;
            xb64 = xb62;
            z3 = z2;
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        c();
        xb6 xb6 = this.b;
        xb6 xb62 = this.a;
        if (!(xb62 == null || xb6 == null)) {
            xb62.m();
            xb6.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.c == 0) {
            i3 = xb62.j(makeMeasureSpec);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i4 = xb6.j(makeMeasureSpec2);
        } else {
            i4 = xb6.j(makeMeasureSpec2);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            i3 = xb62.j(makeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i) {
        this.w0 = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.a.o(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        xb6 xb6 = this.a;
        xb6.u = z;
        xb6.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = B0;
        }
        this.z0 = printer;
    }

    public void setRowCount(int i) {
        this.b.o(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        xb6 xb6 = this.b;
        xb6.u = z;
        xb6.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.o = z;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ac6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v4, types: [ac6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r1v5, types: [ac6, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ac6) {
            ac6 ac6 = (ac6) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(ac6);
            cc6 cc6 = cc6.e;
            marginLayoutParams.a = cc6;
            marginLayoutParams.b = cc6;
            marginLayoutParams.a = ac6.a;
            marginLayoutParams.b = ac6.b;
            return marginLayoutParams;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            cc6 cc62 = cc6.e;
            marginLayoutParams2.a = cc62;
            marginLayoutParams2.b = cc62;
            return marginLayoutParams2;
        } else {
            ? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
            cc6 cc63 = cc6.e;
            marginLayoutParams3.a = cc63;
            marginLayoutParams3.b = cc63;
            return marginLayoutParams3;
        }
    }
}
