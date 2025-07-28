package defpackage;

import bolts.Task;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ys0  reason: default package */
public final class ys0 {
    public final cd5 a;
    public final qe4 b;
    public final og0 c;
    public final Executor d;
    public final Executor e;
    public final kk9 f;
    public final mod g;

    public ys0(cd5 cd5, qe4 qe4, og0 og0, Executor executor, Executor executor2, kk9 kk9) {
        this.a = cd5;
        this.b = qe4;
        this.c = og0;
        this.d = executor;
        this.e = executor2;
        this.f = kk9;
        mod mod = new mod(0);
        mod.b = new HashMap();
        this.g = mod;
    }

    public final void a() {
        this.g.x();
        try {
            Task.call(new m5(1, this), this.e);
        } catch (Exception e2) {
            m75.l(e2, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e2);
        }
    }

    public final Task b(ngd ngd, AtomicBoolean atomicBoolean) {
        n06.s();
        ax4 A = this.g.A(ngd);
        if (A == null) {
            return c(ngd, atomicBoolean);
        }
        m75.d(ys0.class, ngd.a, "Found image for %s in staging area");
        this.f.getClass();
        return Task.forResult(A);
    }

    public final Task c(ngd ngd, AtomicBoolean atomicBoolean) {
        try {
            return Task.call(new xs0(atomicBoolean, this, ngd, 0), this.d);
        } catch (Exception e2) {
            m75.l(e2, "Failed to schedule disk-cache read for %s", ngd.a);
            return Task.forError(e2);
        }
    }

    public final void d(ov0 ov0, ax4 ax4) {
        n06.s();
        Executor executor = this.e;
        if (ax4.m0(ax4)) {
            mod mod = this.g;
            mod.P(ov0, ax4);
            ax4 a2 = ax4.a(ax4);
            try {
                executor.execute(new g5(this, ov0, a2, 5));
            } catch (Exception e2) {
                m75.l(e2, "Failed to schedule disk-cache write for %s", ov0.c());
                mod.Q(ov0, ax4);
                ax4.d(a2);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final jl8 e(ngd ngd) {
        kl8 kl8;
        String str = ngd.a;
        kk9 kk9 = this.f;
        Class<ys0> cls = ys0.class;
        try {
            m75.d(cls, str, "Disk cache read for %s");
            bd5 c2 = ((ci4) this.a).c(ngd);
            if (c2 == null) {
                m75.d(cls, str, "Disk cache miss for %s");
                kk9.getClass();
                return null;
            }
            m75.d(cls, str, "Found entry in disk cache for %s");
            kk9.getClass();
            FileInputStream fileInputStream = new FileInputStream(c2.a);
            try {
                qe4 qe4 = this.b;
                qe4.getClass();
                kl8 = new kl8((il8) qe4.b, (int) c2.a.length());
                ((og0) qe4.c).j(fileInputStream, kl8);
                jl8 n = kl8.n();
                kl8.close();
                fileInputStream.close();
                m75.d(cls, str, "Successful read from disk cache for %s");
                return n;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e2) {
            m75.l(e2, "Exception reading from cache for %s", str);
            kk9.getClass();
            throw e2;
        }
    }

    public final void f(ov0 ov0, ax4 ax4) {
        Class<ys0> cls = ys0.class;
        m75.d(cls, ov0.c(), "About to write to disk-cache for key %s");
        try {
            ((ci4) this.a).e(ov0, new j9(ax4, 4, this));
            this.f.getClass();
            m75.d(cls, ov0.c(), "Successful disk-cache write for key %s");
        } catch (IOException e2) {
            m75.l(e2, "Failed to write to disk-cache for key %s", ov0.c());
        }
    }
}
