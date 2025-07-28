package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: e04  reason: default package */
public class e04 extends p6c {
    public RecyclerView a;
    public Scroller b;
    public final cld c = new cld(this);
    public final /* synthetic */ int d;
    public mga e;
    public mga f;

    public e04(int i) {
        this.d = i;
    }

    public static int e(View view, o57 o57) {
        return ((o57.d(view) / 2) + o57.f(view)) - ((o57.n() / 2) + o57.m());
    }

    public static View g(a aVar, o57 o57) {
        int w = aVar.w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int n = (o57.n() / 2) + o57.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < w; i2++) {
            View v = aVar.v(i2);
            int abs = Math.abs(((o57.d(v) / 2) + o57.f(v)) - n);
            if (abs < i) {
                view = v;
                i = abs;
            }
        }
        return view;
    }

    public static View h(a aVar, o57 o57) {
        int w = aVar.w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int n = (o57.n() / 2) + o57.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < w; i2++) {
            View v = aVar.v(i2);
            int abs = Math.abs(((o57.d(v) / 2) + o57.f(v)) - n);
            if (abs < i) {
                view = v;
                i = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            cld cld = this.c;
            if (recyclerView2 != null) {
                recyclerView2.s0(cld);
                this.a.setOnFlingListener((p6c) null);
            }
            this.a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.a.m(cld);
                this.a.setOnFlingListener(this);
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                o();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public final int[] b(a aVar, View view) {
        switch (this.d) {
            case 0:
                int[] iArr = new int[2];
                if (aVar.e()) {
                    o57 k = k(aVar);
                    iArr[0] = ((k.d(view) / 2) + k.f(view)) - ((k.n() / 2) + k.m());
                } else {
                    iArr[0] = 0;
                }
                if (aVar.f()) {
                    o57 m = m(aVar);
                    iArr[1] = ((m.d(view) / 2) + m.f(view)) - ((m.n() / 2) + m.m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (aVar.e()) {
                    iArr2[0] = e(view, l(aVar));
                } else {
                    iArr2[0] = 0;
                }
                if (aVar.f()) {
                    iArr2[1] = e(view, n(aVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public hd7 c(a aVar) {
        switch (this.d) {
            case 1:
                if (!(aVar instanceof w6c)) {
                    return null;
                }
                return new zw1(this, this.a.getContext(), 1);
            default:
                return d(aVar);
        }
    }

    public final hd7 d(a aVar) {
        if (!(aVar instanceof w6c)) {
            return null;
        }
        return new zw1(this, this.a.getContext(), 2);
    }

    public int f(a aVar, o57 o57, int i, int i2) {
        int max;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int w = aVar.w();
        float f2 = 1.0f;
        if (w != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < w; i5++) {
                View v = aVar.v(i5);
                int M = a.M(v);
                if (M != -1) {
                    if (M < i4) {
                        view = v;
                        i4 = M;
                    }
                    if (M > i3) {
                        view2 = v;
                        i3 = M;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(o57.c(view), o57.c(view2)) - Math.min(o57.f(view), o57.f(view2))) == 0)) {
                f2 = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f2);
    }

    public View i(a aVar) {
        switch (this.d) {
            case 0:
                if (aVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
                    if (linearLayoutManager.T0() == 0 || linearLayoutManager.X0() == linearLayoutManager.G() - 1) {
                        return null;
                    }
                }
                if (aVar.f()) {
                    return g(aVar, m(aVar));
                }
                if (aVar.e()) {
                    return g(aVar, k(aVar));
                }
                return null;
            default:
                if (aVar.f()) {
                    return h(aVar, n(aVar));
                }
                if (aVar.e()) {
                    return h(aVar, l(aVar));
                }
                return null;
        }
    }

    public final int j(a aVar, int i, int i2) {
        int G;
        View i3;
        int M;
        int i4;
        PointF a2;
        int i5;
        int i6;
        PointF a3;
        switch (this.d) {
            case 0:
                if (!(aVar instanceof w6c) || (G = aVar.G()) == 0 || (i3 = i(aVar)) == null || (M = a.M(i3)) == -1 || (a2 = ((w6c) aVar).a(i4)) == null) {
                    return -1;
                }
                int i7 = 0;
                if (aVar.e()) {
                    i5 = f(aVar, k(aVar), i, 0);
                    if (a2.x < 0.0f) {
                        i5 = -i5;
                    }
                } else {
                    i5 = 0;
                }
                if (aVar.f()) {
                    i6 = f(aVar, m(aVar), 0, i2);
                    if (a2.y < 0.0f) {
                        i6 = -i6;
                    }
                } else {
                    i6 = 0;
                }
                if (aVar.f()) {
                    i5 = i6;
                }
                if (i5 == 0) {
                    return -1;
                }
                int i8 = M + i5;
                if (i8 >= 0) {
                    i7 = i8;
                }
                return i7 >= G ? G - 1 : i7;
            default:
                int G2 = aVar.G();
                if (G2 == 0) {
                    return -1;
                }
                View view = null;
                o57 n = aVar.f() ? n(aVar) : aVar.e() ? l(aVar) : null;
                if (n == null) {
                    return -1;
                }
                int w = aVar.w();
                boolean z = false;
                int i9 = Integer.MAX_VALUE;
                int i10 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i11 = 0; i11 < w; i11++) {
                    View v = aVar.v(i11);
                    if (v != null) {
                        int e2 = e(v, n);
                        if (e2 <= 0 && e2 > i10) {
                            view2 = v;
                            i10 = e2;
                        }
                        if (e2 >= 0 && e2 < i9) {
                            view = v;
                            i9 = e2;
                        }
                    }
                }
                int i12 = 1;
                boolean z2 = !aVar.e() ? i2 > 0 : i > 0;
                if (z2 && view != null) {
                    return a.M(view);
                }
                if (!z2 && view2 != null) {
                    return a.M(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int M2 = a.M(view);
                int G3 = aVar.G();
                if ((aVar instanceof w6c) && (a3 = ((w6c) aVar).a(G3 - 1)) != null && (a3.x < 0.0f || a3.y < 0.0f)) {
                    z = true;
                }
                if (z == z2) {
                    i12 = -1;
                }
                int i13 = M2 + i12;
                if (i13 < 0 || i13 >= G2) {
                    return -1;
                }
                return i13;
        }
    }

    public o57 k(a aVar) {
        mga mga = this.f;
        if (mga == null || ((a) mga.b) != aVar) {
            this.f = new mga(aVar, 0);
        }
        return this.f;
    }

    public o57 l(a aVar) {
        mga mga = this.f;
        if (mga == null || ((a) mga.b) != aVar) {
            this.f = new mga(aVar, 0);
        }
        return this.f;
    }

    public o57 m(a aVar) {
        mga mga = this.e;
        if (mga == null || ((a) mga.b) != aVar) {
            this.e = new mga(aVar, 1);
        }
        return this.e;
    }

    public o57 n(a aVar) {
        mga mga = this.e;
        if (mga == null || ((a) mga.b) != aVar) {
            this.e = new mga(aVar, 1);
        }
        return this.e;
    }

    public final void o() {
        a layoutManager;
        View i;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (i = i(layoutManager)) != null) {
            int[] b2 = b(layoutManager, i);
            int i2 = b2[0];
            if (i2 != 0 || b2[1] != 0) {
                this.a.A0(i2, b2[1], false);
            }
        }
    }
}
