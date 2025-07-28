package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: vhd  reason: default package */
public abstract class vhd implements a5f {
    public boolean A0;
    public boolean B0;
    public volatile boolean C0;
    public int D0 = -1;
    public final pv0 X;
    public final Executor Y;
    public final boolean Z;
    public final Context a;
    public final k4f b;
    public final z23 c;
    public final z4f o;
    public final long w0;
    public final u2b x0;
    public m4f y0;
    public p4e z0;

    public vhd(Context context, k4f k4f, z23 z23, z4f z4f, pv0 pv0, Executor executor, lk9 lk9, boolean z, u2b u2b, long j) {
        oyb.j("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", lk9.Z.equals(lk9));
        this.a = context;
        this.b = k4f;
        this.c = z23;
        this.o = z4f;
        this.X = pv0;
        this.Y = executor;
        this.Z = z;
        this.x0 = u2b;
        this.w0 = j;
    }

    public final void a() {
    }

    public final m4f b(int i) {
        int i2 = this.D0;
        oyb.d(i2 != -1 && i2 == i);
        m4f m4f = this.y0;
        oyb.l(m4f);
        return m4f;
    }

    public final void c(int i) {
        if (this.y0 == null) {
            boolean z = this.B0;
        }
        oyb.k(this.D0 == -1);
        this.D0 = i;
        m4f a2 = this.b.a(this.a, this.X, this.c, this.Z, new xw2(10, (Object) this));
        this.y0 = a2;
        p4e p4e = this.z0;
        if (p4e != null) {
            ((rc4) a2).e(p4e);
        }
    }

    public final boolean k() {
        return this.C0;
    }

    public final void l(p4e p4e) {
        this.z0 = p4e;
        m4f m4f = this.y0;
        if (m4f != null) {
            ((rc4) m4f).e(p4e);
        }
    }

    public final void release() {
        if (!this.B0) {
            m4f m4f = this.y0;
            if (m4f != null) {
                ((rc4) m4f).d();
                this.y0 = null;
            }
            this.B0 = true;
        }
    }
}
