package defpackage;

import java.util.concurrent.Executor;

/* renamed from: sn1  reason: default package */
public final class sn1 {
    public Object a;
    public vn1 b;
    public lbc c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        lbc lbc = this.c;
        if (lbc != null) {
            lbc.c(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        boolean z = true;
        this.d = true;
        vn1 vn1 = this.b;
        if (vn1 == null || !vn1.b.i(obj)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        vn1 vn1 = this.b;
        if (vn1 != null && vn1.b.cancel(true)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final boolean d(Throwable th) {
        boolean z = true;
        this.d = true;
        vn1 vn1 = this.b;
        if (vn1 == null || !vn1.b.j(th)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        lbc lbc;
        vn1 vn1 = this.b;
        if (vn1 != null) {
            un1 un1 = vn1.b;
            if (!un1.isDone()) {
                un1.j(new s0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (!this.d && (lbc = this.c) != null) {
            lbc.i((Object) null);
        }
    }
}
