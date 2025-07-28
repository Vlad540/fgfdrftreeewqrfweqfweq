package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: gf  reason: default package */
public abstract class gf extends rrd {
    public final int j;
    public int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf(View view, sy6 sy6, int i, u16 u16, int i2) {
        super(view, sy6, (i2 & 16) != 0 ? null : u16, 7);
        this.j = 8;
        this.k = -1;
        eaf.l(view, new ff(i, this));
    }

    public static final nsf f(gf gfVar, nsf nsf) {
        if (gfVar.f == 0) {
            return nsf;
        }
        qy6 f = nsf.a.f(7);
        if (f.d > gfVar.f) {
            return nsf;
        }
        dsf dsf = Build.VERSION.SDK_INT >= 30 ? new dsf(nsf) : new csf(nsf);
        dsf.c(7, qy6.b(f.a, f.b, f.c, gfVar.f));
        return dsf.b();
    }

    public final void b(nsf nsf, up0 up0) {
        lsf lsf = nsf.a;
        qy6 f = lsf.f(this.d);
        int i = this.j;
        qy6 f2 = lsf.f(i);
        if (lsf.o(i)) {
            f = f2;
        }
        a(f, up0);
    }

    public final void c(nsf nsf) {
        if (this.k != -1) {
            dsf dsf = Build.VERSION.SDK_INT >= 30 ? new dsf(nsf) : new csf(nsf);
            dsf.c(8, qy6.e);
            dsf.h(8, false);
            nsf = dsf.b();
        }
        super.c(nsf);
    }

    public final nsf d(nsf nsf) {
        return nsf;
    }

    public final void e() {
        this.g = false;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = eaf.a;
            r9f.c(view);
            return;
        }
        view.addOnAttachStateChangeListener(new ef(view, 0));
    }

    public void g(nsf nsf, s5c s5c) {
    }

    public abstract nsf h(nsf nsf);

    public abstract void i();

    public void j() {
    }
}
