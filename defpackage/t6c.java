package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: t6c  reason: default package */
public final class t6c {
    public final ArrayList a;
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d;
    public int e;
    public int f;
    public b g;
    public final /* synthetic */ RecyclerView h;

    public t6c(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(b7c b7c, boolean z) {
        RecyclerView.o(b7c);
        RecyclerView recyclerView = this.h;
        d7c d7c = recyclerView.D1;
        if (d7c != null) {
            c7c c7c = d7c.e;
            boolean z2 = c7c instanceof c7c;
            View view = b7c.a;
            eaf.j(view, z2 ? (b4) c7c.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.G0;
            if (arrayList.size() <= 0) {
                f6c f6c = recyclerView.E0;
                if (f6c != null) {
                    f6c.y(b7c);
                }
                if (recyclerView.w1 != null) {
                    recyclerView.y0.r(b7c);
                }
                if (RecyclerView.Q1) {
                    Objects.toString(b7c);
                }
            } else {
                hr1.r(arrayList.get(0));
                throw null;
            }
        }
        b7c.H0 = null;
        b7c.G0 = null;
        c().putRecycledView(b7c);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.w1.b()) {
            return !recyclerView.w1.h ? i : recyclerView.w0.A(i, 0);
        }
        StringBuilder m = me4.m(i, "invalid position ", ". State item count is ");
        m.append(recyclerView.w1.b());
        m.append(recyclerView.F());
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final b c() {
        if (this.g == null) {
            this.g = new b();
            d();
        }
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r2 = this;
            androidx.recyclerview.widget.b r0 = r2.g
            if (r0 == 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r2 = r2.h
            f6c r1 = r2.E0
            if (r1 == 0) goto L_0x0011
            boolean r2 = r2.K0
            if (r2 == 0) goto L_0x0011
            r0.attachForPoolingContainer(r1)
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6c.d():void");
    }

    public final void e() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            f(size);
        }
        this.c.clear();
        if (RecyclerView.V1) {
            ry2 ry2 = this.h.v1;
            int[] iArr = ry2.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            ry2.d = 0;
        }
    }

    public final void f(int i) {
        boolean z = RecyclerView.P1;
        b7c b7c = (b7c) this.c.get(i);
        if (RecyclerView.Q1) {
            Objects.toString(b7c);
        }
        a(b7c, true);
        this.c.remove(i);
    }

    public final void g(View view) {
        b7c U = RecyclerView.U(view);
        boolean r = U.r();
        RecyclerView recyclerView = this.h;
        if (r) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.q()) {
            U.C0.k(U);
        } else if (U.y()) {
            U.y0 &= -33;
        }
        h(U);
        if (recyclerView.e1 != null && !U.o()) {
            recyclerView.e1.d(U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.b7c r12) {
        /*
            r11 = this;
            boolean r0 = r12.q()
            r1 = 0
            r2 = 1
            androidx.recyclerview.widget.RecyclerView r3 = r11.h
            android.view.View r4 = r12.a
            if (r0 != 0) goto L_0x0121
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0014
            goto L_0x0121
        L_0x0014:
            boolean r0 = r12.r()
            if (r0 != 0) goto L_0x010d
            boolean r0 = r12.w()
            if (r0 != 0) goto L_0x00fc
            int r0 = r12.y0
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = defpackage.eaf.a
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L_0x0030
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f6c r5 = r3.E0
            if (r5 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x003f
            boolean r5 = r5.v(r12)
            if (r5 == 0) goto L_0x003f
            r5 = r2
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.P1
            if (r6 == 0) goto L_0x0061
            java.util.ArrayList r6 = r11.c
            boolean r6 = r6.contains(r12)
            if (r6 != 0) goto L_0x004d
            goto L_0x0061
        L_0x004d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cached view received recycle internal? "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = th2.g(r3, r0)
            r11.<init>(r12)
            throw r11
        L_0x0061:
            if (r5 != 0) goto L_0x0074
            boolean r5 = r12.o()
            if (r5 == 0) goto L_0x006a
            goto L_0x0074
        L_0x006a:
            boolean r11 = androidx.recyclerview.widget.RecyclerView.Q1
            if (r11 == 0) goto L_0x0071
            r3.F()
        L_0x0071:
            r2 = r1
            goto L_0x00e8
        L_0x0074:
            int r5 = r11.f
            if (r5 <= 0) goto L_0x00de
            r5 = 526(0x20e, float:7.37E-43)
            boolean r5 = r12.k(r5)
            if (r5 != 0) goto L_0x00de
            java.util.ArrayList r5 = r11.c
            int r5 = r5.size()
            int r6 = r11.f
            if (r5 < r6) goto L_0x0091
            if (r5 <= 0) goto L_0x0091
            r11.f(r1)
            int r5 = r5 + -1
        L_0x0091:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.V1
            if (r6 == 0) goto L_0x00d7
            if (r5 <= 0) goto L_0x00d7
            ry2 r6 = r3.v1
            int r7 = r12.c
            int[] r8 = r6.c
            if (r8 == 0) goto L_0x00b0
            int r8 = r6.d
            int r8 = r8 * 2
            r9 = r1
        L_0x00a4:
            if (r9 >= r8) goto L_0x00b0
            int[] r10 = r6.c
            r10 = r10[r9]
            if (r10 != r7) goto L_0x00ad
            goto L_0x00d7
        L_0x00ad:
            int r9 = r9 + 2
            goto L_0x00a4
        L_0x00b0:
            int r5 = r5 - r2
        L_0x00b1:
            if (r5 < 0) goto L_0x00d6
            java.util.ArrayList r6 = r11.c
            java.lang.Object r6 = r6.get(r5)
            b7c r6 = (defpackage.b7c) r6
            int r6 = r6.c
            ry2 r7 = r3.v1
            int[] r8 = r7.c
            if (r8 == 0) goto L_0x00d6
            int r8 = r7.d
            int r8 = r8 * 2
            r9 = r1
        L_0x00c8:
            if (r9 >= r8) goto L_0x00d6
            int[] r10 = r7.c
            r10 = r10[r9]
            if (r10 != r6) goto L_0x00d3
            int r5 = r5 + -1
            goto L_0x00b1
        L_0x00d3:
            int r9 = r9 + 2
            goto L_0x00c8
        L_0x00d6:
            int r5 = r5 + r2
        L_0x00d7:
            java.util.ArrayList r6 = r11.c
            r6.add(r5, r12)
            r5 = r2
            goto L_0x00df
        L_0x00de:
            r5 = r1
        L_0x00df:
            if (r5 != 0) goto L_0x00e6
            r11.a(r12, r2)
        L_0x00e4:
            r1 = r5
            goto L_0x00e8
        L_0x00e6:
            r2 = r1
            goto L_0x00e4
        L_0x00e8:
            v2b r11 = r3.y0
            r11.r(r12)
            if (r1 != 0) goto L_0x00fb
            if (r2 != 0) goto L_0x00fb
            if (r0 == 0) goto L_0x00fb
            defpackage.l0b.a(r4)
            r11 = 0
            r12.H0 = r11
            r12.G0 = r11
        L_0x00fb:
            return
        L_0x00fc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r12.<init>(r0)
            java.lang.String r12 = th2.g(r3, r12)
            r11.<init>(r12)
            throw r11
        L_0x010d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = th2.g(r3, r0)
            r11.<init>(r12)
            throw r11
        L_0x0121:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Scrapped or attached views may not be recycled. isScrap:"
            r0.<init>(r5)
            boolean r12 = r12.q()
            r0.append(r12)
            java.lang.String r12 = " isAttached:"
            r0.append(r12)
            android.view.ViewParent r12 = r4.getParent()
            if (r12 == 0) goto L_0x013d
            r1 = r2
        L_0x013d:
            r0.append(r1)
            java.lang.String r12 = r3.F()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6c.h(b7c):void");
    }

    public final void i(View view) {
        k6c k6c;
        b7c U = RecyclerView.U(view);
        boolean k = U.k(12);
        RecyclerView recyclerView = this.h;
        if (!k && U.s() && (k6c = recyclerView.e1) != null) {
            w84 w84 = (w84) k6c;
            if (U.j().isEmpty() && w84.g && !U.n()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                U.C0 = this;
                U.D0 = true;
                this.b.add(U);
                return;
            }
        }
        if (!U.n() || U.p() || recyclerView.E0.b) {
            U.C0 = this;
            U.D0 = false;
            this.a.add(U);
            return;
        }
        throw new IllegalArgumentException(th2.g(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03f1, code lost:
        if (r11.n() == false) goto L_0x03f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b7c j(int r22, long r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = -1
            r8 = 1
            androidx.recyclerview.widget.RecyclerView r9 = r0.h
            if (r1 < 0) goto L_0x04e7
            x6c r3 = r9.w1
            int r3 = r3.b()
            if (r1 >= r3) goto L_0x04e7
            x6c r10 = r9.w1
            boolean r3 = r10.h
            r12 = 0
            r4 = 32
            if (r3 == 0) goto L_0x0084
            java.util.ArrayList r3 = r0.b
            if (r3 == 0) goto L_0x007d
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0026
            goto L_0x007d
        L_0x0026:
            r5 = r12
        L_0x0027:
            if (r5 >= r3) goto L_0x0043
            java.util.ArrayList r6 = r0.b
            java.lang.Object r6 = r6.get(r5)
            b7c r6 = (defpackage.b7c) r6
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0041
            int r7 = r6.i()
            if (r7 != r1) goto L_0x0041
            r6.f(r4)
            goto L_0x007e
        L_0x0041:
            int r5 = r5 + r8
            goto L_0x0027
        L_0x0043:
            f6c r5 = r9.E0
            boolean r5 = r5.b
            if (r5 == 0) goto L_0x007d
            b9 r5 = r9.w0
            int r5 = r5.A(r1, r12)
            if (r5 <= 0) goto L_0x007d
            f6c r6 = r9.E0
            int r6 = r6.j()
            if (r5 >= r6) goto L_0x007d
            f6c r6 = r9.E0
            long r5 = r6.k(r5)
            r7 = r12
        L_0x0060:
            if (r7 >= r3) goto L_0x007d
            java.util.ArrayList r13 = r0.b
            java.lang.Object r13 = r13.get(r7)
            b7c r13 = (defpackage.b7c) r13
            boolean r14 = r13.y()
            if (r14 != 0) goto L_0x007b
            long r14 = r13.X
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 != 0) goto L_0x007b
            r13.f(r4)
            r6 = r13
            goto L_0x007e
        L_0x007b:
            int r7 = r7 + r8
            goto L_0x0060
        L_0x007d:
            r6 = 0
        L_0x007e:
            if (r6 == 0) goto L_0x0082
            r3 = r8
            goto L_0x0086
        L_0x0082:
            r3 = r12
            goto L_0x0086
        L_0x0084:
            r3 = r12
            r6 = 0
        L_0x0086:
            if (r6 != 0) goto L_0x024a
            java.util.ArrayList r5 = r0.a
            int r5 = r5.size()
            r6 = r12
        L_0x008f:
            if (r6 >= r5) goto L_0x00bd
            java.util.ArrayList r7 = r0.a
            java.lang.Object r7 = r7.get(r6)
            b7c r7 = (defpackage.b7c) r7
            boolean r13 = r7.y()
            if (r13 != 0) goto L_0x00bb
            int r13 = r7.i()
            if (r13 != r1) goto L_0x00bb
            boolean r13 = r7.n()
            if (r13 != 0) goto L_0x00bb
            boolean r13 = r10.h
            if (r13 != 0) goto L_0x00b5
            boolean r13 = r7.p()
            if (r13 != 0) goto L_0x00bb
        L_0x00b5:
            r7.f(r4)
        L_0x00b8:
            r6 = r7
            goto L_0x01b6
        L_0x00bb:
            int r6 = r6 + r8
            goto L_0x008f
        L_0x00bd:
            ope r5 = r9.x0
            java.lang.Object r6 = r5.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r7 = r6.size()
            r13 = r12
        L_0x00c8:
            if (r13 >= r7) goto L_0x00f0
            java.lang.Object r14 = r6.get(r13)
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r15 = r5.o
            u41 r15 = (defpackage.u41) r15
            r15.getClass()
            b7c r15 = androidx.recyclerview.widget.RecyclerView.U(r14)
            int r11 = r15.i()
            if (r11 != r1) goto L_0x00ee
            boolean r11 = r15.n()
            if (r11 != 0) goto L_0x00ee
            boolean r11 = r15.p()
            if (r11 != 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            int r13 = r13 + r8
            goto L_0x00c8
        L_0x00f0:
            r14 = 0
        L_0x00f1:
            if (r14 == 0) goto L_0x0182
            b7c r5 = androidx.recyclerview.widget.RecyclerView.U(r14)
            ope r6 = r9.x0
            java.lang.Object r7 = r6.o
            u41 r7 = (defpackage.u41) r7
            androidx.recyclerview.widget.RecyclerView r7 = r7.a
            int r7 = r7.indexOfChild(r14)
            if (r7 < 0) goto L_0x016e
            java.lang.Object r11 = r6.X
            xw2 r11 = (defpackage.xw2) r11
            boolean r13 = r11.S(r7)
            if (r13 == 0) goto L_0x015a
            r11.P(r7)
            r6.X(r14)
            ope r6 = r9.x0
            java.lang.Object r7 = r6.o
            u41 r7 = (defpackage.u41) r7
            androidx.recyclerview.widget.RecyclerView r7 = r7.a
            int r7 = r7.indexOfChild(r14)
            if (r7 != r2) goto L_0x0125
        L_0x0123:
            r7 = r2
            goto L_0x0135
        L_0x0125:
            java.lang.Object r6 = r6.X
            xw2 r6 = (defpackage.xw2) r6
            boolean r11 = r6.S(r7)
            if (r11 == 0) goto L_0x0130
            goto L_0x0123
        L_0x0130:
            int r6 = r6.Q(r7)
            int r7 = r7 - r6
        L_0x0135:
            if (r7 == r2) goto L_0x0146
            ope r6 = r9.x0
            r6.t(r7)
            r0.i(r14)
            r6 = 8224(0x2020, float:1.1524E-41)
            r5.f(r6)
            r6 = r5
            goto L_0x01b6
        L_0x0146:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = th2.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0182:
            java.util.ArrayList r5 = r0.c
            int r5 = r5.size()
            r6 = r12
        L_0x0189:
            if (r6 >= r5) goto L_0x01b5
            java.util.ArrayList r7 = r0.c
            java.lang.Object r7 = r7.get(r6)
            b7c r7 = (defpackage.b7c) r7
            boolean r11 = r7.n()
            if (r11 != 0) goto L_0x01b3
            int r11 = r7.i()
            if (r11 != r1) goto L_0x01b3
            boolean r11 = r7.l()
            if (r11 != 0) goto L_0x01b3
            java.util.ArrayList r5 = r0.c
            r5.remove(r6)
            boolean r5 = androidx.recyclerview.widget.RecyclerView.Q1
            if (r5 == 0) goto L_0x00b8
            r7.toString()
            goto L_0x00b8
        L_0x01b3:
            int r6 = r6 + r8
            goto L_0x0189
        L_0x01b5:
            r6 = 0
        L_0x01b6:
            if (r6 == 0) goto L_0x024a
            boolean r5 = r6.p()
            if (r5 == 0) goto L_0x01db
            boolean r5 = androidx.recyclerview.widget.RecyclerView.P1
            if (r5 == 0) goto L_0x01d8
            boolean r5 = r10.h
            if (r5 == 0) goto L_0x01c7
            goto L_0x01d8
        L_0x01c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "should not receive a removed view unless it is pre layout"
            r1.<init>(r2)
            java.lang.String r1 = th2.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x01d8:
            boolean r5 = r10.h
            goto L_0x020c
        L_0x01db:
            int r5 = r6.c
            if (r5 < 0) goto L_0x0236
            f6c r7 = r9.E0
            int r7 = r7.j()
            if (r5 >= r7) goto L_0x0236
            boolean r5 = r10.h
            if (r5 != 0) goto L_0x01f9
            f6c r5 = r9.E0
            int r7 = r6.c
            int r5 = r5.l(r7)
            int r7 = r6.Y
            if (r5 == r7) goto L_0x01f9
        L_0x01f7:
            r5 = r12
            goto L_0x020c
        L_0x01f9:
            f6c r5 = r9.E0
            boolean r7 = r5.b
            if (r7 == 0) goto L_0x020b
            long r13 = r6.X
            int r7 = r6.c
            long r16 = r5.k(r7)
            int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x01f7
        L_0x020b:
            r5 = r8
        L_0x020c:
            if (r5 != 0) goto L_0x0234
            r5 = 4
            r6.f(r5)
            boolean r5 = r6.q()
            if (r5 == 0) goto L_0x0223
            android.view.View r5 = r6.a
            r9.removeDetachedView(r5, r12)
            t6c r5 = r6.C0
            r5.k(r6)
            goto L_0x022f
        L_0x0223:
            boolean r5 = r6.y()
            if (r5 == 0) goto L_0x022f
            int r5 = r6.y0
            r5 = r5 & -33
            r6.y0 = r5
        L_0x022f:
            r0.h(r6)
            r6 = 0
            goto L_0x024a
        L_0x0234:
            r3 = r8
            goto L_0x024a
        L_0x0236:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = th2.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x024a:
            if (r6 != 0) goto L_0x039b
            b9 r5 = r9.w0
            int r5 = r5.A(r1, r12)
            if (r5 < 0) goto L_0x0379
            f6c r7 = r9.E0
            int r7 = r7.j()
            if (r5 >= r7) goto L_0x0379
            f6c r7 = r9.E0
            int r11 = r7.l(r5)
            f6c r7 = r9.E0
            boolean r15 = r7.b
            if (r15 == 0) goto L_0x0300
            long r6 = r7.k(r5)
            java.util.ArrayList r15 = r0.a
            int r15 = r15.size()
            int r15 = r15 - r8
        L_0x0273:
            if (r15 < 0) goto L_0x02c6
            java.util.ArrayList r13 = r0.a
            java.lang.Object r13 = r13.get(r15)
            b7c r13 = (defpackage.b7c) r13
            r18 = r3
            long r2 = r13.X
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x02c1
            boolean r2 = r13.y()
            if (r2 != 0) goto L_0x02c1
            int r2 = r13.Y
            if (r11 != r2) goto L_0x02a5
            r13.f(r4)
            boolean r2 = r13.p()
            if (r2 == 0) goto L_0x02f8
            boolean r2 = r10.h
            if (r2 != 0) goto L_0x02f8
            int r2 = r13.y0
            r2 = r2 & -15
            r2 = r2 | 2
            r13.y0 = r2
            goto L_0x02f8
        L_0x02a5:
            java.util.ArrayList r2 = r0.a
            r2.remove(r15)
            android.view.View r2 = r13.a
            r9.removeDetachedView(r2, r12)
            b7c r2 = androidx.recyclerview.widget.RecyclerView.U(r2)
            r3 = 0
            r2.C0 = r3
            r2.D0 = r12
            int r3 = r2.y0
            r3 = r3 & -33
            r2.y0 = r3
            r0.h(r2)
        L_0x02c1:
            r2 = -1
            int r15 = r15 + r2
            r3 = r18
            goto L_0x0273
        L_0x02c6:
            r18 = r3
            java.util.ArrayList r2 = r0.c
            int r2 = r2.size()
            int r2 = r2 - r8
        L_0x02cf:
            if (r2 < 0) goto L_0x02f3
            java.util.ArrayList r3 = r0.c
            java.lang.Object r3 = r3.get(r2)
            b7c r3 = (defpackage.b7c) r3
            long r14 = r3.X
            int r13 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x02f5
            boolean r13 = r3.l()
            if (r13 != 0) goto L_0x02f5
            int r4 = r3.Y
            if (r11 != r4) goto L_0x02f0
            java.util.ArrayList r4 = r0.c
            r4.remove(r2)
            r13 = r3
            goto L_0x02f8
        L_0x02f0:
            r0.f(r2)
        L_0x02f3:
            r13 = 0
            goto L_0x02f8
        L_0x02f5:
            r3 = -1
            int r2 = r2 + r3
            goto L_0x02cf
        L_0x02f8:
            if (r13 == 0) goto L_0x02fe
            r13.c = r5
            r18 = r8
        L_0x02fe:
            r6 = r13
            goto L_0x0302
        L_0x0300:
            r18 = r3
        L_0x0302:
            if (r6 != 0) goto L_0x0314
            boolean r2 = androidx.recyclerview.widget.RecyclerView.P1
            androidx.recyclerview.widget.b r2 = r21.c()
            b7c r2 = r2.getRecycledView(r11)
            if (r2 == 0) goto L_0x0313
            r2.u()
        L_0x0313:
            r6 = r2
        L_0x0314:
            if (r6 != 0) goto L_0x0369
            long r13 = r9.getNanoTime()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0331
            androidx.recyclerview.widget.b r2 = r0.g
            r3 = r11
            r4 = r13
            r6 = r23
            boolean r2 = r2.willCreateInTime(r3, r4, r6)
            if (r2 != 0) goto L_0x0331
            r2 = 0
            return r2
        L_0x0331:
            f6c r2 = r9.E0
            r2.getClass()
            java.lang.String r3 = "RV CreateView"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x036b }
            b7c r6 = r2.t(r9, r11)     // Catch:{ all -> 0x036b }
            android.view.View r2 = r6.a     // Catch:{ all -> 0x036b }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ all -> 0x036b }
            if (r2 != 0) goto L_0x036d
            r6.Y = r11     // Catch:{ all -> 0x036b }
            android.os.Trace.endSection()
            boolean r2 = androidx.recyclerview.widget.RecyclerView.V1
            if (r2 == 0) goto L_0x035f
            android.view.View r2 = r6.a
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.L(r2)
            if (r2 == 0) goto L_0x035f
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r6.b = r3
        L_0x035f:
            long r2 = r9.getNanoTime()
            androidx.recyclerview.widget.b r4 = r0.g
            long r2 = r2 - r13
            r4.factorInCreateTime(r11, r2)
        L_0x0369:
            r11 = r6
            goto L_0x039e
        L_0x036b:
            r0 = move-exception
            goto L_0x0375
        L_0x036d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x036b }
            java.lang.String r1 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r1)     // Catch:{ all -> 0x036b }
            throw r0     // Catch:{ all -> 0x036b }
        L_0x0375:
            android.os.Trace.endSection()
            throw r0
        L_0x0379:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Inconsistency detected. Invalid item position "
            java.lang.String r3 = "(offset:"
            java.lang.String r4 = ").state:"
            java.lang.StringBuilder r1 = rf0.i(r2, r1, r3, r5, r4)
            int r2 = r10.b()
            r1.append(r2)
            java.lang.String r2 = r9.F()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x039b:
            r18 = r3
            goto L_0x0369
        L_0x039e:
            if (r18 == 0) goto L_0x03cd
            boolean r2 = r10.h
            if (r2 != 0) goto L_0x03cd
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r11.k(r2)
            if (r2 == 0) goto L_0x03cd
            int r2 = r11.y0
            r2 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r11.y0 = r2
            boolean r2 = r10.k
            if (r2 == 0) goto L_0x03cd
            defpackage.k6c.b(r11)
            k6c r2 = r9.e1
            r11.j()
            r2.getClass()
            ms r2 = new ms
            r3 = 7
            r2.<init>(r3)
            r2.c(r11)
            r9.l0(r11, r2)
        L_0x03cd:
            boolean r2 = r10.h
            android.view.View r13 = r11.a
            if (r2 == 0) goto L_0x03dc
            boolean r2 = r11.m()
            if (r2 == 0) goto L_0x03dc
            r11.Z = r1
            goto L_0x03f4
        L_0x03dc:
            boolean r2 = r11.m()
            if (r2 == 0) goto L_0x03f7
            int r2 = r11.y0
            r2 = r2 & 2
            if (r2 == 0) goto L_0x03ea
            r2 = r8
            goto L_0x03eb
        L_0x03ea:
            r2 = r12
        L_0x03eb:
            if (r2 != 0) goto L_0x03f7
            boolean r2 = r11.n()
            if (r2 == 0) goto L_0x03f4
            goto L_0x03f7
        L_0x03f4:
            r0 = r12
            goto L_0x04ba
        L_0x03f7:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.P1
            if (r2 == 0) goto L_0x0416
            boolean r2 = r11.p()
            if (r2 != 0) goto L_0x0402
            goto L_0x0416
        L_0x0402:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = th2.g(r9, r1)
            r0.<init>(r1)
            throw r0
        L_0x0416:
            b9 r2 = r9.w0
            int r14 = r2.A(r1, r12)
            r15 = 0
            r11.H0 = r15
            r11.G0 = r9
            int r3 = r11.Y
            long r19 = r9.getNanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x043d
            androidx.recyclerview.widget.b r2 = r0.g
            r4 = r19
            r6 = r23
            boolean r2 = r2.willBindInTime(r3, r4, r6)
            if (r2 != 0) goto L_0x043d
            goto L_0x03f4
        L_0x043d:
            boolean r2 = r11.r()
            if (r2 == 0) goto L_0x0450
            int r2 = r9.getChildCount()
            android.view.ViewGroup$LayoutParams r3 = r13.getLayoutParams()
            r9.attachViewToParent(r13, r2, r3)
            r2 = r8
            goto L_0x0451
        L_0x0450:
            r2 = r12
        L_0x0451:
            f6c r3 = r9.E0
            r3.h(r11, r14)
            if (r2 == 0) goto L_0x045b
            r9.detachViewFromParent(r13)
        L_0x045b:
            long r2 = r9.getNanoTime()
            androidx.recyclerview.widget.b r0 = r0.g
            int r4 = r11.Y
            long r2 = r2 - r19
            r0.factorInBindTime(r4, r2)
            android.view.accessibility.AccessibilityManager r0 = r9.T0
            if (r0 == 0) goto L_0x0474
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0474
            r0 = r8
            goto L_0x0475
        L_0x0474:
            r0 = r12
        L_0x0475:
            if (r0 == 0) goto L_0x04b3
            java.util.WeakHashMap r0 = defpackage.eaf.a
            int r0 = r13.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0482
            r13.setImportantForAccessibility(r8)
        L_0x0482:
            d7c r0 = r9.D1
            if (r0 != 0) goto L_0x0487
            goto L_0x04b3
        L_0x0487:
            c7c r0 = r0.e
            boolean r2 = r0 instanceof defpackage.c7c
            if (r2 == 0) goto L_0x04b0
            r0.getClass()
            android.view.View$AccessibilityDelegate r2 = defpackage.z9f.a(r13)
            if (r2 != 0) goto L_0x0497
            goto L_0x04a7
        L_0x0497:
            boolean r3 = r2 instanceof defpackage.a4
            if (r3 == 0) goto L_0x04a1
            a4 r2 = (defpackage.a4) r2
            b4 r2 = r2.a
            r15 = r2
            goto L_0x04a7
        L_0x04a1:
            b4 r3 = new b4
            r3.<init>(r2)
            r15 = r3
        L_0x04a7:
            if (r15 == 0) goto L_0x04b0
            if (r15 == r0) goto L_0x04b0
            java.util.WeakHashMap r2 = r0.e
            r2.put(r13, r15)
        L_0x04b0:
            defpackage.eaf.j(r13, r0)
        L_0x04b3:
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x04b9
            r11.Z = r1
        L_0x04b9:
            r0 = r8
        L_0x04ba:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            if (r1 != 0) goto L_0x04ca
            android.view.ViewGroup$LayoutParams r1 = r9.generateDefaultLayoutParams()
            n6c r1 = (defpackage.n6c) r1
            r13.setLayoutParams(r1)
            goto L_0x04dc
        L_0x04ca:
            boolean r2 = r9.checkLayoutParams(r1)
            if (r2 != 0) goto L_0x04da
            android.view.ViewGroup$LayoutParams r1 = r9.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            n6c r1 = (defpackage.n6c) r1
            r13.setLayoutParams(r1)
            goto L_0x04dc
        L_0x04da:
            n6c r1 = (defpackage.n6c) r1
        L_0x04dc:
            r1.a = r11
            if (r18 == 0) goto L_0x04e3
            if (r0 == 0) goto L_0x04e3
            goto L_0x04e4
        L_0x04e3:
            r8 = r12
        L_0x04e4:
            r1.o = r8
            return r11
        L_0x04e7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Invalid item position "
            java.lang.String r3 = "("
            java.lang.String r4 = "). Item count:"
            java.lang.StringBuilder r1 = rf0.i(r2, r1, r3, r1, r4)
            x6c r2 = r9.w1
            int r2 = r2.b()
            r1.append(r2)
            java.lang.String r2 = r9.F()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6c.j(int, long):b7c");
    }

    public final void k(b7c b7c) {
        if (b7c.D0) {
            this.b.remove(b7c);
        } else {
            this.a.remove(b7c);
        }
        b7c.C0 = null;
        b7c.D0 = false;
        b7c.y0 &= -33;
    }

    public final void l() {
        a aVar = this.h.F0;
        this.f = this.e + (aVar != null ? aVar.j : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            f(size);
        }
    }
}
