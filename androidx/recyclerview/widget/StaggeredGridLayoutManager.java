package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends a implements w6c {
    public int A = Integer.MIN_VALUE;
    public final s5c B = new s5c(4, false);
    public final int C = 2;
    public boolean D;
    public boolean E;
    public kod F;
    public final Rect G = new Rect();
    public final xc9 H;
    public final boolean I;
    public int[] J;
    public final vp6 K;
    public int p = -1;
    public lod[] q;
    public final o57 r;
    public final o57 s;
    public final int t;
    public int u;
    public final r97 v;
    public boolean w = false;
    public boolean x = false;
    public BitSet y;
    public int z = -1;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, xc9] */
    /* JADX WARNING: type inference failed for: r5v3, types: [r97, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        ? obj = new Object();
        obj.g = this;
        obj.c();
        this.H = obj;
        this.I = true;
        this.K = new vp6(28, this);
        m6c N = a.N(context, attributeSet, i, i2);
        int i3 = N.a;
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            if (i3 != this.t) {
                this.t = i3;
                o57 o57 = this.r;
                this.r = this.s;
                this.s = o57;
                w0();
            }
            m1(N.b);
            boolean z2 = N.c;
            c((String) null);
            kod kod = this.F;
            if (!(kod == null || kod.w0 == z2)) {
                kod.w0 = z2;
            }
            this.w = z2;
            w0();
            ? obj2 = new Object();
            obj2.a = true;
            obj2.f = 0;
            obj2.g = 0;
            this.v = obj2;
            this.r = o57.b(this, this.t);
            this.s = o57.b(this, 1 - this.t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int p1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void C0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int K2 = K() + J();
        int I2 = I() + L();
        if (this.t == 1) {
            int height = rect.height() + I2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = eaf.a;
            i4 = a.h(i2, height, recyclerView.getMinimumHeight());
            i3 = a.h(i, (this.u * this.p) + K2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + K2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = eaf.a;
            i3 = a.h(i, width, recyclerView2.getMinimumWidth());
            i4 = a.h(i2, (this.u * this.p) + I2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    public final void I0(RecyclerView recyclerView, int i) {
        hd7 hd7 = new hd7(recyclerView.getContext());
        hd7.a = i;
        J0(hd7);
    }

    public final boolean K0() {
        return this.F == null;
    }

    public final int L0(int i) {
        if (w() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < V0()) != this.x ? -1 : 1;
    }

    public final boolean M0() {
        int i;
        if (!(w() == 0 || this.C == 0 || !this.g)) {
            if (this.x) {
                i = W0();
                V0();
            } else {
                i = V0();
                W0();
            }
            s5c s5c = this.B;
            if (i == 0 && a1() != null) {
                s5c.b();
                this.f = true;
                w0();
                return true;
            }
        }
        return false;
    }

    public final int N0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        o57 o57 = this.r;
        boolean z2 = this.I;
        return urd.m(x6c, o57, S0(!z2), R0(!z2), this, this.I);
    }

    public final int O0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        o57 o57 = this.r;
        boolean z2 = this.I;
        return urd.n(x6c, o57, S0(!z2), R0(!z2), this, this.I, this.x);
    }

    public final int P0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        o57 o57 = this.r;
        boolean z2 = this.I;
        return urd.o(x6c, o57, S0(!z2), R0(!z2), this, this.I);
    }

    public final boolean Q() {
        return this.C != 0;
    }

    public final int Q0(t6c t6c, r97 r97, x6c x6c) {
        int i;
        lod lod;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int m;
        int d;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        t6c t6c2 = t6c;
        r97 r972 = r97;
        int i10 = 0;
        int i11 = 1;
        this.y.set(0, this.p, true);
        r97 r973 = this.v;
        if (r973.i) {
            i = r972.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = r972.e == 1 ? r972.g + r972.b : r972.f - r972.b;
        }
        int i12 = r972.e;
        for (int i13 = 0; i13 < this.p; i13++) {
            if (!((ArrayList) this.q[i13].e).isEmpty()) {
                o1(this.q[i13], i12, i);
            }
        }
        int h = this.x ? this.r.h() : this.r.m();
        int i14 = 0;
        while (true) {
            int i15 = r972.c;
            if (((i15 < 0 || i15 >= x6c.b()) ? i10 : i11) == 0 || (!r973.i && this.y.isEmpty())) {
                int i16 = i10;
            } else {
                View view2 = t6c2.j(r972.c, Long.MAX_VALUE).a;
                r972.c += r972.d;
                iod iod = (iod) view2.getLayoutParams();
                int i17 = iod.a.i();
                s5c s5c = this.B;
                int[] iArr = (int[]) s5c.b;
                int i18 = (iArr == null || i17 >= iArr.length) ? -1 : iArr[i17];
                if (i18 == -1) {
                    if (e1(r972.e)) {
                        i9 = this.p - i11;
                        i8 = -1;
                        i7 = -1;
                    } else {
                        i8 = this.p;
                        i9 = i10;
                        i7 = i11;
                    }
                    lod lod2 = null;
                    if (r972.e == i11) {
                        int m2 = this.r.m();
                        int i19 = Integer.MAX_VALUE;
                        while (i9 != i8) {
                            lod lod3 = this.q[i9];
                            int h2 = lod3.h(m2);
                            if (h2 < i19) {
                                lod2 = lod3;
                                i19 = h2;
                            }
                            i9 += i7;
                        }
                    } else {
                        int h3 = this.r.h();
                        int i20 = Integer.MIN_VALUE;
                        while (i9 != i8) {
                            lod lod4 = this.q[i9];
                            int j = lod4.j(h3);
                            if (j > i20) {
                                lod2 = lod4;
                                i20 = j;
                            }
                            i9 += i7;
                        }
                    }
                    lod = lod2;
                    s5c.g(i17);
                    ((int[]) s5c.b)[i17] = lod.d;
                } else {
                    lod = this.q[i18];
                }
                lod lod5 = lod;
                iod.X = lod5;
                if (r972.e == 1) {
                    z2 = false;
                    b(-1, view2, false);
                } else {
                    z2 = false;
                    b(0, view2, false);
                }
                if (this.t == 1) {
                    i2 = 1;
                    c1(view2, a.x(z2, this.u, this.l, z2 ? 1 : 0, iod.width), a.x(true, this.o, this.m, I() + L(), iod.height));
                } else {
                    i2 = 1;
                    c1(view2, a.x(true, this.n, this.l, K() + J(), iod.width), a.x(false, this.u, this.m, 0, iod.height));
                }
                if (r972.e == i2) {
                    int h4 = lod5.h(h);
                    i4 = h4;
                    i3 = this.r.d(view2) + h4;
                } else {
                    int j2 = lod5.j(h);
                    i3 = j2;
                    i4 = j2 - this.r.d(view2);
                }
                if (r972.e == 1) {
                    lod lod6 = iod.X;
                    lod6.getClass();
                    iod iod2 = (iod) view2.getLayoutParams();
                    iod2.X = lod6;
                    ArrayList arrayList = (ArrayList) lod6.e;
                    arrayList.add(view2);
                    lod6.b = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        lod6.a = Integer.MIN_VALUE;
                    }
                    if (iod2.a.p() || iod2.a.s()) {
                        lod6.c = ((StaggeredGridLayoutManager) lod6.f).r.d(view2) + lod6.c;
                    }
                } else {
                    lod lod7 = iod.X;
                    lod7.getClass();
                    iod iod3 = (iod) view2.getLayoutParams();
                    iod3.X = lod7;
                    ArrayList arrayList2 = (ArrayList) lod7.e;
                    arrayList2.add(0, view2);
                    lod7.a = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        lod7.b = Integer.MIN_VALUE;
                    }
                    if (iod3.a.p() || iod3.a.s()) {
                        lod7.c = ((StaggeredGridLayoutManager) lod7.f).r.d(view2) + lod7.c;
                    }
                }
                if (!b1() || this.t != 1) {
                    m = this.s.m() + (lod5.d * this.u);
                    d = this.s.d(view2) + m;
                } else {
                    d = this.s.h() - (((this.p - 1) - lod5.d) * this.u);
                    m = d - this.s.d(view2);
                }
                int i21 = d;
                int i22 = m;
                if (this.t == 1) {
                    i5 = 1;
                    view = view2;
                    S(view2, i22, i4, i21, i3);
                } else {
                    i5 = 1;
                    view = view2;
                    S(view, i4, i22, i3, i21);
                }
                o1(lod5, r973.e, i);
                g1(t6c2, r973);
                if (!r973.h || !view.hasFocusable()) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    this.y.set(lod5.d, false);
                }
                i10 = i6;
                i14 = i5;
                i11 = i14;
            }
        }
        int i162 = i10;
        if (i14 == 0) {
            g1(t6c2, r973);
        }
        int m3 = r973.e == -1 ? this.r.m() - Y0(this.r.m()) : X0(this.r.h()) - this.r.h();
        return m3 > 0 ? Math.min(r972.b, m3) : i162;
    }

    public final View R0(boolean z2) {
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        for (int w2 = w() - 1; w2 >= 0; w2--) {
            View v2 = v(w2);
            int f = this.r.f(v2);
            int c = this.r.c(v2);
            if (c > m && f < h) {
                if (c <= h || !z2) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    public final View S0(boolean z2) {
        int m = this.r.m();
        int h = this.r.h();
        int w2 = w();
        View view = null;
        for (int i = 0; i < w2; i++) {
            View v2 = v(i);
            int f = this.r.f(v2);
            if (this.r.c(v2) > m && f < h) {
                if (f >= m || !z2) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            lod lod = this.q[i2];
            int i3 = lod.a;
            if (i3 != Integer.MIN_VALUE) {
                lod.a = i3 + i;
            }
            int i4 = lod.b;
            if (i4 != Integer.MIN_VALUE) {
                lod.b = i4 + i;
            }
        }
    }

    public final void T0(t6c t6c, x6c x6c, boolean z2) {
        int h;
        int X0 = X0(Integer.MIN_VALUE);
        if (X0 != Integer.MIN_VALUE && (h = this.r.h() - X0) > 0) {
            int i = h - (-k1(-h, t6c, x6c));
            if (z2 && i > 0) {
                this.r.r(i);
            }
        }
    }

    public final void U(int i) {
        super.U(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            lod lod = this.q[i2];
            int i3 = lod.a;
            if (i3 != Integer.MIN_VALUE) {
                lod.a = i3 + i;
            }
            int i4 = lod.b;
            if (i4 != Integer.MIN_VALUE) {
                lod.b = i4 + i;
            }
        }
    }

    public final void U0(t6c t6c, x6c x6c, boolean z2) {
        int m;
        int Y0 = Y0(Integer.MAX_VALUE);
        if (Y0 != Integer.MAX_VALUE && (m = Y0 - this.r.m()) > 0) {
            int k1 = m - k1(m, t6c, x6c);
            if (z2 && k1 > 0) {
                this.r.r(-k1);
            }
        }
    }

    public final void V() {
        this.B.b();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    public final int V0() {
        if (w() == 0) {
            return 0;
        }
        return a.M(v(0));
    }

    public final int W0() {
        int w2 = w();
        if (w2 == 0) {
            return 0;
        }
        return a.M(v(w2 - 1));
    }

    public final void X(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final int X0(int i) {
        int h = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int h2 = this.q[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (r8.t == 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r8.t == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        if (b1() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
        if (b1() == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r9, int r10, defpackage.t6c r11, defpackage.x6c r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.I(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            ope r0 = r8.a
            boolean r0 = r0.H(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.j1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0061
            r4 = 2
            if (r10 == r4) goto L_0x0053
            r4 = 17
            if (r10 == r4) goto L_0x004e
            r4 = 33
            if (r10 == r4) goto L_0x0049
            r4 = 66
            if (r10 == r4) goto L_0x0044
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003f
        L_0x003d:
            r10 = r3
            goto L_0x006d
        L_0x003f:
            int r10 = r8.t
            if (r10 != r0) goto L_0x003d
            goto L_0x0057
        L_0x0044:
            int r10 = r8.t
            if (r10 != 0) goto L_0x003d
            goto L_0x0057
        L_0x0049:
            int r10 = r8.t
            if (r10 != r0) goto L_0x003d
            goto L_0x005f
        L_0x004e:
            int r10 = r8.t
            if (r10 != 0) goto L_0x003d
            goto L_0x005f
        L_0x0053:
            int r10 = r8.t
            if (r10 != r0) goto L_0x0059
        L_0x0057:
            r10 = r0
            goto L_0x006d
        L_0x0059:
            boolean r10 = r8.b1()
            if (r10 == 0) goto L_0x0057
        L_0x005f:
            r10 = r2
            goto L_0x006d
        L_0x0061:
            int r10 = r8.t
            if (r10 != r0) goto L_0x0066
            goto L_0x005f
        L_0x0066:
            boolean r10 = r8.b1()
            if (r10 == 0) goto L_0x005f
            goto L_0x0057
        L_0x006d:
            if (r10 != r3) goto L_0x0070
            return r1
        L_0x0070:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            iod r3 = (defpackage.iod) r3
            r3.getClass()
            lod r3 = r3.X
            if (r10 != r0) goto L_0x0082
            int r4 = r8.W0()
            goto L_0x0086
        L_0x0082:
            int r4 = r8.V0()
        L_0x0086:
            r8.n1(r4, r12)
            r8.l1(r10)
            r97 r5 = r8.v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            o57 r6 = r8.r
            int r6 = r6.n()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.h = r0
            r6 = 0
            r5.a = r6
            r8.Q0(r11, r5, r12)
            boolean r11 = r8.x
            r8.D = r11
            android.view.View r11 = r3.i(r4, r10)
            if (r11 == 0) goto L_0x00b6
            if (r11 == r9) goto L_0x00b6
            return r11
        L_0x00b6:
            boolean r11 = r8.e1(r10)
            if (r11 == 0) goto L_0x00d1
            int r11 = r8.p
            int r11 = r11 - r0
        L_0x00bf:
            if (r11 < 0) goto L_0x00e6
            lod[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00ce
            if (r12 == r9) goto L_0x00ce
            return r12
        L_0x00ce:
            int r11 = r11 + -1
            goto L_0x00bf
        L_0x00d1:
            r11 = r6
        L_0x00d2:
            int r12 = r8.p
            if (r11 >= r12) goto L_0x00e6
            lod[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00e3
            if (r12 == r9) goto L_0x00e3
            return r12
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x00d2
        L_0x00e6:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ed
            r12 = r0
            goto L_0x00ee
        L_0x00ed:
            r12 = r6
        L_0x00ee:
            if (r11 != r12) goto L_0x00f2
            r11 = r0
            goto L_0x00f3
        L_0x00f2:
            r11 = r6
        L_0x00f3:
            if (r11 == 0) goto L_0x00fa
            int r12 = r3.e()
            goto L_0x00fe
        L_0x00fa:
            int r12 = r3.f()
        L_0x00fe:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x0107
            if (r12 == r9) goto L_0x0107
            return r12
        L_0x0107:
            boolean r10 = r8.e1(r10)
            if (r10 == 0) goto L_0x0136
            int r10 = r8.p
            int r10 = r10 - r0
        L_0x0110:
            if (r10 < 0) goto L_0x0159
            int r12 = r3.d
            if (r10 != r12) goto L_0x0117
            goto L_0x0133
        L_0x0117:
            if (r11 == 0) goto L_0x0122
            lod[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x012a
        L_0x0122:
            lod[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x012a:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x0133
            if (r12 == r9) goto L_0x0133
            return r12
        L_0x0133:
            int r10 = r10 + -1
            goto L_0x0110
        L_0x0136:
            int r10 = r8.p
            if (r6 >= r10) goto L_0x0159
            if (r11 == 0) goto L_0x0145
            lod[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x014d
        L_0x0145:
            lod[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x014d:
            android.view.View r10 = r8.r(r10)
            if (r10 == 0) goto L_0x0156
            if (r10 == r9) goto L_0x0156
            return r10
        L_0x0156:
            int r6 = r6 + 1
            goto L_0x0136
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y(android.view.View, int, t6c, x6c):android.view.View");
    }

    public final int Y0(int i) {
        int j = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int j2 = this.q[i2].j(i);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            View S0 = S0(false);
            View R0 = R0(false);
            if (S0 != null && R0 != null) {
                int M = a.M(S0);
                int M2 = a.M(R0);
                if (M < M2) {
                    accessibilityEvent.setFromIndex(M);
                    accessibilityEvent.setToIndex(M2);
                    return;
                }
                accessibilityEvent.setFromIndex(M2);
                accessibilityEvent.setToIndex(M);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.W0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.V0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001b
            if (r8 >= r9) goto L_0x0017
            int r2 = r9 + 1
        L_0x0015:
            r3 = r8
            goto L_0x001e
        L_0x0017:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001e
        L_0x001b:
            int r2 = r8 + r9
            goto L_0x0015
        L_0x001e:
            s5c r4 = r7.B
            r4.h(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0037
            r6 = 2
            if (r10 == r6) goto L_0x0033
            if (r10 == r1) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            r4.k(r8, r5)
            r4.i(r9, r5)
            goto L_0x003a
        L_0x0033:
            r4.k(r8, r9)
            goto L_0x003a
        L_0x0037:
            r4.i(r8, r9)
        L_0x003a:
            if (r2 > r0) goto L_0x003d
            return
        L_0x003d:
            boolean r8 = r7.x
            if (r8 == 0) goto L_0x0046
            int r8 = r7.V0()
            goto L_0x004a
        L_0x0046:
            int r8 = r7.W0()
        L_0x004a:
            if (r3 > r8) goto L_0x004f
            r7.w0()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Z0(int, int, int):void");
    }

    public final PointF a(int i) {
        int L0 = L0(i);
        PointF pointF = new PointF();
        if (L0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = (float) L0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) L0;
        }
        return pointF;
    }

    public final View a1() {
        int w2 = w();
        int i = w2 - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        int i2 = -1;
        char c = (this.t != 1 || !b1()) ? (char) 65535 : 1;
        if (this.x) {
            w2 = -1;
        } else {
            i = 0;
        }
        if (i < w2) {
            i2 = 1;
        }
        while (i != w2) {
            View v2 = v(i);
            iod iod = (iod) v2.getLayoutParams();
            if (bitSet.get(iod.X.d)) {
                lod lod = iod.X;
                if (this.x) {
                    int i3 = lod.b;
                    if (i3 == Integer.MIN_VALUE) {
                        lod.c();
                        i3 = lod.b;
                    }
                    if (i3 < this.r.h()) {
                        ((iod) ((View) rf0.e((ArrayList) lod.e, 1)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(iod.X.d);
                } else {
                    int i4 = lod.a;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) lod.e).get(0);
                        lod.a = ((StaggeredGridLayoutManager) lod.f).r.f(view);
                        ((iod) view.getLayoutParams()).getClass();
                        i4 = lod.a;
                    }
                    if (i4 > this.r.m()) {
                        ((iod) ((View) ((ArrayList) lod.e).get(0)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(iod.X.d);
                }
                return v2;
            }
            i += i2;
            if (i != w2) {
                View v3 = v(i);
                if (this.x) {
                    int c2 = this.r.c(v2);
                    int c3 = this.r.c(v3);
                    if (c2 < c3) {
                        return v2;
                    }
                    if (c2 != c3) {
                        continue;
                    }
                } else {
                    int f = this.r.f(v2);
                    int f2 = this.r.f(v3);
                    if (f > f2) {
                        return v2;
                    }
                    if (f != f2) {
                        continue;
                    }
                }
                if ((iod.X.d - ((iod) v3.getLayoutParams()).X.d < 0) != (c < 0)) {
                    return v2;
                }
            }
        }
        return null;
    }

    public final boolean b1() {
        return H() == 1;
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c1(View view, int i, int i2) {
        Rect rect = this.G;
        d(rect, view);
        iod iod = (iod) view.getLayoutParams();
        int p1 = p1(i, iod.leftMargin + rect.left, iod.rightMargin + rect.right);
        int p12 = p1(i2, iod.topMargin + rect.top, iod.bottomMargin + rect.bottom);
        if (F0(view, p1, p12, iod)) {
            view.measure(p1, p12);
        }
    }

    public final void d0(int i, int i2) {
        Z0(i, i2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:231:0x040e, code lost:
        if (M0() != false) goto L_0x0412;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(defpackage.t6c r17, defpackage.x6c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            kod r3 = r0.F
            r4 = -1
            xc9 r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.r0(r17)
            r5.c()
            return
        L_0x001e:
            boolean r3 = r5.e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.z
            if (r3 != r4) goto L_0x002f
            kod r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            s5c r8 = r0.B
            java.lang.Object r9 = r5.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r9
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x0210
            r5.c()
            kod r11 = r0.F
            if (r11 == 0) goto L_0x00c5
            int r12 = r11.c
            r13 = 0
            if (r12 <= 0) goto L_0x008a
            int r14 = r0.p
            if (r12 != r14) goto L_0x007c
            r11 = r6
        L_0x004b:
            int r12 = r0.p
            if (r11 >= r12) goto L_0x008a
            lod[] r12 = r0.q
            r12 = r12[r11]
            r12.d()
            kod r12 = r0.F
            int[] r14 = r12.o
            r14 = r14[r11]
            if (r14 == r10) goto L_0x0071
            boolean r12 = r12.x0
            if (r12 == 0) goto L_0x006a
            o57 r12 = r0.r
            int r12 = r12.h()
        L_0x0068:
            int r14 = r14 + r12
            goto L_0x0071
        L_0x006a:
            o57 r12 = r0.r
            int r12 = r12.m()
            goto L_0x0068
        L_0x0071:
            lod[] r12 = r0.q
            r12 = r12[r11]
            r12.a = r14
            r12.b = r14
            int r11 = r11 + 1
            goto L_0x004b
        L_0x007c:
            r11.o = r13
            r11.c = r6
            r11.X = r6
            r11.Y = r13
            r11.Z = r13
            int r12 = r11.b
            r11.a = r12
        L_0x008a:
            kod r11 = r0.F
            boolean r12 = r11.y0
            r0.E = r12
            boolean r11 = r11.w0
            r0.c(r13)
            kod r12 = r0.F
            if (r12 == 0) goto L_0x009f
            boolean r13 = r12.w0
            if (r13 == r11) goto L_0x009f
            r12.w0 = r11
        L_0x009f:
            r0.w = r11
            r16.w0()
            r16.j1()
            kod r11 = r0.F
            int r12 = r11.a
            if (r12 == r4) goto L_0x00b4
            r0.z = r12
            boolean r12 = r11.x0
            r5.c = r12
            goto L_0x00b8
        L_0x00b4:
            boolean r12 = r0.x
            r5.c = r12
        L_0x00b8:
            int r12 = r11.X
            if (r12 <= r7) goto L_0x00cc
            int[] r12 = r11.Y
            r8.b = r12
            java.util.List r11 = r11.Z
            r8.c = r11
            goto L_0x00cc
        L_0x00c5:
            r16.j1()
            boolean r11 = r0.x
            r5.c = r11
        L_0x00cc:
            boolean r11 = r2.h
            if (r11 != 0) goto L_0x01cd
            int r11 = r0.z
            if (r11 != r4) goto L_0x00d6
            goto L_0x01cd
        L_0x00d6:
            if (r11 < 0) goto L_0x01c9
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00e0
            goto L_0x01c9
        L_0x00e0:
            kod r11 = r0.F
            if (r11 == 0) goto L_0x00f5
            int r12 = r11.a
            if (r12 == r4) goto L_0x00f5
            int r11 = r11.c
            if (r11 >= r7) goto L_0x00ed
            goto L_0x00f5
        L_0x00ed:
            r5.b = r10
            int r11 = r0.z
            r5.a = r11
            goto L_0x020e
        L_0x00f5:
            int r11 = r0.z
            android.view.View r11 = r0.r(r11)
            if (r11 == 0) goto L_0x018a
            boolean r12 = r0.x
            if (r12 == 0) goto L_0x0106
            int r12 = r16.W0()
            goto L_0x010a
        L_0x0106:
            int r12 = r16.V0()
        L_0x010a:
            r5.a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x013c
            boolean r12 = r5.c
            if (r12 == 0) goto L_0x0128
            o57 r12 = r0.r
            int r12 = r12.h()
            int r13 = r0.A
            int r12 = r12 - r13
            o57 r13 = r0.r
            int r11 = r13.c(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L_0x020e
        L_0x0128:
            o57 r12 = r0.r
            int r12 = r12.m()
            int r13 = r0.A
            int r12 = r12 + r13
            o57 r13 = r0.r
            int r11 = r13.f(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L_0x020e
        L_0x013c:
            o57 r12 = r0.r
            int r12 = r12.d(r11)
            o57 r13 = r0.r
            int r13 = r13.n()
            if (r12 <= r13) goto L_0x015f
            boolean r11 = r5.c
            if (r11 == 0) goto L_0x0155
            o57 r11 = r0.r
            int r11 = r11.h()
            goto L_0x015b
        L_0x0155:
            o57 r11 = r0.r
            int r11 = r11.m()
        L_0x015b:
            r5.b = r11
            goto L_0x020e
        L_0x015f:
            o57 r12 = r0.r
            int r12 = r12.f(r11)
            o57 r13 = r0.r
            int r13 = r13.m()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0173
            int r11 = -r12
            r5.b = r11
            goto L_0x020e
        L_0x0173:
            o57 r12 = r0.r
            int r12 = r12.h()
            o57 r13 = r0.r
            int r11 = r13.c(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0186
            r5.b = r12
            goto L_0x020e
        L_0x0186:
            r5.b = r10
            goto L_0x020e
        L_0x018a:
            int r11 = r0.z
            r5.a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x01af
            int r11 = r0.L0(r11)
            if (r11 != r7) goto L_0x019a
            r11 = r7
            goto L_0x019b
        L_0x019a:
            r11 = r6
        L_0x019b:
            r5.c = r11
            if (r11 == 0) goto L_0x01a6
            o57 r11 = r9.r
            int r11 = r11.h()
            goto L_0x01ac
        L_0x01a6:
            o57 r11 = r9.r
            int r11 = r11.m()
        L_0x01ac:
            r5.b = r11
            goto L_0x01c6
        L_0x01af:
            boolean r11 = r5.c
            if (r11 == 0) goto L_0x01bd
            o57 r11 = r9.r
            int r11 = r11.h()
            int r11 = r11 - r12
            r5.b = r11
            goto L_0x01c6
        L_0x01bd:
            o57 r11 = r9.r
            int r11 = r11.m()
            int r11 = r11 + r12
            r5.b = r11
        L_0x01c6:
            r5.d = r7
            goto L_0x020e
        L_0x01c9:
            r0.z = r4
            r0.A = r10
        L_0x01cd:
            boolean r11 = r0.D
            if (r11 == 0) goto L_0x01ee
            int r11 = r18.b()
            int r12 = r16.w()
            int r12 = r12 - r7
        L_0x01da:
            if (r12 < 0) goto L_0x01ec
            android.view.View r13 = r0.v(r12)
            int r13 = androidx.recyclerview.widget.a.M(r13)
            if (r13 < 0) goto L_0x01e9
            if (r13 >= r11) goto L_0x01e9
            goto L_0x020a
        L_0x01e9:
            int r12 = r12 + -1
            goto L_0x01da
        L_0x01ec:
            r13 = r6
            goto L_0x020a
        L_0x01ee:
            int r11 = r18.b()
            int r12 = r16.w()
            r13 = r6
        L_0x01f7:
            if (r13 >= r12) goto L_0x01ec
            android.view.View r14 = r0.v(r13)
            int r14 = androidx.recyclerview.widget.a.M(r14)
            if (r14 < 0) goto L_0x0207
            if (r14 >= r11) goto L_0x0207
            r13 = r14
            goto L_0x020a
        L_0x0207:
            int r13 = r13 + 1
            goto L_0x01f7
        L_0x020a:
            r5.a = r13
            r5.b = r10
        L_0x020e:
            r5.e = r7
        L_0x0210:
            kod r11 = r0.F
            if (r11 != 0) goto L_0x022b
            int r11 = r0.z
            if (r11 != r4) goto L_0x022b
            boolean r11 = r5.c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x0226
            boolean r11 = r16.b1()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x022b
        L_0x0226:
            r8.b()
            r5.d = r7
        L_0x022b:
            int r8 = r16.w()
            if (r8 <= 0) goto L_0x02e0
            kod r8 = r0.F
            if (r8 == 0) goto L_0x0239
            int r8 = r8.c
            if (r8 >= r7) goto L_0x02e0
        L_0x0239:
            boolean r8 = r5.d
            if (r8 == 0) goto L_0x0258
            r3 = r6
        L_0x023e:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02e0
            lod[] r8 = r0.q
            r8 = r8[r3]
            r8.d()
            int r8 = r5.b
            if (r8 == r10) goto L_0x0255
            lod[] r9 = r0.q
            r9 = r9[r3]
            r9.a = r8
            r9.b = r8
        L_0x0255:
            int r3 = r3 + 1
            goto L_0x023e
        L_0x0258:
            if (r3 != 0) goto L_0x027a
            java.lang.Object r3 = r5.f
            int[] r3 = (int[]) r3
            if (r3 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            r3 = r6
        L_0x0262:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02e0
            lod[] r8 = r0.q
            r8 = r8[r3]
            r8.d()
            java.lang.Object r9 = r5.f
            int[] r9 = (int[]) r9
            r9 = r9[r3]
            r8.a = r9
            r8.b = r9
            int r3 = r3 + 1
            goto L_0x0262
        L_0x027a:
            r3 = r6
        L_0x027b:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02bb
            lod[] r8 = r0.q
            r8 = r8[r3]
            boolean r11 = r0.x
            int r12 = r5.b
            if (r11 == 0) goto L_0x028e
            int r13 = r8.h(r10)
            goto L_0x0292
        L_0x028e:
            int r13 = r8.j(r10)
        L_0x0292:
            r8.d()
            if (r13 != r10) goto L_0x0298
            goto L_0x02b8
        L_0x0298:
            java.lang.Object r14 = r8.f
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r14
            if (r11 == 0) goto L_0x02a6
            o57 r15 = r14.r
            int r15 = r15.h()
            if (r13 < r15) goto L_0x02b8
        L_0x02a6:
            if (r11 != 0) goto L_0x02b1
            o57 r11 = r14.r
            int r11 = r11.m()
            if (r13 <= r11) goto L_0x02b1
            goto L_0x02b8
        L_0x02b1:
            if (r12 == r10) goto L_0x02b4
            int r13 = r13 + r12
        L_0x02b4:
            r8.b = r13
            r8.a = r13
        L_0x02b8:
            int r3 = r3 + 1
            goto L_0x027b
        L_0x02bb:
            lod[] r3 = r0.q
            int r8 = r3.length
            java.lang.Object r11 = r5.f
            int[] r11 = (int[]) r11
            if (r11 == 0) goto L_0x02c7
            int r11 = r11.length
            if (r11 >= r8) goto L_0x02ce
        L_0x02c7:
            lod[] r9 = r9.q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f = r9
        L_0x02ce:
            r9 = r6
        L_0x02cf:
            if (r9 >= r8) goto L_0x02e0
            java.lang.Object r11 = r5.f
            int[] r11 = (int[]) r11
            r12 = r3[r9]
            int r12 = r12.j(r10)
            r11[r9] = r12
            int r9 = r9 + 1
            goto L_0x02cf
        L_0x02e0:
            r16.q(r17)
            r97 r3 = r0.v
            r3.a = r6
            o57 r8 = r0.s
            int r8 = r8.n()
            int r9 = r0.p
            int r9 = r8 / r9
            r0.u = r9
            o57 r9 = r0.s
            int r9 = r9.j()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.a
            r0.n1(r8, r2)
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x0319
            r0.l1(r4)
            r0.Q0(r1, r3, r2)
            r0.l1(r7)
            int r4 = r5.a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.Q0(r1, r3, r2)
            goto L_0x032c
        L_0x0319:
            r0.l1(r7)
            r0.Q0(r1, r3, r2)
            r0.l1(r4)
            int r4 = r5.a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.Q0(r1, r3, r2)
        L_0x032c:
            o57 r3 = r0.s
            int r3 = r3.j()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0338
            goto L_0x03d4
        L_0x0338:
            int r3 = r16.w()
            r4 = 0
            r8 = r6
        L_0x033e:
            if (r8 >= r3) goto L_0x0360
            android.view.View r9 = r0.v(r8)
            o57 r11 = r0.s
            int r11 = r11.d(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0350
            goto L_0x035d
        L_0x0350:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            iod r9 = (defpackage.iod) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x035d:
            int r8 = r8 + 1
            goto L_0x033e
        L_0x0360:
            int r8 = r0.u
            int r9 = r0.p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            o57 r9 = r0.s
            int r9 = r9.j()
            if (r9 != r10) goto L_0x037c
            o57 r9 = r0.s
            int r9 = r9.n()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x037c:
            int r9 = r0.p
            int r9 = r4 / r9
            r0.u = r9
            o57 r9 = r0.s
            int r9 = r9.j()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.u
            if (r4 != r8) goto L_0x0390
            goto L_0x03d4
        L_0x0390:
            r4 = r6
        L_0x0391:
            if (r4 >= r3) goto L_0x03d4
            android.view.View r9 = r0.v(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            iod r10 = (defpackage.iod) r10
            r10.getClass()
            boolean r11 = r16.b1()
            if (r11 == 0) goto L_0x03bc
            int r11 = r0.t
            if (r11 != r7) goto L_0x03bc
            int r11 = r0.p
            int r11 = r11 - r7
            lod r10 = r10.X
            int r10 = r10.d
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03d1
        L_0x03bc:
            lod r10 = r10.X
            int r10 = r10.d
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.t
            if (r12 != r7) goto L_0x03cd
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03d1
        L_0x03cd:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03d1:
            int r4 = r4 + 1
            goto L_0x0391
        L_0x03d4:
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03eb
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x03e5
            r0.T0(r1, r2, r7)
            r0.U0(r1, r2, r6)
            goto L_0x03eb
        L_0x03e5:
            r0.U0(r1, r2, r7)
            r0.T0(r1, r2, r6)
        L_0x03eb:
            if (r19 == 0) goto L_0x0411
            boolean r3 = r2.h
            if (r3 != 0) goto L_0x0411
            int r3 = r0.C
            if (r3 == 0) goto L_0x0411
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x0411
            android.view.View r3 = r16.a1()
            if (r3 == 0) goto L_0x0411
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L_0x040a
            vp6 r4 = r0.K
            r3.removeCallbacks(r4)
        L_0x040a:
            boolean r3 = r16.M0()
            if (r3 == 0) goto L_0x0411
            goto L_0x0412
        L_0x0411:
            r7 = r6
        L_0x0412:
            boolean r3 = r2.h
            if (r3 == 0) goto L_0x0419
            r5.c()
        L_0x0419:
            boolean r3 = r5.c
            r0.D = r3
            boolean r3 = r16.b1()
            r0.E = r3
            if (r7 == 0) goto L_0x042b
            r5.c()
            r0.d1(r1, r2, r6)
        L_0x042b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(t6c, x6c, boolean):void");
    }

    public final boolean e() {
        return this.t == 0;
    }

    public final void e0() {
        this.B.b();
        w0();
    }

    public final boolean e1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == b1();
    }

    public final boolean f() {
        return this.t == 1;
    }

    public final void f0(int i, int i2) {
        Z0(i, i2, 8);
    }

    public final void f1(int i, x6c x6c) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = W0();
            i2 = 1;
        } else {
            i3 = V0();
            i2 = -1;
        }
        r97 r97 = this.v;
        r97.a = true;
        n1(i3, x6c);
        l1(i2);
        r97.c = i3 + r97.d;
        r97.b = Math.abs(i);
    }

    public final boolean g(n6c n6c) {
        return n6c instanceof iod;
    }

    public final void g0(int i, int i2) {
        Z0(i, i2, 2);
    }

    public final void g1(t6c t6c, r97 r97) {
        if (r97.a && !r97.i) {
            if (r97.b != 0) {
                int i = 1;
                if (r97.e == -1) {
                    int i2 = r97.f;
                    int j = this.q[0].j(i2);
                    while (i < this.p) {
                        int j2 = this.q[i].j(i2);
                        if (j2 > j) {
                            j = j2;
                        }
                        i++;
                    }
                    int i3 = i2 - j;
                    h1(i3 < 0 ? r97.g : r97.g - Math.min(i3, r97.b), t6c);
                    return;
                }
                int i4 = r97.g;
                int h = this.q[0].h(i4);
                while (i < this.p) {
                    int h2 = this.q[i].h(i4);
                    if (h2 < h) {
                        h = h2;
                    }
                    i++;
                }
                int i5 = h - r97.g;
                i1(i5 < 0 ? r97.f : Math.min(i5, r97.b) + r97.f, t6c);
            } else if (r97.e == -1) {
                h1(r97.g, t6c);
            } else {
                i1(r97.f, t6c);
            }
        }
    }

    public final void h1(int i, t6c t6c) {
        int w2 = w() - 1;
        while (w2 >= 0) {
            View v2 = v(w2);
            if (this.r.f(v2) >= i && this.r.q(v2) >= i) {
                iod iod = (iod) v2.getLayoutParams();
                iod.getClass();
                if (((ArrayList) iod.X.e).size() != 1) {
                    lod lod = iod.X;
                    ArrayList arrayList = (ArrayList) lod.e;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    iod iod2 = (iod) view.getLayoutParams();
                    iod2.X = null;
                    if (iod2.a.p() || iod2.a.s()) {
                        lod.c -= ((StaggeredGridLayoutManager) lod.f).r.d(view);
                    }
                    if (size == 1) {
                        lod.a = Integer.MIN_VALUE;
                    }
                    lod.b = Integer.MIN_VALUE;
                    t0(v2, t6c);
                    w2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void i(int i, int i2, x6c x6c, ry2 ry2) {
        r97 r97;
        int h;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            f1(i, x6c);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.p) {
                this.J = new int[this.p];
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.p;
                r97 = this.v;
                if (i5 >= i7) {
                    break;
                }
                if (r97.d == -1) {
                    h = r97.f;
                    i3 = this.q[i5].j(h);
                } else {
                    h = this.q[i5].h(r97.g);
                    i3 = r97.g;
                }
                int i8 = h - i3;
                if (i8 >= 0) {
                    this.J[i6] = i8;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.J, 0, i6);
            while (i4 < i6) {
                int i9 = r97.c;
                if (i9 >= 0 && i9 < x6c.b()) {
                    ry2.b(r97.c, this.J[i4]);
                    r97.c += r97.d;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        Z0(i, i2, 4);
    }

    public final void i1(int i, t6c t6c) {
        while (w() > 0) {
            View v2 = v(0);
            if (this.r.c(v2) <= i && this.r.p(v2) <= i) {
                iod iod = (iod) v2.getLayoutParams();
                iod.getClass();
                if (((ArrayList) iod.X.e).size() != 1) {
                    lod lod = iod.X;
                    ArrayList arrayList = (ArrayList) lod.e;
                    View view = (View) arrayList.remove(0);
                    iod iod2 = (iod) view.getLayoutParams();
                    iod2.X = null;
                    if (arrayList.size() == 0) {
                        lod.b = Integer.MIN_VALUE;
                    }
                    if (iod2.a.p() || iod2.a.s()) {
                        lod.c -= ((StaggeredGridLayoutManager) lod.f).r.d(view);
                    }
                    lod.a = Integer.MIN_VALUE;
                    t0(v2, t6c);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void j0(t6c t6c, x6c x6c) {
        d1(t6c, x6c, true);
    }

    public final void j1() {
        if (this.t == 1 || !b1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public final int k(x6c x6c) {
        return N0(x6c);
    }

    public final void k0(x6c x6c) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.c();
    }

    public final int k1(int i, t6c t6c, x6c x6c) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        f1(i, x6c);
        r97 r97 = this.v;
        int Q0 = Q0(t6c, r97, x6c);
        if (r97.b >= Q0) {
            i = i < 0 ? -Q0 : Q0;
        }
        this.r.r(-i);
        this.D = this.x;
        r97.b = 0;
        g1(t6c, r97);
        return i;
    }

    public final int l(x6c x6c) {
        return O0(x6c);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof kod) {
            kod kod = (kod) parcelable;
            this.F = kod;
            if (this.z != -1) {
                kod.o = null;
                kod.c = 0;
                kod.a = -1;
                kod.b = -1;
                kod.o = null;
                kod.c = 0;
                kod.X = 0;
                kod.Y = null;
                kod.Z = null;
            }
            w0();
        }
    }

    public final void l1(int i) {
        r97 r97 = this.v;
        r97.e = i;
        int i2 = 1;
        if (this.x != (i == -1)) {
            i2 = -1;
        }
        r97.d = i2;
    }

    public final int m(x6c x6c) {
        return P0(x6c);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kod, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [kod, android.os.Parcelable, java.lang.Object] */
    public final Parcelable m0() {
        int i;
        int m;
        int[] iArr;
        kod kod = this.F;
        if (kod != null) {
            ? obj = new Object();
            obj.c = kod.c;
            obj.a = kod.a;
            obj.b = kod.b;
            obj.o = kod.o;
            obj.X = kod.X;
            obj.Y = kod.Y;
            obj.w0 = kod.w0;
            obj.x0 = kod.x0;
            obj.y0 = kod.y0;
            obj.Z = kod.Z;
            return obj;
        }
        ? obj2 = new Object();
        obj2.w0 = this.w;
        obj2.x0 = this.D;
        obj2.y0 = this.E;
        s5c s5c = this.B;
        if (s5c == null || (iArr = (int[]) s5c.b) == null) {
            obj2.X = 0;
        } else {
            obj2.Y = iArr;
            obj2.X = iArr.length;
            obj2.Z = (List) s5c.c;
        }
        int i2 = -1;
        if (w() > 0) {
            obj2.a = this.D ? W0() : V0();
            View R0 = this.x ? R0(true) : S0(true);
            if (R0 != null) {
                i2 = a.M(R0);
            }
            obj2.b = i2;
            int i3 = this.p;
            obj2.c = i3;
            obj2.o = new int[i3];
            for (int i4 = 0; i4 < this.p; i4++) {
                if (this.D) {
                    i = this.q[i4].h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        m = this.r.h();
                    } else {
                        obj2.o[i4] = i;
                    }
                } else {
                    i = this.q[i4].j(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        m = this.r.m();
                    } else {
                        obj2.o[i4] = i;
                    }
                }
                i -= m;
                obj2.o[i4] = i;
            }
        } else {
            obj2.a = -1;
            obj2.b = -1;
            obj2.c = 0;
        }
        return obj2;
    }

    public final void m1(int i) {
        c((String) null);
        if (i != this.p) {
            this.B.b();
            w0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new lod[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new lod(this, i2);
            }
            w0();
        }
    }

    public final int n(x6c x6c) {
        return N0(x6c);
    }

    public final void n0(int i) {
        if (i == 0) {
            M0();
        }
    }

    public final void n1(int i, x6c x6c) {
        int i2;
        int i3;
        int i4;
        r97 r97 = this.v;
        boolean z2 = false;
        r97.b = 0;
        r97.c = i;
        hd7 hd7 = this.e;
        if (!(hd7 != null && hd7.e) || (i4 = x6c.a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i3 = this.r.n();
                i2 = 0;
            } else {
                i2 = this.r.n();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.z0) {
            r97.g = this.r.g() + i3;
            r97.f = -i2;
        } else {
            r97.f = this.r.m() - i2;
            r97.g = this.r.h() + i3;
        }
        r97.h = false;
        r97.a = true;
        if (this.r.j() == 0 && this.r.g() == 0) {
            z2 = true;
        }
        r97.i = z2;
    }

    public final int o(x6c x6c) {
        return O0(x6c);
    }

    public final void o1(lod lod, int i, int i2) {
        int i3 = lod.c;
        int i4 = lod.d;
        if (i == -1) {
            int i5 = lod.a;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) lod.e).get(0);
                lod.a = ((StaggeredGridLayoutManager) lod.f).r.f(view);
                ((iod) view.getLayoutParams()).getClass();
                i5 = lod.a;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = lod.b;
        if (i6 == Integer.MIN_VALUE) {
            lod.c();
            i6 = lod.b;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    public final int p(x6c x6c) {
        return P0(x6c);
    }

    public final n6c s() {
        return this.t == 0 ? new n6c(-2, -1) : new n6c(-1, -2);
    }

    public final n6c t(Context context, AttributeSet attributeSet) {
        return new n6c(context, attributeSet);
    }

    public final n6c u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new n6c((ViewGroup.MarginLayoutParams) layoutParams) : new n6c(layoutParams);
    }

    public final int x0(int i, t6c t6c, x6c x6c) {
        return k1(i, t6c, x6c);
    }

    public final void y0(int i) {
        kod kod = this.F;
        if (!(kod == null || kod.a == i)) {
            kod.o = null;
            kod.c = 0;
            kod.a = -1;
            kod.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        w0();
    }

    public final int z0(int i, t6c t6c, x6c x6c) {
        return k1(i, t6c, x6c);
    }
}
