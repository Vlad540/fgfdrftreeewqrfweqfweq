package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ViewPager2 extends ViewGroup {
    public Parcelable A0;
    public vbf B0;
    public ubf C0;
    public dpc D0;
    public hg0 E0;
    public c85 F0;
    public sia G0;
    public k6c H0 = null;
    public boolean I0 = false;
    public boolean J0 = true;
    public int K0 = -1;
    public j8e L0;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final hg0 c = new hg0();
    public int o;
    public boolean w0 = false;
    public final mbf x0 = new mbf(0, this);
    public pbf y0;
    public int z0 = -1;

    public ViewPager2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v0, types: [j8e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Object, o6c] */
    public final void a(Context context, AttributeSet attributeSet) {
        ? obj = new Object();
        obj.o = this;
        obj.a = new rbf(obj);
        obj.b = new sbf(obj);
        this.L0 = obj;
        vbf vbf = new vbf(this, context);
        this.B0 = vbf;
        vbf.setId(View.generateViewId());
        this.B0.setDescendantFocusability(131072);
        pbf pbf = new pbf(this);
        this.y0 = pbf;
        this.B0.setLayoutManager(pbf);
        this.B0.setScrollingTouchSlop(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tvb.ViewPager2);
        int[] iArr = tvb.ViewPager2;
        WeakHashMap weakHashMap = eaf.a;
        z9f.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(tvb.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.B0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.B0.k(new Object());
            dpc dpc = new dpc(this);
            this.D0 = dpc;
            this.F0 = new c85(this, dpc, this.B0);
            ubf ubf = new ubf(this);
            this.C0 = ubf;
            ubf.a(this.B0);
            this.B0.m(this.D0);
            hg0 hg0 = new hg0();
            this.E0 = hg0;
            this.D0.a = hg0;
            nbf nbf = new nbf(this, 0);
            nbf nbf2 = new nbf(this, 1);
            ((ArrayList) hg0.b).add(nbf);
            ((ArrayList) this.E0.b).add(nbf2);
            this.L0.z(this.B0);
            hg0 hg02 = this.E0;
            ((ArrayList) hg02.b).add(this.c);
            sia sia = new sia(this.y0);
            this.G0 = sia;
            ((ArrayList) this.E0.b).add(sia);
            vbf vbf2 = this.B0;
            attachViewToParent(vbf2, 0, vbf2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(qbf qbf) {
        ((ArrayList) this.c.b).add(qbf);
    }

    public final void c() {
        if (this.G0.b != null) {
            dpc dpc = this.D0;
            dpc.g();
            cpc cpc = dpc.g;
            double d = ((double) cpc.b) + ((double) cpc.a);
            int i = (int) d;
            float f = (float) (d - ((double) i));
            this.G0.b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.B0.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.B0.canScrollVertically(i);
    }

    public final void d() {
        f6c adapter;
        if (this.z0 != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.A0;
            if (parcelable != null) {
                if (adapter instanceof lrd) {
                    ((lrd) adapter).c(parcelable);
                }
                this.A0 = null;
            }
            int max = Math.max(0, Math.min(this.z0, adapter.j() - 1));
            this.o = max;
            this.z0 = -1;
            this.B0.x0(max);
            this.L0.I();
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof wbf) {
            int i = ((wbf) parcelable).a;
            sparseArray.put(this.B0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        if (!this.F0.b.m) {
            f(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void f(int i, boolean z) {
        f6c adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.z0 != -1) {
                this.z0 = Math.max(i, 0);
            }
        } else if (adapter.j() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.j() - 1);
            int i2 = this.o;
            if (min != i2 || this.D0.f != 0) {
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.o = min;
                    this.L0.I();
                    dpc dpc = this.D0;
                    if (dpc.f != 0) {
                        dpc.g();
                        cpc cpc = dpc.g;
                        d = ((double) cpc.b) + ((double) cpc.a);
                    }
                    dpc dpc2 = this.D0;
                    dpc2.getClass();
                    dpc2.e = z ? 2 : 3;
                    dpc2.m = false;
                    if (dpc2.i != min) {
                        z2 = true;
                    }
                    dpc2.i = min;
                    dpc2.d(2);
                    if (z2) {
                        dpc2.c(min);
                    }
                    if (!z) {
                        this.B0.x0(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.B0.x0(d2 > d ? min - 3 : min + 3);
                        vbf vbf = this.B0;
                        vbf.post(new ui0(vbf, min));
                        return;
                    }
                    this.B0.B0(min);
                }
            }
        }
    }

    public final void g(qbf qbf) {
        ((ArrayList) this.c.b).remove(qbf);
    }

    public CharSequence getAccessibilityClassName() {
        this.L0.getClass();
        this.L0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public f6c getAdapter() {
        return this.B0.getAdapter();
    }

    public int getCurrentItem() {
        return this.o;
    }

    public int getItemDecorationCount() {
        return this.B0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.K0;
    }

    public int getOrientation() {
        return this.y0.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        vbf vbf = this.B0;
        if (getOrientation() == 0) {
            height = vbf.getWidth() - vbf.getPaddingLeft();
            paddingBottom = vbf.getPaddingRight();
        } else {
            height = vbf.getHeight() - vbf.getPaddingTop();
            paddingBottom = vbf.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.D0.f;
    }

    public final void h() {
        ubf ubf = this.C0;
        if (ubf != null) {
            View i = ubf.i(this.y0);
            if (i != null) {
                this.y0.getClass();
                int M = a.M(i);
                if (M != this.o && getScrollState() == 0) {
                    this.E0.c(M);
                }
                this.w0 = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int j;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.L0.o;
        if (viewPager2.getAdapter() == null) {
            i2 = 0;
            i = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i2 = viewPager2.getAdapter().j();
            i = 1;
        } else {
            i = viewPager2.getAdapter().j();
            i2 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(i2, i, 0).b);
        f6c adapter = viewPager2.getAdapter();
        if (adapter != null && (j = adapter.j()) != 0 && viewPager2.J0) {
            if (viewPager2.o > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.o < j - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.B0.getMeasuredWidth();
        int measuredHeight = this.B0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.B0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.w0) {
            h();
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChild(this.B0, i, i2);
        int measuredWidth = this.B0.getMeasuredWidth();
        int measuredHeight = this.B0.getMeasuredHeight();
        int measuredState = this.B0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wbf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wbf wbf = (wbf) parcelable;
        super.onRestoreInstanceState(wbf.getSuperState());
        this.z0 = wbf.b;
        this.A0 = wbf.c;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, wbf] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = this.B0.getId();
        int i = this.z0;
        if (i == -1) {
            i = this.o;
        }
        baseSavedState.b = i;
        Parcelable parcelable = this.A0;
        if (parcelable != null) {
            baseSavedState.c = parcelable;
        } else {
            f6c adapter = this.B0.getAdapter();
            if (adapter instanceof lrd) {
                baseSavedState.c = ((lrd) adapter).a();
            }
        }
        return baseSavedState;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.L0.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        j8e j8e = this.L0;
        j8e.getClass();
        if (i == 8192 || i == 4096) {
            ViewPager2 viewPager2 = (ViewPager2) j8e.o;
            int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
            if (viewPager2.J0) {
                viewPager2.f(currentItem, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(f6c f6c) {
        f6c adapter = this.B0.getAdapter();
        j8e j8e = this.L0;
        if (adapter != null) {
            adapter.B((mbf) j8e.c);
        } else {
            j8e.getClass();
        }
        mbf mbf = this.x0;
        if (adapter != null) {
            adapter.B(mbf);
        }
        this.B0.setAdapter(f6c);
        this.o = 0;
        d();
        j8e j8e2 = this.L0;
        j8e2.I();
        if (f6c != null) {
            f6c.z((mbf) j8e2.c);
        }
        if (f6c != null) {
            f6c.z(mbf);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.L0.I();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.K0 = i;
            this.B0.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.y0.o1(i);
        this.L0.I();
    }

    public void setPageTransformer(tbf tbf) {
        if (tbf != null) {
            if (!this.I0) {
                this.H0 = this.B0.getItemAnimator();
                this.I0 = true;
            }
            this.B0.setItemAnimator((k6c) null);
        } else if (this.I0) {
            this.B0.setItemAnimator(this.H0);
            this.H0 = null;
            this.I0 = false;
        }
        sia sia = this.G0;
        if (tbf != sia.b) {
            sia.b = tbf;
            c();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.J0 = z;
        this.L0.I();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }
}
