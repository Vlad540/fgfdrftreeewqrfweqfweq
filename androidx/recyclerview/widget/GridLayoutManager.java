package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public gc6 K = new gc6();
    public final Rect L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A1(a.N(context, attributeSet, i, i2).b);
    }

    public final void A1(int i) {
        if (i != this.F) {
            this.E = true;
            if (i >= 1) {
                this.F = i;
                this.K.d();
                w0();
                return;
            }
            throw new IllegalArgumentException(wn6.h(i, "Span count should be at least 1. Provided "));
        }
    }

    public final void B1() {
        int I2;
        int L2;
        if (this.p == 1) {
            I2 = this.n - K();
            L2 = J();
        } else {
            I2 = this.o - I();
            L2 = L();
        }
        t1(I2 - L2);
    }

    public final void C0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.G == null) {
            super.C0(rect, i, i2);
        }
        int K2 = K() + J();
        int I2 = I() + L();
        if (this.p == 1) {
            int height = rect.height() + I2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = eaf.a;
            i4 = a.h(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            i3 = a.h(i, iArr[iArr.length - 1] + K2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + K2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = eaf.a;
            i3 = a.h(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            i4 = a.h(i2, iArr2[iArr2.length - 1] + I2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    public final boolean K0() {
        return this.z == null && !this.E;
    }

    public final void M0(x6c x6c, dd7 dd7, ry2 ry2) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F && (r3 = dd7.d) >= 0 && r3 < x6c.b() && i > 0; i2++) {
            int i3 = dd7.d;
            ry2.b(i3, Math.max(0, dd7.g));
            i -= this.K.c(i3);
            dd7.d += dd7.e;
        }
    }

    public final int O(t6c t6c, x6c x6c) {
        if (this.p == 0) {
            return this.F;
        }
        if (x6c.b() < 1) {
            return 0;
        }
        return w1(x6c.b() - 1, t6c, x6c) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == (r2 > r15)) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r13 == (r2 > r8 ? r9 : false)) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.a.H(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r23, int r24, defpackage.t6c r25, defpackage.x6c r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0021
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.I(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            ope r6 = r0.a
            boolean r6 = r6.H(r3)
            if (r6 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            fc6 r6 = (defpackage.fc6) r6
            int r7 = r6.X
            int r6 = r6.Y
            int r6 = r6 + r7
            android.view.View r5 = super.Y(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r5 = r24
            int r5 = r0.Q0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0041
            r5 = r9
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            boolean r10 = r0.u
            r11 = -1
            if (r5 == r10) goto L_0x004f
            int r5 = r22.w()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L_0x0056
        L_0x004f:
            int r5 = r22.w()
            r10 = r5
            r12 = r9
            r5 = 0
        L_0x0056:
            int r13 = r0.p
            if (r13 != r9) goto L_0x0062
            boolean r13 = r22.g1()
            if (r13 == 0) goto L_0x0062
            r13 = r9
            goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            int r14 = r0.w1(r5, r1, r2)
            r8 = r11
            r15 = r8
            r16 = r12
            r9 = 0
            r12 = 0
            r11 = r5
            r5 = r4
        L_0x006f:
            if (r11 == r10) goto L_0x007d
            r17 = r10
            int r10 = r0.w1(r11, r1, r2)
            android.view.View r1 = r0.v(r11)
            if (r1 != r3) goto L_0x0081
        L_0x007d:
            r21 = r5
            goto L_0x0145
        L_0x0081:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0095
            if (r10 == r14) goto L_0x0095
            if (r4 == 0) goto L_0x008c
            goto L_0x007d
        L_0x008c:
            r18 = r3
            r21 = r5
        L_0x0090:
            r19 = r9
            r9 = 1
            goto L_0x0135
        L_0x0095:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            fc6 r10 = (defpackage.fc6) r10
            int r2 = r10.X
            r18 = r3
            int r3 = r10.Y
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ad
            if (r2 != r7) goto L_0x00ad
            if (r3 != r6) goto L_0x00ad
            return r1
        L_0x00ad:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b5
            if (r4 == 0) goto L_0x00bd
        L_0x00b5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00bd:
            r21 = r5
        L_0x00bf:
            r19 = r9
            r9 = 1
            goto L_0x010d
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e2
            if (r5 <= r9) goto L_0x00d8
        L_0x00d7:
            goto L_0x00bf
        L_0x00d8:
            if (r5 != r9) goto L_0x0090
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0090
            goto L_0x00d7
        L_0x00e2:
            if (r4 != 0) goto L_0x0090
            r19 = r9
            f2b r9 = r0.c
            boolean r9 = r9.i(r1)
            if (r9 == 0) goto L_0x00fa
            f2b r9 = r0.d
            boolean r9 = r9.i(r1)
            if (r9 == 0) goto L_0x00fa
            r9 = 1
            r20 = 1
            goto L_0x00fd
        L_0x00fa:
            r9 = 1
            r20 = 0
        L_0x00fd:
            r20 = r20 ^ 1
            if (r20 == 0) goto L_0x0135
            if (r5 <= r12) goto L_0x0104
            goto L_0x010d
        L_0x0104:
            if (r5 != r12) goto L_0x0135
            if (r2 <= r8) goto L_0x010a
            r5 = r9
            goto L_0x010b
        L_0x010a:
            r5 = 0
        L_0x010b:
            if (r13 != r5) goto L_0x0135
        L_0x010d:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0126
            int r4 = r10.X
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r19 = r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0137
        L_0x0126:
            int r5 = r10.X
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r8 = r5
            r5 = r1
            goto L_0x0137
        L_0x0135:
            r5 = r21
        L_0x0137:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            r9 = r19
            goto L_0x006f
        L_0x0145:
            if (r4 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r4 = r21
        L_0x014a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, t6c, x6c):android.view.View");
    }

    public final void a0(t6c t6c, x6c x6c, l4 l4Var) {
        super.a0(t6c, x6c, l4Var);
        l4Var.h(GridView.class.getName());
    }

    public final void b0(t6c t6c, x6c x6c, View view, l4 l4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof fc6)) {
            c0(view, l4Var);
            return;
        }
        fc6 fc6 = (fc6) layoutParams;
        int w1 = w1(fc6.a.i(), t6c, x6c);
        if (this.p == 0) {
            l4Var.i(k4.a(false, fc6.X, fc6.Y, w1, 1));
        } else {
            l4Var.i(k4.a(false, w1, 1, fc6.X, fc6.Y));
        }
    }

    public final View b1(t6c t6c, x6c x6c, boolean z, boolean z2) {
        int i;
        int i2;
        int w = w();
        int i3 = 1;
        if (z2) {
            i2 = w() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = w;
            i2 = 0;
        }
        int b = x6c.b();
        R0();
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View v = v(i2);
            int M = a.M(v);
            if (M >= 0 && M < b && x1(M, t6c, x6c) == 0) {
                if (((n6c) v.getLayoutParams()).a.p()) {
                    if (view2 == null) {
                        view2 = v;
                    }
                } else if (this.r.f(v) < h && this.r.c(v) >= m) {
                    return v;
                } else {
                    if (view == null) {
                        view = v;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    public final void d0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void e0() {
        this.K.d();
        this.K.b.clear();
    }

    public final void f0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public boolean g(n6c n6c) {
        return n6c instanceof fc6;
    }

    public final void g0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void h1(t6c t6c, x6c x6c, dd7 dd7, cd7 cd7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        View b;
        t6c t6c2 = t6c;
        x6c x6c2 = x6c;
        dd7 dd72 = dd7;
        cd7 cd72 = cd7;
        int k = this.r.k();
        boolean z2 = k != 1073741824;
        int i14 = w() > 0 ? this.G[this.F] : 0;
        if (z2) {
            B1();
        }
        boolean z3 = dd72.e == 1;
        int i15 = this.F;
        if (!z3) {
            i15 = x1(dd72.d, t6c2, x6c2) + y1(dd72.d, t6c2, x6c2);
        }
        int i16 = 0;
        while (i16 < this.F && (r14 = dd72.d) >= 0 && r14 < x6c.b() && i15 > 0) {
            int i17 = dd72.d;
            int y1 = y1(i17, t6c2, x6c2);
            if (y1 <= this.F) {
                i15 -= y1;
                if (i15 < 0 || (b = dd72.b(t6c2)) == null) {
                    break;
                }
                this.H[i16] = b;
                i16++;
            } else {
                throw new IllegalArgumentException(wn6.j(rf0.i("Item at position ", i17, " requires ", y1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
        }
        if (i16 == 0) {
            cd72.b = true;
            return;
        }
        if (z3) {
            i = 1;
            i2 = i16;
            i3 = 0;
        } else {
            i3 = i16 - 1;
            i2 = -1;
            i = -1;
        }
        int i18 = 0;
        while (i3 != i2) {
            View view = this.H[i3];
            fc6 fc6 = (fc6) view.getLayoutParams();
            int y12 = y1(a.M(view), t6c2, x6c2);
            fc6.Y = y12;
            fc6.X = i18;
            i18 += y12;
            i3 += i;
        }
        float f = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i16; i20++) {
            View view2 = this.H[i20];
            if (dd72.k != null) {
                z = false;
                if (z3) {
                    b(-1, view2, true);
                } else {
                    b(0, view2, true);
                }
            } else if (z3) {
                z = false;
                b(-1, view2, false);
            } else {
                z = false;
                b(0, view2, false);
            }
            d(this.L, view2);
            z1(k, view2, z);
            int d = this.r.d(view2);
            if (d > i19) {
                i19 = d;
            }
            float e = (((float) this.r.e(view2)) * 1.0f) / ((float) ((fc6) view2.getLayoutParams()).Y);
            if (e > f) {
                f = e;
            }
        }
        if (z2) {
            t1(Math.max(Math.round(f * ((float) this.F)), i14));
            i19 = 0;
            for (int i21 = 0; i21 < i16; i21++) {
                View view3 = this.H[i21];
                z1(1073741824, view3, true);
                int d2 = this.r.d(view3);
                if (d2 > i19) {
                    i19 = d2;
                }
            }
        }
        for (int i22 = 0; i22 < i16; i22++) {
            View view4 = this.H[i22];
            if (this.r.d(view4) != i19) {
                fc6 fc62 = (fc6) view4.getLayoutParams();
                Rect rect = fc62.b;
                int i23 = rect.top + rect.bottom + fc62.topMargin + fc62.bottomMargin;
                int i24 = rect.left + rect.right + fc62.leftMargin + fc62.rightMargin;
                int v1 = v1(fc62.X, fc62.Y);
                if (this.p == 1) {
                    i13 = a.x(false, v1, 1073741824, i24, fc62.width);
                    i12 = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    i12 = a.x(false, v1, 1073741824, i23, fc62.height);
                    i13 = makeMeasureSpec;
                }
                if (H0(view4, i13, i12, (n6c) view4.getLayoutParams())) {
                    view4.measure(i13, i12);
                }
            }
        }
        int i25 = 0;
        cd72.a = i19;
        if (this.p != 1) {
            if (dd72.f == -1) {
                int i26 = dd72.b;
                i7 = i26 - i19;
                i6 = i26;
            } else {
                int i27 = dd72.b;
                i6 = i27 + i19;
                i7 = i27;
            }
            i5 = 0;
            i4 = 0;
        } else if (dd72.f == -1) {
            i4 = dd72.b;
            i5 = i4 - i19;
            i7 = 0;
            i6 = 0;
        } else {
            int i28 = dd72.b;
            i5 = i28;
            i6 = 0;
            i4 = i28 + i19;
            i7 = 0;
        }
        while (i25 < i16) {
            View view5 = this.H[i25];
            fc6 fc63 = (fc6) view5.getLayoutParams();
            if (this.p != 1) {
                int L2 = L() + this.G[fc63.X];
                i11 = i7;
                i10 = i6;
                i9 = L2;
                i8 = this.r.e(view5) + L2;
            } else if (g1()) {
                int J2 = J() + this.G[this.F - fc63.X];
                i10 = J2;
                i9 = i5;
                i8 = i4;
                i11 = J2 - this.r.e(view5);
            } else {
                int J3 = J() + this.G[fc63.X];
                i10 = this.r.e(view5) + J3;
                i9 = i5;
                i8 = i4;
                i11 = J3;
            }
            S(view5, i11, i9, i10, i8);
            if (fc63.a.p() || fc63.a.s()) {
                cd72.c = true;
            }
            cd72.d |= view5.hasFocusable();
            i25++;
            i7 = i11;
            i6 = i10;
            i5 = i9;
            i4 = i8;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void i1(t6c t6c, x6c x6c, u45 u45, int i) {
        B1();
        if (x6c.b() > 0 && !x6c.h) {
            boolean z = i == 1;
            int x1 = x1(u45.b, t6c, x6c);
            if (z) {
                while (x1 > 0) {
                    int i2 = u45.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    u45.b = i3;
                    x1 = x1(i3, t6c, x6c);
                }
            } else {
                int b = x6c.b() - 1;
                int i4 = u45.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int x12 = x1(i5, t6c, x6c);
                    if (x12 <= x1) {
                        break;
                    }
                    i4 = i5;
                    x1 = x12;
                }
                u45.b = i4;
            }
        }
        u1();
    }

    public final void j0(t6c t6c, x6c x6c) {
        boolean z = x6c.h;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int w = w();
            for (int i = 0; i < w; i++) {
                fc6 fc6 = (fc6) v(i).getLayoutParams();
                int i2 = fc6.a.i();
                sparseIntArray2.put(i2, fc6.Y);
                sparseIntArray.put(i2, fc6.X);
            }
        }
        super.j0(t6c, x6c);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void k0(x6c x6c) {
        super.k0(x6c);
        this.E = false;
    }

    public final int l(x6c x6c) {
        return O0(x6c);
    }

    public final int m(x6c x6c) {
        return P0(x6c);
    }

    public final int o(x6c x6c) {
        return O0(x6c);
    }

    public final int p(x6c x6c) {
        return P0(x6c);
    }

    public final void p1(boolean z) {
        if (!z) {
            super.p1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public n6c s() {
        return this.p == 0 ? new fc6(-2, -1) : new fc6(-1, -2);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [fc6, n6c] */
    public n6c t(Context context, AttributeSet attributeSet) {
        ? n6c = new n6c(context, attributeSet);
        n6c.X = -1;
        n6c.Y = 0;
        return n6c;
    }

    public final void t1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [fc6, n6c] */
    /* JADX WARNING: type inference failed for: r2v3, types: [fc6, n6c] */
    public n6c u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? n6c = new n6c((ViewGroup.MarginLayoutParams) layoutParams);
            n6c.X = -1;
            n6c.Y = 0;
            return n6c;
        }
        ? n6c2 = new n6c(layoutParams);
        n6c2.X = -1;
        n6c2.Y = 0;
        return n6c2;
    }

    public final void u1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int v1(int i, int i2) {
        if (this.p != 1 || !g1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int w1(int i, t6c t6c, x6c x6c) {
        if (!x6c.h) {
            return this.K.a(i, this.F);
        }
        int b = t6c.b(i);
        if (b == -1) {
            return 0;
        }
        return this.K.a(b, this.F);
    }

    public final int x0(int i, t6c t6c, x6c x6c) {
        B1();
        u1();
        return super.x0(i, t6c, x6c);
    }

    public final int x1(int i, t6c t6c, x6c x6c) {
        if (!x6c.h) {
            return this.K.b(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = t6c.b(i);
        if (b == -1) {
            return 0;
        }
        return this.K.b(b, this.F);
    }

    public final int y(t6c t6c, x6c x6c) {
        if (this.p == 1) {
            return this.F;
        }
        if (x6c.b() < 1) {
            return 0;
        }
        return w1(x6c.b() - 1, t6c, x6c) + 1;
    }

    public final int y1(int i, t6c t6c, x6c x6c) {
        if (!x6c.h) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = t6c.b(i);
        if (b == -1) {
            return 1;
        }
        return this.K.c(b);
    }

    public final int z0(int i, t6c t6c, x6c x6c) {
        B1();
        u1();
        return super.z0(i, t6c, x6c);
    }

    public final void z1(int i, View view, boolean z) {
        int i2;
        int i3;
        fc6 fc6 = (fc6) view.getLayoutParams();
        Rect rect = fc6.b;
        int i4 = rect.top + rect.bottom + fc6.topMargin + fc6.bottomMargin;
        int i5 = rect.left + rect.right + fc6.leftMargin + fc6.rightMargin;
        int v1 = v1(fc6.X, fc6.Y);
        if (this.p == 1) {
            i2 = a.x(false, v1, i, i5, fc6.width);
            i3 = a.x(true, this.r.n(), this.m, i4, fc6.height);
        } else {
            int x = a.x(false, v1, i, i4, fc6.height);
            int x2 = a.x(true, this.r.n(), this.l, i5, fc6.width);
            i3 = x;
            i2 = x2;
        }
        n6c n6c = (n6c) view.getLayoutParams();
        if (z ? H0(view, i2, i3, n6c) : F0(view, i2, i3, n6c)) {
            view.measure(i2, i3);
        }
    }

    public GridLayoutManager(int i) {
        A1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(1, false);
        A1(i);
    }
}
