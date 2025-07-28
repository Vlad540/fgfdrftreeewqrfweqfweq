package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: pqe  reason: default package */
public final class pqe implements tqe, a5f {
    public final ArrayDeque A0;
    public final SparseArray B0;
    public final long C0;
    public rc4 D0;
    public jc4 E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public long J0 = -9223372036854775807L;
    public volatile boolean K0;
    public final z4f X;
    public final Executor Y;
    public final lk9 Z;
    public final Context a;
    public final z23 b;
    public final b2b c;
    public final pv0 o;
    public final ArrayList w0;
    public final SparseArray x0 = new SparseArray();
    public final ScheduledExecutorService y0;
    public final qc4 z0;

    public pqe(Context context, z23 z23, pv0 pv0, z4f z4f, lk9 lk9, List list, long j) {
        lh4 lh4 = lh4.a;
        this.a = context;
        this.b = z23;
        this.o = pv0;
        this.X = z4f;
        this.Y = lh4;
        this.Z = lk9;
        this.w0 = new ArrayList(list);
        this.C0 = j;
        int i = oze.a;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new v93(3, "Effect:MultipleInputVideoGraph:Thread"));
        this.y0 = newSingleThreadScheduledExecutor;
        b2b b2b = new b2b(26);
        this.c = b2b;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = 2;
        defaultVideoFrameProcessor$Factory$Builder.c = b2b;
        defaultVideoFrameProcessor$Factory$Builder.b = newSingleThreadScheduledExecutor;
        this.z0 = defaultVideoFrameProcessor$Factory$Builder.build();
        this.A0 = new ArrayDeque();
        this.B0 = new SparseArray();
    }

    public final void a() {
        oyb.k(this.x0.size() == 0 && this.E0 == null && this.D0 == null && !this.I0);
        rc4 b2 = this.z0.b(this.a, this.o, this.b, true, lh4.a, new mod(23, this));
        this.D0 = b2;
        la9 la9 = new la9(this);
        SparseArray sparseArray = b2.d.g;
        oyb.k(oze.l(sparseArray, 3));
        ((my6) sparseArray.get(3)).a.x(la9);
        this.E0 = new jc4(this.a, this.c, this.Z, this.y0, new gvf(21, (Object) this), new la9(this));
    }

    public final void b() {
        boolean z;
        oyb.l(this.D0);
        if (this.G0) {
            ArrayDeque arrayDeque = this.A0;
            ma9 ma9 = (ma9) arrayDeque.peek();
            if (ma9 != null) {
                rc4 rc4 = this.D0;
                rc4.getClass();
                int i = ma9.a.a;
                if (!rc4.k.e()) {
                    z = false;
                } else {
                    v2 v2Var = rc4.d.k;
                    oyb.l(v2Var);
                    v2Var.r(i, ma9.b);
                    z = true;
                }
                oyb.k(z);
                arrayDeque.remove();
                if (this.H0 && arrayDeque.isEmpty()) {
                    rc4 rc42 = this.D0;
                    rc42.getClass();
                    rc42.f();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder, java.lang.Object] */
    public final ob6 h(int i) {
        oyb.k(!oze.l(this.x0, i));
        jc4 jc4 = this.E0;
        jc4.getClass();
        synchronized (jc4) {
            oyb.k(!oze.l(jc4.g, i));
            jc4.g.put(i, new ic4());
            if (jc4.o == -1) {
                jc4.o = i;
            }
        }
        qc4 qc4 = this.z0;
        ? obj = new Object();
        obj.a = qc4.a;
        obj.b = qc4.d;
        obj.c = qc4.c;
        obj.f = !qc4.b;
        boolean z = qc4.g;
        boolean z2 = qc4.h;
        obj.d = new hc0(i, 8, this);
        obj.e = 2;
        this.x0.put(i, obj.build().b(this.a, pv0.o, this.b, true, this.Y, new og0(i, 13, (Object) this)));
        SparseArray sparseArray = this.x0;
        oyb.k(oze.l(sparseArray, i));
        return new j4f((m4f) sparseArray.get(i), (u2b) null, this.C0);
    }

    public final boolean k() {
        return this.K0;
    }

    public final void l(p4e p4e) {
        rc4 rc4 = this.D0;
        rc4.getClass();
        rc4.e(p4e);
    }

    public final void release() {
        if (!this.I0) {
            for (int i = 0; i < this.x0.size(); i++) {
                SparseArray sparseArray = this.x0;
                ((rc4) ((m4f) sparseArray.get(sparseArray.keyAt(i)))).d();
            }
            this.x0.clear();
            jc4 jc4 = this.E0;
            if (jc4 != null) {
                synchronized (jc4) {
                    oyb.k(jc4.h);
                    try {
                        jc4.f.t(new ec4(jc4, 1));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException(e);
                    }
                }
                this.E0 = null;
            }
            rc4 rc4 = this.D0;
            if (rc4 != null) {
                rc4.d();
                this.D0 = null;
            }
            try {
                if (((EGLContext) this.c.c) != null) {
                    gt0.r((EGLContext) this.c.c, gt0.x());
                }
            } catch (GlUtil$GlException e2) {
                ez3.B("Error releasing GL context", e2);
            }
            this.y0.shutdown();
            try {
                this.y0.awaitTermination(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                this.Y.execute(new zo5(this, 28, e3));
            }
            this.I0 = true;
        }
    }
}
