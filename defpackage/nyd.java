package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: nyd  reason: default package */
public final class nyd extends h6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nyd(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a() {
        switch (this.a) {
            case 0:
                l83.g((l83) this.b);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<nyd> cls = nyd.class;
                String name = cls.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, name, us8.k("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                }
                l83.g((l83) this.b);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, name2, us8.k("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                l83.g((l83) this.b);
                return;
            default:
                nyd.super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                l83.g((l83) this.b);
                return;
            default:
                if (i2 != 0 && ((NeuroAvatarsScreen) this.b).M0.J(i) != null) {
                    rj9 q0 = ((NeuroAvatarsScreen) this.b).q0();
                    mi9 mi9 = q0.o;
                    if (mi9 != null) {
                        int i4 = mi9.c;
                        mi9 mi92 = q0.o;
                        if (mi92 != null) {
                            long j = mi92.a;
                            Iterator it = ((Map) q0.C0.getValue()).keySet().iterator();
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i3 = -1;
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (i6 < 0) {
                                        p23.G();
                                        throw null;
                                    } else if (((Number) next).intValue() != i4) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            Iterator it2 = ((List) q0.X.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((mi9) it2.next()).a == j) {
                                        i3 = i5;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            Integer valueOf = Integer.valueOf(i3);
                            q0.Y = i6;
                            q0.z0.g(new ni9(i6, valueOf));
                        }
                    }
                    ((f6c) this.c).B(this);
                    return;
                }
                return;
        }
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                l83.g((l83) this.b);
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                l83.g((l83) this.b);
                return;
            default:
                return;
        }
    }
}
