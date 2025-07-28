package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: lx3  reason: default package */
public abstract class lx3 extends f6c implements lrd {
    public final rr3 X;
    public ArrayList Y;
    public int Z;
    public final /* synthetic */ int o;
    public final SparseArray w0;
    public int x0;
    public Cloneable y0;
    public qbf z0;

    public lx3(rr3 rr3, int i) {
        this.o = i;
        switch (i) {
            case 1:
                this.X = rr3;
                this.y0 = new LongSparseArray();
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.w0 = new SparseArray();
                A(true);
                return;
            default:
                this.X = rr3;
                this.y0 = new uq7((Object) null);
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.w0 = new SparseArray();
                A(true);
                return;
        }
    }

    public static ViewPager2 H(RecyclerView recyclerView) {
        ViewPager2 parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public static ViewPager2 I(RecyclerView recyclerView) {
        ViewPager2 parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        ViewParent parent2 = recyclerView.getParent();
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + parent2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(defpackage.wgc r8, int r9) {
        /*
            r7 = this;
            long r0 = r7.k(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            rr3 r3 = r7.X
            az1 r4 = r8.J0
            r5 = 1
            r6 = 0
            sgc r2 = r3.getChildRouter(r4, r2, r5, r6)
            r2.e = r5
            sgc r4 = r8.K0
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0023
            sgc r4 = r8.K0
            if (r4 == 0) goto L_0x0023
            r3.removeChildRouter(r4)
        L_0x0023:
            r8.K0 = r2
            r8.L0 = r0
            boolean r3 = r2.n()
            if (r3 != 0) goto L_0x004d
            java.lang.Cloneable r3 = r7.y0
            uq7 r3 = (uq7) r3
            java.lang.Object r3 = r3.c(r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L_0x004d
            r2.N(r3)
            java.lang.Cloneable r3 = r7.y0
            uq7 r3 = (uq7) r3
            r3.g(r0)
            java.util.ArrayList r3 = r7.Y
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.remove(r0)
            r6 = r5
        L_0x004d:
            java.util.ArrayList r0 = r2.e()
            java.lang.Object r0 = o23.f0(r0)
            vgc r0 = (vgc) r0
            if (r0 == 0) goto L_0x0062
            rr3 r0 = r0.a
            if (r0 == 0) goto L_0x0062
            rr3 r0 = r0.getTargetController()
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x007e
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Router adapter. Attach router, target exist | router restored:"
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            udd.q(r0, r1)
        L_0x007e:
            r2.I()
            r7.E(r2, r9)
            int r0 = r7.x0
            if (r9 == r0) goto L_0x00a2
            java.util.ArrayList r0 = r2.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r0.next()
            vgc r1 = (vgc) r1
            rr3 r1 = r1.a
            r1.setOptionsMenuHidden(r5)
            goto L_0x0090
        L_0x00a2:
            android.util.SparseArray r7 = r7.w0
            r7.put(r9, r2)
            r8.M0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx3.C(wgc, int):void");
    }

    public void D(xgc xgc, int i) {
        Bundle bundle;
        sgc sgc;
        long k = k(i);
        String valueOf = String.valueOf(k);
        rr3 rr3 = this.X;
        sgc childRouter = rr3.getChildRouter(xgc.J0, valueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(xgc.K0) && (sgc = xgc.K0) != null) {
            rr3.removeChildRouter(sgc);
        }
        xgc.K0 = childRouter;
        xgc.M0 = k;
        if (!childRouter.n() && (bundle = (Bundle) ((LongSparseArray) this.y0).get(k)) != null) {
            childRouter.N(bundle);
            ((LongSparseArray) this.y0).remove(k);
            this.Y.remove(Long.valueOf(k));
        }
        childRouter.I();
        E(childRouter, i);
        if (i != this.x0) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((vgc) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.w0.put(i, childRouter);
        xgc.N0 = true;
    }

    public abstract void E(sgc sgc, int i);

    public void F(wgc wgc) {
        if (wgc.M0) {
            sgc sgc = wgc.K0;
            if (sgc != null) {
                sgc.F();
                L(wgc.L0, sgc);
                SparseArray sparseArray = this.w0;
                if (hhd.f(sparseArray.get(wgc.g()), sgc)) {
                    sparseArray.remove(wgc.g());
                }
            }
            wgc.M0 = false;
        }
    }

    public void G(xgc xgc) {
        if (xgc.N0) {
            sgc sgc = xgc.K0;
            if (sgc != null) {
                sgc.F();
                K(xgc.M0, sgc);
                SparseArray sparseArray = this.w0;
                if (hhd.f(sparseArray.get(xgc.L0), sgc)) {
                    sparseArray.remove(xgc.L0);
                }
            }
            xgc.N0 = false;
        }
    }

    public void J(xgc xgc) {
        G(xgc);
        sgc sgc = xgc.K0;
        if (sgc != null) {
            this.X.removeChildRouter(sgc);
            xgc.K0 = null;
        }
    }

    public void K(long j, sgc sgc) {
        Bundle bundle = new Bundle();
        sgc.O(bundle);
        ((LongSparseArray) this.y0).put(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (((LongSparseArray) this.y0).size() > this.Z) {
            ((LongSparseArray) this.y0).remove(((Number) this.Y.remove(0)).longValue());
        }
    }

    public void L(long j, sgc sgc) {
        Bundle bundle = new Bundle();
        sgc.O(bundle);
        this.y0.f(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (this.y0.h() > this.Z) {
            this.y0.g(((Number) this.Y.remove(0)).longValue());
        }
    }

    public final Parcelable a() {
        switch (this.o) {
            case 0:
                SparseArray sparseArray = this.w0;
                fz6 S = gwf.S(0, sparseArray.size());
                ArrayList arrayList = new ArrayList(q23.H(S, 10));
                ez6 it = S.iterator();
                while (it.c) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(it.a())));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                while (!arrayList2.isEmpty()) {
                    int intValue = ((Number) arrayList2.remove(p23.A(arrayList2))).intValue();
                    L(k(intValue), (sgc) sparseArray.get(intValue));
                    if (!arrayList2.isEmpty()) {
                        int intValue2 = ((Number) arrayList2.remove(0)).intValue();
                        L(k(intValue2), (sgc) sparseArray.get(intValue2));
                    }
                }
                fz6 S2 = gwf.S(0, this.y0.h());
                ArrayList arrayList3 = new ArrayList(q23.H(S2, 10));
                ez6 it2 = S2.iterator();
                while (it2.c) {
                    arrayList3.add(Long.valueOf(this.y0.e(it2.a())));
                }
                fz6 S3 = gwf.S(0, this.y0.h());
                ArrayList arrayList4 = new ArrayList(q23.H(S3, 10));
                ez6 it3 = S3.iterator();
                while (it3.c) {
                    arrayList4.add((Bundle) this.y0.i(it3.a()));
                }
                return new kx3(arrayList3, arrayList4, this.Y, this.Z);
            default:
                SparseArray sparseArray2 = this.w0;
                fz6 S4 = gwf.S(0, sparseArray2.size());
                ArrayList arrayList5 = new ArrayList(q23.H(S4, 10));
                ez6 it4 = S4.iterator();
                while (it4.c) {
                    arrayList5.add(Integer.valueOf(sparseArray2.keyAt(it4.a())));
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                while (!arrayList6.isEmpty()) {
                    int intValue3 = ((Number) arrayList6.remove(p23.A(arrayList6))).intValue();
                    K(k(intValue3), (sgc) sparseArray2.get(intValue3));
                    if (!arrayList6.isEmpty()) {
                        int intValue4 = ((Number) arrayList6.remove(0)).intValue();
                        K(k(intValue4), (sgc) sparseArray2.get(intValue4));
                    }
                }
                fz6 S5 = gwf.S(0, ((LongSparseArray) this.y0).size());
                ArrayList arrayList7 = new ArrayList(q23.H(S5, 10));
                ez6 it5 = S5.iterator();
                while (it5.c) {
                    arrayList7.add(Long.valueOf(((LongSparseArray) this.y0).keyAt(it5.a())));
                }
                fz6 S6 = gwf.S(0, ((LongSparseArray) this.y0).size());
                ArrayList arrayList8 = new ArrayList(q23.H(S6, 10));
                ez6 it6 = S6.iterator();
                while (it6.c) {
                    arrayList8.add((Bundle) ((LongSparseArray) this.y0).valueAt(it6.a()));
                }
                return new ugc(arrayList7, arrayList8, this.Y, this.Z);
        }
    }

    public final void c(Parcelable parcelable) {
        switch (this.o) {
            case 0:
                if (parcelable instanceof kx3) {
                    this.y0 = new uq7((Object) null);
                    kx3 kx3 = (kx3) parcelable;
                    List list = kx3.a;
                    ez6 it = new dz6(0, list.size() - 1, 1).iterator();
                    while (it.c) {
                        int a = it.a();
                        this.y0.f(((Number) list.get(a)).longValue(), kx3.b.get(a));
                    }
                    this.Y = new ArrayList(kx3.c);
                    this.Z = kx3.o;
                    return;
                }
                return;
            default:
                if (parcelable instanceof ugc) {
                    this.y0 = new LongSparseArray();
                    ugc ugc = (ugc) parcelable;
                    List list2 = ugc.a;
                    ez6 it2 = new dz6(0, list2.size() - 1, 1).iterator();
                    while (it2.c) {
                        int a2 = it2.a();
                        ((LongSparseArray) this.y0).put(((Number) list2.get(a2)).longValue(), ugc.b.get(a2));
                    }
                    this.Y = new ArrayList(ugc.c);
                    this.Z = ugc.o;
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        return (long) i;
    }

    public final void q(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 I = I(recyclerView);
                hg0 hg0 = new hg0(7, this);
                I.b(hg0);
                this.z0 = hg0;
                return;
            default:
                ViewPager2 H = H(recyclerView);
                hg0 hg02 = new hg0(10, this);
                H.b(hg02);
                this.z0 = hg02;
                return;
        }
    }

    public final void r(b7c b7c, int i) {
        switch (this.o) {
            case 0:
                C((wgc) b7c, i);
                return;
            default:
                xgc xgc = (xgc) b7c;
                xgc.L0 = i;
                D(xgc, i);
                return;
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                int i2 = wgc.N0;
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap = eaf.a;
                frameLayout.setId(View.generateViewId());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setSaveEnabled(false);
                return new wgc(frameLayout);
            default:
                int i3 = xgc.O0;
                FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap2 = eaf.a;
                frameLayout2.setId(View.generateViewId());
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout2.setSaveEnabled(false);
                return new xgc(frameLayout2);
        }
    }

    public final void u(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 I = I(recyclerView);
                hg0 hg0 = this.z0;
                if (hg0 != null) {
                    I.g(hg0);
                }
                this.z0 = null;
                return;
            default:
                ViewPager2 H = H(recyclerView);
                hg0 hg02 = this.z0;
                if (hg02 != null) {
                    H.g(hg02);
                }
                this.z0 = null;
                return;
        }
    }

    public final /* bridge */ /* synthetic */ boolean v(b7c b7c) {
        switch (this.o) {
            case 0:
                wgc wgc = (wgc) b7c;
                return true;
            default:
                xgc xgc = (xgc) b7c;
                return true;
        }
    }

    public final void w(b7c b7c) {
        switch (this.o) {
            case 0:
                wgc wgc = (wgc) b7c;
                if (!wgc.M0) {
                    C(wgc, wgc.g());
                    return;
                }
                return;
            default:
                xgc xgc = (xgc) b7c;
                if (!xgc.N0) {
                    D(xgc, xgc.L0);
                    return;
                }
                return;
        }
    }

    public final void x(b7c b7c) {
        switch (this.o) {
            case 0:
                wgc wgc = (wgc) b7c;
                F(wgc);
                wgc.J0.removeAllViews();
                return;
            default:
                xgc xgc = (xgc) b7c;
                G(xgc);
                xgc.J0.removeAllViews();
                return;
        }
    }

    public void y(b7c b7c) {
        switch (this.o) {
            case 0:
                wgc wgc = (wgc) b7c;
                F(wgc);
                sgc sgc = wgc.K0;
                if (sgc != null) {
                    this.X.removeChildRouter(sgc);
                    wgc.K0 = null;
                    return;
                }
                return;
            default:
                J((xgc) b7c);
                return;
        }
    }
}
