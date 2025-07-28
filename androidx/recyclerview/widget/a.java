package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class a {
    public ope a;
    public RecyclerView b;
    public final f2b c;
    public final f2b d;
    public hd7 e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public final boolean i = true;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public a() {
        e3 e3Var = new e3(this);
        x3a x3a = new x3a(22, (Object) this);
        this.c = new f2b(e3Var);
        this.d = new f2b(x3a);
    }

    public static int B(View view) {
        return view.getLeft() - ((n6c) view.getLayoutParams()).b.left;
    }

    public static int C(View view) {
        Rect rect = ((n6c) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int D(View view) {
        Rect rect = ((n6c) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int E(View view) {
        return view.getRight() + ((n6c) view.getLayoutParams()).b.right;
    }

    public static int F(View view) {
        return view.getTop() - ((n6c) view.getLayoutParams()).b.top;
    }

    public static int M(View view) {
        return ((n6c) view.getLayoutParams()).a.i();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m6c] */
    public static m6c N(Context context, AttributeSet attributeSet, int i2, int i3) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, svb.RecyclerView, i2, i3);
        obj.a = obtainStyledAttributes.getInt(svb.RecyclerView_android_orientation, 1);
        obj.b = obtainStyledAttributes.getInt(svb.RecyclerView_spanCount, 1);
        obj.c = obtainStyledAttributes.getBoolean(svb.RecyclerView_reverseLayout, false);
        obj.d = obtainStyledAttributes.getBoolean(svb.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean R(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public static int h(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r6 == 1073741824) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int x(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x001d
            if (r8 < 0) goto L_0x0012
        L_0x0010:
            r6 = r3
            goto L_0x0030
        L_0x0012:
            if (r8 != r1) goto L_0x001a
            if (r6 == r2) goto L_0x0022
            if (r6 == 0) goto L_0x001a
            if (r6 == r3) goto L_0x0022
        L_0x001a:
            r6 = r7
            r8 = r6
            goto L_0x0030
        L_0x001d:
            if (r8 < 0) goto L_0x0020
            goto L_0x0010
        L_0x0020:
            if (r8 != r1) goto L_0x0024
        L_0x0022:
            r8 = r5
            goto L_0x0030
        L_0x0024:
            if (r8 != r0) goto L_0x001a
            if (r6 == r2) goto L_0x002e
            if (r6 != r3) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            r8 = r5
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r8 = r5
            r6 = r2
        L_0x0030:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.x(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        return view.getBottom() + ((n6c) view.getLayoutParams()).b.bottom;
    }

    public void A(Rect rect, View view) {
        RecyclerView.V(rect, view);
    }

    public final void A0(RecyclerView recyclerView) {
        B0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void B0(int i2, int i3) {
        this.n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.l = mode;
        if (mode == 0 && !RecyclerView.T1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.T1) {
            this.o = 0;
        }
    }

    public void C0(Rect rect, int i2, int i3) {
        int K = K() + J() + rect.width();
        int I = I() + L() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = eaf.a;
        this.b.setMeasuredDimension(h(i2, K, recyclerView.getMinimumWidth()), h(i3, I, this.b.getMinimumHeight()));
    }

    public final void D0(int i2, int i3) {
        int w = w();
        if (w == 0) {
            this.b.t(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < w; i8++) {
            View v = v(i8);
            Rect rect = this.b.B0;
            A(rect, v);
            int i9 = rect.left;
            if (i9 < i7) {
                i7 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i5) {
                i5 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i6) {
                i6 = i12;
            }
        }
        this.b.B0.set(i7, i5, i4, i6);
        C0(this.b.B0, i2, i3);
    }

    public final void E0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.x0;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    /* access modifiers changed from: package-private */
    public final boolean F0(View view, int i2, int i3, n6c n6c) {
        return view.isLayoutRequested() || !this.h || !R(view.getWidth(), i2, n6c.width) || !R(view.getHeight(), i3, n6c.height);
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        f6c adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.j();
        }
        return 0;
    }

    public boolean G0() {
        return false;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = eaf.a;
        return recyclerView.getLayoutDirection();
    }

    public final boolean H0(View view, int i2, int i3, n6c n6c) {
        return !this.h || !R(view.getMeasuredWidth(), i2, n6c.width) || !R(view.getMeasuredHeight(), i3, n6c.height);
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void I0(RecyclerView recyclerView, int i2);

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void J0(hd7 hd7) {
        hd7 hd72 = this.e;
        if (!(hd72 == null || hd7 == hd72 || !hd72.e)) {
            hd72.k();
        }
        this.e = hd7;
        RecyclerView recyclerView = this.b;
        a7c a7c = recyclerView.t1;
        a7c.Z.removeCallbacks(a7c);
        a7c.c.abortAnimation();
        hd7.b = recyclerView;
        hd7.c = this;
        int i2 = hd7.a;
        if (i2 != -1) {
            recyclerView.w1.a = i2;
            hd7.e = true;
            hd7.d = true;
            hd7.f = recyclerView.F0.r(i2);
            hd7.b.t1.b();
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int K() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean K0() {
        return false;
    }

    public final int L() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int O(t6c t6c, x6c x6c) {
        return -1;
    }

    public final void P(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((n6c) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.b.D0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean Q();

    public void S(View view, int i2, int i3, int i4, int i5) {
        n6c n6c = (n6c) view.getLayoutParams();
        Rect rect = n6c.b;
        view.layout(i2 + rect.left + n6c.leftMargin, i3 + rect.top + n6c.topMargin, (i4 - rect.right) - n6c.rightMargin, (i5 - rect.bottom) - n6c.bottomMargin);
    }

    public void T(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int z = recyclerView.x0.z();
            for (int i3 = 0; i3 < z; i3++) {
                recyclerView.x0.y(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void U(int i2) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.c0(i2);
        }
    }

    public void V() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public abstract void X(RecyclerView recyclerView);

    public View Y(View view, int i2, t6c t6c, x6c x6c) {
        return null;
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        t6c t6c = recyclerView.c;
        x6c x6c = recyclerView.w1;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            f6c f6c = this.b.E0;
            if (f6c != null) {
                accessibilityEvent.setItemCount(f6c.j());
            }
        }
    }

    public void a0(t6c t6c, x6c x6c, l4 l4Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            l4Var.a(8192);
            l4Var.j(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            l4Var.a(4096);
            l4Var.j(true);
        }
        l4Var.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(O(t6c, x6c), y(t6c, x6c), 0).b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r8, android.view.View r9, boolean r10) {
        /*
            r7 = this;
            b7c r0 = androidx.recyclerview.widget.RecyclerView.U(r9)
            r1 = 1
            if (r10 != 0) goto L_0x0016
            boolean r10 = r0.p()
            if (r10 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView r10 = r7.b
            v2b r10 = r10.y0
            r10.q(r0)
            goto L_0x0032
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r10 = r7.b
            v2b r10 = r10.y0
            java.lang.Object r10 = r10.b
            kgd r10 = (defpackage.kgd) r10
            java.lang.Object r2 = r10.get(r0)
            maf r2 = (defpackage.maf) r2
            if (r2 != 0) goto L_0x002d
            maf r2 = defpackage.maf.a()
            r10.put(r0, r2)
        L_0x002d:
            int r10 = r2.a
            r10 = r10 | r1
            r2.a = r10
        L_0x0032:
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            n6c r10 = (defpackage.n6c) r10
            boolean r2 = r0.y()
            r3 = 0
            if (r2 != 0) goto L_0x0124
            boolean r2 = r0.q()
            if (r2 == 0) goto L_0x0047
            goto L_0x0124
        L_0x0047:
            android.view.ViewParent r2 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r4 = r7.b
            if (r2 != r4) goto L_0x0105
            ope r2 = r7.a
            java.lang.Object r4 = r2.o
            u41 r4 = (defpackage.u41) r4
            androidx.recyclerview.widget.RecyclerView r4 = r4.a
            int r4 = r4.indexOfChild(r9)
            r5 = -1
            if (r4 != r5) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x0070
        L_0x0060:
            java.lang.Object r2 = r2.X
            xw2 r2 = (defpackage.xw2) r2
            boolean r6 = r2.S(r4)
            if (r6 == 0) goto L_0x006b
            goto L_0x005e
        L_0x006b:
            int r2 = r2.Q(r4)
            int r4 = r4 - r2
        L_0x0070:
            if (r8 != r5) goto L_0x0078
            ope r8 = r7.a
            int r8 = r8.z()
        L_0x0078:
            if (r4 == r5) goto L_0x00e9
            if (r4 == r8) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r7 = r7.b
            androidx.recyclerview.widget.a r7 = r7.F0
            android.view.View r9 = r7.v(r4)
            if (r9 == 0) goto L_0x00cc
            r7.v(r4)
            ope r2 = r7.a
            r2.t(r4)
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            n6c r2 = (defpackage.n6c) r2
            b7c r4 = androidx.recyclerview.widget.RecyclerView.U(r9)
            boolean r5 = r4.p()
            if (r5 == 0) goto L_0x00bb
            androidx.recyclerview.widget.RecyclerView r5 = r7.b
            v2b r5 = r5.y0
            java.lang.Object r5 = r5.b
            kgd r5 = (defpackage.kgd) r5
            java.lang.Object r6 = r5.get(r4)
            maf r6 = (defpackage.maf) r6
            if (r6 != 0) goto L_0x00b5
            maf r6 = defpackage.maf.a()
            r5.put(r4, r6)
        L_0x00b5:
            int r5 = r6.a
            r1 = r1 | r5
            r6.a = r1
            goto L_0x00c2
        L_0x00bb:
            androidx.recyclerview.widget.RecyclerView r1 = r7.b
            v2b r1 = r1.y0
            r1.q(r4)
        L_0x00c2:
            ope r7 = r7.a
            boolean r1 = r4.p()
            r7.d(r9, r8, r2, r1)
            goto L_0x013f
        L_0x00cc:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Cannot move a child from non-existing index:"
            r9.<init>(r10)
            r9.append(r4)
            androidx.recyclerview.widget.RecyclerView r7 = r7.b
            java.lang.String r7 = r7.toString()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L_0x00e9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r10.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.b
            int r9 = r0.indexOfChild(r9)
            r10.append(r9)
            androidx.recyclerview.widget.RecyclerView r7 = r7.b
            java.lang.String r7 = th2.g(r7, r10)
            r8.<init>(r7)
            throw r8
        L_0x0105:
            ope r2 = r7.a
            r2.a(r8, r9, r3)
            r10.c = r1
            hd7 r7 = r7.e
            if (r7 == 0) goto L_0x013f
            boolean r8 = r7.e
            if (r8 == 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r8 = r7.b
            r8.getClass()
            int r8 = androidx.recyclerview.widget.RecyclerView.S(r9)
            int r1 = r7.a
            if (r8 != r1) goto L_0x013f
            r7.f = r9
            goto L_0x013f
        L_0x0124:
            boolean r1 = r0.q()
            if (r1 == 0) goto L_0x0130
            t6c r1 = r0.C0
            r1.k(r0)
            goto L_0x0136
        L_0x0130:
            int r1 = r0.y0
            r1 = r1 & -33
            r0.y0 = r1
        L_0x0136:
            ope r7 = r7.a
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            r7.d(r9, r8, r1, r3)
        L_0x013f:
            boolean r7 = r10.o
            if (r7 == 0) goto L_0x0153
            boolean r7 = androidx.recyclerview.widget.RecyclerView.Q1
            if (r7 == 0) goto L_0x014c
            b7c r7 = r10.a
            java.util.Objects.toString(r7)
        L_0x014c:
            android.view.View r7 = r0.a
            r7.invalidate()
            r10.o = r3
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.b(int, android.view.View, boolean):void");
    }

    public void b0(t6c t6c, x6c x6c, View view, l4 l4Var) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.n(str);
        }
    }

    public final void c0(View view, l4 l4Var) {
        b7c U = RecyclerView.U(view);
        if (U != null && !U.p() && !((ArrayList) this.a.Y).contains(U.a)) {
            RecyclerView recyclerView = this.b;
            b0(recyclerView.c, recyclerView.w1, view, l4Var);
        }
    }

    public final void d(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public void d0(int i2, int i3) {
    }

    public abstract boolean e();

    public void e0() {
    }

    public abstract boolean f();

    public void f0(int i2, int i3) {
    }

    public boolean g(n6c n6c) {
        return n6c != null;
    }

    public void g0(int i2, int i3) {
    }

    public void h0(int i2) {
    }

    public void i(int i2, int i3, x6c x6c, ry2 ry2) {
    }

    public void i0(RecyclerView recyclerView, int i2, int i3) {
        h0(i2);
    }

    public void j(int i2, ry2 ry2) {
    }

    public abstract void j0(t6c t6c, x6c x6c);

    public abstract int k(x6c x6c);

    public abstract void k0(x6c x6c);

    public abstract int l(x6c x6c);

    public void l0(Parcelable parcelable) {
    }

    public abstract int m(x6c x6c);

    public Parcelable m0() {
        return null;
    }

    public abstract int n(x6c x6c);

    public void n0(int i2) {
    }

    public abstract int o(x6c x6c);

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o0(defpackage.t6c r3, defpackage.x6c r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.b
            r4 = 0
            if (r3 != 0) goto L_0x0006
            return r4
        L_0x0006:
            int r3 = r2.o
            int r6 = r2.n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L_0x002b
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L_0x002b
            int r3 = r0.height()
            int r6 = r0.width()
        L_0x002b:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L_0x0063
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r0) goto L_0x0037
            r3 = r4
            r5 = r3
            goto L_0x008a
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L_0x004c
            int r5 = r2.L()
            int r3 = r3 - r5
            int r5 = r2.I()
            int r3 = r3 - r5
            int r3 = -r3
            goto L_0x004d
        L_0x004c:
            r3 = r4
        L_0x004d:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L_0x0061
            int r5 = r2.J()
            int r6 = r6 - r5
            int r5 = r2.K()
            int r6 = r6 - r5
            int r5 = -r6
            goto L_0x008a
        L_0x0061:
            r5 = r4
            goto L_0x008a
        L_0x0063:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L_0x0076
            int r5 = r2.L()
            int r3 = r3 - r5
            int r5 = r2.I()
            int r3 = r3 - r5
            goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L_0x0061
            int r5 = r2.J()
            int r6 = r6 - r5
            int r5 = r2.K()
            int r5 = r6 - r5
        L_0x008a:
            if (r3 != 0) goto L_0x008f
            if (r5 != 0) goto L_0x008f
            return r4
        L_0x008f:
            androidx.recyclerview.widget.RecyclerView r2 = r2.b
            r2.A0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.o0(t6c, x6c, int, android.os.Bundle):boolean");
    }

    public abstract int p(x6c x6c);

    public void p0() {
        w0();
    }

    public final void q(t6c t6c) {
        for (int w = w() - 1; w >= 0; w--) {
            View v = v(w);
            b7c U = RecyclerView.U(v);
            if (U.w()) {
                if (RecyclerView.Q1) {
                    U.toString();
                }
            } else if (!U.n() || U.p() || this.b.E0.b) {
                v(w);
                this.a.t(w);
                t6c.i(v);
                this.b.y0.q(U);
            } else {
                if (v(w) != null) {
                    this.a.R(w);
                }
                t6c.h(U);
            }
        }
    }

    public final void q0() {
        for (int w = w() - 1; w >= 0; w--) {
            this.a.R(w);
        }
    }

    public View r(int i2) {
        int w = w();
        for (int i3 = 0; i3 < w; i3++) {
            View v = v(i3);
            b7c U = RecyclerView.U(v);
            if (U != null && U.i() == i2 && !U.w() && (this.b.w1.h || !U.p())) {
                return v;
            }
        }
        return null;
    }

    public final void r0(t6c t6c) {
        for (int w = w() - 1; w >= 0; w--) {
            if (!RecyclerView.U(v(w)).w()) {
                u0(w, t6c);
            }
        }
    }

    public abstract n6c s();

    public final void s0(t6c t6c) {
        int size = t6c.a.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view = ((b7c) t6c.a.get(i2)).a;
            b7c U = RecyclerView.U(view);
            if (!U.w()) {
                U.v(false);
                if (U.r()) {
                    this.b.removeDetachedView(view, false);
                }
                k6c k6c = this.b.e1;
                if (k6c != null) {
                    k6c.d(U);
                }
                U.v(true);
                b7c U2 = RecyclerView.U(view);
                U2.C0 = null;
                U2.D0 = false;
                U2.y0 &= -33;
                t6c.h(U2);
            }
        }
        t6c.a.clear();
        ArrayList arrayList = t6c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public n6c t(Context context, AttributeSet attributeSet) {
        return new n6c(context, attributeSet);
    }

    public final void t0(View view, t6c t6c) {
        ope ope = this.a;
        u41 u41 = (u41) ope.o;
        int i2 = ope.b;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i2 != 2) {
            try {
                ope.b = 1;
                ope.c = view;
                int indexOfChild = u41.a.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (((xw2) ope.X).Z(indexOfChild)) {
                        ope.X(view);
                    }
                    u41.a(indexOfChild);
                }
                ope.b = 0;
                ope.c = null;
                t6c.g(view);
            } catch (Throwable th) {
                ope.b = 0;
                ope.c = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public n6c u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n6c ? new n6c((n6c) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n6c((ViewGroup.MarginLayoutParams) layoutParams) : new n6c(layoutParams);
    }

    public final void u0(int i2, t6c t6c) {
        View v = v(i2);
        if (v(i2) != null) {
            this.a.R(i2);
        }
        t6c.g(v);
    }

    public final View v(int i2) {
        ope ope = this.a;
        if (ope != null) {
            return ope.y(i2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.J()
            int r1 = r8.L()
            int r2 = r8.n
            int r3 = r8.K()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.I()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.H()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto L_0x00ae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            int r1 = r8.J()
            int r2 = r8.L()
            int r3 = r8.n
            int r4 = r8.K()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.I()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.B0
            r8.A(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto L_0x00b3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto L_0x00b3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto L_0x00b3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            if (r11 != 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r9.scrollBy(r11, r10)
            goto L_0x00bd
        L_0x00ba:
            r9.A0(r11, r10, r0)
        L_0x00bd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.v0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final int w() {
        ope ope = this.a;
        if (ope != null) {
            return ope.z();
        }
        return 0;
    }

    public final void w0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int x0(int i2, t6c t6c, x6c x6c);

    public int y(t6c t6c, x6c x6c) {
        return -1;
    }

    public abstract void y0(int i2);

    public abstract int z0(int i2, t6c t6c, x6c x6c);
}
