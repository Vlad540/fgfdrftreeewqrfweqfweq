package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: sy4  reason: default package */
public final class sy4 extends h6c {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public sy4(vp0 vp0, RecyclerView recyclerView, f6c f6c) {
        this.b = vp0;
        this.c = recyclerView;
        this.d = f6c;
    }

    public void a() {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<sy4> cls = sy4.class;
                String name = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.d;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, name, us8.k("onItemRangeInserted start. isComputingLayout:", endlessRecyclerView2.Z()), (Throwable) null);
                }
                h();
                String name2 = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.d;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, name2, us8.k("onItemRangeInserted end. isComputingLayout:", endlessRecyclerView22.Z()), (Throwable) null);
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
                h();
                return;
            default:
                sy4.super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                vp0 vp0 = (vp0) this.b;
                if (i2 == vp0.X && vp0.h0(vp0, (RecyclerView) this.c, i)) {
                    String str = ((vp0) this.b).Y;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.X, str, us8.k("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                    }
                    vp0.i0((vp0) this.b, (RecyclerView) this.c, (f6c) this.d, i);
                    String str2 = ((vp0) this.b).Y;
                    RecyclerView recyclerView2 = (RecyclerView) this.c;
                    fn6 fn62 = udd.e;
                    if (fn62 != null && fn62.c()) {
                        fn62.d(tn7.X, str2, us8.k("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                vp0 vp0 = (vp0) this.b;
                int i3 = vp0.X;
                f6c f6c = (f6c) this.d;
                RecyclerView recyclerView = (RecyclerView) this.c;
                if (1 == i3 && vp0.h0(vp0, recyclerView, i)) {
                    vp0.i0(vp0, recyclerView, f6c, i);
                    return;
                } else if (1 == vp0.X && vp0.h0(vp0, recyclerView, i2)) {
                    vp0.i0(vp0, recyclerView, f6c, i);
                    return;
                } else {
                    return;
                }
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                vp0 vp0 = (vp0) this.b;
                if (i2 == vp0.X) {
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    if (vp0.h0(vp0, recyclerView, i)) {
                        vp0.i0(vp0, recyclerView, (f6c) this.d, i);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void h() {
        z3d.L((EndlessRecyclerView2) this.d, (q36) this.c);
    }

    public sy4(EndlessRecyclerView2 endlessRecyclerView2) {
        this.d = endlessRecyclerView2;
        this.b = new AtomicBoolean(true);
        this.c = new q36(this, 3, endlessRecyclerView2);
    }
}
