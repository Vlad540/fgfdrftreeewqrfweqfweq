package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.List;

/* renamed from: d2b  reason: default package */
public final class d2b extends r6c {
    public static final /* synthetic */ k77[] m;
    public static final String n;
    public final s16 a;
    public final int b;
    public final boolean c;
    public final qf3 d;
    public final zb9 e = new zb9(10);
    public final zb9 f = new zb9(10);
    public boolean g;
    public int h = -1;
    public int i = -1;
    public int j;
    public final HashSet k;
    public final yj l;

    static {
        Class<d2b> cls = d2b.class;
        k77 hc9 = new hc9(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
        m7c.a.getClass();
        m = new k77[]{hc9};
        n = cls.getName();
    }

    public d2b(a09 a09, int i2, boolean z, qf3 qf3) {
        this.a = a09;
        this.b = i2;
        this.c = z;
        this.d = qf3;
        this.k = new HashSet(i2);
        this.l = new yj(21, this);
    }

    public final void a(RecyclerView recyclerView, int i2) {
        this.l.o1(this, m[0], recyclerView);
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        this.l.o1(this, m[0], recyclerView);
        if (this.c && this.g && this.d != null) {
            HashSet hashSet = this.k;
            try {
                hashSet.clear();
                c();
                hashSet.clear();
            } catch (Throwable th) {
                udd.s(n, "tryToPrefetch failure!", th);
            }
        }
    }

    public final void c() {
        f6c adapter;
        qf3 qf3;
        int h2;
        boolean z = false;
        k77 k77 = m[0];
        RecyclerView recyclerView = (RecyclerView) this.l.b;
        if (recyclerView != null) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                boolean z3 = i2 < recyclerView.getChildCount();
                HashSet hashSet = this.k;
                zb9 zb9 = this.f;
                if (z3) {
                    int i5 = i2 + 1;
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != null) {
                        try {
                            tp8 T = recyclerView.T(childAt);
                            tp8 tp8 = T instanceof tp8 ? T : null;
                            if (tp8 != null) {
                                ao8 ao8 = (ao8) tp8;
                                if (ao8.S0) {
                                    long j2 = ao8.T0;
                                    boolean a2 = zb9.a(j2);
                                    if (a2) {
                                        hashSet.add(Long.valueOf(j2));
                                    }
                                    z2 = z2 || a2;
                                    if (z2 && (h2 = ((b7c) tp8).h()) != -1) {
                                        i3 = Math.min(i3, h2);
                                        i4 = Math.max(i4, h2);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i2 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    zb9 zb92 = this.e;
                    if (zb92.j() && !hhd.f(zb9, zb92)) {
                        z = true;
                    }
                    this.g = z;
                    if (z2 && (adapter = recyclerView.getAdapter()) != null) {
                        int size = hashSet.size();
                        if (size > 0) {
                            int i6 = this.b;
                            if (((float) size) < ((float) i6) * 0.8f) {
                                if (this.j != adapter.j()) {
                                    this.j = adapter.j();
                                    this.h = -1;
                                    this.i = -1;
                                }
                                int i7 = (i6 - size) / 2;
                                if (i7 != 0) {
                                    List list = (List) this.a.invoke();
                                    if (this.h != i3) {
                                        this.h = i3;
                                        for (Number longValue : gwf.K(list, i3, -i7)) {
                                            long longValue2 = longValue.longValue();
                                            if (zb9.a(longValue2)) {
                                                hashSet.add(Long.valueOf(longValue2));
                                            }
                                        }
                                    }
                                    if (this.i != i4) {
                                        this.i = i4;
                                        for (Number longValue3 : gwf.K(list, i4, i7)) {
                                            long longValue4 = longValue3.longValue();
                                            if (zb9.a(longValue4)) {
                                                hashSet.add(Long.valueOf(longValue4));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((!hashSet.isEmpty()) && (qf3 = this.d) != null) {
                            qf3.accept(o23.s0(hashSet));
                        }
                        if (!this.g) {
                            udd.q(n, "clear");
                            hashSet.clear();
                            zb9.c();
                            zb92.c();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
