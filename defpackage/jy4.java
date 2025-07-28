package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jy4  reason: default package */
public final class jy4 extends f6c {
    public final /* synthetic */ ty4 X;
    public final f6c o;

    public jy4(ty4 ty4, f6c f6c) {
        this.X = ty4;
        this.o = f6c;
        A(f6c.b);
    }

    public final void B(h6c h6c) {
        jy4.super.B(h6c);
        this.o.B(h6c);
    }

    public final int j() {
        ty4 ty4 = this.X;
        int i = 0;
        int i2 = (!ty4.h2 || ty4.k2 == null) ? 0 : 1;
        if (ty4.i2 && ty4.k2 != null) {
            i = 1;
        }
        return this.o.j() + i + i2;
    }

    public final long k(int i) {
        ty4 ty4 = this.X;
        if (ty4.i2 && i == 0) {
            return -100;
        }
        if (ty4.h2 && i == j() - 1) {
            return -200;
        }
        f6c f6c = this.o;
        if (f6c.j() > 0) {
            return f6c.k(i - (ty4.i2 ? 1 : 0));
        }
        return -1;
    }

    public final int l(int i) {
        ty4 ty4 = this.X;
        if ((ty4.i2 && i == 0) || (ty4.h2 && i == j() - 1)) {
            return -1;
        }
        f6c f6c = this.o;
        if (f6c.j() > 0) {
            return f6c.l(i - (ty4.i2 ? 1 : 0));
        }
        return -1;
    }

    public final void q(RecyclerView recyclerView) {
        this.o.q(recyclerView);
    }

    public final void r(b7c b7c, int i) {
        s(b7c, i, new ArrayList());
    }

    public final void s(b7c b7c, int i, List list) {
        if (!(b7c instanceof iy4)) {
            f6c f6c = this.o;
            if (f6c.j() > 0) {
                f6c.s(b7c, i - (this.X.i2 ? 1 : 0), list);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View, ty4] */
    public final b7c t(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.o.t(viewGroup, i);
        }
        ? r2 = this.X;
        LayoutInflater from = LayoutInflater.from(r2.getContext());
        Integer num = r2.k2;
        if (num != null) {
            View inflate = from.inflate(num.intValue(), viewGroup, false);
            try {
                rf3 rf3 = r2.l2;
                if (rf3 != null) {
                    rf3.accept(inflate);
                }
            } catch (Exception unused) {
            }
            return new b7c(inflate);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void u(RecyclerView recyclerView) {
        this.o.u(recyclerView);
    }

    public final boolean v(b7c b7c) {
        return (b7c instanceof iy4) || this.o.v(b7c);
    }

    public final void w(b7c b7c) {
        if (!(b7c instanceof iy4)) {
            this.o.w(b7c);
        }
    }

    public final void x(b7c b7c) {
        if (!(b7c instanceof iy4)) {
            this.o.x(b7c);
        }
    }

    public final void y(b7c b7c) {
        if (!(b7c instanceof iy4)) {
            this.o.y(b7c);
        }
    }

    public final void z(h6c h6c) {
        jy4.super.z(h6c);
        this.o.z(h6c);
    }
}
