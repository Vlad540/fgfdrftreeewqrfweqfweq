package defpackage;

import android.util.Pair;
import android.util.Printer;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* renamed from: xb6  reason: default package */
public final class xb6 {
    public final boolean a;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public w4g d;
    public boolean e = false;
    public w4g f;
    public boolean g = false;
    public w4g h;
    public boolean i = false;
    public int[] j;
    public boolean k = false;
    public int[] l;
    public boolean m = false;
    public vb6[] n;
    public boolean o = false;
    public int[] p;
    public boolean q = false;
    public boolean r;
    public boolean s = false;
    public int[] t;
    public boolean u = true;
    public final bc6 v = new bc6(0);
    public final bc6 w = new bc6(-100000);
    public final /* synthetic */ dc6 x;

    public xb6(ContextMenuGridLayout contextMenuGridLayout, boolean z) {
        this.x = contextMenuGridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, zb6 zb6, bc6 bc6, boolean z) {
        if (zb6.a() != 0) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((vb6) it.next()).a.equals(zb6)) {
                        return;
                    }
                }
            }
            arrayList.add(new vb6(zb6, bc6));
        }
    }

    public static boolean n(int[] iArr, vb6 vb6) {
        if (!vb6.c) {
            return false;
        }
        zb6 zb6 = vb6.a;
        int i2 = zb6.a;
        int i3 = iArr[i2] + vb6.b.a;
        int i4 = zb6.b;
        if (i3 <= iArr[i4]) {
            return false;
        }
        iArr[i4] = i3;
        return true;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb;
        String str = this.a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            vb6 vb6 = (vb6) it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            zb6 zb6 = vb6.a;
            int i2 = zb6.a;
            int i3 = vb6.b.a;
            int i4 = zb6.b;
            if (i2 < i4) {
                sb.append(str);
                sb.append(i4);
                sb.append("-");
                sb.append(str);
                sb.append(i2);
                sb.append(">=");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i2);
                sb.append("-");
                sb.append(str);
                sb.append(i4);
                sb.append("<=");
                i3 = -i3;
            }
            sb.append(i3);
            sb2.append(sb.toString());
        }
        return sb2.toString();
    }

    public final void b(w4g w4g, boolean z) {
        bc6[] bc6Arr = (bc6[]) ((Object[]) w4g.o);
        for (bc6 bc6 : bc6Arr) {
            bc6.a = Integer.MIN_VALUE;
        }
        yb6[] yb6Arr = (yb6[]) ((Object[]) g().o);
        for (int i2 = 0; i2 < yb6Arr.length; i2++) {
            int d2 = yb6Arr[i2].d(z);
            bc6 bc62 = (bc6) ((Object[]) w4g.o)[((int[]) w4g.b)[i2]];
            int i3 = bc62.a;
            if (!z) {
                d2 = -d2;
            }
            bc62.a = Math.max(i3, d2);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        dc6 dc6 = this.x;
        int childCount = dc6.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = dc6.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ac6 ac6 = (ac6) childAt.getLayoutParams();
                boolean z2 = this.a;
                zb6 zb6 = (z2 ? ac6.b : ac6.a).b;
                int i3 = z ? zb6.a : zb6.b;
                iArr[i3] = Math.max(iArr[i3], dc6.f(childAt, z2, z));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [bc6, java.lang.Object] */
    public final w4g d(boolean z) {
        zb6 zb6;
        wb6 wb6 = new wb6(zb6.class, bc6.class);
        cc6[] cc6Arr = (cc6[]) ((Object[]) g().c);
        int length = cc6Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z) {
                zb6 = cc6Arr[i2].b;
            } else {
                zb6 zb62 = cc6Arr[i2].b;
                zb6 = new zb6(zb62.b, zb62.a);
            }
            ? obj = new Object();
            obj.a = Integer.MIN_VALUE;
            wb6.add(Pair.create(zb6, obj));
        }
        return wb6.a();
    }

    public final vb6[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            w4g w4g = this.f;
            int i2 = 0;
            while (true) {
                zb6[] zb6Arr = (zb6[]) ((Object[]) w4g.c);
                if (i2 >= zb6Arr.length) {
                    break;
                }
                k(arrayList, zb6Arr[i2], ((bc6[]) ((Object[]) w4g.o))[i2], false);
                i2++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            w4g w4g2 = this.h;
            int i3 = 0;
            while (true) {
                zb6[] zb6Arr2 = (zb6[]) ((Object[]) w4g2.c);
                if (i3 >= zb6Arr2.length) {
                    break;
                }
                k(arrayList2, zb6Arr2[i3], ((bc6[]) ((Object[]) w4g2.o))[i3], false);
                i3++;
            }
            if (this.u) {
                int i4 = 0;
                while (i4 < f()) {
                    int i5 = i4 + 1;
                    k(arrayList, new zb6(i4, i5), new bc6(0), true);
                    i4 = i5;
                }
            }
            int f2 = f();
            k(arrayList, new zb6(0, f2), this.v, false);
            k(arrayList2, new zb6(f2, 0), this.w, false);
            vb6[] r2 = r(arrayList);
            vb6[] r3 = r(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(r2.getClass().getComponentType(), r2.length + r3.length);
            System.arraycopy(r2, 0, objArr, 0, r2.length);
            System.arraycopy(r3, 0, objArr, r2.length, r3.length);
            this.n = (vb6[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final w4g g() {
        int i2;
        int i3;
        w4g w4g = this.d;
        boolean z = this.a;
        dc6 dc6 = this.x;
        if (w4g == null) {
            wb6 wb6 = new wb6(cc6.class, yb6.class);
            int childCount = dc6.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                ac6 ac6 = (ac6) dc6.getChildAt(i4).getLayoutParams();
                cc6 cc6 = z ? ac6.b : ac6.a;
                wb6.add(Pair.create(cc6, cc6.a(z).o()));
            }
            this.d = wb6.a();
        }
        if (!this.e) {
            yb6[] yb6Arr = (yb6[]) ((Object[]) this.d.o);
            for (yb6 c2 : yb6Arr) {
                c2.c();
            }
            int childCount2 = dc6.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = dc6.getChildAt(i5);
                ac6 ac62 = (ac6) childAt.getLayoutParams();
                cc6 cc62 = z ? ac62.b : ac62.a;
                if (childAt.getVisibility() == 8) {
                    i2 = 0;
                } else {
                    i2 = dc6.e(childAt, z, false) + dc6.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (cc62.d == 0.0f) {
                    i3 = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[dc6.getChildCount()];
                    }
                    i3 = this.t[i5];
                }
                int i6 = i2 + i3;
                w4g w4g2 = this.d;
                yb6 yb6 = (yb6) ((Object[]) w4g2.o)[((int[]) w4g2.b)[i5]];
                yb6.c = ((cc62.c == dc6.J0 && cc62.d == 0.0f) ? 0 : 2) & yb6.c;
                int m2 = cc62.a(z).m(childAt, i6, dc6.getLayoutMode());
                yb6.b(m2, i6 - m2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[(f() + 1)];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            dc6 dc6 = this.x;
            float f2 = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = dc6.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = dc6.getChildAt(i2);
                    if (childAt.getVisibility() != 8) {
                        ac6 ac6 = (ac6) childAt.getLayoutParams();
                        if ((z3 ? ac6.b : ac6.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                this.r = z;
                this.s = true;
            }
            if (!this.r) {
                q(e(), iArr, true);
            } else {
                if (this.t == null) {
                    this.t = new int[dc6.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (dc6.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = dc6.getChildCount();
                    for (int i3 = 0; i3 < childCount3; i3++) {
                        View childAt2 = dc6.getChildAt(i3);
                        if (childAt2.getVisibility() != 8) {
                            ac6 ac62 = (ac6) childAt2.getLayoutParams();
                            f2 += (z3 ? ac62.b : ac62.a).d;
                        }
                    }
                    int i4 = -1;
                    boolean z4 = true;
                    int i5 = 0;
                    while (i5 < childCount2) {
                        int i6 = (int) ((((long) i5) + ((long) childCount2)) / 2);
                        m();
                        p(i6, f2);
                        boolean q2 = q(e(), iArr, false);
                        if (q2) {
                            i5 = i6 + 1;
                            i4 = i6;
                        } else {
                            childCount2 = i6;
                        }
                        z4 = q2;
                    }
                    if (i4 > 0 && !z4) {
                        m();
                        p(i4, f2);
                        q(e(), iArr, true);
                    }
                }
            }
            if (!this.u) {
                int i7 = iArr[0];
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    iArr[i8] = iArr[i8] - i7;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        int i2 = Integer.MIN_VALUE;
        if (this.c == Integer.MIN_VALUE) {
            dc6 dc6 = this.x;
            int childCount = dc6.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                ac6 ac6 = (ac6) dc6.getChildAt(i4).getLayoutParams();
                zb6 zb6 = (this.a ? ac6.b : ac6.a).b;
                i3 = Math.max(Math.max(Math.max(i3, zb6.a), zb6.b), zb6.a());
            }
            if (i3 != -1) {
                i2 = i3;
            }
            this.c = Math.max(0, i2);
        }
        return this.c;
    }

    public final int j(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            this.v.a = 0;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        } else if (mode == 0) {
            this.v.a = 0;
            this.w.a = -100000;
            this.q = false;
            return h()[f()];
        } else if (mode != 1073741824) {
            return 0;
        } else {
            this.v.a = size;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        }
    }

    public final void l() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i2) {
        if (i2 == Integer.MIN_VALUE || i2 >= i()) {
            this.b = i2;
        } else {
            dc6.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(int i2, float f2) {
        Arrays.fill(this.t, 0);
        dc6 dc6 = this.x;
        int childCount = dc6.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = dc6.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ac6 ac6 = (ac6) childAt.getLayoutParams();
                float f3 = (this.a ? ac6.b : ac6.a).d;
                if (f3 != 0.0f) {
                    int round = Math.round((((float) i2) * f3) / f2);
                    this.t[i3] = round;
                    i2 -= round;
                    f2 -= f3;
                }
            }
        }
    }

    public final boolean q(vb6[] vb6Arr, int[] iArr, boolean z) {
        String str = this.a ? "horizontal" : "vertical";
        int f2 = f() + 1;
        boolean[] zArr = null;
        for (int i2 = 0; i2 < vb6Arr.length; i2++) {
            Arrays.fill(iArr, 0);
            for (int i3 = 0; i3 < f2; i3++) {
                boolean z2 = false;
                for (vb6 n2 : vb6Arr) {
                    z2 |= n(iArr, n2);
                }
                if (!z2) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < vb6Arr.length; i4++) {
                            vb6 vb6 = vb6Arr[i4];
                            if (zArr[i4]) {
                                arrayList.add(vb6);
                            }
                            if (!vb6.c) {
                                arrayList2.add(vb6);
                            }
                        }
                        Printer printer = this.x.z0;
                        StringBuilder n3 = me4.n(str, " constraints: ");
                        n3.append(a(arrayList));
                        n3.append(" are inconsistent; permanently removing: ");
                        n3.append(a(arrayList2));
                        n3.append(". ");
                        printer.println(n3.toString());
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[vb6Arr.length];
            for (int i5 = 0; i5 < f2; i5++) {
                int length = vb6Arr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    zArr2[i6] = zArr2[i6] | n(iArr, vb6Arr[i6]);
                }
            }
            if (i2 == 0) {
                zArr = zArr2;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= vb6Arr.length) {
                    break;
                }
                if (zArr2[i7]) {
                    vb6 vb62 = vb6Arr[i7];
                    zb6 zb6 = vb62.a;
                    if (zb6.a >= zb6.b) {
                        vb62.c = false;
                        break;
                    }
                }
                i7++;
            }
        }
        return true;
    }

    public final vb6[] r(ArrayList arrayList) {
        ope ope = new ope(this, (vb6[]) arrayList.toArray(new vb6[arrayList.size()]));
        int length = ((vb6[][]) ope.X).length;
        for (int i2 = 0; i2 < length; i2++) {
            ope.Z(i2);
        }
        return (vb6[]) ope.o;
    }
}
