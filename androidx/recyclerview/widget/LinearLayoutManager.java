package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends a implements w6c {
    public final u45 A;
    public final cd7 B;
    public int C;
    public final int[] D;
    public int p;
    public dd7 q;
    public o57 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public ed7 z;

    public LinearLayoutManager() {
        this(1, false);
    }

    public final boolean G0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int w2 = w();
        for (int i = 0; i < w2; i++) {
            ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void I0(RecyclerView recyclerView, int i) {
        hd7 hd7 = new hd7(recyclerView.getContext());
        hd7.a = i;
        J0(hd7);
    }

    public boolean K0() {
        return this.z == null && this.s == this.v;
    }

    public void L0(x6c x6c, int[] iArr) {
        int i;
        int n = x6c.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = n;
            n = 0;
        }
        iArr[0] = n;
        iArr[1] = i;
    }

    public void M0(x6c x6c, dd7 dd7, ry2 ry2) {
        int i = dd7.d;
        if (i >= 0 && i < x6c.b()) {
            ry2.b(i, Math.max(0, dd7.g));
        }
    }

    public final int N0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        R0();
        o57 o57 = this.r;
        boolean z2 = !this.w;
        return urd.m(x6c, o57, V0(z2), U0(z2), this, this.w);
    }

    public final int O0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        R0();
        o57 o57 = this.r;
        boolean z2 = !this.w;
        return urd.n(x6c, o57, V0(z2), U0(z2), this, this.w, this.u);
    }

    public final int P0(x6c x6c) {
        if (w() == 0) {
            return 0;
        }
        R0();
        o57 o57 = this.r;
        boolean z2 = !this.w;
        return urd.o(x6c, o57, V0(z2), U0(z2), this, this.w);
    }

    public final boolean Q() {
        return true;
    }

    public final int Q0(int i) {
        if (i == 1) {
            return (this.p != 1 && g1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && g1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.p == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [dd7, java.lang.Object] */
    public final void R0() {
        if (this.q == null) {
            ? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int S0(t6c t6c, dd7 dd7, x6c x6c, boolean z2) {
        int i;
        int i2 = dd7.c;
        int i3 = dd7.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                dd7.g = i3 + i2;
            }
            j1(t6c, dd7);
        }
        int i4 = dd7.c + dd7.h;
        while (true) {
            if ((!dd7.l && i4 <= 0) || (i = dd7.d) < 0 || i >= x6c.b()) {
                break;
            }
            cd7 cd7 = this.B;
            cd7.a = 0;
            cd7.b = false;
            cd7.c = false;
            cd7.d = false;
            h1(t6c, x6c, dd7, cd7);
            if (!cd7.b) {
                int i5 = dd7.b;
                int i6 = cd7.a;
                dd7.b = (dd7.f * i6) + i5;
                if (!cd7.c || dd7.k != null || !x6c.h) {
                    dd7.c -= i6;
                    i4 -= i6;
                }
                int i7 = dd7.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    dd7.g = i8;
                    int i9 = dd7.c;
                    if (i9 < 0) {
                        dd7.g = i8 + i9;
                    }
                    j1(t6c, dd7);
                }
                if (z2 && cd7.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - dd7.c;
    }

    public final int T0() {
        View a1 = a1(0, w(), true, false);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public final View U0(boolean z2) {
        return this.u ? a1(0, w(), z2, true) : a1(w() - 1, -1, z2, true);
    }

    public final View V0(boolean z2) {
        return this.u ? a1(w() - 1, -1, z2, true) : a1(0, w(), z2, true);
    }

    public final int W0() {
        View a1 = a1(0, w(), false, true);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public void X(RecyclerView recyclerView) {
    }

    public final int X0() {
        View a1 = a1(w() - 1, -1, true, false);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public View Y(View view, int i, t6c t6c, x6c x6c) {
        int Q0;
        l1();
        if (w() == 0 || (Q0 = Q0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        R0();
        q1(Q0, (int) (((float) this.r.n()) * 0.33333334f), false, x6c);
        dd7 dd7 = this.q;
        dd7.g = Integer.MIN_VALUE;
        dd7.a = false;
        S0(t6c, dd7, x6c, true);
        View Z0 = Q0 == -1 ? this.u ? Z0(w() - 1, -1) : Z0(0, w()) : this.u ? Z0(0, w()) : Z0(w() - 1, -1);
        View f1 = Q0 == -1 ? f1() : e1();
        if (!f1.hasFocusable()) {
            return Z0;
        }
        if (Z0 == null) {
            return null;
        }
        return f1;
    }

    public final int Y0() {
        View a1 = a1(w() - 1, -1, false, true);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(W0());
            accessibilityEvent.setToIndex(Y0());
        }
    }

    public final View Z0(int i, int i2) {
        int i3;
        int i4;
        R0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.f(v(i)) < this.r.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.p == 0 ? this.c.g(i, i2, i4, i3) : this.d.g(i, i2, i4, i3);
    }

    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < a.M(v(0))) {
            z2 = true;
        }
        if (z2 != this.u) {
            i2 = -1;
        }
        return this.p == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public final View a1(int i, int i2, boolean z2, boolean z3) {
        R0();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return this.p == 0 ? this.c.g(i, i2, i4, i3) : this.d.g(i, i2, i4, i3);
    }

    public View b1(t6c t6c, x6c x6c, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        R0();
        int w2 = w();
        if (z3) {
            i3 = w() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = w2;
            i3 = 0;
            i = 1;
        }
        int b = x6c.b();
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View v2 = v(i3);
            int M = a.M(v2);
            int f = this.r.f(v2);
            int c = this.r.c(v2);
            if (M >= 0 && M < b) {
                if (!((n6c) v2.getLayoutParams()).a.p()) {
                    boolean z4 = c <= m && f < m;
                    boolean z5 = f >= h && c > h;
                    if (!z4 && !z5) {
                        return v2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = v2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = v2;
                    }
                    view2 = v2;
                } else if (view3 == null) {
                    view3 = v2;
                }
            }
            i3 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final int c1(int i, t6c t6c, x6c x6c, boolean z2) {
        int h;
        int h2 = this.r.h() - i;
        if (h2 <= 0) {
            return 0;
        }
        int i2 = -m1(-h2, t6c, x6c);
        int i3 = i + i2;
        if (!z2 || (h = this.r.h() - i3) <= 0) {
            return i2;
        }
        this.r.r(h);
        return h + i2;
    }

    public final int d1(int i, t6c t6c, x6c x6c, boolean z2) {
        int m;
        int m2 = i - this.r.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -m1(m2, t6c, x6c);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-m);
        return i2 - m;
    }

    public boolean e() {
        return this.p == 0;
    }

    public final View e1() {
        return v(this.u ? 0 : w() - 1);
    }

    public boolean f() {
        return this.p == 1;
    }

    public final View f1() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean g1() {
        return H() == 1;
    }

    public void h1(t6c t6c, x6c x6c, dd7 dd7, cd7 cd7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View b = dd7.b(t6c);
        if (b == null) {
            cd7.b = true;
            return;
        }
        n6c n6c = (n6c) b.getLayoutParams();
        if (dd7.k == null) {
            if (this.u == (dd7.f == -1)) {
                b(-1, b, false);
            } else {
                b(0, b, false);
            }
        } else {
            if (this.u == (dd7.f == -1)) {
                b(-1, b, true);
            } else {
                b(0, b, true);
            }
        }
        n6c n6c2 = (n6c) b.getLayoutParams();
        Rect W = this.b.W(b);
        int i7 = W.left + W.right;
        int i8 = W.top + W.bottom;
        int x2 = a.x(e(), this.n, this.l, K() + J() + n6c2.leftMargin + n6c2.rightMargin + i7, n6c2.width);
        int x3 = a.x(f(), this.o, this.m, I() + L() + n6c2.topMargin + n6c2.bottomMargin + i8, n6c2.height);
        if (F0(b, x2, x3, n6c2)) {
            b.measure(x2, x3);
        }
        cd7.a = this.r.d(b);
        if (this.p == 1) {
            if (g1()) {
                i6 = this.n - K();
                i5 = i6 - this.r.e(b);
            } else {
                i5 = J();
                i6 = this.r.e(b) + i5;
            }
            if (dd7.f == -1) {
                int i9 = dd7.b;
                i = i9;
                i2 = i6;
                i3 = i9 - cd7.a;
            } else {
                int i10 = dd7.b;
                i3 = i10;
                i2 = i6;
                i = cd7.a + i10;
            }
            i4 = i5;
        } else {
            int L = L();
            int e = this.r.e(b) + L;
            if (dd7.f == -1) {
                int i11 = dd7.b;
                i4 = i11 - cd7.a;
                i2 = i11;
                i3 = L;
                i = e;
            } else {
                int i12 = dd7.b;
                i3 = L;
                i = e;
                i2 = cd7.a + i12;
                i4 = i12;
            }
        }
        S(b, i4, i3, i2, i);
        if (n6c.a.p() || n6c.a.s()) {
            cd7.c = true;
        }
        cd7.d = b.hasFocusable();
    }

    public final void i(int i, int i2, x6c x6c, ry2 ry2) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            R0();
            q1(i > 0 ? 1 : -1, Math.abs(i), true, x6c);
            M0(x6c, this.q, ry2);
        }
    }

    public void i1(t6c t6c, x6c x6c, u45 u45, int i) {
    }

    public final void j(int i, ry2 ry2) {
        int i2;
        boolean z2;
        ed7 ed7 = this.z;
        int i3 = -1;
        if (ed7 == null || (i2 = ed7.a) < 0) {
            l1();
            z2 = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = ed7.c;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            ry2.b(i2, 0);
            i2 += i3;
        }
    }

    public void j0(t6c t6c, x6c x6c) {
        View view;
        int i;
        int i2;
        List list;
        int i3;
        int i4;
        int c1;
        int i5;
        View r2;
        int f;
        int i6;
        View view2;
        View b1;
        int i7;
        int i8;
        t6c t6c2 = t6c;
        x6c x6c2 = x6c;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && x6c.b() == 0) {
            r0(t6c);
            return;
        }
        ed7 ed7 = this.z;
        if (ed7 != null && (i8 = ed7.a) >= 0) {
            this.x = i8;
        }
        R0();
        this.q.a = false;
        l1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.H(view)) {
            view = null;
        }
        u45 u45 = this.A;
        if (!u45.e || this.x != -1 || this.z != null) {
            u45.e();
            u45.d = this.u ^ this.v;
            if (!x6c2.h && (i7 = this.x) != -1) {
                if (i7 < 0 || i7 >= x6c.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    u45.b = i10;
                    ed7 ed72 = this.z;
                    if (ed72 == null || ed72.a < 0) {
                        if (this.y == Integer.MIN_VALUE) {
                            View r3 = r(i10);
                            if (r3 == null) {
                                if (w() > 0) {
                                    u45.d = (this.x < a.M(v(0))) == this.u;
                                }
                                u45.a();
                            } else if (this.r.d(r3) > this.r.n()) {
                                u45.a();
                            } else if (this.r.f(r3) - this.r.m() < 0) {
                                u45.c = this.r.m();
                                u45.d = false;
                            } else if (this.r.h() - this.r.c(r3) < 0) {
                                u45.c = this.r.h();
                                u45.d = true;
                            } else {
                                u45.c = u45.d ? this.r.o() + this.r.c(r3) : this.r.f(r3);
                            }
                        } else {
                            boolean z2 = this.u;
                            u45.d = z2;
                            if (z2) {
                                u45.c = this.r.h() - this.y;
                            } else {
                                u45.c = this.r.m() + this.y;
                            }
                        }
                        u45.e = true;
                    } else {
                        boolean z3 = ed72.c;
                        u45.d = z3;
                        if (z3) {
                            u45.c = this.r.h() - this.z.b;
                        } else {
                            u45.c = this.r.m() + this.z.b;
                        }
                        u45.e = true;
                    }
                }
            }
            if (w() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.H(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    n6c n6c = (n6c) view2.getLayoutParams();
                    if (!n6c.a.p() && n6c.a.i() >= 0 && n6c.a.i() < x6c.b()) {
                        u45.c(view2, a.M(view2));
                        u45.e = true;
                    }
                }
                boolean z4 = this.s;
                boolean z5 = this.v;
                if (z4 == z5 && (b1 = b1(t6c2, x6c2, u45.d, z5)) != null) {
                    u45.b(b1, a.M(b1));
                    if (!x6c2.h && K0()) {
                        int f2 = this.r.f(b1);
                        int c = this.r.c(b1);
                        int m = this.r.m();
                        int h = this.r.h();
                        boolean z6 = c <= m && f2 < m;
                        boolean z7 = f2 >= h && c > h;
                        if (z6 || z7) {
                            if (u45.d) {
                                m = h;
                            }
                            u45.c = m;
                        }
                    }
                    u45.e = true;
                }
            }
            u45.a();
            u45.b = this.v ? x6c.b() - 1 : 0;
            u45.e = true;
        } else if (view != null && (this.r.f(view) >= this.r.h() || this.r.c(view) <= this.r.m())) {
            u45.c(view, a.M(view));
        }
        dd7 dd7 = this.q;
        dd7.f = dd7.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        L0(x6c2, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int i11 = this.r.i() + Math.max(0, iArr[1]);
        if (!(!x6c2.h || (i5 = this.x) == -1 || this.y == Integer.MIN_VALUE || (r2 = r(i5)) == null)) {
            if (this.u) {
                i6 = this.r.h() - this.r.c(r2);
                f = this.y;
            } else {
                f = this.r.f(r2) - this.r.m();
                i6 = this.y;
            }
            int i12 = i6 - f;
            if (i12 > 0) {
                m2 += i12;
            } else {
                i11 -= i12;
            }
        }
        if (!u45.d ? !this.u : this.u) {
            i9 = 1;
        }
        i1(t6c2, x6c2, u45, i9);
        q(t6c);
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (u45.d) {
            s1(u45.b, u45.c);
            dd7 dd72 = this.q;
            dd72.h = m2;
            S0(t6c2, dd72, x6c2, false);
            dd7 dd73 = this.q;
            i2 = dd73.b;
            int i13 = dd73.d;
            int i14 = dd73.c;
            if (i14 > 0) {
                i11 += i14;
            }
            r1(u45.b, u45.c);
            dd7 dd74 = this.q;
            dd74.h = i11;
            dd74.d += dd74.e;
            S0(t6c2, dd74, x6c2, false);
            dd7 dd75 = this.q;
            i = dd75.b;
            int i15 = dd75.c;
            if (i15 > 0) {
                s1(i13, i2);
                dd7 dd76 = this.q;
                dd76.h = i15;
                S0(t6c2, dd76, x6c2, false);
                i2 = this.q.b;
            }
        } else {
            r1(u45.b, u45.c);
            dd7 dd77 = this.q;
            dd77.h = i11;
            S0(t6c2, dd77, x6c2, false);
            dd7 dd78 = this.q;
            i = dd78.b;
            int i16 = dd78.d;
            int i17 = dd78.c;
            if (i17 > 0) {
                m2 += i17;
            }
            s1(u45.b, u45.c);
            dd7 dd79 = this.q;
            dd79.h = m2;
            dd79.d += dd79.e;
            S0(t6c2, dd79, x6c2, false);
            dd7 dd710 = this.q;
            int i18 = dd710.b;
            int i19 = dd710.c;
            if (i19 > 0) {
                r1(i16, i);
                dd7 dd711 = this.q;
                dd711.h = i19;
                S0(t6c2, dd711, x6c2, false);
                i = this.q.b;
            }
            i2 = i18;
        }
        if (w() > 0) {
            if (this.u ^ this.v) {
                int c12 = c1(i, t6c2, x6c2, true);
                i3 = i2 + c12;
                i4 = i + c12;
                c1 = d1(i3, t6c2, x6c2, false);
            } else {
                int d1 = d1(i2, t6c2, x6c2, true);
                i3 = i2 + d1;
                i4 = i + d1;
                c1 = c1(i4, t6c2, x6c2, false);
            }
            i2 = i3 + c1;
            i = i4 + c1;
        }
        if (x6c2.l && w() != 0 && !x6c2.h && K0()) {
            List list2 = t6c2.d;
            int size = list2.size();
            int M = a.M(v(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                b7c b7c = (b7c) list2.get(i22);
                if (!b7c.p()) {
                    boolean z8 = b7c.i() < M;
                    boolean z9 = this.u;
                    View view3 = b7c.a;
                    if (z8 != z9) {
                        i20 += this.r.d(view3);
                    } else {
                        i21 += this.r.d(view3);
                    }
                }
            }
            this.q.k = list2;
            if (i20 > 0) {
                s1(a.M(f1()), i2);
                dd7 dd712 = this.q;
                dd712.h = i20;
                dd712.c = 0;
                dd712.a((View) null);
                S0(t6c2, this.q, x6c2, false);
            }
            if (i21 > 0) {
                r1(a.M(e1()), i);
                dd7 dd713 = this.q;
                dd713.h = i21;
                dd713.c = 0;
                list = null;
                dd713.a((View) null);
                S0(t6c2, this.q, x6c2, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!x6c2.h) {
            o57 o57 = this.r;
            o57.a = o57.n();
        } else {
            u45.e();
        }
        this.s = this.v;
    }

    public final void j1(t6c t6c, dd7 dd7) {
        if (dd7.a && !dd7.l) {
            int i = dd7.g;
            int i2 = dd7.i;
            if (dd7.f == -1) {
                int w2 = w();
                if (i >= 0) {
                    int g = (this.r.g() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < w2; i3++) {
                            View v2 = v(i3);
                            if (this.r.f(v2) < g || this.r.q(v2) < g) {
                                k1(t6c, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = w2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View v3 = v(i5);
                        if (this.r.f(v3) < g || this.r.q(v3) < g) {
                            k1(t6c, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int w3 = w();
                if (this.u) {
                    int i7 = w3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View v4 = v(i8);
                        if (this.r.c(v4) > i6 || this.r.p(v4) > i6) {
                            k1(t6c, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < w3; i9++) {
                    View v5 = v(i9);
                    if (this.r.c(v5) > i6 || this.r.p(v5) > i6) {
                        k1(t6c, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final int k(x6c x6c) {
        return N0(x6c);
    }

    public void k0(x6c x6c) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.e();
    }

    public final void k1(t6c t6c, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    u0(i3, t6c);
                }
                return;
            }
            while (i > i2) {
                u0(i, t6c);
                i--;
            }
        }
    }

    public int l(x6c x6c) {
        return O0(x6c);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof ed7) {
            ed7 ed7 = (ed7) parcelable;
            this.z = ed7;
            if (this.x != -1) {
                ed7.a = -1;
            }
            w0();
        }
    }

    public final void l1() {
        if (this.p == 1 || !g1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public int m(x6c x6c) {
        return P0(x6c);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, ed7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.os.Parcelable, ed7, java.lang.Object] */
    public final Parcelable m0() {
        ed7 ed7 = this.z;
        if (ed7 != null) {
            ? obj = new Object();
            obj.a = ed7.a;
            obj.b = ed7.b;
            obj.c = ed7.c;
            return obj;
        }
        ? obj2 = new Object();
        if (w() > 0) {
            R0();
            boolean z2 = this.s ^ this.u;
            obj2.c = z2;
            if (z2) {
                View e1 = e1();
                obj2.b = this.r.h() - this.r.c(e1);
                obj2.a = a.M(e1);
            } else {
                View f1 = f1();
                obj2.a = a.M(f1);
                obj2.b = this.r.f(f1) - this.r.m();
            }
        } else {
            obj2.a = -1;
        }
        return obj2;
    }

    public final int m1(int i, t6c t6c, x6c x6c) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        R0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        q1(i2, abs, true, x6c);
        dd7 dd7 = this.q;
        int S0 = S0(t6c, dd7, x6c, false) + dd7.g;
        if (S0 < 0) {
            return 0;
        }
        if (abs > S0) {
            i = i2 * S0;
        }
        this.r.r(-i);
        this.q.j = i;
        return i;
    }

    public final int n(x6c x6c) {
        return N0(x6c);
    }

    public final void n1(int i, int i2) {
        this.x = i;
        this.y = i2;
        ed7 ed7 = this.z;
        if (ed7 != null) {
            ed7.a = -1;
        }
        w0();
    }

    public int o(x6c x6c) {
        return O0(x6c);
    }

    public final void o1(int i) {
        if (i == 0 || i == 1) {
            c((String) null);
            if (i != this.p || this.r == null) {
                o57 b = o57.b(this, i);
                this.r = b;
                this.A.f = b;
                this.p = i;
                w0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(wn6.h(i, "invalid orientation:"));
    }

    public int p(x6c x6c) {
        return P0(x6c);
    }

    public void p1(boolean z2) {
        c((String) null);
        if (this.v != z2) {
            this.v = z2;
            w0();
        }
    }

    public final void q1(int i, int i2, boolean z2, x6c x6c) {
        int i3;
        boolean z3 = false;
        int i4 = 1;
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        L0(x6c, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        dd7 dd7 = this.q;
        int i5 = z3 ? max2 : max;
        dd7.h = i5;
        if (!z3) {
            max = max2;
        }
        dd7.i = max;
        if (z3) {
            dd7.h = this.r.i() + i5;
            View e1 = e1();
            dd7 dd72 = this.q;
            if (this.u) {
                i4 = -1;
            }
            dd72.e = i4;
            int M = a.M(e1);
            dd7 dd73 = this.q;
            dd72.d = M + dd73.e;
            dd73.b = this.r.c(e1);
            i3 = this.r.c(e1) - this.r.h();
        } else {
            View f1 = f1();
            dd7 dd74 = this.q;
            dd74.h = this.r.m() + dd74.h;
            dd7 dd75 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            dd75.e = i4;
            int M2 = a.M(f1);
            dd7 dd76 = this.q;
            dd75.d = M2 + dd76.e;
            dd76.b = this.r.f(f1);
            i3 = (-this.r.f(f1)) + this.r.m();
        }
        dd7 dd77 = this.q;
        dd77.c = i2;
        if (z2) {
            dd77.c = i2 - i3;
        }
        dd77.g = i3;
    }

    public final View r(int i) {
        int w2 = w();
        if (w2 == 0) {
            return null;
        }
        int M = i - a.M(v(0));
        if (M >= 0 && M < w2) {
            View v2 = v(M);
            if (a.M(v2) == i) {
                return v2;
            }
        }
        return super.r(i);
    }

    public final void r1(int i, int i2) {
        this.q.c = this.r.h() - i2;
        dd7 dd7 = this.q;
        dd7.e = this.u ? -1 : 1;
        dd7.d = i;
        dd7.f = 1;
        dd7.b = i2;
        dd7.g = Integer.MIN_VALUE;
    }

    public n6c s() {
        return new n6c(-2, -2);
    }

    public final void s1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        dd7 dd7 = this.q;
        dd7.d = i;
        dd7.e = this.u ? 1 : -1;
        dd7.f = -1;
        dd7.b = i2;
        dd7.g = Integer.MIN_VALUE;
    }

    public int x0(int i, t6c t6c, x6c x6c) {
        if (this.p == 1) {
            return 0;
        }
        return m1(i, t6c, x6c);
    }

    public void y0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        ed7 ed7 = this.z;
        if (ed7 != null) {
            ed7.a = -1;
        }
        w0();
    }

    public int z0(int i, t6c t6c, x6c x6c) {
        if (this.p == 0) {
            return 0;
        }
        return m1(i, t6c, x6c);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [cd7, java.lang.Object] */
    public LinearLayoutManager(int i, boolean z2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new u45();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        o1(i);
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            w0();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [cd7, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new u45();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        m6c N = a.N(context, attributeSet, i, i2);
        o1(N.a);
        boolean z2 = N.c;
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            w0();
        }
        p1(N.d);
    }
}
